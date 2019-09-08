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
 * <p>OperationsSegmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OperationsSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" minOccurs="0"/>
 *         &lt;element name="OperationsType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.mesa.org/xml/B2MML}DurationType" minOccurs="0"/>
 *         &lt;element name="ProcessSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillOfMaterialsID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="WorkDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="BillOfResourcesID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="UsesPropertiesOfOperationsSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Parameter" type="{http://www.mesa.org/xml/B2MML}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelSpecification" type="{http://www.mesa.org/xml/B2MML}OpPersonnelSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentSpecification" type="{http://www.mesa.org/xml/B2MML}OpEquipmentSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetSpecification" type="{http://www.mesa.org/xml/B2MML}OpPhysicalAssetSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialSpecification" type="{http://www.mesa.org/xml/B2MML}OpMaterialSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentDependency" type="{http://www.mesa.org/xml/B2MML}SegmentDependencyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsSegment" type="{http://www.mesa.org/xml/B2MML}OperationsSegmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationsSegment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsSegmentType", propOrder = {
    "id",
    "description",
    "operationsType",
    "hierarchyScope",
    "duration",
    "processSegmentID",
    "billOfMaterialsID",
    "workDefinitionID",
    "billOfResourcesID",
    "usesPropertiesOfOperationsSegmentID",
    "parameter",
    "personnelSpecification",
    "equipmentSpecification",
    "physicalAssetSpecification",
    "materialSpecification",
    "segmentDependency",
    "operationsSegment"
})
public class OperationsSegmentType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected DescriptionType description;
    @XmlElement(name = "OperationsType")
    protected OperationsTypeType operationsType;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "ProcessSegmentID")
    protected List<IdentifierType> processSegmentID;
    @XmlElement(name = "BillOfMaterialsID")
    protected IdentifierType billOfMaterialsID;
    @XmlElement(name = "WorkDefinitionID")
    protected IdentifierType workDefinitionID;
    @XmlElement(name = "BillOfResourcesID")
    protected IdentifierType billOfResourcesID;
    @XmlElement(name = "UsesPropertiesOfOperationsSegmentID")
    protected List<IdentifierType> usesPropertiesOfOperationsSegmentID;
    @XmlElement(name = "Parameter")
    protected List<ParameterType> parameter;
    @XmlElement(name = "PersonnelSpecification")
    protected List<OpPersonnelSpecificationType> personnelSpecification;
    @XmlElement(name = "EquipmentSpecification")
    protected List<OpEquipmentSpecificationType> equipmentSpecification;
    @XmlElement(name = "PhysicalAssetSpecification")
    protected List<OpPhysicalAssetSpecificationType> physicalAssetSpecification;
    @XmlElement(name = "MaterialSpecification")
    protected List<OpMaterialSpecificationType> materialSpecification;
    @XmlElement(name = "SegmentDependency")
    protected List<SegmentDependencyType> segmentDependency;
    @XmlElement(name = "OperationsSegment")
    protected List<OperationsSegmentType> operationsSegment;

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
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
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
     * 获取billOfMaterialsID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getBillOfMaterialsID() {
        return billOfMaterialsID;
    }

    /**
     * 设置billOfMaterialsID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setBillOfMaterialsID(IdentifierType value) {
        this.billOfMaterialsID = value;
    }

    /**
     * 获取workDefinitionID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getWorkDefinitionID() {
        return workDefinitionID;
    }

    /**
     * 设置workDefinitionID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setWorkDefinitionID(IdentifierType value) {
        this.workDefinitionID = value;
    }

    /**
     * 获取billOfResourcesID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getBillOfResourcesID() {
        return billOfResourcesID;
    }

    /**
     * 设置billOfResourcesID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setBillOfResourcesID(IdentifierType value) {
        this.billOfResourcesID = value;
    }

    /**
     * Gets the value of the usesPropertiesOfOperationsSegmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usesPropertiesOfOperationsSegmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsesPropertiesOfOperationsSegmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getUsesPropertiesOfOperationsSegmentID() {
        if (usesPropertiesOfOperationsSegmentID == null) {
            usesPropertiesOfOperationsSegmentID = new ArrayList<IdentifierType>();
        }
        return this.usesPropertiesOfOperationsSegmentID;
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
     * 
     * 
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
     * 
     * 
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
     * 
     * 
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
     * 
     * 
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
     * 
     * 
     */
    public List<OpMaterialSpecificationType> getMaterialSpecification() {
        if (materialSpecification == null) {
            materialSpecification = new ArrayList<OpMaterialSpecificationType>();
        }
        return this.materialSpecification;
    }

    /**
     * Gets the value of the segmentDependency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentDependency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentDependency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentDependencyType }
     * 
     * 
     */
    public List<SegmentDependencyType> getSegmentDependency() {
        if (segmentDependency == null) {
            segmentDependency = new ArrayList<SegmentDependencyType>();
        }
        return this.segmentDependency;
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

}
