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
 * <p>WorkDataSetType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkDataSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}WorkRecordEntryType"/>
 *         &lt;element name="TrendSystemReference" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="TimeSpecification" type="{http://www.mesa.org/xml/B2MML}WorkTimeSpecificationType" minOccurs="0"/>
 *         &lt;element name="TagSpecification" type="{http://www.mesa.org/xml/B2MML}WorkTagSpecificationType" maxOccurs="unbounded"/>
 *         &lt;choice>
 *           &lt;element name="DelimitedDataBlock" type="{http://www.mesa.org/xml/B2MML}WorkDelimitedDataBlockType"/>
 *           &lt;element name="OrderedData" type="{http://www.mesa.org/xml/B2MML}WorkOrderedDataType" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkDataSetType", propOrder = {
        "entryID",
        "objectType",
        "timeStamp",
        "externalReference",
        "description",
        "trendSystemReference",
        "startTime",
        "endTime",
        "timeSpecification",
        "tagSpecification",
        "delimitedDataBlock",
        "orderedData"
})
public class WorkDataSetType {

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
    @XmlElement(name = "TrendSystemReference")
    protected IdentifierType trendSystemReference;
    @XmlElement(name = "StartTime")
    protected DateTimeType startTime;
    @XmlElement(name = "EndTime")
    protected DateTimeType endTime;
    @XmlElement(name = "TimeSpecification")
    protected WorkTimeSpecificationType timeSpecification;
    @XmlElement(name = "TagSpecification", required = true)
    protected List<WorkTagSpecificationType> tagSpecification;
    @XmlElement(name = "DelimitedDataBlock")
    protected WorkDelimitedDataBlockType delimitedDataBlock;
    @XmlElement(name = "OrderedData")
    protected List<WorkOrderedDataType> orderedData;

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
     * {@link WorkRecordObjectTypeType }
     */
    public WorkRecordObjectTypeType getObjectType() {
        return objectType;
    }

    /**
     * 设置objectType属性的值。
     *
     * @param value allowed object is
     *              {@link WorkRecordObjectTypeType }
     */
    public void setObjectType(WorkRecordObjectTypeType value) {
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
     * 获取trendSystemReference属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getTrendSystemReference() {
        return trendSystemReference;
    }

    /**
     * 设置trendSystemReference属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setTrendSystemReference(IdentifierType value) {
        this.trendSystemReference = value;
    }

    /**
     * 获取startTime属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setStartTime(DateTimeType value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setEndTime(DateTimeType value) {
        this.endTime = value;
    }

    /**
     * 获取timeSpecification属性的值。
     *
     * @return possible object is
     * {@link WorkTimeSpecificationType }
     */
    public WorkTimeSpecificationType getTimeSpecification() {
        return timeSpecification;
    }

    /**
     * 设置timeSpecification属性的值。
     *
     * @param value allowed object is
     *              {@link WorkTimeSpecificationType }
     */
    public void setTimeSpecification(WorkTimeSpecificationType value) {
        this.timeSpecification = value;
    }

    /**
     * Gets the value of the tagSpecification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tagSpecification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTagSpecification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkTagSpecificationType }
     */
    public List<WorkTagSpecificationType> getTagSpecification() {
        if (tagSpecification == null) {
            tagSpecification = new ArrayList<WorkTagSpecificationType>();
        }
        return this.tagSpecification;
    }

    /**
     * 获取delimitedDataBlock属性的值。
     *
     * @return possible object is
     * {@link WorkDelimitedDataBlockType }
     */
    public WorkDelimitedDataBlockType getDelimitedDataBlock() {
        return delimitedDataBlock;
    }

    /**
     * 设置delimitedDataBlock属性的值。
     *
     * @param value allowed object is
     *              {@link WorkDelimitedDataBlockType }
     */
    public void setDelimitedDataBlock(WorkDelimitedDataBlockType value) {
        this.delimitedDataBlock = value;
    }

    /**
     * Gets the value of the orderedData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderedData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderedData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkOrderedDataType }
     */
    public List<WorkOrderedDataType> getOrderedData() {
        if (orderedData == null) {
            orderedData = new ArrayList<WorkOrderedDataType>();
        }
        return this.orderedData;
    }

}
