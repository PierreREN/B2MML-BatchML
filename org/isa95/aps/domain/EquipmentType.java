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

@Entity(name = "Equipment")
public class EquipmentType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private HierarchyScopeType hierarchyScope;
    private HierarchyScopeType equipmentLevel;
    private SpatialDefinitionType spatialDefinition;
    private List<EquipmentAssetMappingType> equipmentAssetMapping;
    private ResourceLocationType operationalLocation;
    private List<EquipmentPropertyType> equipmentProperty;
    private List<EquipmentType> equipment;
    private List<EquipmentClassType> equipmentClass;
    private List<TestSpecificationType> equipmentCapabilityTestSpecification;

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

    public HierarchyScopeType getEquipmentLevel() {
        return equipmentLevel;
    }

    public void setEquipmentLevel(HierarchyScopeType equipmentLevel) {
        this.equipmentLevel = equipmentLevel;
    }

    public SpatialDefinitionType getSpatialDefinition() {
        return spatialDefinition;
    }

    public void setSpatialDefinition(SpatialDefinitionType spatialDefinition) {
        this.spatialDefinition = spatialDefinition;
    }

    public List<EquipmentAssetMappingType> getEquipmentAssetMapping() {
        return equipmentAssetMapping;
    }

    public void setEquipmentAssetMapping(List<EquipmentAssetMappingType> equipmentAssetMapping) {
        this.equipmentAssetMapping = equipmentAssetMapping;
    }

    public ResourceLocationType getOperationalLocation() {
        return operationalLocation;
    }

    public void setOperationalLocation(ResourceLocationType operationalLocation) {
        this.operationalLocation = operationalLocation;
    }

    public List<EquipmentPropertyType> getEquipmentProperty() {
        return equipmentProperty;
    }

    public void setEquipmentProperty(List<EquipmentPropertyType> equipmentProperty) {
        this.equipmentProperty = equipmentProperty;
    }

    public List<EquipmentType> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<EquipmentType> equipment) {
        this.equipment = equipment;
    }

    public List<EquipmentClassType> getEquipmentClass() {
        return equipmentClass;
    }

    public void setEquipmentClass(List<EquipmentClassType> equipmentClass) {
        this.equipmentClass = equipmentClass;
    }

    public List<TestSpecificationType> getEquipmentCapabilityTestSpecification() {
        return equipmentCapabilityTestSpecification;
    }

    public void setEquipmentCapabilityTestSpecification(List<TestSpecificationType> equipmentCapabilityTestSpecification) {
        this.equipmentCapabilityTestSpecification = equipmentCapabilityTestSpecification;
    }
}
