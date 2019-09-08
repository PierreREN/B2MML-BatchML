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
 * <p>TransApplicationAreaType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TransApplicationAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sender" type="{http://www.mesa.org/xml/B2MML}TransSenderType" minOccurs="0"/>
 *         &lt;element name="Receiver" type="{http://www.mesa.org/xml/B2MML}TransReceiverType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreationDateTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType"/>
 *         &lt;element name="Signature" type="{http://www.mesa.org/xml/B2MML}TransSignatureType" minOccurs="0"/>
 *         &lt;element name="BODID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
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
@XmlType(name = "TransApplicationAreaType", propOrder = {
    "sender",
    "receiver",
    "creationDateTime",
    "signature",
    "bodid",
    "userArea"
})
public class TransApplicationAreaType {

    @XmlElement(name = "Sender")
    protected TransSenderType sender;
    @XmlElement(name = "Receiver")
    protected List<TransReceiverType> receiver;
    @XmlElement(name = "CreationDateTime", required = true)
    protected DateTimeType creationDateTime;
    @XmlElement(name = "Signature")
    protected TransSignatureType signature;
    @XmlElement(name = "BODID")
    protected IdentifierType bodid;
    @XmlElement(name = "UserArea")
    protected TransUserAreaType userArea;

    /**
     * 获取sender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransSenderType }
     *     
     */
    public TransSenderType getSender() {
        return sender;
    }

    /**
     * 设置sender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransSenderType }
     *     
     */
    public void setSender(TransSenderType value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransReceiverType }
     * 
     * 
     */
    public List<TransReceiverType> getReceiver() {
        if (receiver == null) {
            receiver = new ArrayList<TransReceiverType>();
        }
        return this.receiver;
    }

    /**
     * 获取creationDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * 设置creationDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setCreationDateTime(DateTimeType value) {
        this.creationDateTime = value;
    }

    /**
     * 获取signature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransSignatureType }
     *     
     */
    public TransSignatureType getSignature() {
        return signature;
    }

    /**
     * 设置signature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransSignatureType }
     *     
     */
    public void setSignature(TransSignatureType value) {
        this.signature = value;
    }

    /**
     * 获取bodid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getBODID() {
        return bodid;
    }

    /**
     * 设置bodid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setBODID(IdentifierType value) {
        this.bodid = value;
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
