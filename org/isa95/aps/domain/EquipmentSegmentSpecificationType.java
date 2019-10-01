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

@Entity(name = "EquipmentSegmentSpecification")
public class EquipmentSegmentSpecificationType {

    @EmbeddedId
    private IdentifierType id;
    private IdentifierType equipmentClassID;
    private IdentifierType equipmentID;
    private List<DescriptionType> description;
    private CodeType equipmentUse;
    private HierarchyScopeType hierarchyScope;
    private SpatialDefinitionType spatialDefinition;
    private ResourceLocationType operationalLocation;
    private List<QuantityValueType> quantity;
    private List<EquipmentSegmentSpecificationPropertyType> equipmentSegmentSpecificationProperty;
    private List<EquipmentSegmentSpecificationType> equipmentSegmentSpecification;
    private List<TestSpecificationType> testSpecification;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public IdentifierType getEquipmentClassID() {
        return equipmentClassID;
    }

    public void setEquipmentClassID(IdentifierType equipmentClassID) {
        this.equipmentClassID = equipmentClassID;
    }

    public IdentifierType getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(IdentifierType equipmentID) {
        this.equipmentID = equipmentID;
    }

    public List<DescriptionType> getDescription() {
        return description;
    }

    public void setDescription(List<DescriptionType> description) {
        this.description = description;
    }

    public CodeType getEquipmentUse() {
        return equipmentUse;
    }

    public void setEquipmentUse(CodeType equipmentUse) {
        this.equipmentUse = equipmentUse;
    }

    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    public void setHierarchyScope(HierarchyScopeType hierarchyScope) {
        this.hierarchyScope = hierarchyScope;
    }

    public SpatialDefinitionType getSpatialDefinition() {
        return spatialDefinition;
    }

    public void setSpatialDefinition(SpatialDefinitionType spatialDefinition) {
        this.spatialDefinition = spatialDefinition;
    }

    public ResourceLocationType getOperationalLocation() {
        return operationalLocation;
    }

    public void setOperationalLocation(ResourceLocationType operationalLocation) {
        this.operationalLocation = operationalLocation;
    }

    public List<QuantityValueType> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<QuantityValueType> quantity) {
        this.quantity = quantity;
    }

    public List<EquipmentSegmentSpecificationPropertyType> getEquipmentSegmentSpecificationProperty() {
        return equipmentSegmentSpecificationProperty;
    }

    public void setEquipmentSegmentSpecificationProperty(List<EquipmentSegmentSpecificationPropertyType> equipmentSegmentSpecificationProperty) {
        this.equipmentSegmentSpecificationProperty = equipmentSegmentSpecificationProperty;
    }

    public List<EquipmentSegmentSpecificationType> getEquipmentSegmentSpecification() {
        return equipmentSegmentSpecification;
    }

    public void setEquipmentSegmentSpecification(List<EquipmentSegmentSpecificationType> equipmentSegmentSpecification) {
        this.equipmentSegmentSpecification = equipmentSegmentSpecification;
    }

    public List<TestSpecificationType> getTestSpecification() {
        return testSpecification;
    }

    public void setTestSpecification(List<TestSpecificationType> testSpecification) {
        this.testSpecification = testSpecification;
    }
}
