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

@Entity(name = "PhysicalAssetClass")
public class PhysicalAssetClassType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private HierarchyScopeType hierarchyScope;
    private List<NameType> manufacturer;
    private List<PhysicalAssetClassType> physicalAssetClass;
    private List<PhysicalAssetClassType> usesPropertiesOfPhysicalAssetClass;
    private List<PhysicalAssetClassPropertyType> physicalAssetClassProperty;
    private List<PhysicalAssetType> physicalAsset;
    private List<TestSpecificationType> physicalAssetCapabilityTestSpecification;

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

    public List<NameType> getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(List<NameType> manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<PhysicalAssetClassType> getPhysicalAssetClass() {
        return physicalAssetClass;
    }

    public void setPhysicalAssetClass(List<PhysicalAssetClassType> physicalAssetClass) {
        this.physicalAssetClass = physicalAssetClass;
    }

    public List<PhysicalAssetClassType> getUsesPropertiesOfPhysicalAssetClass() {
        return usesPropertiesOfPhysicalAssetClass;
    }

    public void setUsesPropertiesOfPhysicalAssetClass(List<PhysicalAssetClassType> usesPropertiesOfPhysicalAssetClass) {
        this.usesPropertiesOfPhysicalAssetClass = usesPropertiesOfPhysicalAssetClass;
    }

    public List<PhysicalAssetClassPropertyType> getPhysicalAssetClassProperty() {
        return physicalAssetClassProperty;
    }

    public void setPhysicalAssetClassProperty(List<PhysicalAssetClassPropertyType> physicalAssetClassProperty) {
        this.physicalAssetClassProperty = physicalAssetClassProperty;
    }

    public List<PhysicalAssetType> getPhysicalAsset() {
        return physicalAsset;
    }

    public void setPhysicalAsset(List<PhysicalAssetType> physicalAsset) {
        this.physicalAsset = physicalAsset;
    }

    public List<TestSpecificationType> getPhysicalAssetCapabilityTestSpecification() {
        return physicalAssetCapabilityTestSpecification;
    }

    public void setPhysicalAssetCapabilityTestSpecification(List<TestSpecificationType> physicalAssetCapabilityTestSpecification) {
        this.physicalAssetCapabilityTestSpecification = physicalAssetCapabilityTestSpecification;
    }
}
