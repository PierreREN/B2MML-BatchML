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
 * <p>OpMaterialSpecificationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OpMaterialSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="MaterialClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialUseType" type="{http://www.mesa.org/xml/B2MML}MaterialUseType" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssemblySpecification" type="{http://www.mesa.org/xml/B2MML}OpMaterialSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssemblyTypeType" type="{http://www.mesa.org/xml/B2MML}AssemblyTypeType" minOccurs="0"/>
 *         &lt;element name="AssemblyRelationshipType" type="{http://www.mesa.org/xml/B2MML}AssemblyRelationshipType" minOccurs="0"/>
 *         &lt;element name="MaterialSpecificationProperty" type="{http://www.mesa.org/xml/B2MML}OpMaterialSpecificationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OpMaterialSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpMaterialSpecificationType", propOrder = {
        "id",
        "materialClassID",
        "materialDefinitionID",
        "description",
        "materialUse",
        "hierarchyScope",
        "quantity",
        "assemblySpecification",
        "assemblyType",
        "assemblyRelationship",
        "materialSpecificationProperty",
        "testSpecificationID"
})
public class OpMaterialSpecificationType {

    @XmlElement(name = "ID", required = true)
    private IdentifierType id;
    @XmlElement(name = "MaterialClassID")
    private List<IdentifierType> materialClassID;
    @XmlElement(name = "MaterialDefinitionID")
    private List<IdentifierType> materialDefinitionID;
    @XmlElement(name = "DescriptionType")
    private List<DescriptionType> description;
    @XmlElement(name = "MaterialUseType")
    private MaterialUseType materialUse;
    @XmlElement(name = "HierarchyScopeType")
    private HierarchyScopeType hierarchyScope;
    @XmlElement(name = "Quantity")
    private List<QuantityValueType> quantity;
    @XmlElement(name = "AssemblySpecification")
    private List<OpMaterialSpecificationType> assemblySpecification;
    @XmlElement(name = "AssemblyTypeType")
    private AssemblyTypeType assemblyType;
    @XmlElement(name = "AssemblyRelationshipType")
    private AssemblyRelationshipType assemblyRelationship;
    @XmlElement(name = "MaterialSpecificationProperty")
    private List<OpMaterialSpecificationPropertyType> materialSpecificationProperty;
    @XmlElement(name = "TestSpecificationID")
    private List<IdentifierType> testSpecificationID;

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
     * Gets the value of the materialClassID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialClassID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialClassID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getMaterialClassID() {
        if (materialClassID == null) {
            materialClassID = new ArrayList<IdentifierType>();
        }
        return this.materialClassID;
    }

    /**
     * Gets the value of the materialDefinitionID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialDefinitionID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialDefinitionID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getMaterialDefinitionID() {
        if (materialDefinitionID == null) {
            materialDefinitionID = new ArrayList<IdentifierType>();
        }
        return this.materialDefinitionID;
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
     * Gets the value of the assemblySpecification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblySpecification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblySpecification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpMaterialSpecificationType }
     */
    public List<OpMaterialSpecificationType> getAssemblySpecification() {
        if (assemblySpecification == null) {
            assemblySpecification = new ArrayList<OpMaterialSpecificationType>();
        }
        return this.assemblySpecification;
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
     * Gets the value of the materialSpecificationProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSpecificationProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSpecificationProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpMaterialSpecificationPropertyType }
     */
    public List<OpMaterialSpecificationPropertyType> getMaterialSpecificationProperty() {
        if (materialSpecificationProperty == null) {
            materialSpecificationProperty = new ArrayList<OpMaterialSpecificationPropertyType>();
        }
        return this.materialSpecificationProperty;
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
