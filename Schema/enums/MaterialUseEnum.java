//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.01 时间 09:17:32 PM CST 
//


package org.mesa.xml.b2mml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MaterialUseEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MaterialUseEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Consumable"/>
 *     &lt;enumeration value="Consumed"/>
 *     &lt;enumeration value="Produced"/>
 *     &lt;enumeration value="By-product Produced"/>
 *     &lt;enumeration value="Co-product Produced"/>
 *     &lt;enumeration value="Yield Produced"/>
 *     &lt;enumeration value="Material Consumed"/>
 *     &lt;enumeration value="Material Produced"/>
 *     &lt;enumeration value="Destructive Sample"/>
 *     &lt;enumeration value="Returned Sample"/>
 *     &lt;enumeration value="Retained Sample"/>
 *     &lt;enumeration value="Inventoried"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaterialUseEnum")
@XmlEnum
public enum MaterialUseEnum {

    @XmlEnumValue("Consumable")
    CONSUMABLE("Consumable"),
    @XmlEnumValue("Consumed")
    CONSUMED("Consumed"),
    @XmlEnumValue("Produced")
    PRODUCED("Produced"),
    @XmlEnumValue("By-product Produced")
    BY_PRODUCT_PRODUCED("By-product Produced"),
    @XmlEnumValue("Co-product Produced")
    CO_PRODUCT_PRODUCED("Co-product Produced"),
    @XmlEnumValue("Yield Produced")
    YIELD_PRODUCED("Yield Produced"),
    @XmlEnumValue("Material Consumed")
    MATERIAL_CONSUMED("Material Consumed"),
    @XmlEnumValue("Material Produced")
    MATERIAL_PRODUCED("Material Produced"),
    @XmlEnumValue("Destructive Sample")
    DESTRUCTIVE_SAMPLE("Destructive Sample"),
    @XmlEnumValue("Returned Sample")
    RETURNED_SAMPLE("Returned Sample"),
    @XmlEnumValue("Retained Sample")
    RETAINED_SAMPLE("Retained Sample"),
    @XmlEnumValue("Inventoried")
    INVENTORIED("Inventoried"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MaterialUseEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaterialUseEnum fromValue(String v) {
        for (MaterialUseEnum c: MaterialUseEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
