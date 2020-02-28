//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.01 时间 09:17:32 PM CST 
//


package isa95.aps.interfaces.b2mml.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EquipmentElementLevelEnum的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentElementLevelEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Enterprise"/>
 *     &lt;enumeration value="Site"/>
 *     &lt;enumeration value="Area"/>
 *     &lt;enumeration value="ProcessCell"/>
 *     &lt;enumeration value="Unit"/>
 *     &lt;enumeration value="ProductionLine"/>
 *     &lt;enumeration value="WorkCell"/>
 *     &lt;enumeration value="ProductionUnit"/>
 *     &lt;enumeration value="StorageZone"/>
 *     &lt;enumeration value="StorageUnit"/>
 *     &lt;enumeration value="WorkCenter"/>
 *     &lt;enumeration value="WorkUnit"/>
 *     &lt;enumeration value="EquipmentModule"/>
 *     &lt;enumeration value="ControlModule"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "EquipmentElementLevelEnum")
@XmlEnum
public enum EquipmentElementLevelEnum {

    @XmlEnumValue("Enterprise")
    ENTERPRISE("Enterprise"),
    @XmlEnumValue("Site")
    SITE("Site"),
    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("ProcessCell")
    PROCESS_CELL("ProcessCell"),
    @XmlEnumValue("Unit")
    UNIT("Unit"),
    @XmlEnumValue("ProductionLine")
    PRODUCTION_LINE("ProductionLine"),
    @XmlEnumValue("WorkCell")
    WORK_CELL("WorkCell"),
    @XmlEnumValue("ProductionUnit")
    PRODUCTION_UNIT("ProductionUnit"),
    @XmlEnumValue("StorageZone")
    STORAGE_ZONE("StorageZone"),
    @XmlEnumValue("StorageUnit")
    STORAGE_UNIT("StorageUnit"),
    @XmlEnumValue("WorkCenter")
    WORK_CENTER("WorkCenter"),
    @XmlEnumValue("WorkUnit")
    WORK_UNIT("WorkUnit"),
    @XmlEnumValue("EquipmentModule")
    EQUIPMENT_MODULE("EquipmentModule"),
    @XmlEnumValue("ControlModule")
    CONTROL_MODULE("ControlModule"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EquipmentElementLevelEnum(String v) {
        value = v;
    }

    public static EquipmentElementLevelEnum fromValue(String v) {
        for (EquipmentElementLevelEnum c : EquipmentElementLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
