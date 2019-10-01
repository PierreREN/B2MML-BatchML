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

@Entity(name = "MaterialDefinition")
public class MaterialDefinitionType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private HierarchyScopeType hierarchyScope;
    private SpatialDefinitionType spatialDefinition;
    private List<MaterialDefinitionPropertyType> materialDefinitionProperty;
    private List<MaterialClassType> materialClassID;
    private List<MaterialLotType> materialLotID;
    private List<TestSpecificationType> materialTestSpecificationID;
    private List<MaterialDefinitionType> assemblyDefinitionID;
    private AssemblyTypeType assemblyType;
    private AssemblyRelationshipType assemblyRelationship;

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

    public SpatialDefinitionType getSpatialDefinition() {
        return spatialDefinition;
    }

    public void setSpatialDefinition(SpatialDefinitionType spatialDefinition) {
        this.spatialDefinition = spatialDefinition;
    }

    public List<MaterialDefinitionPropertyType> getMaterialDefinitionProperty() {
        return materialDefinitionProperty;
    }

    public void setMaterialDefinitionProperty(List<MaterialDefinitionPropertyType> materialDefinitionProperty) {
        this.materialDefinitionProperty = materialDefinitionProperty;
    }

    public List<MaterialClassType> getMaterialClassID() {
        return materialClassID;
    }

    public void setMaterialClassID(List<MaterialClassType> materialClassID) {
        this.materialClassID = materialClassID;
    }

    public List<MaterialLotType> getMaterialLotID() {
        return materialLotID;
    }

    public void setMaterialLotID(List<MaterialLotType> materialLotID) {
        this.materialLotID = materialLotID;
    }

    public List<TestSpecificationType> getMaterialTestSpecificationID() {
        return materialTestSpecificationID;
    }

    public void setMaterialTestSpecificationID(List<TestSpecificationType> materialTestSpecificationID) {
        this.materialTestSpecificationID = materialTestSpecificationID;
    }

    public List<MaterialDefinitionType> getAssemblyDefinitionID() {
        return assemblyDefinitionID;
    }

    public void setAssemblyDefinitionID(List<MaterialDefinitionType> assemblyDefinitionID) {
        this.assemblyDefinitionID = assemblyDefinitionID;
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
}
