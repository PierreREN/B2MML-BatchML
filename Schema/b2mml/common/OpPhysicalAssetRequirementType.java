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
 * <p>OpPhysicalAssetRequirementType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OpPhysicalAssetRequirementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhysicalAssetClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetUseType" type="{http://www.mesa.org/xml/B2MML}PhysicalAssetUseType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="SpatialDefinitionType" type="{http://www.mesa.org/xml/B2MML}SpatialDefinitionType" minOccurs="0"/>
 *         &lt;element name="PhysicalLocation" type="{http://www.mesa.org/xml/B2MML}ResourceLocationTypeType" minOccurs="0"/>
 *         &lt;element name="EquipmentLevel" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetRequirementProperty" type="{http://www.mesa.org/xml/B2MML}OpPhysicalAssetRequirementPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponseType" type="{http://www.mesa.org/xml/B2MML}RequiredByRequestedSegmentResponseType" minOccurs="0"/>
 *         &lt;element name="TestSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OpPhysicalAssetRequirement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpPhysicalAssetRequirementType", propOrder = {
        "physicalAssetClassID",
        "physicalAssetID",
        "description",
        "physicalAssetUse",
        "quantity",
        "hierarchyScope",
        "spatialDefinition",
        "physicalLocation",
        "equipmentLevel",
        "physicalAssetRequirementProperty",
        "requiredByRequestedSegmentResponse",
        "testSpecificationID"
})
public class OpPhysicalAssetRequirementType {

    @XmlElement(name = "PhysicalAssetClassID")
    private List<IdentifierType> physicalAssetClassID;
    @XmlElement(name = "PhysicalAssetID")
    private List<IdentifierType> physicalAssetID;
    @XmlElement(name = "DescriptionType")
    private List<DescriptionType> description;
    @XmlElement(name = "PhysicalAssetUseType")
    private PhysicalAssetUseType physicalAssetUse;
    @XmlElement(name = "Quantity")
    private List<QuantityValueType> quantity;
    @XmlElement(name = "HierarchyScopeType")
    private HierarchyScopeType hierarchyScope;
    @XmlElement(name = "SpatialDefinitionType")
    private SpatialDefinitionType spatialDefinition;
    @XmlElement(name = "PhysicalLocation")
    private ResourceLocationType physicalLocation;
    @XmlElement(name = "EquipmentLevel")
    private HierarchyScopeType equipmentLevel;
    @XmlElement(name = "PhysicalAssetRequirementProperty")
    private List<OpPhysicalAssetRequirementPropertyType> physicalAssetRequirementProperty;
    @XmlElement(name = "RequiredByRequestedSegmentResponseType")
    private RequiredByRequestedSegmentResponseType requiredByRequestedSegmentResponse;
    @XmlElement(name = "TestSpecificationID")
    private List<IdentifierType> testSpecificationID;

    /**
     * Gets the value of the physicalAssetClassID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetClassID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetClassID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getPhysicalAssetClassID() {
        if (physicalAssetClassID == null) {
            physicalAssetClassID = new ArrayList<IdentifierType>();
        }
        return this.physicalAssetClassID;
    }

    /**
     * Gets the value of the physicalAssetID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getPhysicalAssetID() {
        if (physicalAssetID == null) {
            physicalAssetID = new ArrayList<IdentifierType>();
        }
        return this.physicalAssetID;
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
     * 获取physicalAssetUse属性的值。
     *
     * @return possible object is
     * {@link PhysicalAssetUseType }
     */
    public PhysicalAssetUseType getPhysicalAssetUse() {
        return physicalAssetUse;
    }

    /**
     * 设置physicalAssetUse属性的值。
     *
     * @param value allowed object is
     *              {@link PhysicalAssetUseType }
     */
    public void setPhysicalAssetUse(PhysicalAssetUseType value) {
        this.physicalAssetUse = value;
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
     * 获取physicalLocation属性的值。
     *
     * @return possible object is
     * {@link ResourceLocationType }
     */
    public ResourceLocationType getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * 设置physicalLocation属性的值。
     *
     * @param value allowed object is
     *              {@link ResourceLocationType }
     */
    public void setPhysicalLocation(ResourceLocationType value) {
        this.physicalLocation = value;
    }

    /**
     * 获取equipmentLevel属性的值。
     *
     * @return possible object is
     * {@link HierarchyScopeType }
     */
    public HierarchyScopeType getEquipmentLevel() {
        return equipmentLevel;
    }

    /**
     * 设置equipmentLevel属性的值。
     *
     * @param value allowed object is
     *              {@link HierarchyScopeType }
     */
    public void setEquipmentLevel(HierarchyScopeType value) {
        this.equipmentLevel = value;
    }

    /**
     * Gets the value of the physicalAssetRequirementProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetRequirementProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetRequirementProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPhysicalAssetRequirementPropertyType }
     */
    public List<OpPhysicalAssetRequirementPropertyType> getPhysicalAssetRequirementProperty() {
        if (physicalAssetRequirementProperty == null) {
            physicalAssetRequirementProperty = new ArrayList<OpPhysicalAssetRequirementPropertyType>();
        }
        return this.physicalAssetRequirementProperty;
    }

    /**
     * 获取requiredByRequestedSegmentResponse属性的值。
     *
     * @return possible object is
     * {@link RequiredByRequestedSegmentResponseType }
     */
    public RequiredByRequestedSegmentResponseType getRequiredByRequestedSegmentResponse() {
        return requiredByRequestedSegmentResponse;
    }

    /**
     * 设置requiredByRequestedSegmentResponse属性的值。
     *
     * @param value allowed object is
     *              {@link RequiredByRequestedSegmentResponseType }
     */
    public void setRequiredByRequestedSegmentResponse(RequiredByRequestedSegmentResponseType value) {
        this.requiredByRequestedSegmentResponse = value;
    }

    /**
     * Gets the value of the testSpecificationID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSpecificationID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSpecificationID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getTestSpecificationID() {
        if (testSpecificationID == null) {
            testSpecificationID = new ArrayList<IdentifierType>();
        }
        return this.testSpecificationID;
    }

}
