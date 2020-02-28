//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>TestPropertyMeasurementType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TestPropertyMeasurementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MeasurementDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ValueType" type="{http://www.mesa.org/xml/B2MML}ValueType" minOccurs="0"/>
 *         &lt;element name="Expiration" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="WorkDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}TestPropertyMeasurementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestPropertyMeasurementType", propOrder = {
        "id",
        "description",
        "measurementDate",
        "value",
        "expiration",
        "workDefinitionID"
})
public class TestPropertyMeasurementType {

    @XmlElementRef(name = "ID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    private JAXBElement<IdentifierType> id;
    @XmlElement(name = "DescriptionType", nillable = true)
    private List<DescriptionType> description;
    @XmlElementRef(name = "MeasurementDate", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    private JAXBElement<DateTimeType> measurementDate;
    @XmlElementRef(name = "ValueType", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    private JAXBElement<ValueType> value;
    @XmlElementRef(name = "Expiration", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    private JAXBElement<DateTimeType> expiration;
    @XmlElementRef(name = "WorkDefinitionID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    private JAXBElement<IdentifierType> workDefinitionID;

    /**
     * 获取id属性的值。
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     */
    public JAXBElement<IdentifierType> getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     */
    public void setID(JAXBElement<IdentifierType> value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * 获取measurementDate属性的值。
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     */
    public JAXBElement<DateTimeType> getMeasurementDate() {
        return measurementDate;
    }

    /**
     * 设置measurementDate属性的值。
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     */
    public void setMeasurementDate(JAXBElement<DateTimeType> value) {
        this.measurementDate = value;
    }

    /**
     * 获取value属性的值。
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link ValueType }{@code >}
     */
    public JAXBElement<ValueType> getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link ValueType }{@code >}
     */
    public void setValue(JAXBElement<ValueType> value) {
        this.value = value;
    }

    /**
     * 获取expiration属性的值。
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     */
    public JAXBElement<DateTimeType> getExpiration() {
        return expiration;
    }

    /**
     * 设置expiration属性的值。
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     */
    public void setExpiration(JAXBElement<DateTimeType> value) {
        this.expiration = value;
    }

    /**
     * 获取workDefinitionID属性的值。
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     */
    public JAXBElement<IdentifierType> getWorkDefinitionID() {
        return workDefinitionID;
    }

    /**
     * 设置workDefinitionID属性的值。
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     */
    public void setWorkDefinitionID(JAXBElement<IdentifierType> value) {
        this.workDefinitionID = value;
    }

}
