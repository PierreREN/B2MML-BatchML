//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.List;

@Entity(name = "MaterialSubLotType")
public class MaterialSubLotType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private HierarchyScopeType hierarchyScope;
    private StatusType status;
    private List<MaterialLotPropertyType> materialSubLotProperty;
    private StorageHierarchyScopeType storageLocation;
    private List<QuantityValueType> quantity;
    private List<MaterialSubLotType> materialSubLot;
    private MaterialLotType materialLot;
    private List<MaterialLotType> assemblyLot;
    private List<MaterialSubLotType> assemblySubLot;
    private AssemblyTypeType assemblyType;
    private AssemblyRelationshipType assemblyRelationship;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public List<DescriptionType> getDescription() {
        return description;
    }

    public void setDescription(List<DescriptionType> description) {
        this.description = description;
    }

    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    public void setHierarchyScope(HierarchyScopeType hierarchyScope) {
        this.hierarchyScope = hierarchyScope;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public List<MaterialLotPropertyType> getMaterialSubLotProperty() {
        return materialSubLotProperty;
    }

    public void setMaterialSubLotProperty(List<MaterialLotPropertyType> materialSubLotProperty) {
        this.materialSubLotProperty = materialSubLotProperty;
    }

    public StorageHierarchyScopeType getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(StorageHierarchyScopeType storageLocation) {
        this.storageLocation = storageLocation;
    }

    public List<QuantityValueType> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<QuantityValueType> quantity) {
        this.quantity = quantity;
    }

    public List<MaterialSubLotType> getMaterialSubLot() {
        return materialSubLot;
    }

    public void setMaterialSubLot(List<MaterialSubLotType> materialSubLot) {
        this.materialSubLot = materialSubLot;
    }

    public MaterialLotType getMaterialLot() {
        return materialLot;
    }

    public void setMaterialLot(MaterialLotType materialLot) {
        this.materialLot = materialLot;
    }

    public List<MaterialLotType> getAssemblyLot() {
        return assemblyLot;
    }

    public void setAssemblyLot(List<MaterialLotType> assemblyLot) {
        this.assemblyLot = assemblyLot;
    }

    public List<MaterialSubLotType> getAssemblySubLot() {
        return assemblySubLot;
    }

    public void setAssemblySubLot(List<MaterialSubLotType> assemblySubLot) {
        this.assemblySubLot = assemblySubLot;
    }

    public AssemblyTypeType getAssemblyType() {
        return assemblyType;
    }

    public void setAssemblyType(AssemblyTypeType assemblyType) {
        this.assemblyType = assemblyType;
    }

    public AssemblyRelationshipType getAssemblyRelationship() {
        return assemblyRelationship;
    }

    public void setAssemblyRelationship(AssemblyRelationshipType assemblyRelationship) {
        this.assemblyRelationship = assemblyRelationship;
    }
}
