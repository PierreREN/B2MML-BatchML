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
 * <p>JobOrderType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="JobOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="WorkType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="WorkMasterID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="WorkMasterVersion" type="{http://www.mesa.org/xml/B2MML}VersionType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.mesa.org/xml/B2MML}PriorityType" minOccurs="0"/>
 *         &lt;element name="Command" type="{http://www.mesa.org/xml/B2MML}JobOrderCommandType" minOccurs="0"/>
 *         &lt;element name="CommandRule" type="{http://www.mesa.org/xml/B2MML}JobOrderCommandRuleType" minOccurs="0"/>
 *         &lt;element name="DispatchStatus" type="{http://www.mesa.org/xml/B2MML}JobOrderDispatchStatusType" minOccurs="0"/>
 *         &lt;element name="JobOrderParameter" type="{http://www.mesa.org/xml/B2MML}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelRequirement" type="{http://www.mesa.org/xml/B2MML}OpPersonnelRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentRequirement" type="{http://www.mesa.org/xml/B2MML}OpEquipmentRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetRequirement" type="{http://www.mesa.org/xml/B2MML}OpPhysicalAssetRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialRequirement" type="{http://www.mesa.org/xml/B2MML}OpMaterialRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsRequestID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentRequirementID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}JobOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobOrderType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "workType",
        "workMasterID",
        "workMasterVersion",
        "startTime",
        "endTime",
        "priority",
        "command",
        "commandRule",
        "dispatchStatus",
        "jobOrderParameter",
        "personnelRequirement",
        "equipmentRequirement",
        "physicalAssetRequirement",
        "materialRequirement",
        "operationsRequestID",
        "segmentRequirementID"
})
public class JobOrderType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "WorkType")
    protected OperationsTypeType workType;
    @XmlElement(name = "WorkMasterID")
    protected IdentifierType workMasterID;
    @XmlElement(name = "WorkMasterVersion")
    protected VersionType workMasterVersion;
    @XmlElement(name = "StartTime")
    protected DateTimeType startTime;
    @XmlElement(name = "EndTime")
    protected DateTimeType endTime;
    @XmlElement(name = "Priority")
    protected PriorityType priority;
    @XmlElement(name = "Command")
    protected JobOrderCommandType command;
    @XmlElement(name = "CommandRule")
    protected JobOrderCommandRuleType commandRule;
    @XmlElement(name = "DispatchStatus")
    protected JobOrderDispatchStatusType dispatchStatus;
    @XmlElement(name = "JobOrderParameter")
    protected List<ParameterType> jobOrderParameter;
    @XmlElement(name = "PersonnelRequirement")
    protected List<OpPersonnelRequirementType> personnelRequirement;
    @XmlElement(name = "EquipmentRequirement")
    protected List<OpEquipmentRequirementType> equipmentRequirement;
    @XmlElement(name = "PhysicalAssetRequirement")
    protected List<OpPhysicalAssetRequirementType> physicalAssetRequirement;
    @XmlElement(name = "MaterialRequirement")
    protected List<OpMaterialRequirementType> materialRequirement;
    @XmlElement(name = "OperationsRequestID")
    protected List<IdentifierType> operationsRequestID;
    @XmlElement(name = "SegmentRequirementID")
    protected List<IdentifierType> segmentRequirementID;

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
     * 获取command属性的值。
     *
     * @return possible object is
     * {@link JobOrderCommandType }
     */
    public JobOrderCommandType getCommand() {
        return command;
    }

    /**
     * 设置command属性的值。
     *
     * @param value allowed object is
     *              {@link JobOrderCommandType }
     */
    public void setCommand(JobOrderCommandType value) {
        this.command = value;
    }

    /**
     * 获取commandRule属性的值。
     *
     * @return possible object is
     * {@link JobOrderCommandRuleType }
     */
    public JobOrderCommandRuleType getCommandRule() {
        return commandRule;
    }

    /**
     * 设置commandRule属性的值。
     *
     * @param value allowed object is
     *              {@link JobOrderCommandRuleType }
     */
    public void setCommandRule(JobOrderCommandRuleType value) {
        this.commandRule = value;
    }

    /**
     * 获取dispatchStatus属性的值。
     *
     * @return possible object is
     * {@link JobOrderDispatchStatusType }
     */
    public JobOrderDispatchStatusType getDispatchStatus() {
        return dispatchStatus;
    }

    /**
     * 设置dispatchStatus属性的值。
     *
     * @param value allowed object is
     *              {@link JobOrderDispatchStatusType }
     */
    public void setDispatchStatus(JobOrderDispatchStatusType value) {
        this.dispatchStatus = value;
    }

    /**
     * Gets the value of the jobOrderParameter property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobOrderParameter property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobOrderParameter().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterType }
     */
    public List<ParameterType> getJobOrderParameter() {
        if (jobOrderParameter == null) {
            jobOrderParameter = new ArrayList<ParameterType>();
        }
        return this.jobOrderParameter;
    }

    /**
     * Gets the value of the personnelRequirement property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelRequirement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelRequirement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPersonnelRequirementType }
     */
    public List<OpPersonnelRequirementType> getPersonnelRequirement() {
        if (personnelRequirement == null) {
            personnelRequirement = new ArrayList<OpPersonnelRequirementType>();
        }
        return this.personnelRequirement;
    }

    /**
     * Gets the value of the equipmentRequirement property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentRequirement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentRequirement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpEquipmentRequirementType }
     */
    public List<OpEquipmentRequirementType> getEquipmentRequirement() {
        if (equipmentRequirement == null) {
            equipmentRequirement = new ArrayList<OpEquipmentRequirementType>();
        }
        return this.equipmentRequirement;
    }

    /**
     * Gets the value of the physicalAssetRequirement property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetRequirement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetRequirement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPhysicalAssetRequirementType }
     */
    public List<OpPhysicalAssetRequirementType> getPhysicalAssetRequirement() {
        if (physicalAssetRequirement == null) {
            physicalAssetRequirement = new ArrayList<OpPhysicalAssetRequirementType>();
        }
        return this.physicalAssetRequirement;
    }

    /**
     * Gets the value of the materialRequirement property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialRequirement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialRequirement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpMaterialRequirementType }
     */
    public List<OpMaterialRequirementType> getMaterialRequirement() {
        if (materialRequirement == null) {
            materialRequirement = new ArrayList<OpMaterialRequirementType>();
        }
        return this.materialRequirement;
    }

    /**
     * Gets the value of the operationsRequestID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsRequestID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsRequestID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getOperationsRequestID() {
        if (operationsRequestID == null) {
            operationsRequestID = new ArrayList<IdentifierType>();
        }
        return this.operationsRequestID;
    }

    /**
     * Gets the value of the segmentRequirementID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentRequirementID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentRequirementID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getSegmentRequirementID() {
        if (segmentRequirementID == null) {
            segmentRequirementID = new ArrayList<IdentifierType>();
        }
        return this.segmentRequirementID;
    }

}
