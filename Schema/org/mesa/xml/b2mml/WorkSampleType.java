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
 * <p>WorkSampleType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WorkSampleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}WorkRecordEntryType"/>
 *         &lt;element name="SampleSourceID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="SampleSize" type="{http://www.mesa.org/xml/B2MML}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SampleType" type="{http://www.mesa.org/xml/B2MML}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SamplePullReason" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SampleExpiration" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JobStep" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SOPReference" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SampleTest" type="{http://www.mesa.org/xml/B2MML}SampleTestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkSampleType", propOrder = {
    "entryID",
    "objectType",
    "timeStamp",
    "externalReference",
    "description",
    "sampleSourceID",
    "sampleSize",
    "sampleType",
    "samplePullReason",
    "sampleExpiration",
    "equipmentID",
    "physicalAssetID",
    "jobStep",
    "sopReference",
    "sampleTest"
})
public class WorkSampleType {

    @XmlElement(name = "EntryID", required = true)
    protected IdentifierType entryID;
    @XmlElement(name = "ObjectType", required = true)
    protected WorkRecordObjectTypeType objectType;
    @XmlElement(name = "TimeStamp")
    protected DateTimeType timeStamp;
    @XmlElement(name = "ExternalReference")
    protected IdentifierType externalReference;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "SampleSourceID")
    protected IdentifierType sampleSourceID;
    @XmlElement(name = "SampleSize")
    protected List<QuantityValueType> sampleSize;
    @XmlElement(name = "SampleType")
    protected List<CodeType> sampleType;
    @XmlElement(name = "SamplePullReason")
    protected List<TextType> samplePullReason;
    @XmlElement(name = "SampleExpiration")
    protected DateTimeType sampleExpiration;
    @XmlElement(name = "EquipmentID")
    protected List<IdentifierType> equipmentID;
    @XmlElement(name = "PhysicalAssetID")
    protected List<IdentifierType> physicalAssetID;
    @XmlElement(name = "JobStep")
    protected List<IdentifierType> jobStep;
    @XmlElement(name = "SOPReference")
    protected List<IdentifierType> sopReference;
    @XmlElement(name = "SampleTest")
    protected List<SampleTestType> sampleTest;

    /**
     * 获取entryID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getEntryID() {
        return entryID;
    }

    /**
     * 设置entryID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setEntryID(IdentifierType value) {
        this.entryID = value;
    }

    /**
     * 获取objectType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WorkRecordObjectTypeType }
     *     
     */
    public WorkRecordObjectTypeType getObjectType() {
        return objectType;
    }

    /**
     * 设置objectType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WorkRecordObjectTypeType }
     *     
     */
    public void setObjectType(WorkRecordObjectTypeType value) {
        this.objectType = value;
    }

    /**
     * 获取timeStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getTimeStamp() {
        return timeStamp;
    }

    /**
     * 设置timeStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setTimeStamp(DateTimeType value) {
        this.timeStamp = value;
    }

    /**
     * 获取externalReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getExternalReference() {
        return externalReference;
    }

    /**
     * 设置externalReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setExternalReference(IdentifierType value) {
        this.externalReference = value;
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
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * 获取sampleSourceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getSampleSourceID() {
        return sampleSourceID;
    }

    /**
     * 设置sampleSourceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setSampleSourceID(IdentifierType value) {
        this.sampleSourceID = value;
    }

    /**
     * Gets the value of the sampleSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sampleSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSampleSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityValueType }
     * 
     * 
     */
    public List<QuantityValueType> getSampleSize() {
        if (sampleSize == null) {
            sampleSize = new ArrayList<QuantityValueType>();
        }
        return this.sampleSize;
    }

    /**
     * Gets the value of the sampleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sampleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSampleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getSampleType() {
        if (sampleType == null) {
            sampleType = new ArrayList<CodeType>();
        }
        return this.sampleType;
    }

    /**
     * Gets the value of the samplePullReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the samplePullReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSamplePullReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getSamplePullReason() {
        if (samplePullReason == null) {
            samplePullReason = new ArrayList<TextType>();
        }
        return this.samplePullReason;
    }

    /**
     * 获取sampleExpiration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getSampleExpiration() {
        return sampleExpiration;
    }

    /**
     * 设置sampleExpiration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setSampleExpiration(DateTimeType value) {
        this.sampleExpiration = value;
    }

    /**
     * Gets the value of the equipmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getEquipmentID() {
        if (equipmentID == null) {
            equipmentID = new ArrayList<IdentifierType>();
        }
        return this.equipmentID;
    }

    /**
     * Gets the value of the physicalAssetID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getPhysicalAssetID() {
        if (physicalAssetID == null) {
            physicalAssetID = new ArrayList<IdentifierType>();
        }
        return this.physicalAssetID;
    }

    /**
     * Gets the value of the jobStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getJobStep() {
        if (jobStep == null) {
            jobStep = new ArrayList<IdentifierType>();
        }
        return this.jobStep;
    }

    /**
     * Gets the value of the sopReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sopReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSOPReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getSOPReference() {
        if (sopReference == null) {
            sopReference = new ArrayList<IdentifierType>();
        }
        return this.sopReference;
    }

    /**
     * Gets the value of the sampleTest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sampleTest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSampleTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SampleTestType }
     * 
     * 
     */
    public List<SampleTestType> getSampleTest() {
        if (sampleTest == null) {
            sampleTest = new ArrayList<SampleTestType>();
        }
        return this.sampleTest;
    }

}
