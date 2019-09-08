//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnumerationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EnumerationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnumerationNumber" type="{http://www.mesa.org/xml/B2MML}EnumerationNumberType"/>
 *         &lt;element name="EnumerationString" type="{http://www.mesa.org/xml/B2MML}EnumerationStringType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}Enumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumerationType", propOrder = {
    "enumerationNumber",
    "enumerationString",
    "description"
})
public class EnumerationType {

    @XmlElement(name = "EnumerationNumber", required = true)
    protected EnumerationNumberType enumerationNumber;
    @XmlElement(name = "EnumerationString")
    protected EnumerationStringType enumerationString;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;

    /**
     * 获取enumerationNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumerationNumberType }
     *     
     */
    public EnumerationNumberType getEnumerationNumber() {
        return enumerationNumber;
    }

    /**
     * 设置enumerationNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationNumberType }
     *     
     */
    public void setEnumerationNumber(EnumerationNumberType value) {
        this.enumerationNumber = value;
    }

    /**
     * 获取enumerationString属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnumerationStringType }
     *     
     */
    public EnumerationStringType getEnumerationString() {
        return enumerationString;
    }

    /**
     * 设置enumerationString属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnumerationStringType }
     *     
     */
    public void setEnumerationString(EnumerationStringType value) {
        this.enumerationString = value;
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
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

}
