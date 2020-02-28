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
 * <p>OpPersonnelRequirementType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OpPersonnelRequirementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonnelClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelUseType" type="{http://www.mesa.org/xml/B2MML}PersonnelUseType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="SpatialDefinitionType" type="{http://www.mesa.org/xml/B2MML}SpatialDefinitionType" minOccurs="0"/>
 *         &lt;element name="OperationalLocation" type="{http://www.mesa.org/xml/B2MML}ResourceLocationTypeType" minOccurs="0"/>
 *         &lt;element name="PersonnelRequirementProperty" type="{http://www.mesa.org/xml/B2MML}OpPersonnelRequirementPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponseType" type="{http://www.mesa.org/xml/B2MML}RequiredByRequestedSegmentResponseType" minOccurs="0"/>
 *         &lt;element name="TestSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OpPersonnelRequirement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpPersonnelRequirementType", propOrder = {
        "personnelClassID",
        "personID",
        "description",
        "personnelUse",
        "quantity",
        "hierarchyScope",
        "spatialDefinition",
        "operationalLocation",
        "personnelRequirementProperty",
        "requiredByRequestedSegmentResponse",
        "testSpecificationID"
})
public class OpPersonnelRequirementType {

    @XmlElement(name = "PersonnelClassID")
    private List<IdentifierType> personnelClassID;
    @XmlElement(name = "PersonID")
    private List<IdentifierType> personID;
    @XmlElement(name = "DescriptionType")
    private List<DescriptionType> description;
    @XmlElement(name = "PersonnelUseType")
    private PersonnelUseType personnelUse;
    @XmlElement(name = "Quantity")
    private List<QuantityValueType> quantity;
    @XmlElement(name = "HierarchyScopeType")
    private HierarchyScopeType hierarchyScope;
    @XmlElement(name = "SpatialDefinitionType")
    private SpatialDefinitionType spatialDefinition;
    @XmlElement(name = "OperationalLocation")
    private ResourceLocationType operationalLocation;
    @XmlElement(name = "PersonnelRequirementProperty")
    private List<OpPersonnelRequirementPropertyType> personnelRequirementProperty;
    @XmlElement(name = "RequiredByRequestedSegmentResponseType")
    private RequiredByRequestedSegmentResponseType requiredByRequestedSegmentResponse;
    @XmlElement(name = "TestSpecificationID")
    private List<IdentifierType> testSpecificationID;

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
     * Gets the value of the personnelRequirementProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelRequirementProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelRequirementProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpPersonnelRequirementPropertyType }
     */
    public List<OpPersonnelRequirementPropertyType> getPersonnelRequirementProperty() {
        if (personnelRequirementProperty == null) {
            personnelRequirementProperty = new ArrayList<OpPersonnelRequirementPropertyType>();
        }
        return this.personnelRequirementProperty;
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
