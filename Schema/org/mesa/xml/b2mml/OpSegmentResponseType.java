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
 * <p>OpSegmentResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OpSegmentResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="OperationsType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="ProcessSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ActualStartTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ActualEndTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PostingDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="OperationsDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkResponseID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JobResponseID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentState" type="{http://www.mesa.org/xml/B2MML}ResponseStateType" minOccurs="0"/>
 *         &lt;element name="SegmentData" type="{http://www.mesa.org/xml/B2MML}OpSegmentDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelActual" type="{http://www.mesa.org/xml/B2MML}OpPersonnelActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentActual" type="{http://www.mesa.org/xml/B2MML}OpEquipmentActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetActual" type="{http://www.mesa.org/xml/B2MML}OpPhysicalAssetActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialActual" type="{http://www.mesa.org/xml/B2MML}OpMaterialActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentResponse" type="{http://www.mesa.org/xml/B2MML}OpSegmentResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponse" type="{http://www.mesa.org/xml/B2MML}RequiredByRequestedSegmentResponseType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OpSegmentResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpSegmentResponseType", propOrder = {
    "id",
    "description",
    "hierarchyScope",
    "operationsType",
    "processSegmentID",
    "actualStartTime",
    "actualEndTime",
    "postingDate",
    "operationsDefinitionID",
    "operationsSegmentID",
    "workResponseID",
    "jobResponseID",
    "segmentState",
    "segmentData",
    "personnelActual",
    "equipmentActual",
    "physicalAssetActual",
    "materialActual",
    "segmentResponse",
    "requiredByRequestedSegmentResponse"
})
public class OpSegmentResponseType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "OperationsType")
    protected OperationsTypeType operationsType;
    @XmlElement(name = "ProcessSegmentID")
    protected List<IdentifierType> processSegmentID;
    @XmlElement(name = "ActualStartTime")
    protected DateTimeType actualStartTime;
    @XmlElement(name = "ActualEndTime")
    protected DateTimeType actualEndTime;
    @XmlElement(name = "PostingDate")
    protected DateTimeType postingDate;
    @XmlElement(name = "OperationsDefinitionID")
    protected List<IdentifierType> operationsDefinitionID;
    @XmlElement(name = "OperationsSegmentID")
    protected List<IdentifierType> operationsSegmentID;
    @XmlElement(name = "WorkResponseID")
    protected List<IdentifierType> workResponseID;
    @XmlElement(name = "JobResponseID")
    protected List<IdentifierType> jobResponseID;
    @XmlElement(name = "SegmentState")
    protected ResponseStateType segmentState;
    @XmlElement(name = "SegmentData")
    protected List<OpSegmentDataType> segmentData;
    @XmlElement(name = "PersonnelActual")
    protected List<OpPersonnelActualType> personnelActual;
    @XmlElement(name = "EquipmentActual")
    protected List<OpEquipmentActualType> equipmentActual;
    @XmlElement(name = "PhysicalAssetActual")
    protected List<OpPhysicalAssetActualType> physicalAssetActual;
    @XmlElement(name = "MaterialActual")
    protected List<OpMaterialActualType> materialActual;
    @XmlElement(name = "SegmentResponse")
    protected List<OpSegmentResponseType> segmentResponse;
    @XmlElement(name = "RequiredByRequestedSegmentResponse")
    protected RequiredByRequestedSegmentResponseType requiredByRequestedSegmentResponse;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
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
     * 获取hierarchyScope属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HierarchyScopeType }
     *     
     */
    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * 设置hierarchyScope属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyScopeType }
     *     
     */
    public void setHierarchyScope(HierarchyScopeType value) {
        this.hierarchyScope = value;
    }

    /**
     * 获取operationsType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperationsTypeType }
     *     
     */
    public OperationsTypeType getOperationsType() {
        return operationsType;
    }

    /**
     * 设置operationsType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperationsTypeType }
     *     
     */
    public void setOperationsType(OperationsTypeType value) {
        this.operationsType = value;
    }

    /**
     * Gets the value of the processSegmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processSegmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessSegmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getProcessSegmentID() {
        if (processSegmentID == null) {
            processSegmentID = new ArrayList<IdentifierType>();
        }
        return this.processSegmentID;
    }

    /**
     * 获取actualStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getActualStartTime() {
        return actualStartTime;
    }

    /**
     * 设置actualStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setActualStartTime(DateTimeType value) {
        this.actualStartTime = value;
    }

    /**
     * 获取actualEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getActualEndTime() {
        return actualEndTime;
    }

    /**
     * 设置actualEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setActualEndTime(DateTimeType value) {
        this.actualEndTime = value;
    }

    /**
     * 获取postingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPostingDate() {
        return postingDate;
    }

    /**
     * 设置postingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPostingDate(DateTimeType value) {
        this.postingDate = value;
    }

    /**
     * Gets the value of the operationsDefinitionID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsDefinitionID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsDefinitionID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getOperationsDefinitionID() {
        if (operationsDefinitionID == null) {
            operationsDefinitionID = new ArrayList<IdentifierType>();
        }
        return this.operationsDefinitionID;
    }

    /**
     * Gets the value of the operationsSegmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsSegmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsSegmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getOperationsSegmentID() {
        if (operationsSegmentID == null) {
            operationsSegmentID = new ArrayList<IdentifierType>();
        }
        return this.operationsSegmentID;
    }

    /**
     * Gets the value of the workResponseID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workResponseID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkResponseID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getWorkResponseID() {
        if (workResponseID == null) {
            workResponseID = new ArrayList<IdentifierType>();
        }
        return this.workResponseID;
    }

    /**
     * Gets the value of the jobResponseID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobResponseID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobResponseID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getJobResponseID() {
        if (jobResponseID == null) {
            jobResponseID = new ArrayList<IdentifierType>();
        }
        return this.jobResponseID;
    }

    /**
     * 获取segmentState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseStateType }
     *     
     */
    public ResponseStateType getSegmentState() {
        return segmentState;
    }

    /**
     * 设置segmentState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStateType }
     *     
     */
    public void setSegmentState(ResponseStateType value) {
        this.segmentState = value;
    }

    /**
     * Gets the value of the segmentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpSegmentDataType }
     * 
     * 
     */
    public List<OpSegmentDataType> getSegmentData() {
        if (segmentData == null) {
            segmentData = new ArrayList<OpSegmentDataType>();
        }
        return this.segmentData;
    }

    /**
     * Gets the value of the personnelActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPersonnelActualType }
     * 
     * 
     */
    public List<OpPersonnelActualType> getPersonnelActual() {
        if (personnelActual == null) {
            personnelActual = new ArrayList<OpPersonnelActualType>();
        }
        return this.personnelActual;
    }

    /**
     * Gets the value of the equipmentActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpEquipmentActualType }
     * 
     * 
     */
    public List<OpEquipmentActualType> getEquipmentActual() {
        if (equipmentActual == null) {
            equipmentActual = new ArrayList<OpEquipmentActualType>();
        }
        return this.equipmentActual;
    }

    /**
     * Gets the value of the physicalAssetActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPhysicalAssetActualType }
     * 
     * 
     */
    public List<OpPhysicalAssetActualType> getPhysicalAssetActual() {
        if (physicalAssetActual == null) {
            physicalAssetActual = new ArrayList<OpPhysicalAssetActualType>();
        }
        return this.physicalAssetActual;
    }

    /**
     * Gets the value of the materialActual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialActual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpMaterialActualType }
     * 
     * 
     */
    public List<OpMaterialActualType> getMaterialActual() {
        if (materialActual == null) {
            materialActual = new ArrayList<OpMaterialActualType>();
        }
        return this.materialActual;
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
     * 
     * 
     */
    public List<OpSegmentResponseType> getSegmentResponse() {
        if (segmentResponse == null) {
            segmentResponse = new ArrayList<OpSegmentResponseType>();
        }
        return this.segmentResponse;
    }

    /**
     * 获取requiredByRequestedSegmentResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequiredByRequestedSegmentResponseType }
     *     
     */
    public RequiredByRequestedSegmentResponseType getRequiredByRequestedSegmentResponse() {
        return requiredByRequestedSegmentResponse;
    }

    /**
     * 设置requiredByRequestedSegmentResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredByRequestedSegmentResponseType }
     *     
     */
    public void setRequiredByRequestedSegmentResponse(RequiredByRequestedSegmentResponseType value) {
        this.requiredByRequestedSegmentResponse = value;
    }

}
