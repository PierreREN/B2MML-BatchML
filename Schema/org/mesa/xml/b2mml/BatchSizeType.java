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
 * <p>BatchSizeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BatchSizeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nominal" type="{http://www.mesa.org/xml/B2MML}NominalType" minOccurs="0"/>
 *         &lt;element name="Min" type="{http://www.mesa.org/xml/B2MML}MinType" minOccurs="0"/>
 *         &lt;element name="Max" type="{http://www.mesa.org/xml/B2MML}MaxType" minOccurs="0"/>
 *         &lt;element name="ScaleReference" type="{http://www.mesa.org/xml/B2MML}ScaleReferenceType" minOccurs="0"/>
 *         &lt;element name="ScaledSize" type="{http://www.mesa.org/xml/B2MML}ScaledSizeType" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.mesa.org/xml/B2MML}UnitOfMeasureType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}BatchSize" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchSizeType", propOrder = {
    "nominal",
    "min",
    "max",
    "scaleReference",
    "scaledSize",
    "unitOfMeasure"
})
public class BatchSizeType {

    @XmlElement(name = "Nominal")
    protected NominalType nominal;
    @XmlElement(name = "Min")
    protected MinType min;
    @XmlElement(name = "Max")
    protected MaxType max;
    @XmlElement(name = "ScaleReference")
    protected ScaleReferenceType scaleReference;
    @XmlElement(name = "ScaledSize")
    protected ScaledSizeType scaledSize;
    @XmlElement(name = "UnitOfMeasure")
    protected UnitOfMeasureType unitOfMeasure;

    /**
     * 获取nominal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NominalType }
     *     
     */
    public NominalType getNominal() {
        return nominal;
    }

    /**
     * 设置nominal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NominalType }
     *     
     */
    public void setNominal(NominalType value) {
        this.nominal = value;
    }

    /**
     * 获取min属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MinType }
     *     
     */
    public MinType getMin() {
        return min;
    }

    /**
     * 设置min属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MinType }
     *     
     */
    public void setMin(MinType value) {
        this.min = value;
    }

    /**
     * 获取max属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MaxType }
     *     
     */
    public MaxType getMax() {
        return max;
    }

    /**
     * 设置max属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MaxType }
     *     
     */
    public void setMax(MaxType value) {
        this.max = value;
    }

    /**
     * 获取scaleReference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ScaleReferenceType }
     *     
     */
    public ScaleReferenceType getScaleReference() {
        return scaleReference;
    }

    /**
     * 设置scaleReference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleReferenceType }
     *     
     */
    public void setScaleReference(ScaleReferenceType value) {
        this.scaleReference = value;
    }

    /**
     * 获取scaledSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ScaledSizeType }
     *     
     */
    public ScaledSizeType getScaledSize() {
        return scaledSize;
    }

    /**
     * 设置scaledSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledSizeType }
     *     
     */
    public void setScaledSize(ScaledSizeType value) {
        this.scaledSize = value;
    }

    /**
     * 获取unitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasureType value) {
        this.unitOfMeasure = value;
    }

}
