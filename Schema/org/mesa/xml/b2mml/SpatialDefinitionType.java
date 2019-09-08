//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * The spatial definition provides a means of communicating zero-dimensional point, one-dimensional line, 
 * or two-dimensional shape or three-dimensional solid geospatial location data for planning/scheduling, 
 * actuals, resources, and analytics. 
 * Spatial definition identifies a value and the predefined coordinate reference system. 
 * 			
 * 
 * <p>SpatialDefinitionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SpatialDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.mesa.org/xml/B2MML}TextType"/>
 *         &lt;element name="Format" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="SRID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="SRIDAuthority" type="{http://www.mesa.org/xml/B2MML}TextType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}SpatialDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpatialDefinitionType", propOrder = {
    "value",
    "format",
    "srid",
    "sridAuthority"
})
public class SpatialDefinitionType {

    @XmlElement(name = "Value", required = true)
    protected TextType value;
    @XmlElement(name = "Format", required = true)
    protected IdentifierType format;
    @XmlElement(name = "SRID")
    protected IdentifierType srid;
    @XmlElement(name = "SRIDAuthority")
    protected TextType sridAuthority;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setValue(TextType value) {
        this.value = value;
    }

    /**
     * 获取format属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setFormat(IdentifierType value) {
        this.format = value;
    }

    /**
     * 获取srid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSRID() {
        return srid;
    }

    /**
     * 设置srid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSRID(IdentifierType value) {
        this.srid = value;
    }

    /**
     * 获取sridAuthority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSRIDAuthority() {
        return sridAuthority;
    }

    /**
     * 设置sridAuthority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSRIDAuthority(TextType value) {
        this.sridAuthority = value;
    }

}
