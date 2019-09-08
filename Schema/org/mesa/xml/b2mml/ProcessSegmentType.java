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
 * <p>ProcessSegmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProcessSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="DefinitionType" type="{http://www.mesa.org/xml/B2MML}DefinitionTypeType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PersonnelSegmentSpecification" type="{http://www.mesa.org/xml/B2MML}PersonnelSegmentSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentSegmentSpecification" type="{http://www.mesa.org/xml/B2MML}EquipmentSegmentSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetSegmentSpecification" type="{http://www.mesa.org/xml/B2MML}PhysicalAssetSegmentSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialSegmentSpecification" type="{http://www.mesa.org/xml/B2MML}MaterialSegmentSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Parameter" type="{http://www.mesa.org/xml/B2MML}ParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentDependency" type="{http://www.mesa.org/xml/B2MML}SegmentDependencyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessSegment" type="{http://www.mesa.org/xml/B2MML}ProcessSegmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludesPropertiesOfProcessSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CorrespondsToWorkMasterID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CorrespondsToOperationsSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CorrespondsToSegmentRequirementID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}ProcessSegment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessSegmentType", propOrder = {
    "id",
    "description",
    "operationsType",
    "hierarchyScope",
    "definitionType",
    "publishedDate",
    "personnelSegmentSpecification",
    "equipmentSegmentSpecification",
    "physicalAssetSegmentSpecification",
    "materialSegmentSpecification",
    "parameter",
    "segmentDependency",
    "processSegment",
    "includesPropertiesOfProcessSegmentID",
    "correspondsToWorkMasterID",
    "correspondsToOperationsSegmentID",
    "correspondsToSegmentRequirementID"
})
public class ProcessSegmentType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "OperationsType")
    protected OperationsTypeType operationsType;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "DefinitionType")
    protected DefinitionTypeType definitionType;
    @XmlElement(name = "PublishedDate")
    protected DateTimeType publishedDate;
    @XmlElement(name = "PersonnelSegmentSpecification")
    protected List<PersonnelSegmentSpecificationType> personnelSegmentSpecification;
    @XmlElement(name = "EquipmentSegmentSpecification")
    protected List<EquipmentSegmentSpecificationType> equipmentSegmentSpecification;
    @XmlElement(name = "PhysicalAssetSegmentSpecification")
    protected List<PhysicalAssetSegmentSpecificationType> physicalAssetSegmentSpecification;
    @XmlElement(name = "MaterialSegmentSpecification")
    protected List<MaterialSegmentSpecificationType> materialSegmentSpecification;
    @XmlElement(name = "Parameter")
    protected List<ParameterType> parameter;
    @XmlElement(name = "SegmentDependency")
    protected List<SegmentDependencyType> segmentDependency;
    @XmlElement(name = "ProcessSegment")
    protected List<ProcessSegmentType> processSegment;
    @XmlElement(name = "IncludesPropertiesOfProcessSegmentID")
    protected List<IdentifierType> includesPropertiesOfProcessSegmentID;
    @XmlElement(name = "CorrespondsToWorkMasterID")
    protected List<IdentifierType> correspondsToWorkMasterID;
    @XmlElement(name = "CorrespondsToOperationsSegmentID")
    protected List<IdentifierType> correspondsToOperationsSegmentID;
    @XmlElement(name = "CorrespondsToSegmentRequirementID")
    protected List<IdentifierType> correspondsToSegmentRequirementID;

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
     * 获取definitionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DefinitionTypeType }
     *     
     */
    public DefinitionTypeType getDefinitionType() {
        return definitionType;
    }

    /**
     * 设置definitionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionTypeType }
     *     
     */
    public void setDefinitionType(DefinitionTypeType value) {
        this.definitionType = value;
    }

    /**
     * 获取publishedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPublishedDate() {
        return publishedDate;
    }

    /**
     * 设置publishedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPublishedDate(DateTimeType value) {
        this.publishedDate = value;
    }

    /**
     * Gets the value of the personnelSegmentSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelSegmentSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelSegmentSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonnelSegmentSpecificationType }
     * 
     * 
     */
    public List<PersonnelSegmentSpecificationType> getPersonnelSegmentSpecification() {
        if (personnelSegmentSpecification == null) {
            personnelSegmentSpecification = new ArrayList<PersonnelSegmentSpecificationType>();
        }
        return this.personnelSegmentSpecification;
    }

    /**
     * Gets the value of the equipmentSegmentSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentSegmentSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentSegmentSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentSegmentSpecificationType }
     * 
     * 
     */
    public List<EquipmentSegmentSpecificationType> getEquipmentSegmentSpecification() {
        if (equipmentSegmentSpecification == null) {
            equipmentSegmentSpecification = new ArrayList<EquipmentSegmentSpecificationType>();
        }
        return this.equipmentSegmentSpecification;
    }

    /**
     * Gets the value of the physicalAssetSegmentSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetSegmentSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetSegmentSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAssetSegmentSpecificationType }
     * 
     * 
     */
    public List<PhysicalAssetSegmentSpecificationType> getPhysicalAssetSegmentSpecification() {
        if (physicalAssetSegmentSpecification == null) {
            physicalAssetSegmentSpecification = new ArrayList<PhysicalAssetSegmentSpecificationType>();
        }
        return this.physicalAssetSegmentSpecification;
    }

    /**
     * Gets the value of the materialSegmentSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSegmentSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSegmentSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialSegmentSpecificationType }
     * 
     * 
     */
    public List<MaterialSegmentSpecificationType> getMaterialSegmentSpecification() {
        if (materialSegmentSpecification == null) {
            materialSegmentSpecification = new ArrayList<MaterialSegmentSpecificationType>();
        }
        return this.materialSegmentSpecification;
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
     * Gets the value of the includesPropertiesOfProcessSegmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesPropertiesOfProcessSegmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesPropertiesOfProcessSegmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getIncludesPropertiesOfProcessSegmentID() {
        if (includesPropertiesOfProcessSegmentID == null) {
            includesPropertiesOfProcessSegmentID = new ArrayList<IdentifierType>();
        }
        return this.includesPropertiesOfProcessSegmentID;
    }

    /**
     * Gets the value of the correspondsToWorkMasterID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correspondsToWorkMasterID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrespondsToWorkMasterID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getCorrespondsToWorkMasterID() {
        if (correspondsToWorkMasterID == null) {
            correspondsToWorkMasterID = new ArrayList<IdentifierType>();
        }
        return this.correspondsToWorkMasterID;
    }

    /**
     * Gets the value of the correspondsToOperationsSegmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correspondsToOperationsSegmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrespondsToOperationsSegmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getCorrespondsToOperationsSegmentID() {
        if (correspondsToOperationsSegmentID == null) {
            correspondsToOperationsSegmentID = new ArrayList<IdentifierType>();
        }
        return this.correspondsToOperationsSegmentID;
    }

    /**
     * Gets the value of the correspondsToSegmentRequirementID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correspondsToSegmentRequirementID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrespondsToSegmentRequirementID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getCorrespondsToSegmentRequirementID() {
        if (correspondsToSegmentRequirementID == null) {
            correspondsToSegmentRequirementID = new ArrayList<IdentifierType>();
        }
        return this.correspondsToSegmentRequirementID;
    }

}
