//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QuantityValueType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QuantityValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuantityString" type="{http://www.mesa.org/xml/B2MML}QuantityStringType"/>
 *         &lt;element name="DataType" type="{http://www.mesa.org/xml/B2MML}DataTypeType" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.mesa.org/xml/B2MML}UnitOfMeasureType" minOccurs="0"/>
 *         &lt;element name="Key" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}Quantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityValueType", propOrder = {
    "quantityString",
    "dataType",
    "unitOfMeasure",
    "key"
})
public class QuantityValueType {

    @XmlElement(name = "QuantityString", required = true, nillable = true)
    protected QuantityStringType quantityString;
    @XmlElementRef(name = "DataType", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<DataTypeType> dataType;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitOfMeasureType> unitOfMeasure;
    @XmlElement(name = "Key")
    protected IdentifierType key;

    /**
     * 获取quantityString属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QuantityStringType }
     *     
     */
    public QuantityStringType getQuantityString() {
        return quantityString;
    }

    /**
     * 设置quantityString属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityStringType }
     *     
     */
    public void setQuantityString(QuantityStringType value) {
        this.quantityString = value;
    }

    /**
     * 获取dataType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     
     */
    public JAXBElement<DataTypeType> getDataType() {
        return dataType;
    }

    /**
     * 设置dataType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     
     */
    public void setDataType(JAXBElement<DataTypeType> value) {
        this.dataType = value;
    }

    /**
     * 获取unitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitOfMeasureType }{@code >}
     *     
     */
    public JAXBElement<UnitOfMeasureType> getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitOfMeasureType }{@code >}
     *     
     */
    public void setUnitOfMeasure(JAXBElement<UnitOfMeasureType> value) {
        this.unitOfMeasure = value;
    }

    /**
     * 获取key属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getKey() {
        return key;
    }

    /**
     * 设置key属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setKey(IdentifierType value) {
        this.key = value;
    }

}
