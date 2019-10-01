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
 * <p>ResourceQualificationsManifestType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ResourceQualificationsManifestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}BatchProductionRecordEntryType"/>
 *         &lt;element name="RecordReference" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="ResourceID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="ResourceUse" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="ResourceType" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="QualificationStatus" type="{http://www.mesa.org/xml/B2MML}CodeType"/>
 *         &lt;element name="EffectiveTimeStamp" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ExpirationTimeStamp" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceQualificationsManifestType", propOrder = {
        "entryID",
        "objectType",
        "timeStamp",
        "externalReference",
        "description",
        "recordReference",
        "resourceID",
        "resourceUse",
        "resourceType",
        "qualificationStatus",
        "effectiveTimeStamp",
        "expirationTimeStamp"
})
public class ResourceQualificationsManifestType {

    @XmlElement(name = "EntryID", required = true)
    protected IdentifierType entryID;
    @XmlElement(name = "ObjectType", required = true)
    protected RecordObjectTypeType objectType;
    @XmlElement(name = "TimeStamp")
    protected DateTimeType timeStamp;
    @XmlElement(name = "ExternalReference")
    protected IdentifierType externalReference;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "RecordReference", required = true)
    protected IdentifierType recordReference;
    @XmlElement(name = "ResourceID", required = true)
    protected IdentifierType resourceID;
    @XmlElement(name = "ResourceUse", required = true)
    protected IdentifierType resourceUse;
    @XmlElement(name = "ResourceType", required = true)
    protected IdentifierType resourceType;
    @XmlElement(name = "QualificationStatus", required = true)
    protected CodeType qualificationStatus;
    @XmlElement(name = "EffectiveTimeStamp")
    protected DateTimeType effectiveTimeStamp;
    @XmlElement(name = "ExpirationTimeStamp")
    protected DateTimeType expirationTimeStamp;

    /**
     * 获取entryID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getEntryID() {
        return entryID;
    }

    /**
     * 设置entryID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setEntryID(IdentifierType value) {
        this.entryID = value;
    }

    /**
     * 获取objectType属性的值。
     *
     * @return possible object is
     * {@link RecordObjectTypeType }
     */
    public RecordObjectTypeType getObjectType() {
        return objectType;
    }

    /**
     * 设置objectType属性的值。
     *
     * @param value allowed object is
     *              {@link RecordObjectTypeType }
     */
    public void setObjectType(RecordObjectTypeType value) {
        this.objectType = value;
    }

    /**
     * 获取timeStamp属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getTimeStamp() {
        return timeStamp;
    }

    /**
     * 设置timeStamp属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setTimeStamp(DateTimeType value) {
        this.timeStamp = value;
    }

    /**
     * 获取externalReference属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getExternalReference() {
        return externalReference;
    }

    /**
     * 设置externalReference属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
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
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * 获取recordReference属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getRecordReference() {
        return recordReference;
    }

    /**
     * 设置recordReference属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setRecordReference(IdentifierType value) {
        this.recordReference = value;
    }

    /**
     * 获取resourceID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getResourceID() {
        return resourceID;
    }

    /**
     * 设置resourceID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setResourceID(IdentifierType value) {
        this.resourceID = value;
    }

    /**
     * 获取resourceUse属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getResourceUse() {
        return resourceUse;
    }

    /**
     * 设置resourceUse属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setResourceUse(IdentifierType value) {
        this.resourceUse = value;
    }

    /**
     * 获取resourceType属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getResourceType() {
        return resourceType;
    }

    /**
     * 设置resourceType属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setResourceType(IdentifierType value) {
        this.resourceType = value;
    }

    /**
     * 获取qualificationStatus属性的值。
     *
     * @return possible object is
     * {@link CodeType }
     */
    public CodeType getQualificationStatus() {
        return qualificationStatus;
    }

    /**
     * 设置qualificationStatus属性的值。
     *
     * @param value allowed object is
     *              {@link CodeType }
     */
    public void setQualificationStatus(CodeType value) {
        this.qualificationStatus = value;
    }

    /**
     * 获取effectiveTimeStamp属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getEffectiveTimeStamp() {
        return effectiveTimeStamp;
    }

    /**
     * 设置effectiveTimeStamp属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setEffectiveTimeStamp(DateTimeType value) {
        this.effectiveTimeStamp = value;
    }

    /**
     * 获取expirationTimeStamp属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getExpirationTimeStamp() {
        return expirationTimeStamp;
    }

    /**
     * 设置expirationTimeStamp属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setExpirationTimeStamp(DateTimeType value) {
        this.expirationTimeStamp = value;
    }

}
