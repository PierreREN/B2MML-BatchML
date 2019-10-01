//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>EquipmentProceduralElementType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="EquipmentProceduralElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentProceduralElementType" type="{http://www.mesa.org/xml/B2MML}EquipmentProceduralElementTypeType"/>
 *         &lt;choice>
 *           &lt;element name="EquipmentProceduralElementClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *           &lt;element name="Parameter" type="{http://www.mesa.org/xml/B2MML}BatchParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}EquipmentProceduralElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentProceduralElementType", propOrder = {
        "id",
        "description",
        "equipmentProceduralElementType",
        "equipmentProceduralElementClassID",
        "parameter"
})
public class EquipmentProceduralElementType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "EquipmentProceduralElementType", required = true)
    protected EquipmentProceduralElementTypeType equipmentProceduralElementType;
    @XmlElement(name = "EquipmentProceduralElementClassID")
    protected IdentifierType equipmentProceduralElementClassID;
    @XmlElement(name = "Parameter")
    protected List<BatchParameterType> parameter;

    /**
     * 获取id属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setID(IdentifierType value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * 获取equipmentProceduralElementType属性的值。
     *
     * @return possible object is
     * {@link EquipmentProceduralElementTypeType }
     */
    public EquipmentProceduralElementTypeType getEquipmentProceduralElementType() {
        return equipmentProceduralElementType;
    }

    /**
     * 设置equipmentProceduralElementType属性的值。
     *
     * @param value allowed object is
     *              {@link EquipmentProceduralElementTypeType }
     */
    public void setEquipmentProceduralElementType(EquipmentProceduralElementTypeType value) {
        this.equipmentProceduralElementType = value;
    }

    /**
     * 获取equipmentProceduralElementClassID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getEquipmentProceduralElementClassID() {
        return equipmentProceduralElementClassID;
    }

    /**
     * 设置equipmentProceduralElementClassID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setEquipmentProceduralElementClassID(IdentifierType value) {
        this.equipmentProceduralElementClassID = value;
    }

    /**
     * Gets the value of the parameter property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchParameterType }
     */
    public List<BatchParameterType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<BatchParameterType>();
        }
        return this.parameter;
    }

}
