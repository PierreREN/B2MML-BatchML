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
 * <p>HeaderType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModificationLog" type="{http://www.mesa.org/xml/B2MML}ModificationLogType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApprovalHistory" type="{http://www.mesa.org/xml/B2MML}ApprovalHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="BatchSize" type="{http://www.mesa.org/xml/B2MML}BatchSizeType" minOccurs="0"/>
 *         &lt;element name="ActualProductProduced" type="{http://www.mesa.org/xml/B2MML}ActualProductProducedType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.mesa.org/xml/B2MML}BatchStatusType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}Header" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", propOrder = {
    "modificationLog",
    "approvalHistory",
    "effectiveDate",
    "expirationDate",
    "productID",
    "productName",
    "batchSize",
    "actualProductProduced",
    "status"
})
public class HeaderType {

    @XmlElement(name = "ModificationLog")
    protected List<ModificationLogType> modificationLog;
    @XmlElement(name = "ApprovalHistory")
    protected List<ApprovalHistoryType> approvalHistory;
    @XmlElement(name = "EffectiveDate")
    protected DateTimeType effectiveDate;
    @XmlElement(name = "ExpirationDate")
    protected DateTimeType expirationDate;
    @XmlElement(name = "ProductID")
    protected IdentifierType productID;
    @XmlElement(name = "ProductName")
    protected IdentifierType productName;
    @XmlElement(name = "BatchSize")
    protected BatchSizeType batchSize;
    @XmlElement(name = "ActualProductProduced")
    protected List<ActualProductProducedType> actualProductProduced;
    @XmlElement(name = "Status")
    protected BatchStatusType status;

    /**
     * Gets the value of the modificationLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modificationLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModificationLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationLogType }
     * 
     * 
     */
    public List<ModificationLogType> getModificationLog() {
        if (modificationLog == null) {
            modificationLog = new ArrayList<ModificationLogType>();
        }
        return this.modificationLog;
    }

    /**
     * Gets the value of the approvalHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvalHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovalHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApprovalHistoryType }
     * 
     * 
     */
    public List<ApprovalHistoryType> getApprovalHistory() {
        if (approvalHistory == null) {
            approvalHistory = new ArrayList<ApprovalHistoryType>();
        }
        return this.approvalHistory;
    }

    /**
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEffectiveDate(DateTimeType value) {
        this.effectiveDate = value;
    }

    /**
     * 获取expirationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getExpirationDate() {
        return expirationDate;
    }

    /**
     * 设置expirationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setExpirationDate(DateTimeType value) {
        this.expirationDate = value;
    }

    /**
     * 获取productID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getProductID() {
        return productID;
    }

    /**
     * 设置productID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setProductID(IdentifierType value) {
        this.productID = value;
    }

    /**
     * 获取productName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getProductName() {
        return productName;
    }

    /**
     * 设置productName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setProductName(IdentifierType value) {
        this.productName = value;
    }

    /**
     * 获取batchSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatchSizeType }
     *     
     */
    public BatchSizeType getBatchSize() {
        return batchSize;
    }

    /**
     * 设置batchSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatchSizeType }
     *     
     */
    public void setBatchSize(BatchSizeType value) {
        this.batchSize = value;
    }

    /**
     * Gets the value of the actualProductProduced property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actualProductProduced property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualProductProduced().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActualProductProducedType }
     * 
     * 
     */
    public List<ActualProductProducedType> getActualProductProduced() {
        if (actualProductProduced == null) {
            actualProductProduced = new ArrayList<ActualProductProducedType>();
        }
        return this.actualProductProduced;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatchStatusType }
     *     
     */
    public BatchStatusType getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatchStatusType }
     *     
     */
    public void setStatus(BatchStatusType value) {
        this.status = value;
    }

}
