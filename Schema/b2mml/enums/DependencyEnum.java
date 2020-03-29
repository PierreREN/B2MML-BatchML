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
 * <p>DependencyEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DependencyEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotFollow"/>
 *     &lt;enumeration value="PossibleParallel"/>
 *     &lt;enumeration value="NotInParallel"/>
 *     &lt;enumeration value="AtStart"/>
 *     &lt;enumeration value="AfterStart"/>
 *     &lt;enumeration value="AfterEnd"/>
 *     &lt;enumeration value="NoLaterAfterStart"/>
 *     &lt;enumeration value="NoEarlierAfterStart"/>
 *     &lt;enumeration value="NoLaterAfterEnd"/>
 *     &lt;enumeration value="NoEarlierAfterEnd"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DependencyEnum")
@XmlEnum
public enum DependencyEnum {

    @XmlEnumValue("NotFollow")
    NOT_FOLLOW("NotFollow"),
    @XmlEnumValue("PossibleParallel")
    POSSIBLE_PARALLEL("PossibleParallel"),
    @XmlEnumValue("NotInParallel")
    NOT_IN_PARALLEL("NotInParallel"),
    @XmlEnumValue("AtStart")
    AT_START("AtStart"),
    @XmlEnumValue("AfterStart")
    AFTER_START("AfterStart"),
    @XmlEnumValue("AfterEnd")
    AFTER_END("AfterEnd"),
    @XmlEnumValue("NoLaterAfterStart")
    NO_LATER_AFTER_START("NoLaterAfterStart"),
    @XmlEnumValue("NoEarlierAfterStart")
    NO_EARLIER_AFTER_START("NoEarlierAfterStart"),
    @XmlEnumValue("NoLaterAfterEnd")
    NO_LATER_AFTER_END("NoLaterAfterEnd"),
    @XmlEnumValue("NoEarlierAfterEnd")
    NO_EARLIER_AFTER_END("NoEarlierAfterEnd"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DependencyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DependencyEnum fromValue(String v) {
        for (DependencyEnum c: DependencyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
