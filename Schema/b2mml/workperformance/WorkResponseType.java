//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:43:42 PM CST 
//


package isa95.aps.interfaces.b2mml.workperformance;

import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkResponseType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="WorkTypeType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="WorkRequestID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ResponseStateType" type="{http://www.mesa.org/xml/B2MML}ResponseStateType" minOccurs="0"/>
 *         &lt;element name="WorkResponse" type="{http://www.mesa.org/xml/B2MML}WorkResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JobResponse" type="{http://www.mesa.org/xml/B2MML}JobResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}WorkResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkResponseType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "workType",
        "workRequestID",
        "startTime",
        "endTime",
        "responseState",
        "workResponse",
        "jobResponse"
})
public class WorkResponseType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "WorkTypeType")
    protected OperationsTypeType workType;
    @XmlElement(name = "WorkRequestID")
    protected IdentifierType workRequestID;
    @XmlElement(name = "StartTime")
    protected DateTimeType startTime;
    @XmlElement(name = "EndTime")
    protected DateTimeType endTime;
    @XmlElement(name = "ResponseStateType")
    protected ResponseStateType responseState;
    @XmlElement(name = "WorkResponse")
    protected List<WorkResponseType> workResponse;
    @XmlElement(name = "JobResponse")
    protected List<JobResponseType> jobResponse;

    /**
     * 获取id属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setID(IdentifierType value) {
        this.id = value;
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
     * 获取hierarchyScope属性的值。
     *
     * @return possible object is
     * {@link HierarchyScopeType }
     */
    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * 设置hierarchyScope属性的值。
     *
     * @param value allowed object is
     *              {@link HierarchyScopeType }
     */
    public void setHierarchyScope(HierarchyScopeType value) {
        this.hierarchyScope = value;
    }

    /**
     * 获取workType属性的值。
     *
     * @return possible object is
     * {@link OperationsTypeType }
     */
    public OperationsTypeType getWorkType() {
        return workType;
    }

    /**
     * 设置workType属性的值。
     *
     * @param value allowed object is
     *              {@link OperationsTypeType }
     */
    public void setWorkType(OperationsTypeType value) {
        this.workType = value;
    }

    /**
     * 获取workRequestID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getWorkRequestID() {
        return workRequestID;
    }

    /**
     * 设置workRequestID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setWorkRequestID(IdentifierType value) {
        this.workRequestID = value;
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
     * 获取responseState属性的值。
     *
     * @return possible object is
     * {@link ResponseStateType }
     */
    public ResponseStateType getResponseState() {
        return responseState;
    }

    /**
     * 设置responseState属性的值。
     *
     * @param value allowed object is
     *              {@link ResponseStateType }
     */
    public void setResponseState(ResponseStateType value) {
        this.responseState = value;
    }

    /**
     * Gets the value of the workResponse property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workResponse property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkResponse().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkResponseType }
     */
    public List<WorkResponseType> getWorkResponse() {
        if (workResponse == null) {
            workResponse = new ArrayList<WorkResponseType>();
        }
        return this.workResponse;
    }

    /**
     * Gets the value of the jobResponse property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobResponse property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobResponse().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobResponseType }
     */
    public List<JobResponseType> getJobResponse() {
        if (jobResponse == null) {
            jobResponse = new ArrayList<JobResponseType>();
        }
        return this.jobResponse;
    }

}
