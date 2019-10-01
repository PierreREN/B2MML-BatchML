//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>OrderedDataType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OrderedDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderIndex" type="{http://www.mesa.org/xml/B2MML}NumericType" minOccurs="0"/>
 *         &lt;element name="TimeValue" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DataValue" type="{http://www.mesa.org/xml/B2MML}DataValueType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderedDataType", propOrder = {
        "orderIndex",
        "timeValue",
        "dataValue"
})
public class OrderedDataType {

    @XmlElement(name = "OrderIndex")
    protected NumericType orderIndex;
    @XmlElement(name = "TimeValue")
    protected DateTimeType timeValue;
    @XmlElement(name = "DataValue", required = true)
    protected List<DataValueType> dataValue;

    /**
     * 获取orderIndex属性的值。
     *
     * @return possible object is
     * {@link NumericType }
     */
    public NumericType getOrderIndex() {
        return orderIndex;
    }

    /**
     * 设置orderIndex属性的值。
     *
     * @param value allowed object is
     *              {@link NumericType }
     */
    public void setOrderIndex(NumericType value) {
        this.orderIndex = value;
    }

    /**
     * 获取timeValue属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getTimeValue() {
        return timeValue;
    }

    /**
     * 设置timeValue属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setTimeValue(DateTimeType value) {
        this.timeValue = value;
    }

    /**
     * Gets the value of the dataValue property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataValue property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataValueType }
     */
    public List<DataValueType> getDataValue() {
        if (dataValue == null) {
            dataValue = new ArrayList<DataValueType>();
        }
        return this.dataValue;
    }

}
