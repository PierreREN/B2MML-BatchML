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

@Entity(name = "PersonnelClassProperty")
public class PersonnelClassPropertyType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private ClassPropertyTypeType propertyType;
    private List<ValueType> value;
    private List<PersonnelClassPropertyType> personnelClassProperty;
    private EvaluatedPropertyReferenceType evaluatedPropertyReference;

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

    public ClassPropertyTypeType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(ClassPropertyTypeType propertyType) {
        this.propertyType = propertyType;
    }

    public List<ValueType> getValue() {
        return value;
    }

    public void setValue(List<ValueType> value) {
        this.value = value;
    }

    public List<PersonnelClassPropertyType> getPersonnelClassProperty() {
        return personnelClassProperty;
    }

    public void setPersonnelClassProperty(List<PersonnelClassPropertyType> personnelClassProperty) {
        this.personnelClassProperty = personnelClassProperty;
    }

    public EvaluatedPropertyReferenceType getEvaluatedPropertyReference() {
        return evaluatedPropertyReference;
    }

    public void setEvaluatedPropertyReference(EvaluatedPropertyReferenceType evaluatedPropertyReference) {
        this.evaluatedPropertyReference = evaluatedPropertyReference;
    }
}