//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>TextType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextType", propOrder = {
        "value"
})
@XmlSeeAlso({
        JobOrderCommandRuleType.class,
        DescriptionType.class
})
public class TextType {

    @XmlValue
    private String value;
    @XmlAttribute(name = "languageID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    private String languageID;

    /**
     * 获取value属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取languageID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * 设置languageID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

}
