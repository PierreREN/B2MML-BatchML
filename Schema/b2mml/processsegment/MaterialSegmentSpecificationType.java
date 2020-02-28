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
 * <p>MaterialSegmentSpecificationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="MaterialSegmentSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="MaterialClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="MaterialDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssemblyTypeType" type="{http://www.mesa.org/xml/B2MML}AssemblyTypeType" minOccurs="0"/>
 *         &lt;element name="AssemblyRelationshipType" type="{http://www.mesa.org/xml/B2MML}AssemblyRelationshipType" minOccurs="0"/>
 *         &lt;element name="AssemblySpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialUseType" type="{http://www.mesa.org/xml/B2MML}MaterialUseType" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="SpatialDefinitionType" type="{http://www.mesa.org/xml/B2MML}SpatialDefinitionType" minOccurs="0"/>
 *         &lt;element name="OperationalLocation" type="{http://www.mesa.org/xml/B2MML}ResourceLocationTypeType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialSegmentSpecificationProperty" type="{http://www.mesa.org/xml/B2MML}MaterialSegmentSpecificationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialSegmentSpecification" type="{http://www.mesa.org/xml/B2MML}MaterialSegmentSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}MaterialSegmentSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialSegmentSpecificationType", propOrder = {
        "id",
        "materialClassID",
        "materialDefinitionID",
        "description",
        "assemblyType",
        "assemblyRelationship",
        "assemblySpecificationID",
        "materialUse",
        "hierarchyScope",
        "spatialDefinition",
        "operationalLocation",
        "quantity",
        "materialSegmentSpecificationProperty",
        "materialSegmentSpecification",
        "testSpecificationID"
})
public class MaterialSegmentSpecificationType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "MaterialClassID")
    protected IdentifierType materialClassID;
    @XmlElement(name = "MaterialDefinitionID")
    protected IdentifierType materialDefinitionID;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "AssemblyTypeType")
    protected AssemblyTypeType assemblyType;
    @XmlElement(name = "AssemblyRelationshipType")
    protected AssemblyRelationshipType assemblyRelationship;
    @XmlElement(name = "AssemblySpecificationID")
    protected List<IdentifierType> assemblySpecificationID;
    @XmlElement(name = "MaterialUseType")
    protected MaterialUseType materialUse;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "SpatialDefinitionType")
    protected SpatialDefinitionType spatialDefinition;
    @XmlElement(name = "OperationalLocation")
    protected ResourceLocationType operationalLocation;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "MaterialSegmentSpecificationProperty")
    protected List<MaterialSegmentSpecificationPropertyType> materialSegmentSpecificationProperty;
    @XmlElement(name = "MaterialSegmentSpecification")
    protected List<MaterialSegmentSpecificationType> materialSegmentSpecification;
    @XmlElement(name = "TestSpecificationID")
    protected List<IdentifierType> testSpecificationID;

    /**
     * 获取id属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setID(IdentifierType value) {
        this.id = value;
    }

    /**
     * 获取materialClassID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getMaterialClassID() {
        return materialClassID;
    }

    /**
     * 设置materialClassID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setMaterialClassID(IdentifierType value) {
        this.materialClassID = value;
    }

    /**
     * 获取materialDefinitionID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getMaterialDefinitionID() {
        return materialDefinitionID;
    }

    /**
     * 设置materialDefinitionID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setMaterialDefinitionID(IdentifierType value) {
        this.materialDefinitionID = value;
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
     * 获取assemblyType属性的值。
     *
     * @return possible object is
     * {@link AssemblyTypeType }
     */
    public AssemblyTypeType getAssemblyType() {
        return assemblyType;
    }

    /**
     * 设置assemblyType属性的值。
     *
     * @param value allowed object is
     *              {@link AssemblyTypeType }
     */
    public void setAssemblyType(AssemblyTypeType value) {
        this.assemblyType = value;
    }

    /**
     * 获取assemblyRelationship属性的值。
     *
     * @return possible object is
     * {@link AssemblyRelationshipType }
     */
    public AssemblyRelationshipType getAssemblyRelationship() {
        return assemblyRelationship;
    }

    /**
     * 设置assemblyRelationship属性的值。
     *
     * @param value allowed object is
     *              {@link AssemblyRelationshipType }
     */
    public void setAssemblyRelationship(AssemblyRelationshipType value) {
        this.assemblyRelationship = value;
    }

    /**
     * Gets the value of the assemblySpecificationID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblySpecificationID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblySpecificationID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getAssemblySpecificationID() {
        if (assemblySpecificationID == null) {
            assemblySpecificationID = new ArrayList<IdentifierType>();
        }
        return this.assemblySpecificationID;
    }

    /**
     * 获取materialUse属性的值。
     *
     * @return possible object is
     * {@link MaterialUseType }
     */
    public MaterialUseType getMaterialUse() {
        return materialUse;
    }

    /**
     * 设置materialUse属性的值。
     *
     * @param value allowed object is
     *              {@link MaterialUseType }
     */
    public void setMaterialUse(MaterialUseType value) {
        this.materialUse = value;
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
     * Gets the value of the materialSegmentSpecificationProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSegmentSpecificationProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSegmentSpecificationProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialSegmentSpecificationPropertyType }
     */
    public List<MaterialSegmentSpecificationPropertyType> getMaterialSegmentSpecificationProperty() {
        if (materialSegmentSpecificationProperty == null) {
            materialSegmentSpecificationProperty = new ArrayList<MaterialSegmentSpecificationPropertyType>();
        }
        return this.materialSegmentSpecificationProperty;
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
     */
    public List<MaterialSegmentSpecificationType> getMaterialSegmentSpecification() {
        if (materialSegmentSpecification == null) {
            materialSegmentSpecification = new ArrayList<MaterialSegmentSpecificationType>();
        }
        return this.materialSegmentSpecification;
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
