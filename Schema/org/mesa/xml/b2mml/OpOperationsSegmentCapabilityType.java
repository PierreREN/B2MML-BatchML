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
 * <p>OpOperationsSegmentCapabilityType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OpOperationsSegmentCapabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CapabilityType" type="{http://www.mesa.org/xml/B2MML}CapabilityTypeType"/>
 *         &lt;element name="Reason" type="{http://www.mesa.org/xml/B2MML}ReasonType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentElementLevel" type="{http://www.mesa.org/xml/B2MML}EquipmentElementLevelType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PersonnelCapability" type="{http://www.mesa.org/xml/B2MML}OpPersonnelCapabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentCapability" type="{http://www.mesa.org/xml/B2MML}OpEquipmentCapabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetCapability" type="{http://www.mesa.org/xml/B2MML}OpPhysicalAssetCapabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialCapability" type="{http://www.mesa.org/xml/B2MML}OpMaterialCapabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsSegmentCapability" type="{http://www.mesa.org/xml/B2MML}OpOperationsSegmentCapabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OpOperationsSegmentCapability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpOperationsSegmentCapabilityType", propOrder = {
    "id",
    "description",
    "operationsSegmentID",
    "capabilityType",
    "reason",
    "hierarchyScope",
    "equipmentElementLevel",
    "startTime",
    "endTime",
    "personnelCapability",
    "equipmentCapability",
    "physicalAssetCapability",
    "materialCapability",
    "operationsSegmentCapability"
})
public class OpOperationsSegmentCapabilityType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "OperationsSegmentID")
    protected List<IdentifierType> operationsSegmentID;
    @XmlElement(name = "CapabilityType", required = true)
    protected CapabilityTypeType capabilityType;
    @XmlElement(name = "Reason")
    protected List<ReasonType> reason;
    @XmlElement(name = "HierarchyScope")
    protected List<HierarchyScopeType> hierarchyScope;
    @XmlElement(name = "EquipmentElementLevel")
    protected List<EquipmentElementLevelType> equipmentElementLevel;
    @XmlElement(name = "StartTime")
    protected DateTimeType startTime;
    @XmlElement(name = "EndTime")
    protected DateTimeType endTime;
    @XmlElement(name = "PersonnelCapability")
    protected List<OpPersonnelCapabilityType> personnelCapability;
    @XmlElement(name = "EquipmentCapability")
    protected List<OpEquipmentCapabilityType> equipmentCapability;
    @XmlElement(name = "PhysicalAssetCapability")
    protected List<OpPhysicalAssetCapabilityType> physicalAssetCapability;
    @XmlElement(name = "MaterialCapability")
    protected List<OpMaterialCapabilityType> materialCapability;
    @XmlElement(name = "OperationsSegmentCapability")
    protected List<OpOperationsSegmentCapabilityType> operationsSegmentCapability;

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
     * 获取capabilityType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CapabilityTypeType }
     *     
     */
    public CapabilityTypeType getCapabilityType() {
        return capabilityType;
    }

    /**
     * 设置capabilityType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityTypeType }
     *     
     */
    public void setCapabilityType(CapabilityTypeType value) {
        this.capabilityType = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReasonType }
     * 
     * 
     */
    public List<ReasonType> getReason() {
        if (reason == null) {
            reason = new ArrayList<ReasonType>();
        }
        return this.reason;
    }

    /**
     * Gets the value of the hierarchyScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchyScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchyScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HierarchyScopeType }
     * 
     * 
     */
    public List<HierarchyScopeType> getHierarchyScope() {
        if (hierarchyScope == null) {
            hierarchyScope = new ArrayList<HierarchyScopeType>();
        }
        return this.hierarchyScope;
    }

    /**
     * Gets the value of the equipmentElementLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentElementLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentElementLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentElementLevelType }
     * 
     * 
     */
    public List<EquipmentElementLevelType> getEquipmentElementLevel() {
        if (equipmentElementLevel == null) {
            equipmentElementLevel = new ArrayList<EquipmentElementLevelType>();
        }
        return this.equipmentElementLevel;
    }

    /**
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setStartTime(DateTimeType value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEndTime(DateTimeType value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the personnelCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPersonnelCapabilityType }
     * 
     * 
     */
    public List<OpPersonnelCapabilityType> getPersonnelCapability() {
        if (personnelCapability == null) {
            personnelCapability = new ArrayList<OpPersonnelCapabilityType>();
        }
        return this.personnelCapability;
    }

    /**
     * Gets the value of the equipmentCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpEquipmentCapabilityType }
     * 
     * 
     */
    public List<OpEquipmentCapabilityType> getEquipmentCapability() {
        if (equipmentCapability == null) {
            equipmentCapability = new ArrayList<OpEquipmentCapabilityType>();
        }
        return this.equipmentCapability;
    }

    /**
     * Gets the value of the physicalAssetCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPhysicalAssetCapabilityType }
     * 
     * 
     */
    public List<OpPhysicalAssetCapabilityType> getPhysicalAssetCapability() {
        if (physicalAssetCapability == null) {
            physicalAssetCapability = new ArrayList<OpPhysicalAssetCapabilityType>();
        }
        return this.physicalAssetCapability;
    }

    /**
     * Gets the value of the materialCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpMaterialCapabilityType }
     * 
     * 
     */
    public List<OpMaterialCapabilityType> getMaterialCapability() {
        if (materialCapability == null) {
            materialCapability = new ArrayList<OpMaterialCapabilityType>();
        }
        return this.materialCapability;
    }

    /**
     * Gets the value of the operationsSegmentCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsSegmentCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsSegmentCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpOperationsSegmentCapabilityType }
     * 
     * 
     */
    public List<OpOperationsSegmentCapabilityType> getOperationsSegmentCapability() {
        if (operationsSegmentCapability == null) {
            operationsSegmentCapability = new ArrayList<OpOperationsSegmentCapabilityType>();
        }
        return this.operationsSegmentCapability;
    }

}
