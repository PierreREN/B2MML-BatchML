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

@Entity(name = "PhysicalAssetSegmentSpecification")
public class PhysicalAssetSegmentSpecificationType {

    @EmbeddedId
    private IdentifierType id;
    private IdentifierType physicalAssetClassID;
    private IdentifierType physicalAssetID;
    private List<DescriptionType> description;
    private CodeType physicalAssetUse;
    private HierarchyScopeType hierarchyScope;
    private SpatialDefinitionType spatialDefinition;
    private ResourceLocationType operationalLocation;
    private List<QuantityValueType> quantity;
    private List<PhysicalAssetSegmentSpecificationPropertyType> physicalAssetSegmentSpecificationProperty;
    private List<PhysicalAssetSegmentSpecificationType> physicalAssetSegmentSpecification;
    private List<TestSpecificationType> testSpecification;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public IdentifierType getPhysicalAssetClassID() {
        return physicalAssetClassID;
    }

    public void setPhysicalAssetClassID(IdentifierType physicalAssetClassID) {
        this.physicalAssetClassID = physicalAssetClassID;
    }

    public IdentifierType getPhysicalAssetID() {
        return physicalAssetID;
    }

    public void setPhysicalAssetID(IdentifierType physicalAssetID) {
        this.physicalAssetID = physicalAssetID;
    }

    public List<DescriptionType> getDescription() {
        return description;
    }

    public void setDescription(List<DescriptionType> description) {
        this.description = description;
    }

    public CodeType getPhysicalAssetUse() {
        return physicalAssetUse;
    }

    public void setPhysicalAssetUse(CodeType physicalAssetUse) {
        this.physicalAssetUse = physicalAssetUse;
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

    public List<PhysicalAssetSegmentSpecificationPropertyType> getPhysicalAssetSegmentSpecificationProperty() {
        return physicalAssetSegmentSpecificationProperty;
    }

    public void setPhysicalAssetSegmentSpecificationProperty(List<PhysicalAssetSegmentSpecificationPropertyType> physicalAssetSegmentSpecificationProperty) {
        this.physicalAssetSegmentSpecificationProperty = physicalAssetSegmentSpecificationProperty;
    }

    public List<PhysicalAssetSegmentSpecificationType> getPhysicalAssetSegmentSpecification() {
        return physicalAssetSegmentSpecification;
    }

    public void setPhysicalAssetSegmentSpecification(List<PhysicalAssetSegmentSpecificationType> physicalAssetSegmentSpecification) {
        this.physicalAssetSegmentSpecification = physicalAssetSegmentSpecification;
    }

    public List<TestSpecificationType> getTestSpecification() {
        return testSpecification;
    }

    public void setTestSpecification(List<TestSpecificationType> testSpecification) {
        this.testSpecification = testSpecification;
    }
}
