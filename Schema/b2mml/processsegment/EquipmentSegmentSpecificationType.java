//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:11:29 PM CST 
//


package isa95.aps.interfaces.b2mml.processsegment;

import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>EquipmentSegmentSpecificationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="EquipmentSegmentSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentUseType" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="SpatialDefinitionType" type="{http://www.mesa.org/xml/B2MML}SpatialDefinitionType" minOccurs="0"/>
 *         &lt;element name="OperationalLocation" type="{http://www.mesa.org/xml/B2MML}ResourceLocationTypeType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentSegmentSpecificationProperty" type="{http://www.mesa.org/xml/B2MML}EquipmentSegmentSpecificationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentSegmentSpecification" type="{http://www.mesa.org/xml/B2MML}EquipmentSegmentSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}EquipmentSegmentSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentSegmentSpecificationType", propOrder = {
        "equipmentClassID",
        "equipmentID",
        "description",
        "equipmentUse",
        "hierarchyScope",
        "spatialDefinition",
        "operationalLocation",
        "quantity",
        "equipmentSegmentSpecificationProperty",
        "equipmentSegmentSpecification",
        "testSpecificationID"
})
public class EquipmentSegmentSpecificationType {

    @XmlElement(name = "EquipmentClassID")
    protected IdentifierType equipmentClassID;
    @XmlElement(name = "EquipmentID")
    protected IdentifierType equipmentID;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "EquipmentUseType")
    protected CodeType equipmentUse;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "SpatialDefinitionType")
    protected SpatialDefinitionType spatialDefinition;
    @XmlElement(name = "OperationalLocation")
    protected ResourceLocationType operationalLocation;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "EquipmentSegmentSpecificationProperty")
    protected List<EquipmentSegmentSpecificationPropertyType> equipmentSegmentSpecificationProperty;
    @XmlElement(name = "EquipmentSegmentSpecification")
    protected List<EquipmentSegmentSpecificationType> equipmentSegmentSpecification;
    @XmlElement(name = "TestSpecificationID")
    protected List<IdentifierType> testSpecificationID;

    /**
     * 获取equipmentClassID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getEquipmentClassID() {
        return equipmentClassID;
    }

    /**
     * 设置equipmentClassID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setEquipmentClassID(IdentifierType value) {
        this.equipmentClassID = value;
    }

    /**
     * 获取equipmentID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getEquipmentID() {
        return equipmentID;
    }

    /**
     * 设置equipmentID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setEquipmentID(IdentifierType value) {
        this.equipmentID = value;
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
     * 获取equipmentUse属性的值。
     *
     * @return possible object is
     * {@link CodeType }
     */
    public CodeType getEquipmentUse() {
        return equipmentUse;
    }

    /**
     * 设置equipmentUse属性的值。
     *
     * @param value allowed object is
     *              {@link CodeType }
     */
    public void setEquipmentUse(CodeType value) {
        this.equipmentUse = value;
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
     * Gets the value of the equipmentSegmentSpecificationProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentSegmentSpecificationProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentSegmentSpecificationProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentSegmentSpecificationPropertyType }
     */
    public List<EquipmentSegmentSpecificationPropertyType> getEquipmentSegmentSpecificationProperty() {
        if (equipmentSegmentSpecificationProperty == null) {
            equipmentSegmentSpecificationProperty = new ArrayList<EquipmentSegmentSpecificationPropertyType>();
        }
        return this.equipmentSegmentSpecificationProperty;
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
     */
    public List<EquipmentSegmentSpecificationType> getEquipmentSegmentSpecification() {
        if (equipmentSegmentSpecification == null) {
            equipmentSegmentSpecification = new ArrayList<EquipmentSegmentSpecificationType>();
        }
        return this.equipmentSegmentSpecification;
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
