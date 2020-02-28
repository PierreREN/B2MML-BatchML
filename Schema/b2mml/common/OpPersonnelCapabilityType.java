//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>OpPersonnelCapabilityType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OpPersonnelCapabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonnelClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CapabilityTypeType" type="{http://www.mesa.org/xml/B2MML}CapabilityTypeType" minOccurs="0"/>
 *         &lt;element name="ReasonType" type="{http://www.mesa.org/xml/B2MML}ReasonType" minOccurs="0"/>
 *         &lt;element name="ConfidenceFactorType" type="{http://www.mesa.org/xml/B2MML}ConfidenceFactorType" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="SpatialDefinitionType" type="{http://www.mesa.org/xml/B2MML}SpatialDefinitionType" minOccurs="0"/>
 *         &lt;element name="OperationalLocation" type="{http://www.mesa.org/xml/B2MML}ResourceLocationTypeType" minOccurs="0"/>
 *         &lt;element name="PersonnelUseType" type="{http://www.mesa.org/xml/B2MML}PersonnelUseType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelCapability" type="{http://www.mesa.org/xml/B2MML}OpPersonnelCapabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelCapabilityProperty" type="{http://www.mesa.org/xml/B2MML}OpPersonnelCapabilityPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OpPersonnelCapability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpPersonnelCapabilityType", propOrder = {
        "personnelClassID",
        "personID",
        "description",
        "capabilityType",
        "reason",
        "confidenceFactor",
        "hierarchyScope",
        "spatialDefinition",
        "operationalLocation",
        "personnelUse",
        "startTime",
        "endTime",
        "quantity",
        "personnelCapability",
        "personnelCapabilityProperty"
})
public class OpPersonnelCapabilityType {

    @XmlElement(name = "PersonnelClassID")
    private List<IdentifierType> personnelClassID;
    @XmlElement(name = "PersonID")
    private List<IdentifierType> personID;
    @XmlElement(name = "DescriptionType")
    private List<DescriptionType> description;
    @XmlElement(name = "CapabilityTypeType")
    private CapabilityTypeType capabilityType;
    @XmlElement(name = "ReasonType")
    private ReasonType reason;
    @XmlElement(name = "ConfidenceFactorType")
    private ConfidenceFactorType confidenceFactor;
    @XmlElement(name = "HierarchyScopeType")
    private HierarchyScopeType hierarchyScope;
    @XmlElement(name = "SpatialDefinitionType")
    private SpatialDefinitionType spatialDefinition;
    @XmlElement(name = "OperationalLocation")
    private ResourceLocationType operationalLocation;
    @XmlElement(name = "PersonnelUseType")
    private PersonnelUseType personnelUse;
    @XmlElement(name = "StartTime")
    private DateTimeType startTime;
    @XmlElement(name = "EndTime")
    private DateTimeType endTime;
    @XmlElement(name = "Quantity")
    private List<QuantityValueType> quantity;
    @XmlElement(name = "PersonnelCapability")
    private List<OpPersonnelCapabilityType> personnelCapability;
    @XmlElement(name = "PersonnelCapabilityProperty")
    private List<OpPersonnelCapabilityPropertyType> personnelCapabilityProperty;

    /**
     * Gets the value of the personnelClassID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelClassID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelClassID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getPersonnelClassID() {
        if (personnelClassID == null) {
            personnelClassID = new ArrayList<IdentifierType>();
        }
        return this.personnelClassID;
    }

    /**
     * Gets the value of the personID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getPersonID() {
        if (personID == null) {
            personID = new ArrayList<IdentifierType>();
        }
        return this.personID;
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
     * 获取capabilityType属性的值。
     *
     * @return possible object is
     * {@link CapabilityTypeType }
     */
    public CapabilityTypeType getCapabilityType() {
        return capabilityType;
    }

    /**
     * 设置capabilityType属性的值。
     *
     * @param value allowed object is
     *              {@link CapabilityTypeType }
     */
    public void setCapabilityType(CapabilityTypeType value) {
        this.capabilityType = value;
    }

    /**
     * 获取reason属性的值。
     *
     * @return possible object is
     * {@link ReasonType }
     */
    public ReasonType getReason() {
        return reason;
    }

    /**
     * 设置reason属性的值。
     *
     * @param value allowed object is
     *              {@link ReasonType }
     */
    public void setReason(ReasonType value) {
        this.reason = value;
    }

    /**
     * 获取confidenceFactor属性的值。
     *
     * @return possible object is
     * {@link ConfidenceFactorType }
     */
    public ConfidenceFactorType getConfidenceFactor() {
        return confidenceFactor;
    }

    /**
     * 设置confidenceFactor属性的值。
     *
     * @param value allowed object is
     *              {@link ConfidenceFactorType }
     */
    public void setConfidenceFactor(ConfidenceFactorType value) {
        this.confidenceFactor = value;
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
     * 获取spatialDefinition属性的值。
     *
     * @return possible object is
     * {@link SpatialDefinitionType }
     */
    public SpatialDefinitionType getSpatialDefinition() {
        return spatialDefinition;
    }

    /**
     * 设置spatialDefinition属性的值。
     *
     * @param value allowed object is
     *              {@link SpatialDefinitionType }
     */
    public void setSpatialDefinition(SpatialDefinitionType value) {
        this.spatialDefinition = value;
    }

    /**
     * 获取operationalLocation属性的值。
     *
     * @return possible object is
     * {@link ResourceLocationType }
     */
    public ResourceLocationType getOperationalLocation() {
        return operationalLocation;
    }

    /**
     * 设置operationalLocation属性的值。
     *
     * @param value allowed object is
     *              {@link ResourceLocationType }
     */
    public void setOperationalLocation(ResourceLocationType value) {
        this.operationalLocation = value;
    }

    /**
     * 获取personnelUse属性的值。
     *
     * @return possible object is
     * {@link PersonnelUseType }
     */
    public PersonnelUseType getPersonnelUse() {
        return personnelUse;
    }

    /**
     * 设置personnelUse属性的值。
     *
     * @param value allowed object is
     *              {@link PersonnelUseType }
     */
    public void setPersonnelUse(PersonnelUseType value) {
        this.personnelUse = value;
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
     * Gets the value of the quantity property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityValueType }
     */
    public List<QuantityValueType> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<QuantityValueType>();
        }
        return this.quantity;
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
     */
    public List<OpPersonnelCapabilityType> getPersonnelCapability() {
        if (personnelCapability == null) {
            personnelCapability = new ArrayList<OpPersonnelCapabilityType>();
        }
        return this.personnelCapability;
    }

    /**
     * Gets the value of the personnelCapabilityProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelCapabilityProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelCapabilityProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPersonnelCapabilityPropertyType }
     */
    public List<OpPersonnelCapabilityPropertyType> getPersonnelCapabilityProperty() {
        if (personnelCapabilityProperty == null) {
            personnelCapabilityProperty = new ArrayList<OpPersonnelCapabilityPropertyType>();
        }
        return this.personnelCapabilityProperty;
    }

}
