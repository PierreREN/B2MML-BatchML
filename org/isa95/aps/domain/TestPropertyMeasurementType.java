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

@Entity(name = "TestPropertyMeasurement")
public class TestPropertyMeasurementType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private DateTimeType measurementDate;
    private ValueType value;
    private DateTimeType expiration;
    private IdentifierType workDefinitionID;

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

    public DateTimeType getMeasurementDate() {
        return measurementDate;
    }

    public void setMeasurementDate(DateTimeType measurementDate) {
        this.measurementDate = measurementDate;
    }

    public ValueType getValue() {
        return value;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }

    public DateTimeType getExpiration() {
        return expiration;
    }

    public void setExpiration(DateTimeType expiration) {
        this.expiration = expiration;
    }

    public IdentifierType getWorkDefinitionID() {
        return workDefinitionID;
    }

    public void setWorkDefinitionID(IdentifierType workDefinitionID) {
        this.workDefinitionID = workDefinitionID;
    }
}
