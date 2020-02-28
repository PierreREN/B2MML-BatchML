//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:35:35 PM CST 
//


package isa95.aps.interfaces.b2mml.batchinformation;

import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>TransitionType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TransitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Condition" type="{http://www.mesa.org/xml/B2MML}ConditionType"/>
 *         &lt;element name="ConditionAnnotation" type="{http://www.mesa.org/xml/B2MML}ConditionAnnotationType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}Transition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitionType", propOrder = {
        "id",
        "condition",
        "conditionAnnotation",
        "description"
})
public class TransitionType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Condition", required = true)
    protected ConditionType condition;
    @XmlElement(name = "ConditionAnnotation")
    protected ConditionAnnotationType conditionAnnotation;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;

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
     * 获取conditionAnnotation属性的值。
     *
     * @return possible object is
     * {@link ConditionAnnotationType }
     */
    public ConditionAnnotationType getConditionAnnotation() {
        return conditionAnnotation;
    }

    /**
     * 设置conditionAnnotation属性的值。
     *
     * @param value allowed object is
     *              {@link ConditionAnnotationType }
     */
    public void setConditionAnnotation(ConditionAnnotationType value) {
        this.conditionAnnotation = value;
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

}
