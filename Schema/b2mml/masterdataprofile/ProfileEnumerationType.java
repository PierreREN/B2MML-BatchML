//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package isa95.aps.interfaces.b2mml.masterdataprofile;

import isa95.aps.domain.entity.common.Identifier;
import isa95.aps.domain.entity.common.Text;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProfileEnumerationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ProfileEnumerationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectName" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="AttributeName" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DefinedValue" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}TextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileEnumerationType", propOrder = {
        "objectName",
        "attributeName",
        "definedValue",
        "description"
})
public class ProfileEnumerationType {

    @XmlElement(name = "ObjectName", required = true)
    protected Identifier objectName;
    @XmlElement(name = "AttributeName", required = true)
    protected Identifier attributeName;
    @XmlElement(name = "DefinedValue", required = true)
    protected Identifier definedValue;
    @XmlElement(name = "DescriptionType", required = true)
    protected Text description;

    /**
     * 获取objectName属性的值。
     *
     * @return possible object is
     * {@link Identifier }
     */
    public Identifier getObjectName() {
        return objectName;
    }

    /**
     * 设置objectName属性的值。
     *
     * @param value allowed object is
     *              {@link Identifier }
     */
    public void setObjectName(Identifier value) {
        this.objectName = value;
    }

    /**
     * 获取attributeName属性的值。
     *
     * @return possible object is
     * {@link Identifier }
     */
    public Identifier getAttributeName() {
        return attributeName;
    }

    /**
     * 设置attributeName属性的值。
     *
     * @param value allowed object is
     *              {@link Identifier }
     */
    public void setAttributeName(Identifier value) {
        this.attributeName = value;
    }

    /**
     * 获取definedValue属性的值。
     *
     * @return possible object is
     * {@link Identifier }
     */
    public Identifier getDefinedValue() {
        return definedValue;
    }

    /**
     * 设置definedValue属性的值。
     *
     * @param value allowed object is
     *              {@link Identifier }
     */
    public void setDefinedValue(Identifier value) {
        this.definedValue = value;
    }

    /**
     * 获取description属性的值。
     *
     * @return possible object is
     * {@link Text }
     */
    public Text getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     *
     * @param value allowed object is
     *              {@link Text }
     */
    public void setDescription(Text value) {
        this.description = value;
    }

}
