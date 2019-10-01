//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.persistence.Entity;

@Entity(name = "HierarchyScope")
public class HierarchyScopeType {

    private IdentifierType equipmentID;
    private EquipmentElementLevelType equipmentElementLevel;
    private EquipmentElementLevelType equipmentLevel;
    private HierarchyScopeType hierarchyScope;

    public IdentifierType getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(IdentifierType equipmentID) {
        this.equipmentID = equipmentID;
    }

    public EquipmentElementLevelType getEquipmentElementLevel() {
        return equipmentElementLevel;
    }

    public void setEquipmentElementLevel(EquipmentElementLevelType equipmentElementLevel) {
        this.equipmentElementLevel = equipmentElementLevel;
    }

    public EquipmentElementLevelType getEquipmentLevel() {
        return equipmentLevel;
    }

    public void setEquipmentLevel(EquipmentElementLevelType equipmentLevel) {
        this.equipmentLevel = equipmentLevel;
    }

    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    public void setHierarchyScope(HierarchyScopeType hierarchyScope) {
        this.hierarchyScope = hierarchyScope;
    }
}
