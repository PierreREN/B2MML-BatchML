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
import java.util.ArrayList;
import java.util.List;


/**
 * <p>TransStateChangeType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TransStateChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromStateCode" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="ToStateCode" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="ChangeDateTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}TransStateChangeTextGroup" minOccurs="0"/>
 *         &lt;element name="UserArea" type="{http://www.mesa.org/xml/B2MML}TransUserAreaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransStateChangeType", propOrder = {
        "fromStateCode",
        "toStateCode",
        "changeDateTime",
        "description",
        "note",
        "userArea"
})
public class TransStateChangeType {

    @XmlElement(name = "FromStateCode")
    protected CodeType fromStateCode;
    @XmlElement(name = "ToStateCode")
    protected CodeType toStateCode;
    @XmlElement(name = "ChangeDateTime")
    protected DateTimeType changeDateTime;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<TextType> note;
    @XmlElement(name = "UserArea")
    protected TransUserAreaType userArea;

    /**
     * 获取fromStateCode属性的值。
     *
     * @return possible object is
     * {@link CodeType }
     */
    public CodeType getFromStateCode() {
        return fromStateCode;
    }

    /**
     * 设置fromStateCode属性的值。
     *
     * @param value allowed object is
     *              {@link CodeType }
     */
    public void setFromStateCode(CodeType value) {
        this.fromStateCode = value;
    }

    /**
     * 获取toStateCode属性的值。
     *
     * @return possible object is
     * {@link CodeType }
     */
    public CodeType getToStateCode() {
        return toStateCode;
    }

    /**
     * 设置toStateCode属性的值。
     *
     * @param value allowed object is
     *              {@link CodeType }
     */
    public void setToStateCode(CodeType value) {
        this.toStateCode = value;
    }

    /**
     * 获取changeDateTime属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getChangeDateTime() {
        return changeDateTime;
    }

    /**
     * 设置changeDateTime属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setChangeDateTime(DateTimeType value) {
        this.changeDateTime = value;
    }

    /**
     * Gets the value of the description property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the note property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     */
    public List<TextType> getNote() {
        if (note == null) {
            note = new ArrayList<TextType>();
        }
        return this.note;
    }

    /**
     * 获取userArea属性的值。
     *
     * @return possible object is
     * {@link TransUserAreaType }
     */
    public TransUserAreaType getUserArea() {
        return userArea;
    }

    /**
     * 设置userArea属性的值。
     *
     * @param value allowed object is
     *              {@link TransUserAreaType }
     */
    public void setUserArea(TransUserAreaType value) {
        this.userArea = value;
    }

}
