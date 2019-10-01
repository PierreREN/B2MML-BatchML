//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

public class EquipmentAssetMappingType {

    private IdentifierType equipmentID;
    private IdentifierType physicalAssetID;
    private HierarchyScopeType hierarchyScope;
    private DateTimeType startTime;
    private DateTimeType endTime;

    public IdentifierType getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(IdentifierType equipmentID) {
        this.equipmentID = equipmentID;
    }

    public IdentifierType getPhysicalAssetID() {
        return physicalAssetID;
    }

    public void setPhysicalAssetID(IdentifierType physicalAssetID) {
        this.physicalAssetID = physicalAssetID;
    }

    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    public void setHierarchyScope(HierarchyScopeType hierarchyScope) {
        this.hierarchyScope = hierarchyScope;
    }

    public DateTimeType getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTimeType startTime) {
        this.startTime = startTime;
    }

    public DateTimeType getEndTime() {
        return endTime;
    }

    public void setEndTime(DateTimeType endTime) {
        this.endTime = endTime;
    }
}
