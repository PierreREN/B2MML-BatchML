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
 * <p>AssemblyTypeEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AssemblyTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Physical"/>
 *     &lt;enumeration value="Logical"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssemblyTypeEnum")
@XmlEnum
public enum AssemblyTypeEnum {

    @XmlEnumValue("Physical")
    PHYSICAL("Physical"),
    @XmlEnumValue("Logical")
    LOGICAL("Logical"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AssemblyTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssemblyTypeEnum fromValue(String v) {
        for (AssemblyTypeEnum c: AssemblyTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
