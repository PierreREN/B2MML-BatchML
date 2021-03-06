//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:19:19 PM CST 
//


package isa95.aps.interfaces.b2mml.operationsperformancetypes;

import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>OpMaterialActualType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OpMaterialActualType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaterialClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialLotID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialSubLotID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialUseType" type="{http://www.mesa.org/xml/B2MML}MaterialUseType" minOccurs="0"/>
 *         &lt;element name="SpatialDefinitionType" type="{http://www.mesa.org/xml/B2MML}SpatialDefinitionType" minOccurs="0"/>
 *         &lt;element name="StorageLocation" type="{http://www.mesa.org/xml/B2MML}ResourceLocationTypeType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.mesa.org/xml/B2MML}QuantityValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssemblyActual" type="{http://www.mesa.org/xml/B2MML}OpMaterialActualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssemblyTypeType" type="{http://www.mesa.org/xml/B2MML}AssemblyTypeType" minOccurs="0"/>
 *         &lt;element name="AssemblyRelationshipType" type="{http://www.mesa.org/xml/B2MML}AssemblyRelationshipType" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="TestSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialActualProperty" type="{http://www.mesa.org/xml/B2MML}OpMaterialActualPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponseType" type="{http://www.mesa.org/xml/B2MML}RequiredByRequestedSegmentResponseType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OpMaterialActual" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpMaterialActualType", propOrder = {
        "materialClassID",
        "materialDefinitionID",
        "materialLotID",
        "materialSubLotID",
        "description",
        "materialUse",
        "spatialDefinition",
        "storageLocation",
        "quantity",
        "assemblyActual",
        "assemblyType",
        "assemblyRelationship",
        "hierarchyScope",
        "testSpecificationID",
        "materialActualProperty",
        "requiredByRequestedSegmentResponse"
})
public class OpMaterialActualType {

    @XmlElement(name = "MaterialClassID")
    protected List<IdentifierType> materialClassID;
    @XmlElement(name = "MaterialDefinitionID")
    protected List<IdentifierType> materialDefinitionID;
    @XmlElement(name = "MaterialLotID")
    protected List<IdentifierType> materialLotID;
    @XmlElement(name = "MaterialSubLotID")
    protected List<IdentifierType> materialSubLotID;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "MaterialUseType")
    protected MaterialUseType materialUse;
    @XmlElement(name = "SpatialDefinitionType")
    protected SpatialDefinitionType spatialDefinition;
    @XmlElement(name = "StorageLocation")
    protected ResourceLocationType storageLocation;
    @XmlElement(name = "Quantity")
    protected List<QuantityValueType> quantity;
    @XmlElement(name = "AssemblyActual")
    protected List<OpMaterialActualType> assemblyActual;
    @XmlElement(name = "AssemblyTypeType")
    protected AssemblyTypeType assemblyType;
    @XmlElement(name = "AssemblyRelationshipType")
    protected AssemblyRelationshipType assemblyRelationship;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "TestSpecificationID")
    protected List<IdentifierType> testSpecificationID;
    @XmlElement(name = "MaterialActualProperty")
    protected List<OpMaterialActualPropertyType> materialActualProperty;
    @XmlElement(name = "RequiredByRequestedSegmentResponseType")
    protected RequiredByRequestedSegmentResponseType requiredByRequestedSegmentResponse;

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
     * Gets the value of the materialLotID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialLotID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialLotID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getMaterialLotID() {
        if (materialLotID == null) {
            materialLotID = new ArrayList<IdentifierType>();
        }
        return this.materialLotID;
    }

    /**
     * Gets the value of the materialSubLotID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSubLotID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSubLotID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getMaterialSubLotID() {
        if (materialSubLotID == null) {
            materialSubLotID = new ArrayList<IdentifierType>();
        }
        return this.materialSubLotID;
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
     * 获取storageLocation属性的值。
     *
     * @return possible object is
     * {@link ResourceLocationType }
     */
    public ResourceLocationType getStorageLocation() {
        return storageLocation;
    }

    /**
     * 设置storageLocation属性的值。
     *
     * @param value allowed object is
     *              {@link ResourceLocationType }
     */
    public void setStorageLocation(ResourceLocationType value) {
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
     * Gets the value of the assemblyActual property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyActual property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyActual().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpMaterialActualType }
     */
    public List<OpMaterialActualType> getAssemblyActual() {
        if (assemblyActual == null) {
            assemblyActual = new ArrayList<OpMaterialActualType>();
        }
        return this.assemblyActual;
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

    /**
     * Gets the value of the materialActualProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialActualProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialActualProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpMaterialActualPropertyType }
     */
    public List<OpMaterialActualPropertyType> getMaterialActualProperty() {
        if (materialActualProperty == null) {
            materialActualProperty = new ArrayList<OpMaterialActualPropertyType>();
        }
        return this.materialActualProperty;
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

}
