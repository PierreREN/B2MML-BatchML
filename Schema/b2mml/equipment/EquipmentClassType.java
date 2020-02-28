//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 12:54:35 PM CST 
//


package isa95.aps.interfaces.b2mml.equipment;

import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.HierarchyScopeType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>EquipmentClassType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="EquipmentClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="EquipmentLevel" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="EquipmentClassProperty" type="{http://www.mesa.org/xml/B2MML}EquipmentClassPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentClass" type="{http://www.mesa.org/xml/B2MML}EquipmentClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UsesPropertiesOfEquipmentClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentCapabilityTestSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}EquipmentClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentClassType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "equipmentLevel",
        "equipmentClassProperty",
        "equipmentClass",
        "usesPropertiesOfEquipmentClassID",
        "equipmentID",
        "equipmentCapabilityTestSpecificationID"
})
public class EquipmentClassType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "EquipmentLevel")
    protected HierarchyScopeType equipmentLevel;
    @XmlElement(name = "EquipmentClassProperty")
    protected List<EquipmentClassPropertyType> equipmentClassProperty;
    @XmlElement(name = "EquipmentClass")
    protected List<EquipmentClassType> equipmentClass;
    @XmlElement(name = "UsesPropertiesOfEquipmentClassID")
    protected List<IdentifierType> usesPropertiesOfEquipmentClassID;
    @XmlElement(name = "EquipmentID")
    protected List<IdentifierType> equipmentID;
    @XmlElement(name = "EquipmentCapabilityTestSpecificationID")
    protected List<IdentifierType> equipmentCapabilityTestSpecificationID;

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
     * 获取equipmentLevel属性的值。
     *
     * @return possible object is
     * {@link HierarchyScopeType }
     */
    public HierarchyScopeType getEquipmentLevel() {
        return equipmentLevel;
    }

    /**
     * 设置equipmentLevel属性的值。
     *
     * @param value allowed object is
     *              {@link HierarchyScopeType }
     */
    public void setEquipmentLevel(HierarchyScopeType value) {
        this.equipmentLevel = value;
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
     */
    public List<EquipmentClassPropertyType> getEquipmentClassProperty() {
        if (equipmentClassProperty == null) {
            equipmentClassProperty = new ArrayList<EquipmentClassPropertyType>();
        }
        return this.equipmentClassProperty;
    }

    /**
     * Gets the value of the equipmentClass property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentClass property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentClass().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentClassType }
     */
    public List<EquipmentClassType> getEquipmentClass() {
        if (equipmentClass == null) {
            equipmentClass = new ArrayList<EquipmentClassType>();
        }
        return this.equipmentClass;
    }

    /**
     * Gets the value of the usesPropertiesOfEquipmentClassID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usesPropertiesOfEquipmentClassID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsesPropertiesOfEquipmentClassID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getUsesPropertiesOfEquipmentClassID() {
        if (usesPropertiesOfEquipmentClassID == null) {
            usesPropertiesOfEquipmentClassID = new ArrayList<IdentifierType>();
        }
        return this.usesPropertiesOfEquipmentClassID;
    }

    /**
     * Gets the value of the equipmentID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getEquipmentID() {
        if (equipmentID == null) {
            equipmentID = new ArrayList<IdentifierType>();
        }
        return this.equipmentID;
    }

    /**
     * Gets the value of the equipmentCapabilityTestSpecificationID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentCapabilityTestSpecificationID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentCapabilityTestSpecificationID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getEquipmentCapabilityTestSpecificationID() {
        if (equipmentCapabilityTestSpecificationID == null) {
            equipmentCapabilityTestSpecificationID = new ArrayList<IdentifierType>();
        }
        return this.equipmentCapabilityTestSpecificationID;
    }

}
