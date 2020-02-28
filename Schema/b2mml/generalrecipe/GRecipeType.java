//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:41:05 PM CST 
//


package isa95.aps.interfaces.b2mml.generalrecipe;

import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>GRecipeType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="GRecipeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GRecipeType" type="{http://www.mesa.org/xml/B2MML}GRecipeTypeType" minOccurs="0"/>
 *         &lt;element name="LifeCycleState" type="{http://www.mesa.org/xml/B2MML}LifeCycleStateType" minOccurs="0"/>
 *         &lt;element name="Header" type="{http://www.mesa.org/xml/B2MML}GRecipeHeaderType" minOccurs="0"/>
 *         &lt;element name="Formula" type="{http://www.mesa.org/xml/B2MML}GRecipeFormulaType" minOccurs="0"/>
 *         &lt;element name="ProcessProcedure" type="{http://www.mesa.org/xml/B2MML}ProcessElementType" minOccurs="0"/>
 *         &lt;element name="ResourceConstraint" type="{http://www.mesa.org/xml/B2MML}ResourceConstraintType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherInformation" type="{http://www.mesa.org/xml/B2MML}GROtherInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}GRecipe" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRecipeType", propOrder = {
        "id",
        "description",
        "gRecipeType",
        "lifeCycleState",
        "header",
        "formula",
        "processProcedure",
        "resourceConstraint",
        "otherInformation"
})
public class GRecipeType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "GRecipeType")
    protected GRecipeTypeType gRecipeType;
    @XmlElement(name = "LifeCycleState")
    protected LifeCycleStateType lifeCycleState;
    @XmlElement(name = "Header")
    protected GRecipeHeaderType header;
    @XmlElement(name = "Formula")
    protected GRecipeFormulaType formula;
    @XmlElement(name = "ProcessProcedure")
    protected ProcessElementType processProcedure;
    @XmlElement(name = "ResourceConstraint")
    protected List<ResourceConstraintType> resourceConstraint;
    @XmlElement(name = "OtherInformation")
    protected List<GROtherInformationType> otherInformation;

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
     * 获取gRecipeType属性的值。
     *
     * @return possible object is
     * {@link GRecipeTypeType }
     */
    public GRecipeTypeType getGRecipeType() {
        return gRecipeType;
    }

    /**
     * 设置gRecipeType属性的值。
     *
     * @param value allowed object is
     *              {@link GRecipeTypeType }
     */
    public void setGRecipeType(GRecipeTypeType value) {
        this.gRecipeType = value;
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
     * 获取header属性的值。
     *
     * @return possible object is
     * {@link GRecipeHeaderType }
     */
    public GRecipeHeaderType getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     *
     * @param value allowed object is
     *              {@link GRecipeHeaderType }
     */
    public void setHeader(GRecipeHeaderType value) {
        this.header = value;
    }

    /**
     * 获取formula属性的值。
     *
     * @return possible object is
     * {@link GRecipeFormulaType }
     */
    public GRecipeFormulaType getFormula() {
        return formula;
    }

    /**
     * 设置formula属性的值。
     *
     * @param value allowed object is
     *              {@link GRecipeFormulaType }
     */
    public void setFormula(GRecipeFormulaType value) {
        this.formula = value;
    }

    /**
     * 获取processProcedure属性的值。
     *
     * @return possible object is
     * {@link ProcessElementType }
     */
    public ProcessElementType getProcessProcedure() {
        return processProcedure;
    }

    /**
     * 设置processProcedure属性的值。
     *
     * @param value allowed object is
     *              {@link ProcessElementType }
     */
    public void setProcessProcedure(ProcessElementType value) {
        this.processProcedure = value;
    }

    /**
     * Gets the value of the resourceConstraint property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceConstraint property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceConstraint().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceConstraintType }
     */
    public List<ResourceConstraintType> getResourceConstraint() {
        if (resourceConstraint == null) {
            resourceConstraint = new ArrayList<ResourceConstraintType>();
        }
        return this.resourceConstraint;
    }

    /**
     * Gets the value of the otherInformation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherInformation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherInformation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GROtherInformationType }
     */
    public List<GROtherInformationType> getOtherInformation() {
        if (otherInformation == null) {
            otherInformation = new ArrayList<GROtherInformationType>();
        }
        return this.otherInformation;
    }

}
