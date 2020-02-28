//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:16:37 PM CST 
//


package isa95.aps.interfaces.b2mml.operationsschedule;

import isa95.aps.interfaces.b2mml.operationsperformancetypes.OpSegmentResponseType;
import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>OperationsRequestType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OperationsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="OperationsTypeType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PriorityType" type="{http://www.mesa.org/xml/B2MML}PriorityType" minOccurs="0"/>
 *         &lt;element name="RequestStateType" type="{http://www.mesa.org/xml/B2MML}RequestStateType" minOccurs="0"/>
 *         &lt;element name="OperationsDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="OperationsSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="SegmentRequirement" type="{http://www.mesa.org/xml/B2MML}OpSegmentRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentResponse" type="{http://www.mesa.org/xml/B2MML}OpSegmentResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsRequestType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "operationsType",
        "startTime",
        "endTime",
        "priority",
        "requestState",
        "operationsDefinitionID",
        "operationsSegmentID",
        "segmentRequirement",
        "segmentResponse"
})
public class OperationsRequestType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "OperationsTypeType")
    protected OperationsTypeType operationsType;
    @XmlElement(name = "StartTime")
    protected DateTimeType startTime;
    @XmlElement(name = "EndTime")
    protected DateTimeType endTime;
    @XmlElement(name = "PriorityType")
    protected PriorityType priority;
    @XmlElement(name = "RequestStateType")
    protected RequestStateType requestState;
    @XmlElement(name = "OperationsDefinitionID")
    protected IdentifierType operationsDefinitionID;
    @XmlElement(name = "OperationsSegmentID")
    protected IdentifierType operationsSegmentID;
    @XmlElement(name = "SegmentRequirement")
    protected List<OpSegmentRequirementType> segmentRequirement;
    @XmlElement(name = "SegmentResponse")
    protected List<OpSegmentResponseType> segmentResponse;

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
     * 获取operationsType属性的值。
     *
     * @return possible object is
     * {@link OperationsTypeType }
     */
    public OperationsTypeType getOperationsType() {
        return operationsType;
    }

    /**
     * 设置operationsType属性的值。
     *
     * @param value allowed object is
     *              {@link OperationsTypeType }
     */
    public void setOperationsType(OperationsTypeType value) {
        this.operationsType = value;
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
     * 获取priority属性的值。
     *
     * @return possible object is
     * {@link PriorityType }
     */
    public PriorityType getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     *
     * @param value allowed object is
     *              {@link PriorityType }
     */
    public void setPriority(PriorityType value) {
        this.priority = value;
    }

    /**
     * 获取requestState属性的值。
     *
     * @return possible object is
     * {@link RequestStateType }
     */
    public RequestStateType getRequestState() {
        return requestState;
    }

    /**
     * 设置requestState属性的值。
     *
     * @param value allowed object is
     *              {@link RequestStateType }
     */
    public void setRequestState(RequestStateType value) {
        this.requestState = value;
    }

    /**
     * 获取operationsDefinitionID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getOperationsDefinitionID() {
        return operationsDefinitionID;
    }

    /**
     * 设置operationsDefinitionID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setOperationsDefinitionID(IdentifierType value) {
        this.operationsDefinitionID = value;
    }

    /**
     * 获取operationsSegmentID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getOperationsSegmentID() {
        return operationsSegmentID;
    }

    /**
     * 设置operationsSegmentID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setOperationsSegmentID(IdentifierType value) {
        this.operationsSegmentID = value;
    }

    /**
     * Gets the value of the segmentRequirement property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentRequirement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentRequirement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpSegmentRequirementType }
     */
    public List<OpSegmentRequirementType> getSegmentRequirement() {
        if (segmentRequirement == null) {
            segmentRequirement = new ArrayList<OpSegmentRequirementType>();
        }
        return this.segmentRequirement;
    }

    /**
     * Gets the value of the segmentResponse property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentResponse property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentResponse().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpSegmentResponseType }
     */
    public List<OpSegmentResponseType> getSegmentResponse() {
        if (segmentResponse == null) {
            segmentResponse = new ArrayList<OpSegmentResponseType>();
        }
        return this.segmentResponse;
    }

}
