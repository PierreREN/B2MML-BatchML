//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransSenderType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TransSenderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ComponentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="TaskID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ConfirmationCode" type="{http://www.mesa.org/xml/B2MML}TransConfirmationCodeType" minOccurs="0"/>
 *         &lt;element name="AuthorizationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransSenderType", propOrder = {
    "logicalID",
    "componentID",
    "taskID",
    "referenceID",
    "confirmationCode",
    "authorizationID"
})
public class TransSenderType {

    @XmlElement(name = "LogicalID")
    protected IdentifierType logicalID;
    @XmlElement(name = "ComponentID")
    protected IdentifierType componentID;
    @XmlElement(name = "TaskID")
    protected IdentifierType taskID;
    @XmlElement(name = "ReferenceID")
    protected IdentifierType referenceID;
    @XmlElement(name = "ConfirmationCode")
    protected TransConfirmationCodeType confirmationCode;
    @XmlElement(name = "AuthorizationID")
    protected IdentifierType authorizationID;

    /**
     * 获取logicalID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getLogicalID() {
        return logicalID;
    }

    /**
     * 设置logicalID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setLogicalID(IdentifierType value) {
        this.logicalID = value;
    }

    /**
     * 获取componentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getComponentID() {
        return componentID;
    }

    /**
     * 设置componentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setComponentID(IdentifierType value) {
        this.componentID = value;
    }

    /**
     * 获取taskID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getTaskID() {
        return taskID;
    }

    /**
     * 设置taskID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setTaskID(IdentifierType value) {
        this.taskID = value;
    }

    /**
     * 获取referenceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getReferenceID() {
        return referenceID;
    }

    /**
     * 设置referenceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setReferenceID(IdentifierType value) {
        this.referenceID = value;
    }

    /**
     * 获取confirmationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransConfirmationCodeType }
     *     
     */
    public TransConfirmationCodeType getConfirmationCode() {
        return confirmationCode;
    }

    /**
     * 设置confirmationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransConfirmationCodeType }
     *     
     */
    public void setConfirmationCode(TransConfirmationCodeType value) {
        this.confirmationCode = value;
    }

    /**
     * 获取authorizationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getAuthorizationID() {
        return authorizationID;
    }

    /**
     * 设置authorizationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setAuthorizationID(IdentifierType value) {
        this.authorizationID = value;
    }

}
