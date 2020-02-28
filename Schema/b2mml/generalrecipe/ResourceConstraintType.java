//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:41:05 PM CST 
//


package isa95.aps.interfaces.b2mml.generalrecipe;

import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;
import isa95.aps.interfaces.b2mml.common.ValueType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ResourceConstraintType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ResourceConstraintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConstraintID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConstraintType" type="{http://www.mesa.org/xml/B2MML}ConstraintTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LifeCycleState" type="{http://www.mesa.org/xml/B2MML}LifeCycleStateType" minOccurs="0"/>
 *         &lt;element name="Range" type="{http://www.mesa.org/xml/B2MML}ValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResourceConstraintProperty" type="{http://www.mesa.org/xml/B2MML}ResourceConstraintPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}ResourceConstraint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceConstraintType", propOrder = {
        "constraintID",
        "description",
        "constraintType",
        "lifeCycleState",
        "range",
        "resourceConstraintProperty"
})
public class ResourceConstraintType {

    @XmlElement(name = "ConstraintID")
    protected IdentifierType constraintID;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "ConstraintType")
    protected List<ConstraintTypeType> constraintType;
    @XmlElement(name = "LifeCycleState")
    protected LifeCycleStateType lifeCycleState;
    @XmlElement(name = "Range")
    protected List<ValueType> range;
    @XmlElement(name = "ResourceConstraintProperty")
    protected List<ResourceConstraintPropertyType> resourceConstraintProperty;

    /**
     * 获取constraintID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getConstraintID() {
        return constraintID;
    }

    /**
     * 设置constraintID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setConstraintID(IdentifierType value) {
        this.constraintID = value;
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
     * Gets the value of the constraintType property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraintType property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraintType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstraintTypeType }
     */
    public List<ConstraintTypeType> getConstraintType() {
        if (constraintType == null) {
            constraintType = new ArrayList<ConstraintTypeType>();
        }
        return this.constraintType;
    }

    /**
     * 获取lifeCycleState属性的值。
     *
     * @return possible object is
     * {@link LifeCycleStateType }
     */
    public LifeCycleStateType getLifeCycleState() {
        return lifeCycleState;
    }

    /**
     * 设置lifeCycleState属性的值。
     *
     * @param value allowed object is
     *              {@link LifeCycleStateType }
     */
    public void setLifeCycleState(LifeCycleStateType value) {
        this.lifeCycleState = value;
    }

    /**
     * Gets the value of the range property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the range property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRange().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     */
    public List<ValueType> getRange() {
        if (range == null) {
            range = new ArrayList<ValueType>();
        }
        return this.range;
    }

    /**
     * Gets the value of the resourceConstraintProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceConstraintProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceConstraintProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceConstraintPropertyType }
     */
    public List<ResourceConstraintPropertyType> getResourceConstraintProperty() {
        if (resourceConstraintProperty == null) {
            resourceConstraintProperty = new ArrayList<ResourceConstraintPropertyType>();
        }
        return this.resourceConstraintProperty;
    }

}
