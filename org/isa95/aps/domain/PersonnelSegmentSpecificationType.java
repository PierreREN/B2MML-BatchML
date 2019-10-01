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

@Entity(name = "PersonnelSegmentSpecification")
public class PersonnelSegmentSpecificationType {

    @EmbeddedId
    private IdentifierType id;
    private IdentifierType personnelClassID;
    private IdentifierType personID;
    private List<DescriptionType> description;
    private CodeType personnelUse;
    private HierarchyScopeType hierarchyScope;
    private SpatialDefinitionType spatialDefinition;
    private ResourceLocationType operationalLocation;
    private List<QuantityValueType> quantity;
    private List<PersonnelSegmentSpecificationPropertyType> personnelSegmentSpecificationProperty;
    private List<PersonnelSegmentSpecificationType> personnelSegmentSpecification;
    private List<TestSpecificationType> testSpecification;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public IdentifierType getPersonnelClassID() {
        return personnelClassID;
    }

    public void setPersonnelClassID(IdentifierType personnelClassID) {
        this.personnelClassID = personnelClassID;
    }

    public IdentifierType getPersonID() {
        return personID;
    }

    public void setPersonID(IdentifierType personID) {
        this.personID = personID;
    }

    public List<DescriptionType> getDescription() {
        return description;
    }

    public void setDescription(List<DescriptionType> description) {
        this.description = description;
    }

    public CodeType getPersonnelUse() {
        return personnelUse;
    }

    public void setPersonnelUse(CodeType personnelUse) {
        this.personnelUse = personnelUse;
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

    public List<PersonnelSegmentSpecificationPropertyType> getPersonnelSegmentSpecificationProperty() {
        return personnelSegmentSpecificationProperty;
    }

    public void setPersonnelSegmentSpecificationProperty(List<PersonnelSegmentSpecificationPropertyType> personnelSegmentSpecificationProperty) {
        this.personnelSegmentSpecificationProperty = personnelSegmentSpecificationProperty;
    }

    public List<PersonnelSegmentSpecificationType> getPersonnelSegmentSpecification() {
        return personnelSegmentSpecification;
    }

    public void setPersonnelSegmentSpecification(List<PersonnelSegmentSpecificationType> personnelSegmentSpecification) {
        this.personnelSegmentSpecification = personnelSegmentSpecification;
    }

    public List<TestSpecificationType> getTestSpecification() {
        return testSpecification;
    }

    public void setTestSpecification(List<TestSpecificationType> testSpecification) {
        this.testSpecification = testSpecification;
    }
}
