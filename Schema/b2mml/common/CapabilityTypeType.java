//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the type of capability.
 * Defined values are
 * - Committed: capacity that is committed for future productive use;
 * - Unattainable: capacity that is not attainable for future productive use given the equipment condition, equipment utilization, personnel availability or material availability;
 * - Available: capacity that is available for additional future productive use;
 * - Used: a historical value that defines the portion of the capacity with acceptable quality;
 * - Unused: a historical value that defines the portion of the capacity that was not used or had unacceptable quality; and
 * - Total: the sum of used and unused capability or the sum of available, unattainable and committed capability.
 *
 *
 * <p>CapabilityTypeType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CapabilityTypeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.mesa.org/xml/B2MML>CapabilityType1Type">
 *       &lt;attribute name="OtherValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityTypeType")
public class CapabilityTypeType
        extends CapabilityType1Type {

    @XmlAttribute(name = "OtherValue")
    private String otherValue;

    /**
     * 获取otherValue属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getOtherValue() {
        return otherValue;
    }

    /**
     * 设置otherValue属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOtherValue(String value) {
        this.otherValue = value;
    }

}
