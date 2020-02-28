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
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}TextType"/>
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
    protected Identifier objectName;
    @XmlElement(name = "EnumAttributeName", required = true)
    protected Identifier enumAttributeName;
    @XmlElement(name = "OtherEnumValue", required = true)
    protected Identifier otherEnumValue;
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
     * 获取enumAttributeName属性的值。
     *
     * @return possible object is
     * {@link Identifier }
     */
    public Identifier getEnumAttributeName() {
        return enumAttributeName;
    }

    /**
     * 设置enumAttributeName属性的值。
     *
     * @param value allowed object is
     *              {@link Identifier }
     */
    public void setEnumAttributeName(Identifier value) {
        this.enumAttributeName = value;
    }

    /**
     * 获取otherEnumValue属性的值。
     *
     * @return possible object is
     * {@link Identifier }
     */
    public Identifier getOtherEnumValue() {
        return otherEnumValue;
    }

    /**
     * 设置otherEnumValue属性的值。
     *
     * @param value allowed object is
     *              {@link Identifier }
     */
    public void setOtherEnumValue(Identifier value) {
        this.otherEnumValue = value;
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
