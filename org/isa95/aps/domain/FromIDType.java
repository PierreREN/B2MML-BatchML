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
 * <p>FromIDType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="FromIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromIDValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromType" type="{http://www.mesa.org/xml/B2MML}FromTypeType"/>
 *         &lt;element name="IDScope" type="{http://www.mesa.org/xml/B2MML}IDScopeType"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}FromID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromIDType", propOrder = {
        "fromIDValue",
        "fromType",
        "idScope"
})
public class FromIDType {

    @XmlElement(name = "FromIDValue", required = true)
    protected String fromIDValue;
    @XmlElement(name = "FromType", required = true)
    protected FromTypeType fromType;
    @XmlElement(name = "IDScope", required = true)
    protected IDScopeType idScope;

    /**
     * 获取fromIDValue属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getFromIDValue() {
        return fromIDValue;
    }

    /**
     * 设置fromIDValue属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFromIDValue(String value) {
        this.fromIDValue = value;
    }

    /**
     * 获取fromType属性的值。
     *
     * @return possible object is
     * {@link FromTypeType }
     */
    public FromTypeType getFromType() {
        return fromType;
    }

    /**
     * 设置fromType属性的值。
     *
     * @param value allowed object is
     *              {@link FromTypeType }
     */
    public void setFromType(FromTypeType value) {
        this.fromType = value;
    }

    /**
     * 获取idScope属性的值。
     *
     * @return possible object is
     * {@link IDScopeType }
     */
    public IDScopeType getIDScope() {
        return idScope;
    }

    /**
     * 设置idScope属性的值。
     *
     * @param value allowed object is
     *              {@link IDScopeType }
     */
    public void setIDScope(IDScopeType value) {
        this.idScope = value;
    }

}
