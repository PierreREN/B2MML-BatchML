//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 02:18:42 PM CST 
//


package isa95.aps.interfaces.b2mml.workrecord;

import isa95.aps.interfaces.b2mml.common.IdentifierType;
import isa95.aps.interfaces.b2mml.common.NumericType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkDataValueType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkDataValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TagIndex" type="{http://www.mesa.org/xml/B2MML}NumericType" minOccurs="0"/>
 *         &lt;element name="ValueType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="Quality" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkDataValueType", propOrder = {
        "tagIndex",
        "value",
        "quality"
})
public class WorkDataValueType {

    @XmlElement(name = "TagIndex")
    protected NumericType tagIndex;
    @XmlElement(name = "ValueType", required = true)
    protected List<String> value;
    @XmlElement(name = "Quality")
    protected IdentifierType quality;

    /**
     * 获取tagIndex属性的值。
     *
     * @return possible object is
     * {@link NumericType }
     */
    public NumericType getTagIndex() {
        return tagIndex;
    }

    /**
     * 设置tagIndex属性的值。
     *
     * @param value allowed object is
     *              {@link NumericType }
     */
    public void setTagIndex(NumericType value) {
        this.tagIndex = value;
    }

    /**
     * Gets the value of the value property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    /**
     * 获取quality属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getQuality() {
        return quality;
    }

    /**
     * 设置quality属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setQuality(IdentifierType value) {
        this.quality = value;
    }

}
