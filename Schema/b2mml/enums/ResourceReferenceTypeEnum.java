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
 * <p>ResourceReferenceTypeEnum的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceReferenceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Personnel"/>
 *     &lt;enumeration value="Personnel Class"/>
 *     &lt;enumeration value="Equipment"/>
 *     &lt;enumeration value="Equipment Class"/>
 *     &lt;enumeration value="Material Class"/>
 *     &lt;enumeration value="Material Definition"/>
 *     &lt;enumeration value="Material Lot"/>
 *     &lt;enumeration value="Material Sublot"/>
 *     &lt;enumeration value="Physical Asset"/>
 *     &lt;enumeration value="Physical Asset Class"/>
 *     &lt;enumeration value="Work Master"/>
 *     &lt;enumeration value="Process Segment"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ResourceReferenceTypeEnum")
@XmlEnum
public enum ResourceReferenceTypeEnum {

    @XmlEnumValue("Personnel")
    PERSONNEL("Personnel"),
    @XmlEnumValue("Personnel Class")
    PERSONNEL_CLASS("Personnel Class"),
    @XmlEnumValue("Equipment")
    EQUIPMENT("Equipment"),
    @XmlEnumValue("Equipment Class")
    EQUIPMENT_CLASS("Equipment Class"),
    @XmlEnumValue("Material Class")
    MATERIAL_CLASS("Material Class"),
    @XmlEnumValue("Material Definition")
    MATERIAL_DEFINITION("Material Definition"),
    @XmlEnumValue("Material Lot")
    MATERIAL_LOT("Material Lot"),
    @XmlEnumValue("Material Sublot")
    MATERIAL_SUBLOT("Material Sublot"),
    @XmlEnumValue("Physical Asset")
    PHYSICAL_ASSET("Physical Asset"),
    @XmlEnumValue("Physical Asset Class")
    PHYSICAL_ASSET_CLASS("Physical Asset Class"),
    @XmlEnumValue("Work Master")
    WORK_MASTER("Work Master"),
    @XmlEnumValue("Process Segment")
    PROCESS_SEGMENT("Process Segment"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ResourceReferenceTypeEnum(String v) {
        value = v;
    }

    public static ResourceReferenceTypeEnum fromValue(String v) {
        for (ResourceReferenceTypeEnum c : ResourceReferenceTypeEnum.values()) {
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
