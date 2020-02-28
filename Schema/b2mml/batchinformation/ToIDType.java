//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:35:35 PM CST 
//


package isa95.aps.interfaces.b2mml.batchinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ToIDType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ToIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ToIDValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToType" type="{http://www.mesa.org/xml/B2MML}ToTypeType"/>
 *         &lt;element name="IDScope" type="{http://www.mesa.org/xml/B2MML}IDScopeType"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}ToID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToIDType", propOrder = {
        "toIDValue",
        "toType",
        "idScope"
})
public class ToIDType {

    @XmlElement(name = "ToIDValue", required = true)
    protected String toIDValue;
    @XmlElement(name = "ToType", required = true)
    protected ToTypeType toType;
    @XmlElement(name = "IDScope", required = true)
    protected IDScopeType idScope;

    /**
     * 获取toIDValue属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getToIDValue() {
        return toIDValue;
    }

    /**
     * 设置toIDValue属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setToIDValue(String value) {
        this.toIDValue = value;
    }

    /**
     * 获取toType属性的值。
     *
     * @return possible object is
     * {@link ToTypeType }
     */
    public ToTypeType getToType() {
        return toType;
    }

    /**
     * 设置toType属性的值。
     *
     * @param value allowed object is
     *              {@link ToTypeType }
     */
    public void setToType(ToTypeType value) {
        this.toType = value;
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
