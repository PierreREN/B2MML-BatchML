//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.persistence.Embeddable;

@Embeddable
public class QuantityValueType {

    private QuantityStringType quantityString;
    private DataTypeType dataType;
    private UnitOfMeasureType unitOfMeasure;
    private IdentifierType key;

    public QuantityStringType getQuantityString() {
        return quantityString;
    }

    public void setQuantityString(QuantityStringType quantityString) {
        this.quantityString = quantityString;
    }

    public DataTypeType getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeType dataType) {
        this.dataType = dataType;
    }

    public UnitOfMeasureType getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasureType unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public IdentifierType getKey() {
        return key;
    }

    public void setKey(IdentifierType key) {
        this.key = key;
    }
}
