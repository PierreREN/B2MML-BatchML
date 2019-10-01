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
 * <p>OperationalLocationClassType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OperationalLocationClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="OperationalLocationClass" type="{http://www.mesa.org/xml/B2MML}OperationalLocationClassType" minOccurs="0"/>
 *         &lt;element name="IncludesOperationalLocationClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationalLocationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationalLocationClassProperty" type="{http://www.mesa.org/xml/B2MML}OperationalLocationClassPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationalLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationalLocationClassType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "operationalLocationClass",
        "includesOperationalLocationClassID",
        "operationalLocationID",
        "operationalLocationClassProperty"
})
public class OperationalLocationClassType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "OperationalLocationClass")
    protected OperationalLocationClassType operationalLocationClass;
    @XmlElement(name = "IncludesOperationalLocationClassID")
    protected List<IdentifierType> includesOperationalLocationClassID;
    @XmlElement(name = "OperationalLocationID")
    protected List<IdentifierType> operationalLocationID;
    @XmlElement(name = "OperationalLocationClassProperty")
    protected List<OperationalLocationClassPropertyType> operationalLocationClassProperty;

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
     * 获取hierarchyScope属性的值。
     *
     * @return possible object is
     * {@link HierarchyScopeType }
     */
    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * 设置hierarchyScope属性的值。
     *
     * @param value allowed object is
     *              {@link HierarchyScopeType }
     */
    public void setHierarchyScope(HierarchyScopeType value) {
        this.hierarchyScope = value;
    }

    /**
     * 获取operationalLocationClass属性的值。
     *
     * @return possible object is
     * {@link OperationalLocationClassType }
     */
    public OperationalLocationClassType getOperationalLocationClass() {
        return operationalLocationClass;
    }

    /**
     * 设置operationalLocationClass属性的值。
     *
     * @param value allowed object is
     *              {@link OperationalLocationClassType }
     */
    public void setOperationalLocationClass(OperationalLocationClassType value) {
        this.operationalLocationClass = value;
    }

    /**
     * Gets the value of the includesOperationalLocationClassID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesOperationalLocationClassID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesOperationalLocationClassID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getIncludesOperationalLocationClassID() {
        if (includesOperationalLocationClassID == null) {
            includesOperationalLocationClassID = new ArrayList<IdentifierType>();
        }
        return this.includesOperationalLocationClassID;
    }

    /**
     * Gets the value of the operationalLocationID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalLocationID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationalLocationID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getOperationalLocationID() {
        if (operationalLocationID == null) {
            operationalLocationID = new ArrayList<IdentifierType>();
        }
        return this.operationalLocationID;
    }

    /**
     * Gets the value of the operationalLocationClassProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalLocationClassProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationalLocationClassProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationalLocationClassPropertyType }
     */
    public List<OperationalLocationClassPropertyType> getOperationalLocationClassProperty() {
        if (operationalLocationClassProperty == null) {
            operationalLocationClassProperty = new ArrayList<OperationalLocationClassPropertyType>();
        }
        return this.operationalLocationClassProperty;
    }

}
