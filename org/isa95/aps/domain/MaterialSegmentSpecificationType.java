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

@Entity(name = "MaterialSegmentSpecification")
public class MaterialSegmentSpecificationType {

    @EmbeddedId
    private IdentifierType id;
    private IdentifierType materialClassID;
    private IdentifierType materialDefinitionID;
    private List<DescriptionType> description;
    private AssemblyTypeType assemblyType;
    private AssemblyRelationshipType assemblyRelationship;
    private List<IdentifierType> assemblySpecificationID;
    private MaterialUseType materialUse;
    private HierarchyScopeType hierarchyScope;
    private SpatialDefinitionType spatialDefinition;
    private ResourceLocationType operationalLocation;
    private List<QuantityValueType> quantity;
    private List<MaterialSegmentSpecificationPropertyType> materialSegmentSpecificationProperty;
    private List<MaterialSegmentSpecificationType> materialSegmentSpecification;
    private List<TestSpecificationType> testSpecification;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public IdentifierType getMaterialClassID() {
        return materialClassID;
    }

    public void setMaterialClassID(IdentifierType materialClassID) {
        this.materialClassID = materialClassID;
    }

    public IdentifierType getMaterialDefinitionID() {
        return materialDefinitionID;
    }

    public void setMaterialDefinitionID(IdentifierType materialDefinitionID) {
        this.materialDefinitionID = materialDefinitionID;
    }

    public List<DescriptionType> getDescription() {
        return description;
    }

    public void setDescription(List<DescriptionType> description) {
        this.description = description;
    }

    public AssemblyTypeType getAssemblyType() {
        return assemblyType;
    }

    public void setAssemblyType(AssemblyTypeType assemblyType) {
        this.assemblyType = assemblyType;
    }

    public AssemblyRelationshipType getAssemblyRelationship() {
        return assemblyRelationship;
    }

    public void setAssemblyRelationship(AssemblyRelationshipType assemblyRelationship) {
        this.assemblyRelationship = assemblyRelationship;
    }

    public List<IdentifierType> getAssemblySpecificationID() {
        return assemblySpecificationID;
    }

    public void setAssemblySpecificationID(List<IdentifierType> assemblySpecificationID) {
        this.assemblySpecificationID = assemblySpecificationID;
    }

    public MaterialUseType getMaterialUse() {
        return materialUse;
    }

    public void setMaterialUse(MaterialUseType materialUse) {
        this.materialUse = materialUse;
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

    public List<MaterialSegmentSpecificationPropertyType> getMaterialSegmentSpecificationProperty() {
        return materialSegmentSpecificationProperty;
    }

    public void setMaterialSegmentSpecificationProperty(List<MaterialSegmentSpecificationPropertyType> materialSegmentSpecificationProperty) {
        this.materialSegmentSpecificationProperty = materialSegmentSpecificationProperty;
    }

    public List<MaterialSegmentSpecificationType> getMaterialSegmentSpecification() {
        return materialSegmentSpecification;
    }

    public void setMaterialSegmentSpecification(List<MaterialSegmentSpecificationType> materialSegmentSpecification) {
        this.materialSegmentSpecification = materialSegmentSpecification;
    }

    public List<TestSpecificationType> getTestSpecification() {
        return testSpecification;
    }

    public void setTestSpecification(List<TestSpecificationType> testSpecification) {
        this.testSpecification = testSpecification;
    }
}
