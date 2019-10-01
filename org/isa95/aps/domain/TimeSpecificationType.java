//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TimeSpecificationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TimeSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Relative" type="{http://www.mesa.org/xml/B2MML}IndicatorType" minOccurs="0"/>
 *         &lt;element name="OffsetTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSpecificationType", propOrder = {
        "relative",
        "offsetTime"
})
public class TimeSpecificationType {

    @XmlElement(name = "Relative")
    protected Boolean relative;
    @XmlElement(name = "OffsetTime")
    protected DateTimeType offsetTime;

    /**
     * 获取relative属性的值。
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isRelative() {
        return relative;
    }

    /**
     * 设置relative属性的值。
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setRelative(Boolean value) {
        this.relative = value;
    }

    /**
     * 获取offsetTime属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getOffsetTime() {
        return offsetTime;
    }

    /**
     * 设置offsetTime属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setOffsetTime(DateTimeType value) {
        this.offsetTime = value;
    }

}
