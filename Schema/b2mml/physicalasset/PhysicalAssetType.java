//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 12:57:50 PM CST 
//


package isa95.aps.interfaces.b2mml.physicalasset;

import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>PhysicalAssetType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="PhysicalAssetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="FixedAssetID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="VendorID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="SpatialDefinitionType" type="{http://www.mesa.org/xml/B2MML}SpatialDefinitionType" minOccurs="0"/>
 *         &lt;element name="PhysicalLocation" type="{http://www.mesa.org/xml/B2MML}ResourceLocationTypeType" minOccurs="0"/>
 *         &lt;element name="EquipmentLevel" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="EquipmentAssetMappingType" type="{http://www.mesa.org/xml/B2MML}EquipmentAssetMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetProperty" type="{http://www.mesa.org/xml/B2MML}PhysicalAssetPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAsset" type="{http://www.mesa.org/xml/B2MML}PhysicalAssetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetCapabilityTestSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}PhysicalAsset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalAssetType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "fixedAssetID",
        "vendorID",
        "spatialDefinition",
        "physicalLocation",
        "equipmentLevel",
        "equipmentAssetMapping",
        "physicalAssetProperty",
        "physicalAsset",
        "physicalAssetClassID",
        "physicalAssetCapabilityTestSpecificationID"
})
public class PhysicalAssetType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "FixedAssetID")
    protected IdentifierType fixedAssetID;
    @XmlElement(name = "VendorID")
    protected IdentifierType vendorID;
    @XmlElement(name = "SpatialDefinitionType")
    protected SpatialDefinitionType spatialDefinition;
    @XmlElement(name = "PhysicalLocation")
    protected ResourceLocationType physicalLocation;
    @XmlElement(name = "EquipmentLevel")
    protected HierarchyScopeType equipmentLevel;
    @XmlElement(name = "EquipmentAssetMappingType")
    protected List<EquipmentAssetMappingType> equipmentAssetMapping;
    @XmlElement(name = "PhysicalAssetProperty")
    protected List<PhysicalAssetPropertyType> physicalAssetProperty;
    @XmlElement(name = "PhysicalAsset")
    protected List<PhysicalAssetType> physicalAsset;
    @XmlElement(name = "PhysicalAssetClassID")
    protected List<IdentifierType> physicalAssetClassID;
    @XmlElement(name = "PhysicalAssetCapabilityTestSpecificationID")
    protected List<IdentifierType> physicalAssetCapabilityTestSpecificationID;

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
     * 获取fixedAssetID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getFixedAssetID() {
        return fixedAssetID;
    }

    /**
     * 设置fixedAssetID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setFixedAssetID(IdentifierType value) {
        this.fixedAssetID = value;
    }

    /**
     * 获取vendorID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getVendorID() {
        return vendorID;
    }

    /**
     * 设置vendorID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setVendorID(IdentifierType value) {
        this.vendorID = value;
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
     * 获取physicalLocation属性的值。
     *
     * @return possible object is
     * {@link ResourceLocationType }
     */
    public ResourceLocationType getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * 设置physicalLocation属性的值。
     *
     * @param value allowed object is
     *              {@link ResourceLocationType }
     */
    public void setPhysicalLocation(ResourceLocationType value) {
        this.physicalLocation = value;
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
     * Gets the value of the physicalAssetProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAssetPropertyType }
     */
    public List<PhysicalAssetPropertyType> getPhysicalAssetProperty() {
        if (physicalAssetProperty == null) {
            physicalAssetProperty = new ArrayList<PhysicalAssetPropertyType>();
        }
        return this.physicalAssetProperty;
    }

    /**
     * Gets the value of the physicalAsset property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAsset property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAsset().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAssetType }
     */
    public List<PhysicalAssetType> getPhysicalAsset() {
        if (physicalAsset == null) {
            physicalAsset = new ArrayList<PhysicalAssetType>();
        }
        return this.physicalAsset;
    }

    /**
     * Gets the value of the physicalAssetClassID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetClassID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetClassID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getPhysicalAssetClassID() {
        if (physicalAssetClassID == null) {
            physicalAssetClassID = new ArrayList<IdentifierType>();
        }
        return this.physicalAssetClassID;
    }

    /**
     * Gets the value of the physicalAssetCapabilityTestSpecificationID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetCapabilityTestSpecificationID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetCapabilityTestSpecificationID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getPhysicalAssetCapabilityTestSpecificationID() {
        if (physicalAssetCapabilityTestSpecificationID == null) {
            physicalAssetCapabilityTestSpecificationID = new ArrayList<IdentifierType>();
        }
        return this.physicalAssetCapabilityTestSpecificationID;
    }

}
