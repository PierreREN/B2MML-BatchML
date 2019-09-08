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
import javax.xml.datatype.Duration;


/**
 * <p>OpSegmentRequirementType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OpSegmentRequirementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="OperationsType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="ProcessSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="EarliestStartTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LatestEndTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.mesa.org/xml/B2MML}DurationType" minOccurs="0"/>
 *         &lt;element name="OperationsDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="OperationsSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="SegmentState" type="{http://www.mesa.org/xml/B2MML}RequestStateType" minOccurs="0"/>
 *         &lt;element name="SegmentParameter" type="{http://www.mesa.org/xml/B2MML}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelRequirement" type="{http://www.mesa.org/xml/B2MML}OpPersonnelRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentRequirement" type="{http://www.mesa.org/xml/B2MML}OpEquipmentRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetRequirement" type="{http://www.mesa.org/xml/B2MML}OpPhysicalAssetRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialRequirement" type="{http://www.mesa.org/xml/B2MML}OpMaterialRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentRequirement" type="{http://www.mesa.org/xml/B2MML}OpSegmentRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponse" type="{http://www.mesa.org/xml/B2MML}RequiredByRequestedSegmentResponseType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OpSegmentRequirement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpSegmentRequirementType", propOrder = {
    "id",
    "description",
    "hierarchyScope",
    "operationsType",
    "processSegmentID",
    "earliestStartTime",
    "latestEndTime",
    "duration",
    "operationsDefinitionID",
    "operationsSegmentID",
    "segmentState",
    "segmentParameter",
    "personnelRequirement",
    "equipmentRequirement",
    "physicalAssetRequirement",
    "materialRequirement",
    "segmentRequirement",
    "requiredByRequestedSegmentResponse"
})
public class OpSegmentRequirementType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "OperationsType")
    protected OperationsTypeType operationsType;
    @XmlElement(name = "ProcessSegmentID")
    protected IdentifierType processSegmentID;
    @XmlElement(name = "EarliestStartTime")
    protected DateTimeType earliestStartTime;
    @XmlElement(name = "LatestEndTime")
    protected DateTimeType latestEndTime;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "OperationsDefinitionID")
    protected IdentifierType operationsDefinitionID;
    @XmlElement(name = "OperationsSegmentID")
    protected IdentifierType operationsSegmentID;
    @XmlElement(name = "SegmentState")
    protected RequestStateType segmentState;
    @XmlElement(name = "SegmentParameter")
    protected List<ParameterType> segmentParameter;
    @XmlElement(name = "PersonnelRequirement")
    protected List<OpPersonnelRequirementType> personnelRequirement;
    @XmlElement(name = "EquipmentRequirement")
    protected List<OpEquipmentRequirementType> equipmentRequirement;
    @XmlElement(name = "PhysicalAssetRequirement")
    protected List<OpPhysicalAssetRequirementType> physicalAssetRequirement;
    @XmlElement(name = "MaterialRequirement")
    protected List<OpMaterialRequirementType> materialRequirement;
    @XmlElement(name = "SegmentRequirement")
    protected List<OpSegmentRequirementType> segmentRequirement;
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
     * 获取processSegmentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getProcessSegmentID() {
        return processSegmentID;
    }

    /**
     * 设置processSegmentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setProcessSegmentID(IdentifierType value) {
        this.processSegmentID = value;
    }

    /**
     * 获取earliestStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEarliestStartTime() {
        return earliestStartTime;
    }

    /**
     * 设置earliestStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEarliestStartTime(DateTimeType value) {
        this.earliestStartTime = value;
    }

    /**
     * 获取latestEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getLatestEndTime() {
        return latestEndTime;
    }

    /**
     * 设置latestEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setLatestEndTime(DateTimeType value) {
        this.latestEndTime = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * 获取operationsDefinitionID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getOperationsDefinitionID() {
        return operationsDefinitionID;
    }

    /**
     * 设置operationsDefinitionID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setOperationsDefinitionID(IdentifierType value) {
        this.operationsDefinitionID = value;
    }

    /**
     * 获取operationsSegmentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getOperationsSegmentID() {
        return operationsSegmentID;
    }

    /**
     * 设置operationsSegmentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setOperationsSegmentID(IdentifierType value) {
        this.operationsSegmentID = value;
    }

    /**
     * 获取segmentState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequestStateType }
     *     
     */
    public RequestStateType getSegmentState() {
        return segmentState;
    }

    /**
     * 设置segmentState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStateType }
     *     
     */
    public void setSegmentState(RequestStateType value) {
        this.segmentState = value;
    }

    /**
     * Gets the value of the segmentParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterType }
     * 
     * 
     */
    public List<ParameterType> getSegmentParameter() {
        if (segmentParameter == null) {
            segmentParameter = new ArrayList<ParameterType>();
        }
        return this.segmentParameter;
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
     * 
     * 
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
     * 
     * 
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
     * 
     * 
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
     * 
     * 
     */
    public List<OpMaterialRequirementType> getMaterialRequirement() {
        if (materialRequirement == null) {
            materialRequirement = new ArrayList<OpMaterialRequirementType>();
        }
        return this.materialRequirement;
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
     * 
     * 
     */
    public List<OpSegmentRequirementType> getSegmentRequirement() {
        if (segmentRequirement == null) {
            segmentRequirement = new ArrayList<OpSegmentRequirementType>();
        }
        return this.segmentRequirement;
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
