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
 * <p>MasterDataProfileType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MasterDataProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.mesa.org/xml/B2MML}MasterDataProfileHeaderType"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.mesa.org/xml/B2MML}IDandDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataType" type="{http://www.mesa.org/xml/B2MML}IDandDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValueKey" type="{http://www.mesa.org/xml/B2MML}IDandDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Enumeration" type="{http://www.mesa.org/xml/B2MML}ProfileEnumerationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherEnumeration" type="{http://www.mesa.org/xml/B2MML}OtherEnumerationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationalLocation" type="{http://www.mesa.org/xml/B2MML}OperationalLocationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationalLocationClass" type="{http://www.mesa.org/xml/B2MML}OperationalLocationClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsDefinition" type="{http://www.mesa.org/xml/B2MML}OperationsDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsSegment" type="{http://www.mesa.org/xml/B2MML}OperationsSegmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsEventClass" type="{http://www.mesa.org/xml/B2MML}OperationsEventClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsEventDefinition" type="{http://www.mesa.org/xml/B2MML}OperationsEventDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessSegment" type="{http://www.mesa.org/xml/B2MML}ProcessSegmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialClass" type="{http://www.mesa.org/xml/B2MML}MaterialClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialDefinition" type="{http://www.mesa.org/xml/B2MML}MaterialDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentClass" type="{http://www.mesa.org/xml/B2MML}EquipmentClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Equipment" type="{http://www.mesa.org/xml/B2MML}EquipmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelClass" type="{http://www.mesa.org/xml/B2MML}PersonnelClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetClass" type="{http://www.mesa.org/xml/B2MML}PhysicalAssetClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResourceRelationshipNetwork" type="{http://www.mesa.org/xml/B2MML}ResourceRelationshipNetworkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestSpecification" type="{http://www.mesa.org/xml/B2MML}TestSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkAlertDefinition" type="{http://www.mesa.org/xml/B2MML}WorkAlertDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkCalendar" type="{http://www.mesa.org/xml/B2MML}WorkCalendarType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkCalendarDefinition" type="{http://www.mesa.org/xml/B2MML}WorkCalendarDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkflowSpecification" type="{http://www.mesa.org/xml/B2MML}WorkflowSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkflowSpecificationType" type="{http://www.mesa.org/xml/B2MML}WorkflowSpecificationTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkMaster" type="{http://www.mesa.org/xml/B2MML}WorkMasterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionProfile" type="{http://www.mesa.org/xml/B2MML}MasterDataTransactionProfileType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterDataProfileType", propOrder = {
    "header",
    "unitOfMeasure",
    "dataType",
    "valueKey",
    "enumeration",
    "otherEnumeration",
    "operationalLocation",
    "operationalLocationClass",
    "operationsDefinition",
    "operationsSegment",
    "operationsEventClass",
    "operationsEventDefinition",
    "processSegment",
    "materialClass",
    "materialDefinition",
    "equipmentClass",
    "equipment",
    "personnelClass",
    "physicalAssetClass",
    "resourceRelationshipNetwork",
    "testSpecification",
    "workAlertDefinition",
    "workCalendar",
    "workCalendarDefinition",
    "workflowSpecification",
    "workflowSpecificationType",
    "workMaster",
    "transactionProfile"
})
public class MasterDataProfileType {

    @XmlElement(name = "Header", required = true)
    protected MasterDataProfileHeaderType header;
    @XmlElement(name = "UnitOfMeasure")
    protected List<IDandDescriptionType> unitOfMeasure;
    @XmlElement(name = "DataType")
    protected List<IDandDescriptionType> dataType;
    @XmlElement(name = "ValueKey")
    protected List<IDandDescriptionType> valueKey;
    @XmlElement(name = "Enumeration")
    protected List<ProfileEnumerationType> enumeration;
    @XmlElement(name = "OtherEnumeration")
    protected List<OtherEnumerationType> otherEnumeration;
    @XmlElement(name = "OperationalLocation")
    protected List<OperationalLocationType> operationalLocation;
    @XmlElement(name = "OperationalLocationClass")
    protected List<OperationalLocationClassType> operationalLocationClass;
    @XmlElement(name = "OperationsDefinition")
    protected List<OperationsDefinitionType> operationsDefinition;
    @XmlElement(name = "OperationsSegment")
    protected List<OperationsSegmentType> operationsSegment;
    @XmlElement(name = "OperationsEventClass")
    protected List<OperationsEventClassType> operationsEventClass;
    @XmlElement(name = "OperationsEventDefinition")
    protected List<OperationsEventDefinitionType> operationsEventDefinition;
    @XmlElement(name = "ProcessSegment")
    protected List<ProcessSegmentType> processSegment;
    @XmlElement(name = "MaterialClass")
    protected List<MaterialClassType> materialClass;
    @XmlElement(name = "MaterialDefinition")
    protected List<MaterialDefinitionType> materialDefinition;
    @XmlElement(name = "EquipmentClass")
    protected List<EquipmentClassType> equipmentClass;
    @XmlElement(name = "Equipment")
    protected List<EquipmentType> equipment;
    @XmlElement(name = "PersonnelClass")
    protected List<PersonnelClassType> personnelClass;
    @XmlElement(name = "PhysicalAssetClass")
    protected List<PhysicalAssetClassType> physicalAssetClass;
    @XmlElement(name = "ResourceRelationshipNetwork")
    protected List<ResourceRelationshipNetworkType> resourceRelationshipNetwork;
    @XmlElement(name = "TestSpecification")
    protected List<TestSpecificationType> testSpecification;
    @XmlElement(name = "WorkAlertDefinition")
    protected List<WorkAlertDefinitionType> workAlertDefinition;
    @XmlElement(name = "WorkCalendar")
    protected List<WorkCalendarType> workCalendar;
    @XmlElement(name = "WorkCalendarDefinition")
    protected List<WorkCalendarDefinitionType> workCalendarDefinition;
    @XmlElement(name = "WorkflowSpecification")
    protected List<WorkflowSpecificationType> workflowSpecification;
    @XmlElement(name = "WorkflowSpecificationType")
    protected List<WorkflowSpecificationTypeType> workflowSpecificationType;
    @XmlElement(name = "WorkMaster")
    protected List<WorkMasterType> workMaster;
    @XmlElement(name = "TransactionProfile")
    protected List<MasterDataTransactionProfileType> transactionProfile;

    /**
     * 获取header属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MasterDataProfileHeaderType }
     *     
     */
    public MasterDataProfileHeaderType getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MasterDataProfileHeaderType }
     *     
     */
    public void setHeader(MasterDataProfileHeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitOfMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitOfMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDandDescriptionType }
     * 
     * 
     */
    public List<IDandDescriptionType> getUnitOfMeasure() {
        if (unitOfMeasure == null) {
            unitOfMeasure = new ArrayList<IDandDescriptionType>();
        }
        return this.unitOfMeasure;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDandDescriptionType }
     * 
     * 
     */
    public List<IDandDescriptionType> getDataType() {
        if (dataType == null) {
            dataType = new ArrayList<IDandDescriptionType>();
        }
        return this.dataType;
    }

    /**
     * Gets the value of the valueKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDandDescriptionType }
     * 
     * 
     */
    public List<IDandDescriptionType> getValueKey() {
        if (valueKey == null) {
            valueKey = new ArrayList<IDandDescriptionType>();
        }
        return this.valueKey;
    }

    /**
     * Gets the value of the enumeration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumeration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumeration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileEnumerationType }
     * 
     * 
     */
    public List<ProfileEnumerationType> getEnumeration() {
        if (enumeration == null) {
            enumeration = new ArrayList<ProfileEnumerationType>();
        }
        return this.enumeration;
    }

    /**
     * Gets the value of the otherEnumeration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherEnumeration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherEnumeration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherEnumerationType }
     * 
     * 
     */
    public List<OtherEnumerationType> getOtherEnumeration() {
        if (otherEnumeration == null) {
            otherEnumeration = new ArrayList<OtherEnumerationType>();
        }
        return this.otherEnumeration;
    }

    /**
     * Gets the value of the operationalLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationalLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationalLocationType }
     * 
     * 
     */
    public List<OperationalLocationType> getOperationalLocation() {
        if (operationalLocation == null) {
            operationalLocation = new ArrayList<OperationalLocationType>();
        }
        return this.operationalLocation;
    }

    /**
     * Gets the value of the operationalLocationClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationalLocationClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationalLocationClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationalLocationClassType }
     * 
     * 
     */
    public List<OperationalLocationClassType> getOperationalLocationClass() {
        if (operationalLocationClass == null) {
            operationalLocationClass = new ArrayList<OperationalLocationClassType>();
        }
        return this.operationalLocationClass;
    }

    /**
     * Gets the value of the operationsDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsDefinitionType }
     * 
     * 
     */
    public List<OperationsDefinitionType> getOperationsDefinition() {
        if (operationsDefinition == null) {
            operationsDefinition = new ArrayList<OperationsDefinitionType>();
        }
        return this.operationsDefinition;
    }

    /**
     * Gets the value of the operationsSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsSegmentType }
     * 
     * 
     */
    public List<OperationsSegmentType> getOperationsSegment() {
        if (operationsSegment == null) {
            operationsSegment = new ArrayList<OperationsSegmentType>();
        }
        return this.operationsSegment;
    }

    /**
     * Gets the value of the operationsEventClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsEventClassType }
     * 
     * 
     */
    public List<OperationsEventClassType> getOperationsEventClass() {
        if (operationsEventClass == null) {
            operationsEventClass = new ArrayList<OperationsEventClassType>();
        }
        return this.operationsEventClass;
    }

    /**
     * Gets the value of the operationsEventDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsEventDefinitionType }
     * 
     * 
     */
    public List<OperationsEventDefinitionType> getOperationsEventDefinition() {
        if (operationsEventDefinition == null) {
            operationsEventDefinition = new ArrayList<OperationsEventDefinitionType>();
        }
        return this.operationsEventDefinition;
    }

    /**
     * Gets the value of the processSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessSegmentType }
     * 
     * 
     */
    public List<ProcessSegmentType> getProcessSegment() {
        if (processSegment == null) {
            processSegment = new ArrayList<ProcessSegmentType>();
        }
        return this.processSegment;
    }

    /**
     * Gets the value of the materialClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialClassType }
     * 
     * 
     */
    public List<MaterialClassType> getMaterialClass() {
        if (materialClass == null) {
            materialClass = new ArrayList<MaterialClassType>();
        }
        return this.materialClass;
    }

    /**
     * Gets the value of the materialDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialDefinitionType }
     * 
     * 
     */
    public List<MaterialDefinitionType> getMaterialDefinition() {
        if (materialDefinition == null) {
            materialDefinition = new ArrayList<MaterialDefinitionType>();
        }
        return this.materialDefinition;
    }

    /**
     * Gets the value of the equipmentClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentClassType }
     * 
     * 
     */
    public List<EquipmentClassType> getEquipmentClass() {
        if (equipmentClass == null) {
            equipmentClass = new ArrayList<EquipmentClassType>();
        }
        return this.equipmentClass;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentType }
     * 
     * 
     */
    public List<EquipmentType> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<EquipmentType>();
        }
        return this.equipment;
    }

    /**
     * Gets the value of the personnelClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonnelClassType }
     * 
     * 
     */
    public List<PersonnelClassType> getPersonnelClass() {
        if (personnelClass == null) {
            personnelClass = new ArrayList<PersonnelClassType>();
        }
        return this.personnelClass;
    }

    /**
     * Gets the value of the physicalAssetClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAssetClassType }
     * 
     * 
     */
    public List<PhysicalAssetClassType> getPhysicalAssetClass() {
        if (physicalAssetClass == null) {
            physicalAssetClass = new ArrayList<PhysicalAssetClassType>();
        }
        return this.physicalAssetClass;
    }

    /**
     * Gets the value of the resourceRelationshipNetwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceRelationshipNetwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceRelationshipNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceRelationshipNetworkType }
     * 
     * 
     */
    public List<ResourceRelationshipNetworkType> getResourceRelationshipNetwork() {
        if (resourceRelationshipNetwork == null) {
            resourceRelationshipNetwork = new ArrayList<ResourceRelationshipNetworkType>();
        }
        return this.resourceRelationshipNetwork;
    }

    /**
     * Gets the value of the testSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationType }
     * 
     * 
     */
    public List<TestSpecificationType> getTestSpecification() {
        if (testSpecification == null) {
            testSpecification = new ArrayList<TestSpecificationType>();
        }
        return this.testSpecification;
    }

    /**
     * Gets the value of the workAlertDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workAlertDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkAlertDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkAlertDefinitionType }
     * 
     * 
     */
    public List<WorkAlertDefinitionType> getWorkAlertDefinition() {
        if (workAlertDefinition == null) {
            workAlertDefinition = new ArrayList<WorkAlertDefinitionType>();
        }
        return this.workAlertDefinition;
    }

    /**
     * Gets the value of the workCalendar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workCalendar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkCalendar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkCalendarType }
     * 
     * 
     */
    public List<WorkCalendarType> getWorkCalendar() {
        if (workCalendar == null) {
            workCalendar = new ArrayList<WorkCalendarType>();
        }
        return this.workCalendar;
    }

    /**
     * Gets the value of the workCalendarDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workCalendarDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkCalendarDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkCalendarDefinitionType }
     * 
     * 
     */
    public List<WorkCalendarDefinitionType> getWorkCalendarDefinition() {
        if (workCalendarDefinition == null) {
            workCalendarDefinition = new ArrayList<WorkCalendarDefinitionType>();
        }
        return this.workCalendarDefinition;
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
     * 
     * 
     */
    public List<WorkflowSpecificationType> getWorkflowSpecification() {
        if (workflowSpecification == null) {
            workflowSpecification = new ArrayList<WorkflowSpecificationType>();
        }
        return this.workflowSpecification;
    }

    /**
     * Gets the value of the workflowSpecificationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflowSpecificationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflowSpecificationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowSpecificationTypeType }
     * 
     * 
     */
    public List<WorkflowSpecificationTypeType> getWorkflowSpecificationType() {
        if (workflowSpecificationType == null) {
            workflowSpecificationType = new ArrayList<WorkflowSpecificationTypeType>();
        }
        return this.workflowSpecificationType;
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
     * 
     * 
     */
    public List<WorkMasterType> getWorkMaster() {
        if (workMaster == null) {
            workMaster = new ArrayList<WorkMasterType>();
        }
        return this.workMaster;
    }

    /**
     * Gets the value of the transactionProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterDataTransactionProfileType }
     * 
     * 
     */
    public List<MasterDataTransactionProfileType> getTransactionProfile() {
        if (transactionProfile == null) {
            transactionProfile = new ArrayList<MasterDataTransactionProfileType>();
        }
        return this.transactionProfile;
    }

}
