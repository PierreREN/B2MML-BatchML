//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:02:22 PM CST 
//


package isa95.aps.interfaces.b2mml.material;

import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>MaterialSubLotType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="MaterialSubLotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="StatusType" type="{http://www.mesa.org/xml/B2MML}StatusType" minOccurs="0"/>
 *         &lt;element name="MaterialSublotProperty" type="{http://www.mesa.org/xml/B2MML}MaterialLotPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StorageLocation" type="{http://www.mesa.org/xml/B2MML}StorageHierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialSubLot" type="{http://www.mesa.org/xml/B2MML}MaterialSubLotType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialLotID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="AssemblyLotID" type="{http://www.mesa.org/xml/B2MML}MaterialLotType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssemblySubLotID" type="{http://www.mesa.org/xml/B2MML}MaterialSubLotType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssemblyTypeType" type="{http://www.mesa.org/xml/B2MML}AssemblyTypeType" minOccurs="0"/>
 *         &lt;element name="AssemblyRelationshipType" type="{http://www.mesa.org/xml/B2MML}AssemblyRelationshipType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}MaterialSubLot" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialSubLotType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "status",
        "materialSublotProperty",
        "storageLocation",
        "quantity",
        "materialSubLot",
        "materialLotID",
        "assemblyLotID",
        "assemblySubLotID",
        "assemblyType",
        "assemblyRelationship"
})
public class MaterialSubLotType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "StatusType")
    protected StatusType status;
    @XmlElement(name = "MaterialSublotProperty")
    protected List<MaterialLotPropertyType> materialSublotProperty;
    @XmlElement(name = "StorageLocation")
    protected StorageHierarchyScopeType storageLocation;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "MaterialSubLot")
    protected List<MaterialSubLotType> materialSubLot;
    @XmlElement(name = "MaterialLotID")
    protected IdentifierType materialLotID;
    @XmlElement(name = "AssemblyLotID")
    protected List<MaterialLotType> assemblyLotID;
    @XmlElement(name = "AssemblySubLotID")
    protected List<MaterialSubLotType> assemblySubLotID;
    @XmlElement(name = "AssemblyTypeType")
    protected AssemblyTypeType assemblyType;
    @XmlElement(name = "AssemblyRelationshipType")
    protected AssemblyRelationshipType assemblyRelationship;

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
     * 获取status属性的值。
     *
     * @return possible object is
     * {@link StatusType }
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     *
     * @param value allowed object is
     *              {@link StatusType }
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the materialSublotProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSublotProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSublotProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialLotPropertyType }
     */
    public List<MaterialLotPropertyType> getMaterialSublotProperty() {
        if (materialSublotProperty == null) {
            materialSublotProperty = new ArrayList<MaterialLotPropertyType>();
        }
        return this.materialSublotProperty;
    }

    /**
     * 获取storageLocation属性的值。
     *
     * @return possible object is
     * {@link StorageHierarchyScopeType }
     */
    public StorageHierarchyScopeType getStorageLocation() {
        return storageLocation;
    }

    /**
     * 设置storageLocation属性的值。
     *
     * @param value allowed object is
     *              {@link StorageHierarchyScopeType }
     */
    public void setStorageLocation(StorageHierarchyScopeType value) {
        this.storageLocation = value;
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
     * Gets the value of the materialSubLot property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSubLot property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSubLot().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialSubLotType }
     */
    public List<MaterialSubLotType> getMaterialSubLot() {
        if (materialSubLot == null) {
            materialSubLot = new ArrayList<MaterialSubLotType>();
        }
        return this.materialSubLot;
    }

    /**
     * 获取materialLotID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getMaterialLotID() {
        return materialLotID;
    }

    /**
     * 设置materialLotID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setMaterialLotID(IdentifierType value) {
        this.materialLotID = value;
    }

    /**
     * Gets the value of the assemblyLotID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyLotID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyLotID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialLotType }
     */
    public List<MaterialLotType> getAssemblyLotID() {
        if (assemblyLotID == null) {
            assemblyLotID = new ArrayList<MaterialLotType>();
        }
        return this.assemblyLotID;
    }

    /**
     * Gets the value of the assemblySubLotID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblySubLotID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblySubLotID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialSubLotType }
     */
    public List<MaterialSubLotType> getAssemblySubLotID() {
        if (assemblySubLotID == null) {
            assemblySubLotID = new ArrayList<MaterialSubLotType>();
        }
        return this.assemblySubLotID;
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

}
