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

@Entity(name = "MaterialClass")
public class MaterialClassType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private HierarchyScopeType hierarchyScope;
    private List<MaterialClassType> usesPropertiesOfMaterialClass;
    private List<MaterialClassPropertyType> materialClassProperty;
    private List<MaterialDefinitionType> materialDefinition;
    private List<TestSpecificationType> materialTestSpecification;
    private List<MaterialClassType> assemblyClass;
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

    public List<MaterialClassType> getUsesPropertiesOfMaterialClass() {
        return usesPropertiesOfMaterialClass;
    }

    public void setUsesPropertiesOfMaterialClass(List<MaterialClassType> usesPropertiesOfMaterialClass) {
        this.usesPropertiesOfMaterialClass = usesPropertiesOfMaterialClass;
    }

    public List<MaterialClassPropertyType> getMaterialClassProperty() {
        return materialClassProperty;
    }

    public void setMaterialClassProperty(List<MaterialClassPropertyType> materialClassProperty) {
        this.materialClassProperty = materialClassProperty;
    }

    public List<MaterialDefinitionType> getMaterialDefinition() {
        return materialDefinition;
    }

    public void setMaterialDefinition(List<MaterialDefinitionType> materialDefinition) {
        this.materialDefinition = materialDefinition;
    }

    public List<TestSpecificationType> getMaterialTestSpecification() {
        return materialTestSpecification;
    }

    public void setMaterialTestSpecification(List<TestSpecificationType> materialTestSpecification) {
        this.materialTestSpecification = materialTestSpecification;
    }

    public List<MaterialClassType> getAssemblyClass() {
        return assemblyClass;
    }

    public void setAssemblyClass(List<MaterialClassType> assemblyClass) {
        this.assemblyClass = assemblyClass;
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
