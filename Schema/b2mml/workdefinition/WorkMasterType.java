//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:33:33 PM CST 
//


package isa95.aps.interfaces.b2mml.workdefinition;

import isa95.aps.interfaces.b2mml.workflowspecification.WorkflowSpecificationType;
import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkMasterType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkMasterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}WorkDefinitionType"/>
 *         &lt;element name="WorkMaster" type="{http://www.mesa.org/xml/B2MML}WorkMasterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludesPropertiesOf" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}WorkMaster" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkMasterType", propOrder = {
        "id",
        "version",
        "description",
        "hierarchyScope",
        "workType",
        "duration",
        "publishedDate",
        "operationsDefinitionID",
        "operationsSegmentID",
        "processSegmentID",
        "parameter",
        "personnelSpecification",
        "equipmentSpecification",
        "physicalAssetSpecification",
        "materialSpecification",
        "workflowSpecification",
        "workMaster",
        "includesPropertiesOf"
})
public class WorkMasterType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "VersionType")
    protected VersionType version;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "WorkTypeType")
    protected WorkTypeType workType;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "PublishedDate")
    protected DateTimeType publishedDate;
    @XmlElement(name = "OperationsDefinitionID")
    protected List<IdentifierType> operationsDefinitionID;
    @XmlElement(name = "OperationsSegmentID")
    protected List<IdentifierType> operationsSegmentID;
    @XmlElement(name = "ProcessSegmentID")
    protected List<IdentifierType> processSegmentID;
    @XmlElement(name = "ParameterType")
    protected List<ParameterType> parameter;
    @XmlElement(name = "PersonnelSpecification")
    protected List<OpPersonnelSpecificationType> personnelSpecification;
    @XmlElement(name = "EquipmentSpecification")
    protected List<OpEquipmentSpecificationType> equipmentSpecification;
    @XmlElement(name = "PhysicalAssetSpecification")
    protected List<OpPhysicalAssetSpecificationType> physicalAssetSpecification;
    @XmlElement(name = "MaterialSpecification")
    protected List<OpMaterialSpecificationType> materialSpecification;
    @XmlElement(name = "WorkflowSpecification")
    protected List<WorkflowSpecificationType> workflowSpecification;
    @XmlElement(name = "WorkMaster")
    protected List<WorkMasterType> workMaster;
    @XmlElement(name = "IncludesPropertiesOf")
    protected List<IdentifierType> includesPropertiesOf;

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
     * 获取version属性的值。
     *
     * @return possible object is
     * {@link VersionType }
     */
    public VersionType getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     *
     * @param value allowed object is
     *              {@link VersionType }
     */
    public void setVersion(VersionType value) {
        this.version = value;
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
     * {@link WorkTypeType }
     */
    public WorkTypeType getWorkType() {
        return workType;
    }

    /**
     * 设置workType属性的值。
     *
     * @param value allowed object is
     *              {@link WorkTypeType }
     */
    public void setWorkType(WorkTypeType value) {
        this.workType = value;
    }

    /**
     * 获取duration属性的值。
     *
     * @return possible object is
     * {@link Duration }
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     *
     * @param value allowed object is
     *              {@link Duration }
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * 获取publishedDate属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getPublishedDate() {
        return publishedDate;
    }

    /**
     * 设置publishedDate属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setPublishedDate(DateTimeType value) {
        this.publishedDate = value;
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
     */
    public List<IdentifierType> getOperationsSegmentID() {
        if (operationsSegmentID == null) {
            operationsSegmentID = new ArrayList<IdentifierType>();
        }
        return this.operationsSegmentID;
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
     */
    public List<IdentifierType> getProcessSegmentID() {
        if (processSegmentID == null) {
            processSegmentID = new ArrayList<IdentifierType>();
        }
        return this.processSegmentID;
    }

    /**
     * Gets the value of the parameter property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterType }
     */
    public List<ParameterType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<ParameterType>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the personnelSpecification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelSpecification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelSpecification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPersonnelSpecificationType }
     */
    public List<OpPersonnelSpecificationType> getPersonnelSpecification() {
        if (personnelSpecification == null) {
            personnelSpecification = new ArrayList<OpPersonnelSpecificationType>();
        }
        return this.personnelSpecification;
    }

    /**
     * Gets the value of the equipmentSpecification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentSpecification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentSpecification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpEquipmentSpecificationType }
     */
    public List<OpEquipmentSpecificationType> getEquipmentSpecification() {
        if (equipmentSpecification == null) {
            equipmentSpecification = new ArrayList<OpEquipmentSpecificationType>();
        }
        return this.equipmentSpecification;
    }

    /**
     * Gets the value of the physicalAssetSpecification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetSpecification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetSpecification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPhysicalAssetSpecificationType }
     */
    public List<OpPhysicalAssetSpecificationType> getPhysicalAssetSpecification() {
        if (physicalAssetSpecification == null) {
            physicalAssetSpecification = new ArrayList<OpPhysicalAssetSpecificationType>();
        }
        return this.physicalAssetSpecification;
    }

    /**
     * Gets the value of the materialSpecification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSpecification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSpecification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpMaterialSpecificationType }
     */
    public List<OpMaterialSpecificationType> getMaterialSpecification() {
        if (materialSpecification == null) {
            materialSpecification = new ArrayList<OpMaterialSpecificationType>();
        }
        return this.materialSpecification;
    }

    /**
     * Gets the value of the workflowSpecification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflowSpecification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflowSpecification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowSpecificationType }
     */
    public List<WorkflowSpecificationType> getWorkflowSpecification() {
        if (workflowSpecification == null) {
            workflowSpecification = new ArrayList<WorkflowSpecificationType>();
        }
        return this.workflowSpecification;
    }

    /**
     * Gets the value of the workMaster property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workMaster property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkMaster().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkMasterType }
     */
    public List<WorkMasterType> getWorkMaster() {
        if (workMaster == null) {
            workMaster = new ArrayList<WorkMasterType>();
        }
        return this.workMaster;
    }

    /**
     * Gets the value of the includesPropertiesOf property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesPropertiesOf property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesPropertiesOf().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getIncludesPropertiesOf() {
        if (includesPropertiesOf == null) {
            includesPropertiesOf = new ArrayList<IdentifierType>();
        }
        return this.includesPropertiesOf;
    }

}
