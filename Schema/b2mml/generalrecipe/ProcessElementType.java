//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:41:05 PM CST 
//


package isa95.aps.interfaces.b2mml.generalrecipe;

import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;
import isa95.aps.interfaces.b2mml.common.NumericType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ProcessElementType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ProcessElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessElementType" type="{http://www.mesa.org/xml/B2MML}ProcessElementTypeType" minOccurs="0"/>
 *         &lt;element name="LifeCycleState" type="{http://www.mesa.org/xml/B2MML}LifeCycleStateType" minOccurs="0"/>
 *         &lt;element name="SequenceOrder" type="{http://www.mesa.org/xml/B2MML}SequenceOrderType" minOccurs="0"/>
 *         &lt;element name="SequencePath" type="{http://www.mesa.org/xml/B2MML}NumericType" minOccurs="0"/>
 *         &lt;element name="Materials" type="{http://www.mesa.org/xml/B2MML}GRecipeMaterialsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DirectedLink" type="{http://www.mesa.org/xml/B2MML}DirectedLinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcedureChartElement" type="{http://www.mesa.org/xml/B2MML}ProcedureChartElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessElement" type="{http://www.mesa.org/xml/B2MML}ProcessElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessElementParameter" type="{http://www.mesa.org/xml/B2MML}ProcessElementParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResourceConstraint" type="{http://www.mesa.org/xml/B2MML}ResourceConstraintType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherInformation" type="{http://www.mesa.org/xml/B2MML}GROtherInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}ProcessElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessElementType", propOrder = {
        "id",
        "description",
        "processElementType",
        "lifeCycleState",
        "sequenceOrder",
        "sequencePath",
        "materials",
        "directedLink",
        "procedureChartElement",
        "processElement",
        "processElementParameter",
        "resourceConstraint",
        "otherInformation"
})
public class ProcessElementType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "ProcessElementType")
    protected ProcessElementTypeType processElementType;
    @XmlElement(name = "LifeCycleState")
    protected LifeCycleStateType lifeCycleState;
    @XmlElement(name = "SequenceOrder")
    protected SequenceOrderType sequenceOrder;
    @XmlElement(name = "SequencePath")
    protected NumericType sequencePath;
    @XmlElement(name = "Materials")
    protected List<GRecipeMaterialsType> materials;
    @XmlElement(name = "DirectedLink")
    protected List<DirectedLinkType> directedLink;
    @XmlElement(name = "ProcedureChartElement")
    protected List<ProcedureChartElementType> procedureChartElement;
    @XmlElement(name = "ProcessElement")
    protected List<ProcessElementType> processElement;
    @XmlElement(name = "ProcessElementParameter")
    protected List<ProcessElementParameterType> processElementParameter;
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
     * 获取processElementType属性的值。
     *
     * @return possible object is
     * {@link ProcessElementTypeType }
     */
    public ProcessElementTypeType getProcessElementType() {
        return processElementType;
    }

    /**
     * 设置processElementType属性的值。
     *
     * @param value allowed object is
     *              {@link ProcessElementTypeType }
     */
    public void setProcessElementType(ProcessElementTypeType value) {
        this.processElementType = value;
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
     * 获取sequenceOrder属性的值。
     *
     * @return possible object is
     * {@link SequenceOrderType }
     */
    public SequenceOrderType getSequenceOrder() {
        return sequenceOrder;
    }

    /**
     * 设置sequenceOrder属性的值。
     *
     * @param value allowed object is
     *              {@link SequenceOrderType }
     */
    public void setSequenceOrder(SequenceOrderType value) {
        this.sequenceOrder = value;
    }

    /**
     * 获取sequencePath属性的值。
     *
     * @return possible object is
     * {@link NumericType }
     */
    public NumericType getSequencePath() {
        return sequencePath;
    }

    /**
     * 设置sequencePath属性的值。
     *
     * @param value allowed object is
     *              {@link NumericType }
     */
    public void setSequencePath(NumericType value) {
        this.sequencePath = value;
    }

    /**
     * Gets the value of the materials property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materials property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterials().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GRecipeMaterialsType }
     */
    public List<GRecipeMaterialsType> getMaterials() {
        if (materials == null) {
            materials = new ArrayList<GRecipeMaterialsType>();
        }
        return this.materials;
    }

    /**
     * Gets the value of the directedLink property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedLink property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedLink().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedLinkType }
     */
    public List<DirectedLinkType> getDirectedLink() {
        if (directedLink == null) {
            directedLink = new ArrayList<DirectedLinkType>();
        }
        return this.directedLink;
    }

    /**
     * Gets the value of the procedureChartElement property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedureChartElement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedureChartElement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedureChartElementType }
     */
    public List<ProcedureChartElementType> getProcedureChartElement() {
        if (procedureChartElement == null) {
            procedureChartElement = new ArrayList<ProcedureChartElementType>();
        }
        return this.procedureChartElement;
    }

    /**
     * Gets the value of the processElement property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processElement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessElement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessElementType }
     */
    public List<ProcessElementType> getProcessElement() {
        if (processElement == null) {
            processElement = new ArrayList<ProcessElementType>();
        }
        return this.processElement;
    }

    /**
     * Gets the value of the processElementParameter property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processElementParameter property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessElementParameter().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessElementParameterType }
     */
    public List<ProcessElementParameterType> getProcessElementParameter() {
        if (processElementParameter == null) {
            processElementParameter = new ArrayList<ProcessElementParameterType>();
        }
        return this.processElementParameter;
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
