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
 * <p>JobOrderCommandEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="JobOrderCommandEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Start"/>
 *     &lt;enumeration value="Stop"/>
 *     &lt;enumeration value="Hold"/>
 *     &lt;enumeration value="Restart"/>
 *     &lt;enumeration value="Abort"/>
 *     &lt;enumeration value="Reset"/>
 *     &lt;enumeration value="Pause"/>
 *     &lt;enumeration value="Resume"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JobOrderCommandEnum")
@XmlEnum
public enum JobOrderCommandEnum {

    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("Hold")
    HOLD("Hold"),
    @XmlEnumValue("Restart")
    RESTART("Restart"),
    @XmlEnumValue("Abort")
    ABORT("Abort"),
    @XmlEnumValue("Reset")
    RESET("Reset"),
    @XmlEnumValue("Pause")
    PAUSE("Pause"),
    @XmlEnumValue("Resume")
    RESUME("Resume"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    JobOrderCommandEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobOrderCommandEnum fromValue(String v) {
        for (JobOrderCommandEnum c: JobOrderCommandEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
