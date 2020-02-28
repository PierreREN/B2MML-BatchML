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


/**
 * The hierarchy scope identifies where the exchanged information fits within the role-based equipment hierarchy.
 * It defines the scope of the exchanged information, such as a site or area for which the information is relevant.
 * The hierarchy scope identifies the associated instance in the role-based equipment hierarchy.
 *
 *
 * <p>HierarchyScopeType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="HierarchyScopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;choice>
 *           &lt;element name="EquipmentElementLevelType" type="{http://www.mesa.org/xml/B2MML}EquipmentElementLevelType"/>
 *           &lt;element name="EquipmentLevel" type="{http://www.mesa.org/xml/B2MML}EquipmentElementLevelType"/>
 *         &lt;/choice>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}HierarchyScopeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HierarchyScopeType", propOrder = {
        "equipmentID",
        "equipmentElementLevel",
        "equipmentLevel",
        "hierarchyScope"
})
public class HierarchyScopeType {

    @XmlElement(name = "EquipmentID", required = true)
    private IdentifierType equipmentID;
    @XmlElement(name = "EquipmentElementLevelType")
    private EquipmentElementLevelType equipmentElementLevel;
    @XmlElement(name = "EquipmentLevel")
    private EquipmentElementLevelType equipmentLevel;
    @XmlElement(name = "HierarchyScopeType")
    private HierarchyScopeType hierarchyScope;

    /**
     * 获取equipmentID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getEquipmentID() {
        return equipmentID;
    }

    /**
     * 设置equipmentID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setEquipmentID(IdentifierType value) {
        this.equipmentID = value;
    }

    /**
     * 获取equipmentElementLevel属性的值。
     *
     * @return possible object is
     * {@link EquipmentElementLevelType }
     */
    public EquipmentElementLevelType getEquipmentElementLevel() {
        return equipmentElementLevel;
    }

    /**
     * 设置equipmentElementLevel属性的值。
     *
     * @param value allowed object is
     *              {@link EquipmentElementLevelType }
     */
    public void setEquipmentElementLevel(EquipmentElementLevelType value) {
        this.equipmentElementLevel = value;
    }

    /**
     * 获取equipmentLevel属性的值。
     *
     * @return possible object is
     * {@link EquipmentElementLevelType }
     */
    public EquipmentElementLevelType getEquipmentLevel() {
        return equipmentLevel;
    }

    /**
     * 设置equipmentLevel属性的值。
     *
     * @param value allowed object is
     *              {@link EquipmentElementLevelType }
     */
    public void setEquipmentLevel(EquipmentElementLevelType value) {
        this.equipmentLevel = value;
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

}
