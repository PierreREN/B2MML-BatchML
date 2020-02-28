//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>DateTimeType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="DateTimeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>dateTime">
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTimeType", propOrder = {
        "value"
})
public class DateTimeType {

    @XmlValue
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar value;
    @XmlAttribute(name = "format")
    private String format;

    /**
     * 获取value属性的值。
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * 获取format属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
