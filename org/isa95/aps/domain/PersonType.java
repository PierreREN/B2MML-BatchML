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

@Entity(name = "Person")
public class PersonType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private HierarchyScopeType hierarchyScope;
    private PersonNameType personName;
    private SpatialDefinitionType spatialDefinition;
    private ResourceLocationType operationalLocation;
    private List<PersonPropertyType> personProperty;
    private List<PersonnelClassType> personnelClass;
    private List<TestSpecificationType> qualificationTestSpecification;

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

    public PersonNameType getPersonName() {
        return personName;
    }

    public void setPersonName(PersonNameType personName) {
        this.personName = personName;
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

    public List<PersonPropertyType> getPersonProperty() {
        return personProperty;
    }

    public void setPersonProperty(List<PersonPropertyType> personProperty) {
        this.personProperty = personProperty;
    }

    public List<PersonnelClassType> getPersonnelClass() {
        return personnelClass;
    }

    public void setPersonnelClass(List<PersonnelClassType> personnelClass) {
        this.personnelClass = personnelClass;
    }

    public List<TestSpecificationType> getQualificationTestSpecification() {
        return qualificationTestSpecification;
    }

    public void setQualificationTestSpecification(List<TestSpecificationType> qualificationTestSpecification) {
        this.qualificationTestSpecification = qualificationTestSpecification;
    }
}
