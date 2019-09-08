//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EquipmentClassPropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EquipmentClassPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyType" type="{http://www.mesa.org/xml/B2MML}ClassPropertyTypeType" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.mesa.org/xml/B2MML}ValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentClassProperty" type="{http://www.mesa.org/xml/B2MML}EquipmentClassPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EvaluatedPropertyReference" type="{http://www.mesa.org/xml/B2MML}EvaluatedPropertyReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}EquipmentClassProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentClassPropertyType", propOrder = {
    "id",
    "description",
    "propertyType",
    "value",
    "equipmentClassProperty",
    "evaluatedPropertyReference"
})
public class EquipmentClassPropertyType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "PropertyType")
    protected ClassPropertyTypeType propertyType;
    @XmlElement(name = "Value")
    protected List<ValueType> value;
    @XmlElement(name = "EquipmentClassProperty")
    protected List<EquipmentClassPropertyType> equipmentClassProperty;
    @XmlElement(name = "EvaluatedPropertyReference")
    protected List<EvaluatedPropertyReferenceType> evaluatedPropertyReference;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
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
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * 获取propertyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClassPropertyTypeType }
     *     
     */
    public ClassPropertyTypeType getPropertyType() {
        return propertyType;
    }

    /**
     * 设置propertyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClassPropertyTypeType }
     *     
     */
    public void setPropertyType(ClassPropertyTypeType value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     * 
     * 
     */
    public List<ValueType> getValue() {
        if (value == null) {
            value = new ArrayList<ValueType>();
        }
        return this.value;
    }

    /**
     * Gets the value of the equipmentClassProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentClassProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentClassProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentClassPropertyType }
     * 
     * 
     */
    public List<EquipmentClassPropertyType> getEquipmentClassProperty() {
        if (equipmentClassProperty == null) {
            equipmentClassProperty = new ArrayList<EquipmentClassPropertyType>();
        }
        return this.equipmentClassProperty;
    }

    /**
     * Gets the value of the evaluatedPropertyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evaluatedPropertyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvaluatedPropertyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvaluatedPropertyReferenceType }
     * 
     * 
     */
    public List<EvaluatedPropertyReferenceType> getEvaluatedPropertyReference() {
        if (evaluatedPropertyReference == null) {
            evaluatedPropertyReference = new ArrayList<EvaluatedPropertyReferenceType>();
        }
        return this.evaluatedPropertyReference;
    }

}
