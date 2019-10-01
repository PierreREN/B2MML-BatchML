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
 * <p>JobResponseType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="JobResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="WorkType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="JobOrderID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="WorkDirectiveID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="WorkDirectiveVersion" type="{http://www.mesa.org/xml/B2MML}VersionType" minOccurs="0"/>
 *         &lt;element name="WorkMasterID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="WorkMasterVersion" type="{http://www.mesa.org/xml/B2MML}VersionType" minOccurs="0"/>
 *         &lt;element name="WorkflowSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="WorkflowSpecificationNodeID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="JobState" type="{http://www.mesa.org/xml/B2MML}ResponseStateType" minOccurs="0"/>
 *         &lt;element name="JobResponsetData" type="{http://www.mesa.org/xml/B2MML}OpSegmentDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelActual" type="{http://www.mesa.org/xml/B2MML}OpPersonnelActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentActual" type="{http://www.mesa.org/xml/B2MML}OpEquipmentActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetActual" type="{http://www.mesa.org/xml/B2MML}OpPhysicalAssetActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialActual" type="{http://www.mesa.org/xml/B2MML}OpMaterialActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}JobResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobResponseType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "workType",
        "jobOrderID",
        "workDirectiveID",
        "workDirectiveVersion",
        "workMasterID",
        "workMasterVersion",
        "workflowSpecificationID",
        "workflowSpecificationNodeID",
        "startTime",
        "endTime",
        "jobState",
        "jobResponsetData",
        "personnelActual",
        "equipmentActual",
        "physicalAssetActual",
        "materialActual"
})
public class JobResponseType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "WorkType")
    protected OperationsTypeType workType;
    @XmlElement(name = "JobOrderID")
    protected IdentifierType jobOrderID;
    @XmlElement(name = "WorkDirectiveID")
    protected IdentifierType workDirectiveID;
    @XmlElement(name = "WorkDirectiveVersion")
    protected VersionType workDirectiveVersion;
    @XmlElement(name = "WorkMasterID")
    protected IdentifierType workMasterID;
    @XmlElement(name = "WorkMasterVersion")
    protected VersionType workMasterVersion;
    @XmlElement(name = "WorkflowSpecificationID")
    protected IdentifierType workflowSpecificationID;
    @XmlElement(name = "WorkflowSpecificationNodeID")
    protected IdentifierType workflowSpecificationNodeID;
    @XmlElement(name = "StartTime")
    protected DateTimeType startTime;
    @XmlElement(name = "EndTime")
    protected DateTimeType endTime;
    @XmlElement(name = "JobState")
    protected ResponseStateType jobState;
    @XmlElement(name = "JobResponsetData")
    protected List<OpSegmentDataType> jobResponsetData;
    @XmlElement(name = "PersonnelActual")
    protected List<OpPersonnelActualType> personnelActual;
    @XmlElement(name = "EquipmentActual")
    protected List<OpEquipmentActualType> equipmentActual;
    @XmlElement(name = "PhysicalAssetActual")
    protected List<OpPhysicalAssetActualType> physicalAssetActual;
    @XmlElement(name = "MaterialActual")
    protected List<OpMaterialActualType> materialActual;

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
     * 获取jobOrderID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getJobOrderID() {
        return jobOrderID;
    }

    /**
     * 设置jobOrderID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setJobOrderID(IdentifierType value) {
        this.jobOrderID = value;
    }

    /**
     * 获取workDirectiveID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getWorkDirectiveID() {
        return workDirectiveID;
    }

    /**
     * 设置workDirectiveID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setWorkDirectiveID(IdentifierType value) {
        this.workDirectiveID = value;
    }

    /**
     * 获取workDirectiveVersion属性的值。
     *
     * @return possible object is
     * {@link VersionType }
     */
    public VersionType getWorkDirectiveVersion() {
        return workDirectiveVersion;
    }

    /**
     * 设置workDirectiveVersion属性的值。
     *
     * @param value allowed object is
     *              {@link VersionType }
     */
    public void setWorkDirectiveVersion(VersionType value) {
        this.workDirectiveVersion = value;
    }

    /**
     * 获取workMasterID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getWorkMasterID() {
        return workMasterID;
    }

    /**
     * 设置workMasterID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setWorkMasterID(IdentifierType value) {
        this.workMasterID = value;
    }

    /**
     * 获取workMasterVersion属性的值。
     *
     * @return possible object is
     * {@link VersionType }
     */
    public VersionType getWorkMasterVersion() {
        return workMasterVersion;
    }

    /**
     * 设置workMasterVersion属性的值。
     *
     * @param value allowed object is
     *              {@link VersionType }
     */
    public void setWorkMasterVersion(VersionType value) {
        this.workMasterVersion = value;
    }

    /**
     * 获取workflowSpecificationID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getWorkflowSpecificationID() {
        return workflowSpecificationID;
    }

    /**
     * 设置workflowSpecificationID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setWorkflowSpecificationID(IdentifierType value) {
        this.workflowSpecificationID = value;
    }

    /**
     * 获取workflowSpecificationNodeID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getWorkflowSpecificationNodeID() {
        return workflowSpecificationNodeID;
    }

    /**
     * 设置workflowSpecificationNodeID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setWorkflowSpecificationNodeID(IdentifierType value) {
        this.workflowSpecificationNodeID = value;
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
     * 获取jobState属性的值。
     *
     * @return possible object is
     * {@link ResponseStateType }
     */
    public ResponseStateType getJobState() {
        return jobState;
    }

    /**
     * 设置jobState属性的值。
     *
     * @param value allowed object is
     *              {@link ResponseStateType }
     */
    public void setJobState(ResponseStateType value) {
        this.jobState = value;
    }

    /**
     * Gets the value of the jobResponsetData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobResponsetData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobResponsetData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpSegmentDataType }
     */
    public List<OpSegmentDataType> getJobResponsetData() {
        if (jobResponsetData == null) {
            jobResponsetData = new ArrayList<OpSegmentDataType>();
        }
        return this.jobResponsetData;
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
     */
    public List<OpMaterialActualType> getMaterialActual() {
        if (materialActual == null) {
            materialActual = new ArrayList<OpMaterialActualType>();
        }
        return this.materialActual;
    }

}
