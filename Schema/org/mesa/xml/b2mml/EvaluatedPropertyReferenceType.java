//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EvaluatedPropertyReferenceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EvaluatedPropertyReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TestSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="EvaluatedPropertyID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}EvaluatedPropertyReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluatedPropertyReferenceType", propOrder = {
    "testSpecificationID",
    "evaluatedPropertyID"
})
public class EvaluatedPropertyReferenceType {

    @XmlElement(name = "TestSpecificationID", required = true)
    protected IdentifierType testSpecificationID;
    @XmlElement(name = "EvaluatedPropertyID", required = true)
    protected IdentifierType evaluatedPropertyID;

    /**
     * 获取testSpecificationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getTestSpecificationID() {
        return testSpecificationID;
    }

    /**
     * 设置testSpecificationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setTestSpecificationID(IdentifierType value) {
        this.testSpecificationID = value;
    }

    /**
     * 获取evaluatedPropertyID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getEvaluatedPropertyID() {
        return evaluatedPropertyID;
    }

    /**
     * 设置evaluatedPropertyID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setEvaluatedPropertyID(IdentifierType value) {
        this.evaluatedPropertyID = value;
    }

}
