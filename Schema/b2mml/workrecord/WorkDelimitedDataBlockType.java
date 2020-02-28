//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 02:18:42 PM CST 
//


package isa95.aps.interfaces.b2mml.workrecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WorkDelimitedDataBlockType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkDelimitedDataBlockType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TagDelimiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderDelimiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DelimitedData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkDelimitedDataBlockType", propOrder = {
        "tagDelimiter",
        "orderDelimiter",
        "delimitedData"
})
public class WorkDelimitedDataBlockType {

    @XmlElement(name = "TagDelimiter", required = true)
    protected String tagDelimiter;
    @XmlElement(name = "OrderDelimiter", required = true)
    protected String orderDelimiter;
    @XmlElement(name = "DelimitedData", required = true)
    protected String delimitedData;

    /**
     * 获取tagDelimiter属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getTagDelimiter() {
        return tagDelimiter;
    }

    /**
     * 设置tagDelimiter属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTagDelimiter(String value) {
        this.tagDelimiter = value;
    }

    /**
     * 获取orderDelimiter属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getOrderDelimiter() {
        return orderDelimiter;
    }

    /**
     * 设置orderDelimiter属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrderDelimiter(String value) {
        this.orderDelimiter = value;
    }

    /**
     * 获取delimitedData属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getDelimitedData() {
        return delimitedData;
    }

    /**
     * 设置delimitedData属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDelimitedData(String value) {
        this.delimitedData = value;
    }

}
