//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Defines the expected use of the material class, material definition, material lot, or material sublot in the context of the operations segment.
 * Defined values for production operations are
 * - Consumable, Consumed, Produced, By-product Produced, Co-product Produced, and Yield Produced.
 * 
 * Defined values for maintenance operations are
 * - Consumable, Material Consumed, and Material Produced.
 * 
 * Defined values for quality test operations are 
 * - Consumable, Destructive Sample, Returned Sample, and Retained Sample.
 * 
 * Defined values for inventory operations defined values are
 * - Consumable, Material Consumed, Material Produced, and Inventoried.
 * 			
 * 
 * <p>MaterialUseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MaterialUseType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.mesa.org/xml/B2MML>MaterialUse1Type">
 *       &lt;attribute name="OtherValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialUseType")
public class MaterialUseType
    extends MaterialUse1Type
{

    @XmlAttribute(name = "OtherValue")
    protected String otherValue;

    /**
     * 获取otherValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherValue() {
        return otherValue;
    }

    /**
     * 设置otherValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherValue(String value) {
        this.otherValue = value;
    }

}
