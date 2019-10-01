//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.List;

@Entity(name = "PhysicalAsset")
public class PhysicalAssetType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private HierarchyScopeType hierarchyScope;
    private IdentifierType fixedAssetID;
    private IdentifierType vendorID;
    private SpatialDefinitionType spatialDefinition;
    private ResourceLocationType physicalLocation;
    private HierarchyScopeType equipmentLevel;
    private List<EquipmentAssetMappingType> equipmentAssetMapping;
    private List<PhysicalAssetPropertyType> physicalAssetProperty;
    private List<PhysicalAssetType> physicalAsset;
    private List<PhysicalAssetClassType> physicalAssetClass;
    private List<TestSpecificationType> physicalAssetCapabilityTestSpecification;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public List<DescriptionType> getDescription() {
        return description;
    }

    public void setDescription(List<DescriptionType> description) {
        this.description = description;
    }

    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    public void setHierarchyScope(HierarchyScopeType hierarchyScope) {
        this.hierarchyScope = hierarchyScope;
    }

    public IdentifierType getFixedAssetID() {
        return fixedAssetID;
    }

    public void setFixedAssetID(IdentifierType fixedAssetID) {
        this.fixedAssetID = fixedAssetID;
    }

    public IdentifierType getVendorID() {
        return vendorID;
    }

    public void setVendorID(IdentifierType vendorID) {
        this.vendorID = vendorID;
    }

    public SpatialDefinitionType getSpatialDefinition() {
        return spatialDefinition;
    }

    public void setSpatialDefinition(SpatialDefinitionType spatialDefinition) {
        this.spatialDefinition = spatialDefinition;
    }

    public ResourceLocationType getPhysicalLocation() {
        return physicalLocation;
    }

    public void setPhysicalLocation(ResourceLocationType physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    public HierarchyScopeType getEquipmentLevel() {
        return equipmentLevel;
    }

    public void setEquipmentLevel(HierarchyScopeType equipmentLevel) {
        this.equipmentLevel = equipmentLevel;
    }

    public List<EquipmentAssetMappingType> getEquipmentAssetMapping() {
        return equipmentAssetMapping;
    }

    public void setEquipmentAssetMapping(List<EquipmentAssetMappingType> equipmentAssetMapping) {
        this.equipmentAssetMapping = equipmentAssetMapping;
    }

    public List<PhysicalAssetPropertyType> getPhysicalAssetProperty() {
        return physicalAssetProperty;
    }

    public void setPhysicalAssetProperty(List<PhysicalAssetPropertyType> physicalAssetProperty) {
        this.physicalAssetProperty = physicalAssetProperty;
    }

    public List<PhysicalAssetType> getPhysicalAsset() {
        return physicalAsset;
    }

    public void setPhysicalAsset(List<PhysicalAssetType> physicalAsset) {
        this.physicalAsset = physicalAsset;
    }

    public List<PhysicalAssetClassType> getPhysicalAssetClass() {
        return physicalAssetClass;
    }

    public void setPhysicalAssetClass(List<PhysicalAssetClassType> physicalAssetClass) {
        this.physicalAssetClass = physicalAssetClass;
    }

    public List<TestSpecificationType> getPhysicalAssetCapabilityTestSpecification() {
        return physicalAssetCapabilityTestSpecification;
    }

    public void setPhysicalAssetCapabilityTestSpecification(List<TestSpecificationType> physicalAssetCapabilityTestSpecification) {
        this.physicalAssetCapabilityTestSpecification = physicalAssetCapabilityTestSpecification;
    }
}
