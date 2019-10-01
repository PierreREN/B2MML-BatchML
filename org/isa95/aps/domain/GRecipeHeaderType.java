//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>GRecipeHeaderType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="GRecipeHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DerivedFromID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}ProductInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="HeaderProperty" type="{http://www.mesa.org/xml/B2MML}HeaderPropertyType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}GRecipeHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRecipeHeaderType", propOrder = {
        "description",
        "derivedFromID",
        "productInformation",
        "effectiveDate",
        "expirationDate",
        "headerProperty"
})
public class GRecipeHeaderType {

    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "DerivedFromID")
    protected IdentifierType derivedFromID;
    @XmlElements({
            @XmlElement(name = "ProductID", type = IdentifierType.class),
            @XmlElement(name = "Description", type = DescriptionType.class),
            @XmlElement(name = "ProductName", type = NameType.class),
            @XmlElement(name = "BatchSize", type = ValueType.class)
    })
    protected List<Object> productInformation;
    @XmlElement(name = "EffectiveDate")
    protected DateTimeType effectiveDate;
    @XmlElement(name = "ExpirationDate")
    protected DateTimeType expirationDate;
    @XmlElement(name = "HeaderProperty")
    protected HeaderPropertyType headerProperty;

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
     * 获取derivedFromID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getDerivedFromID() {
        return derivedFromID;
    }

    /**
     * 设置derivedFromID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setDerivedFromID(IdentifierType value) {
        this.derivedFromID = value;
    }

    /**
     * Gets the value of the productInformation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInformation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInformation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * {@link DescriptionType }
     * {@link NameType }
     * {@link ValueType }
     */
    public List<Object> getProductInformation() {
        if (productInformation == null) {
            productInformation = new ArrayList<Object>();
        }
        return this.productInformation;
    }

    /**
     * 获取effectiveDate属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setEffectiveDate(DateTimeType value) {
        this.effectiveDate = value;
    }

    /**
     * 获取expirationDate属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getExpirationDate() {
        return expirationDate;
    }

    /**
     * 设置expirationDate属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setExpirationDate(DateTimeType value) {
        this.expirationDate = value;
    }

    /**
     * 获取headerProperty属性的值。
     *
     * @return possible object is
     * {@link HeaderPropertyType }
     */
    public HeaderPropertyType getHeaderProperty() {
        return headerProperty;
    }

    /**
     * 设置headerProperty属性的值。
     *
     * @param value allowed object is
     *              {@link HeaderPropertyType }
     */
    public void setHeaderProperty(HeaderPropertyType value) {
        this.headerProperty = value;
    }

}
