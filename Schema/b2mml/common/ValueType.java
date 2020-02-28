//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.persistence.Embeddable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>ValueType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueStringType" type="{http://www.mesa.org/xml/B2MML}ValueStringType"/>
 *         &lt;element name="DataTypeType" type="{http://www.mesa.org/xml/B2MML}DataTypeType" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasureType" type="{http://www.mesa.org/xml/B2MML}UnitOfMeasureType" minOccurs="0"/>
 *         &lt;element name="Key" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}ValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueType", propOrder = {
        "valueString",
        "dataType",
        "unitOfMeasure",
        "key"
})
@Embeddable
public class ValueType {

    @XmlElement(name = "ValueStringType", required = true, nillable = true)
    private ValueStringType valueString;
    @XmlElementRef(name = "DataTypeType", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    private JAXBElement<DataTypeType> dataType;
    @XmlElementRef(name = "UnitOfMeasureType", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    private JAXBElement<UnitOfMeasureType> unitOfMeasure;
    @XmlElement(name = "Key")
    private IdentifierType key;

    /**
     * 获取valueString属性的值。
     *
     * @return possible object is
     * {@link ValueStringType }
     */
    public ValueStringType getValueString() {
        return valueString;
    }

    /**
     * 设置valueString属性的值。
     *
     * @param value allowed object is
     *              {@link ValueStringType }
     */
    public void setValueString(ValueStringType value) {
        this.valueString = value;
    }

    /**
     * 获取dataType属性的值。
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     */
    public JAXBElement<DataTypeType> getDataType() {
        return dataType;
    }

    /**
     * 设置dataType属性的值。
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     */
    public void setDataType(JAXBElement<DataTypeType> value) {
        this.dataType = value;
    }

    /**
     * 获取unitOfMeasure属性的值。
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link UnitOfMeasureType }{@code >}
     */
    public JAXBElement<UnitOfMeasureType> getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link UnitOfMeasureType }{@code >}
     */
    public void setUnitOfMeasure(JAXBElement<UnitOfMeasureType> value) {
        this.unitOfMeasure = value;
    }

    /**
     * 获取key属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getKey() {
        return key;
    }

    /**
     * 设置key属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setKey(IdentifierType value) {
        this.key = value;
    }

}
