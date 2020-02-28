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
 * <p>AmountType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="AmountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="currencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="currencyCodeListVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", propOrder = {
        "value"
})
public class AmountType {

    @XmlValue
    private BigDecimal value;
    @XmlAttribute(name = "currencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    private String currencyID;
    @XmlAttribute(name = "currencyCodeListVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    private String currencyCodeListVersionID;

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
     * 获取currencyID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrencyID() {
        return currencyID;
    }

    /**
     * 设置currencyID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrencyID(String value) {
        this.currencyID = value;
    }

    /**
     * 获取currencyCodeListVersionID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrencyCodeListVersionID() {
        return currencyCodeListVersionID;
    }

    /**
     * 设置currencyCodeListVersionID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrencyCodeListVersionID(String value) {
        this.currencyCodeListVersionID = value;
    }

}
