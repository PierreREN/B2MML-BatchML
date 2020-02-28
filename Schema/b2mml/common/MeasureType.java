//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;


/**
 * <p>MeasureType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="MeasureType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="unitCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="unitCodeListVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", propOrder = {
        "value"
})
public class MeasureType {

    @XmlValue
    private BigDecimal value;
    @XmlAttribute(name = "unitCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    private String unitCode;
    @XmlAttribute(name = "unitCodeListVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    private String unitCodeListVersionID;

    /**
     * 获取value属性的值。
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * 获取unitCode属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * 设置unitCode属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * 获取unitCodeListVersionID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitCodeListVersionID() {
        return unitCodeListVersionID;
    }

    /**
     * 设置unitCodeListVersionID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitCodeListVersionID(String value) {
        this.unitCodeListVersionID = value;
    }

}
