//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:13:53 PM CST 
//


package isa95.aps.interfaces.b2mml.operationsdefinition;

import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>OperationsMaterialBillItemType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OperationsMaterialBillItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" minOccurs="0"/>
 *         &lt;element name="MaterialClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UseType" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="AssemblyBillOfMaterialItem" type="{http://www.mesa.org/xml/B2MML}OperationsMaterialBillItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssemblyTypeType" type="{http://www.mesa.org/xml/B2MML}AssemblyTypeType" minOccurs="0"/>
 *         &lt;element name="AssemblyRelationshipType" type="{http://www.mesa.org/xml/B2MML}AssemblyRelationshipType" minOccurs="0"/>
 *         &lt;element name="MaterialSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationsBillOfMaterialItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsMaterialBillItemType", propOrder = {
        "id",
        "description",
        "materialClassID",
        "materialDefinitionID",
        "useType",
        "hierarchyScope",
        "assemblyBillOfMaterialItem",
        "assemblyType",
        "assemblyRelationship",
        "materialSpecificationID",
        "quantity"
})
public class OperationsMaterialBillItemType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected DescriptionType description;
    @XmlElement(name = "MaterialClassID")
    protected List<IdentifierType> materialClassID;
    @XmlElement(name = "MaterialDefinitionID")
    protected List<IdentifierType> materialDefinitionID;
    @XmlElement(name = "UseType")
    protected CodeType useType;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "AssemblyBillOfMaterialItem")
    protected List<OperationsMaterialBillItemType> assemblyBillOfMaterialItem;
    @XmlElement(name = "AssemblyTypeType")
    protected AssemblyTypeType assemblyType;
    @XmlElement(name = "AssemblyRelationshipType")
    protected AssemblyRelationshipType assemblyRelationship;
    @XmlElement(name = "MaterialSpecificationID")
    protected List<IdentifierType> materialSpecificationID;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;

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
     * 获取description属性的值。
     *
     * @return possible object is
     * {@link DescriptionType }
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     *
     * @param value allowed object is
     *              {@link DescriptionType }
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
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
     * 获取useType属性的值。
     *
     * @return possible object is
     * {@link CodeType }
     */
    public CodeType getUseType() {
        return useType;
    }

    /**
     * 设置useType属性的值。
     *
     * @param value allowed object is
     *              {@link CodeType }
     */
    public void setUseType(CodeType value) {
        this.useType = value;
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
     * Gets the value of the assemblyBillOfMaterialItem property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyBillOfMaterialItem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyBillOfMaterialItem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsMaterialBillItemType }
     */
    public List<OperationsMaterialBillItemType> getAssemblyBillOfMaterialItem() {
        if (assemblyBillOfMaterialItem == null) {
            assemblyBillOfMaterialItem = new ArrayList<OperationsMaterialBillItemType>();
        }
        return this.assemblyBillOfMaterialItem;
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
     * Gets the value of the materialSpecificationID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSpecificationID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSpecificationID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getMaterialSpecificationID() {
        if (materialSpecificationID == null) {
            materialSpecificationID = new ArrayList<IdentifierType>();
        }
        return this.materialSpecificationID;
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

}
