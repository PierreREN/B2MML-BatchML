//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransChangeStatusType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TransChangeStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" minOccurs="0"/>
 *         &lt;element name="EffectiveDateTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.mesa.org/xml/B2MML}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StateChange" type="{http://www.mesa.org/xml/B2MML}TransStateChangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserArea" type="{http://www.mesa.org/xml/B2MML}TransUserAreaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransChangeStatusType", propOrder = {
    "code",
    "description",
    "effectiveDateTime",
    "reasonCode",
    "reason",
    "stateChange",
    "userArea"
})
public class TransChangeStatusType {

    @XmlElement(name = "Code")
    protected CodeType code;
    @XmlElement(name = "Description")
    protected DescriptionType description;
    @XmlElement(name = "EffectiveDateTime")
    protected DateTimeType effectiveDateTime;
    @XmlElement(name = "ReasonCode")
    protected CodeType reasonCode;
    @XmlElement(name = "Reason")
    protected List<CodeType> reason;
    @XmlElement(name = "StateChange")
    protected List<TransStateChangeType> stateChange;
    @XmlElement(name = "UserArea")
    protected TransUserAreaType userArea;

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCode(CodeType value) {
        this.code = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

    /**
     * 获取effectiveDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * 设置effectiveDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEffectiveDateTime(DateTimeType value) {
        this.effectiveDateTime = value;
    }

    /**
     * 获取reasonCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getReasonCode() {
        return reasonCode;
    }

    /**
     * 设置reasonCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setReasonCode(CodeType value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getReason() {
        if (reason == null) {
            reason = new ArrayList<CodeType>();
        }
        return this.reason;
    }

    /**
     * Gets the value of the stateChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransStateChangeType }
     * 
     * 
     */
    public List<TransStateChangeType> getStateChange() {
        if (stateChange == null) {
            stateChange = new ArrayList<TransStateChangeType>();
        }
        return this.stateChange;
    }

    /**
     * 获取userArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransUserAreaType }
     *     
     */
    public TransUserAreaType getUserArea() {
        return userArea;
    }

    /**
     * 设置userArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransUserAreaType }
     *     
     */
    public void setUserArea(TransUserAreaType value) {
        this.userArea = value;
    }

}
