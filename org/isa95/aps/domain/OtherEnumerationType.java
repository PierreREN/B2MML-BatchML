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


/**
 * <p>OtherEnumerationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OtherEnumerationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectName" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="EnumAttributeName" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="OtherEnumValue" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}TextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherEnumerationType", propOrder = {
        "objectName",
        "enumAttributeName",
        "otherEnumValue",
        "description"
})
public class OtherEnumerationType {

    @XmlElement(name = "ObjectName", required = true)
    protected IdentifierType objectName;
    @XmlElement(name = "EnumAttributeName", required = true)
    protected IdentifierType enumAttributeName;
    @XmlElement(name = "OtherEnumValue", required = true)
    protected IdentifierType otherEnumValue;
    @XmlElement(name = "Description", required = true)
    protected TextType description;

    /**
     * 获取objectName属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getObjectName() {
        return objectName;
    }

    /**
     * 设置objectName属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setObjectName(IdentifierType value) {
        this.objectName = value;
    }

    /**
     * 获取enumAttributeName属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getEnumAttributeName() {
        return enumAttributeName;
    }

    /**
     * 设置enumAttributeName属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setEnumAttributeName(IdentifierType value) {
        this.enumAttributeName = value;
    }

    /**
     * 获取otherEnumValue属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getOtherEnumValue() {
        return otherEnumValue;
    }

    /**
     * 设置otherEnumValue属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setOtherEnumValue(IdentifierType value) {
        this.otherEnumValue = value;
    }

    /**
     * 获取description属性的值。
     *
     * @return possible object is
     * {@link TextType }
     */
    public TextType getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     *
     * @param value allowed object is
     *              {@link TextType }
     */
    public void setDescription(TextType value) {
        this.description = value;
    }

}
