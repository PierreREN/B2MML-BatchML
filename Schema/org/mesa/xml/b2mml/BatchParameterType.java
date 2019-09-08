//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BatchParameterType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BatchParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" minOccurs="0"/>
 *         &lt;element name="ParameterType" type="{http://www.mesa.org/xml/B2MML}ParameterTypeType"/>
 *         &lt;element name="ParameterSubType" type="{http://www.mesa.org/xml/B2MML}ParameterSubTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.mesa.org/xml/B2MML}BatchValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Scaled" type="{http://www.mesa.org/xml/B2MML}ScaledType" minOccurs="0"/>
 *         &lt;element name="ScaleReference" type="{http://www.mesa.org/xml/B2MML}ScaleReferenceType" minOccurs="0"/>
 *         &lt;element name="Parameter" type="{http://www.mesa.org/xml/B2MML}BatchParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}BatchParameter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchParameterType", propOrder = {
    "id",
    "description",
    "parameterType",
    "parameterSubType",
    "value",
    "scaled",
    "scaleReference",
    "parameter"
})
public class BatchParameterType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected DescriptionType description;
    @XmlElement(name = "ParameterType", required = true)
    protected ParameterTypeType parameterType;
    @XmlElement(name = "ParameterSubType")
    protected List<ParameterSubTypeType> parameterSubType;
    @XmlElement(name = "Value")
    protected List<BatchValueType> value;
    @XmlElement(name = "Scaled")
    protected ScaledType scaled;
    @XmlElement(name = "ScaleReference")
    protected ScaleReferenceType scaleReference;
    @XmlElement(name = "Parameter")
    protected List<BatchParameterType> parameter;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setID(IdentifierType value) {
        this.id = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

    /**
     * 获取parameterType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParameterTypeType }
     *     
     */
    public ParameterTypeType getParameterType() {
        return parameterType;
    }

    /**
     * 设置parameterType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterTypeType }
     *     
     */
    public void setParameterType(ParameterTypeType value) {
        this.parameterType = value;
    }

    /**
     * Gets the value of the parameterSubType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterSubType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterSubType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterSubTypeType }
     * 
     * 
     */
    public List<ParameterSubTypeType> getParameterSubType() {
        if (parameterSubType == null) {
            parameterSubType = new ArrayList<ParameterSubTypeType>();
        }
        return this.parameterSubType;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchValueType }
     * 
     * 
     */
    public List<BatchValueType> getValue() {
        if (value == null) {
            value = new ArrayList<BatchValueType>();
        }
        return this.value;
    }

    /**
     * 获取scaled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ScaledType }
     *     
     */
    public ScaledType getScaled() {
        return scaled;
    }

    /**
     * 设置scaled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ScaledType }
     *     
     */
    public void setScaled(ScaledType value) {
        this.scaled = value;
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
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchParameterType }
     * 
     * 
     */
    public List<BatchParameterType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<BatchParameterType>();
        }
        return this.parameter;
    }

}
