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
 * <p>ResourceLocationTypeEnum的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceLocationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Operational Location"/>
 *     &lt;enumeration value="Equipment"/>
 *     &lt;enumeration value="Physical Asset"/>
 *     &lt;enumeration value="DescriptionType"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ResourceLocationTypeEnum")
@XmlEnum
public enum ResourceLocationTypeEnum {

    @XmlEnumValue("Operational Location")
    OPERATIONAL_LOCATION("Operational Location"),
    @XmlEnumValue("Equipment")
    EQUIPMENT("Equipment"),
    @XmlEnumValue("Physical Asset")
    PHYSICAL_ASSET("Physical Asset"),
    @XmlEnumValue("DescriptionType")
    DESCRIPTION("DescriptionType"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ResourceLocationTypeEnum(String v) {
        value = v;
    }

    public static ResourceLocationTypeEnum fromValue(String v) {
        for (ResourceLocationTypeEnum c : ResourceLocationTypeEnum.values()) {
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
