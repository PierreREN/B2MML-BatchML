//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:05:44 PM CST 
//


package isa95.aps.interfaces.b2mml.testspecification;

import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;
import isa95.aps.interfaces.b2mml.common.NumericType;
import isa95.aps.interfaces.b2mml.common.TextType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>TestSpecificationCriteriaType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TestSpecificationCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Sequence" type="{http://www.mesa.org/xml/B2MML}NumericType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Expression" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EvaluatedPropertyID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}TestSpecificationCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestSpecificationCriteriaType", propOrder = {
        "id",
        "description",
        "sequence",
        "expression",
        "result",
        "evaluatedPropertyID"
})
public class TestSpecificationCriteriaType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "Sequence")
    protected List<NumericType> sequence;
    @XmlElement(name = "Expression")
    protected List<TextType> expression;
    @XmlElement(name = "Result")
    protected List<TextType> result;
    @XmlElement(name = "EvaluatedPropertyID")
    protected List<IdentifierType> evaluatedPropertyID;

    /**
     * 获取id属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setID(IdentifierType value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the sequence property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sequence property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequence().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumericType }
     */
    public List<NumericType> getSequence() {
        if (sequence == null) {
            sequence = new ArrayList<NumericType>();
        }
        return this.sequence;
    }

    /**
     * Gets the value of the expression property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expression property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpression().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     */
    public List<TextType> getExpression() {
        if (expression == null) {
            expression = new ArrayList<TextType>();
        }
        return this.expression;
    }

    /**
     * Gets the value of the result property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     */
    public List<TextType> getResult() {
        if (result == null) {
            result = new ArrayList<TextType>();
        }
        return this.result;
    }

    /**
     * Gets the value of the evaluatedPropertyID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evaluatedPropertyID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvaluatedPropertyID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getEvaluatedPropertyID() {
        if (evaluatedPropertyID == null) {
            evaluatedPropertyID = new ArrayList<IdentifierType>();
        }
        return this.evaluatedPropertyID;
    }

}
