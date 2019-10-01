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
 * <p>BatchEquipmentIDType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="BatchEquipmentIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Property" type="{http://www.mesa.org/xml/B2MML}EquipmentElementPropertyType" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.mesa.org/xml/B2MML}ConditionType" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.mesa.org/xml/B2MML}BatchValueType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}BatchEquipmentID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchEquipmentIDType", propOrder = {
        "property",
        "condition",
        "value"
})
public class BatchEquipmentIDType {

    @XmlElement(name = "Property")
    protected EquipmentElementPropertyType property;
    @XmlElement(name = "Condition")
    protected ConditionType condition;
    @XmlElement(name = "Value")
    protected BatchValueType value;

    /**
     * 获取property属性的值。
     *
     * @return possible object is
     * {@link EquipmentElementPropertyType }
     */
    public EquipmentElementPropertyType getProperty() {
        return property;
    }

    /**
     * 设置property属性的值。
     *
     * @param value allowed object is
     *              {@link EquipmentElementPropertyType }
     */
    public void setProperty(EquipmentElementPropertyType value) {
        this.property = value;
    }

    /**
     * 获取condition属性的值。
     *
     * @return possible object is
     * {@link ConditionType }
     */
    public ConditionType getCondition() {
        return condition;
    }

    /**
     * 设置condition属性的值。
     *
     * @param value allowed object is
     *              {@link ConditionType }
     */
    public void setCondition(ConditionType value) {
        this.condition = value;
    }

    /**
     * 获取value属性的值。
     *
     * @return possible object is
     * {@link BatchValueType }
     */
    public BatchValueType getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     *
     * @param value allowed object is
     *              {@link BatchValueType }
     */
    public void setValue(BatchValueType value) {
        this.value = value;
    }

}
