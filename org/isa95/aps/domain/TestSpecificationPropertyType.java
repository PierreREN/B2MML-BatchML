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

@Entity(name = "TestSpecificationProperty")
public class TestSpecificationPropertyType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private List<ValueType> value;
    private List<TestSpecificationPropertyType> testSpecificationProperty;

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

    public List<ValueType> getValue() {
        return value;
    }

    public void setValue(List<ValueType> value) {
        this.value = value;
    }

    public List<TestSpecificationPropertyType> getTestSpecificationProperty() {
        return testSpecificationProperty;
    }

    public void setTestSpecificationProperty(List<TestSpecificationPropertyType> testSpecificationProperty) {
        this.testSpecificationProperty = testSpecificationProperty;
    }
}