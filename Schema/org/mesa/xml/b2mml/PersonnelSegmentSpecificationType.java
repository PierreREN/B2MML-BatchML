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
 * <p>PersonnelSegmentSpecificationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PersonnelSegmentSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonnelClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="PersonID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelUse" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="SpatialDefinition" type="{http://www.mesa.org/xml/B2MML}SpatialDefinitionType" minOccurs="0"/>
 *         &lt;element name="OperationalLocation" type="{http://www.mesa.org/xml/B2MML}ResourceLocationType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelSegmentSpecificationProperty" type="{http://www.mesa.org/xml/B2MML}PersonnelSegmentSpecificationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelSegmentSpecification" type="{http://www.mesa.org/xml/B2MML}PersonnelSegmentSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}PersonnelSegmentSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonnelSegmentSpecificationType", propOrder = {
    "personnelClassID",
    "personID",
    "description",
    "personnelUse",
    "hierarchyScope",
    "spatialDefinition",
    "operationalLocation",
    "quantity",
    "personnelSegmentSpecificationProperty",
    "personnelSegmentSpecification",
    "testSpecificationID"
})
public class PersonnelSegmentSpecificationType {

    @XmlElement(name = "PersonnelClassID")
    protected IdentifierType personnelClassID;
    @XmlElement(name = "PersonID")
    protected IdentifierType personID;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "PersonnelUse")
    protected CodeType personnelUse;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "SpatialDefinition")
    protected SpatialDefinitionType spatialDefinition;
    @XmlElement(name = "OperationalLocation")
    protected ResourceLocationType operationalLocation;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "PersonnelSegmentSpecificationProperty")
    protected List<PersonnelSegmentSpecificationPropertyType> personnelSegmentSpecificationProperty;
    @XmlElement(name = "PersonnelSegmentSpecification")
    protected List<PersonnelSegmentSpecificationType> personnelSegmentSpecification;
    @XmlElement(name = "TestSpecificationID")
    protected List<IdentifierType> testSpecificationID;

    /**
     * 获取personnelClassID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPersonnelClassID() {
        return personnelClassID;
    }

    /**
     * 设置personnelClassID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPersonnelClassID(IdentifierType value) {
        this.personnelClassID = value;
    }

    /**
     * 获取personID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getPersonID() {
        return personID;
    }

    /**
     * 设置personID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setPersonID(IdentifierType value) {
        this.personID = value;
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
     * 获取personnelUse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPersonnelUse() {
        return personnelUse;
    }

    /**
     * 设置personnelUse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPersonnelUse(CodeType value) {
        this.personnelUse = value;
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
     * 获取spatialDefinition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpatialDefinitionType }
     *     
     */
    public SpatialDefinitionType getSpatialDefinition() {
        return spatialDefinition;
    }

    /**
     * 设置spatialDefinition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialDefinitionType }
     *     
     */
    public void setSpatialDefinition(SpatialDefinitionType value) {
        this.spatialDefinition = value;
    }

    /**
     * 获取operationalLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResourceLocationType }
     *     
     */
    public ResourceLocationType getOperationalLocation() {
        return operationalLocation;
    }

    /**
     * 设置operationalLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceLocationType }
     *     
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
     * 
     * 
     */
    public List<QuantityValueType> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<QuantityValueType>();
        }
        return this.quantity;
    }

    /**
     * Gets the value of the personnelSegmentSpecificationProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelSegmentSpecificationProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelSegmentSpecificationProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonnelSegmentSpecificationPropertyType }
     * 
     * 
     */
    public List<PersonnelSegmentSpecificationPropertyType> getPersonnelSegmentSpecificationProperty() {
        if (personnelSegmentSpecificationProperty == null) {
            personnelSegmentSpecificationProperty = new ArrayList<PersonnelSegmentSpecificationPropertyType>();
        }
        return this.personnelSegmentSpecificationProperty;
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
     * 
     * 
     */
    public List<IdentifierType> getTestSpecificationID() {
        if (testSpecificationID == null) {
            testSpecificationID = new ArrayList<IdentifierType>();
        }
        return this.testSpecificationID;
    }

}
