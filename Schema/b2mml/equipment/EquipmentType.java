//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 12:54:35 PM CST 
//


package isa95.aps.interfaces.b2mml.equipment;

import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>EquipmentType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="EquipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="EquipmentLevel" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="SpatialDefinitionType" type="{http://www.mesa.org/xml/B2MML}SpatialDefinitionType" minOccurs="0"/>
 *         &lt;element name="EquipmentAssetMappingType" type="{http://www.mesa.org/xml/B2MML}EquipmentAssetMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationalLocation" type="{http://www.mesa.org/xml/B2MML}ResourceLocationTypeType" minOccurs="0"/>
 *         &lt;element name="EquipmentProperty" type="{http://www.mesa.org/xml/B2MML}EquipmentPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Equipment" type="{http://www.mesa.org/xml/B2MML}EquipmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentCapabilityTestSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}Equipment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "equipmentLevel",
        "spatialDefinition",
        "equipmentAssetMapping",
        "operationalLocation",
        "equipmentProperty",
        "equipment",
        "equipmentClassID",
        "equipmentCapabilityTestSpecificationID"
})
public class EquipmentType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "EquipmentLevel")
    protected HierarchyScopeType equipmentLevel;
    @XmlElement(name = "SpatialDefinitionType")
    protected SpatialDefinitionType spatialDefinition;
    @XmlElement(name = "EquipmentAssetMappingType")
    protected List<EquipmentAssetMappingType> equipmentAssetMapping;
    @XmlElement(name = "OperationalLocation")
    protected ResourceLocationType operationalLocation;
    @XmlElement(name = "EquipmentProperty")
    protected List<EquipmentPropertyType> equipmentProperty;
    @XmlElement(name = "Equipment")
    protected List<EquipmentType> equipment;
    @XmlElement(name = "EquipmentClassID")
    protected List<IdentifierType> equipmentClassID;
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
     * 获取spatialDefinition属性的值。
     *
     * @return possible object is
     * {@link SpatialDefinitionType }
     */
    public SpatialDefinitionType getSpatialDefinition() {
        return spatialDefinition;
    }

    /**
     * 设置spatialDefinition属性的值。
     *
     * @param value allowed object is
     *              {@link SpatialDefinitionType }
     */
    public void setSpatialDefinition(SpatialDefinitionType value) {
        this.spatialDefinition = value;
    }

    /**
     * Gets the value of the equipmentAssetMapping property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentAssetMapping property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentAssetMapping().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentAssetMappingType }
     */
    public List<EquipmentAssetMappingType> getEquipmentAssetMapping() {
        if (equipmentAssetMapping == null) {
            equipmentAssetMapping = new ArrayList<EquipmentAssetMappingType>();
        }
        return this.equipmentAssetMapping;
    }

    /**
     * 获取operationalLocation属性的值。
     *
     * @return possible object is
     * {@link ResourceLocationType }
     */
    public ResourceLocationType getOperationalLocation() {
        return operationalLocation;
    }

    /**
     * 设置operationalLocation属性的值。
     *
     * @param value allowed object is
     *              {@link ResourceLocationType }
     */
    public void setOperationalLocation(ResourceLocationType value) {
        this.operationalLocation = value;
    }

    /**
     * Gets the value of the equipmentProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentPropertyType }
     */
    public List<EquipmentPropertyType> getEquipmentProperty() {
        if (equipmentProperty == null) {
            equipmentProperty = new ArrayList<EquipmentPropertyType>();
        }
        return this.equipmentProperty;
    }

    /**
     * Gets the value of the equipment property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentType }
     */
    public List<EquipmentType> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<EquipmentType>();
        }
        return this.equipment;
    }

    /**
     * Gets the value of the equipmentClassID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentClassID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentClassID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getEquipmentClassID() {
        if (equipmentClassID == null) {
            equipmentClassID = new ArrayList<IdentifierType>();
        }
        return this.equipmentClassID;
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
