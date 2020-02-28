//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:41:05 PM CST 
//


package isa95.aps.interfaces.b2mml.generalrecipe;

import isa95.aps.interfaces.b2mml.common.DescriptionType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>GRecipeFormulaType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="GRecipeFormulaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessInputs" type="{http://www.mesa.org/xml/B2MML}GRecipeMaterialsType" minOccurs="0"/>
 *         &lt;element name="ProcessOutputs" type="{http://www.mesa.org/xml/B2MML}GRecipeMaterialsType" minOccurs="0"/>
 *         &lt;element name="ProcessIntermediates" type="{http://www.mesa.org/xml/B2MML}GRecipeMaterialsType" minOccurs="0"/>
 *         &lt;element name="ProcessElementParameter" type="{http://www.mesa.org/xml/B2MML}ProcessElementParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}GRecipeFormula" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRecipeFormulaType", propOrder = {
        "description",
        "processInputs",
        "processOutputs",
        "processIntermediates",
        "processElementParameter"
})
public class GRecipeFormulaType {

    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "ProcessInputs")
    protected GRecipeMaterialsType processInputs;
    @XmlElement(name = "ProcessOutputs")
    protected GRecipeMaterialsType processOutputs;
    @XmlElement(name = "ProcessIntermediates")
    protected GRecipeMaterialsType processIntermediates;
    @XmlElement(name = "ProcessElementParameter")
    protected List<ProcessElementParameterType> processElementParameter;

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
     * 获取processInputs属性的值。
     *
     * @return possible object is
     * {@link GRecipeMaterialsType }
     */
    public GRecipeMaterialsType getProcessInputs() {
        return processInputs;
    }

    /**
     * 设置processInputs属性的值。
     *
     * @param value allowed object is
     *              {@link GRecipeMaterialsType }
     */
    public void setProcessInputs(GRecipeMaterialsType value) {
        this.processInputs = value;
    }

    /**
     * 获取processOutputs属性的值。
     *
     * @return possible object is
     * {@link GRecipeMaterialsType }
     */
    public GRecipeMaterialsType getProcessOutputs() {
        return processOutputs;
    }

    /**
     * 设置processOutputs属性的值。
     *
     * @param value allowed object is
     *              {@link GRecipeMaterialsType }
     */
    public void setProcessOutputs(GRecipeMaterialsType value) {
        this.processOutputs = value;
    }

    /**
     * 获取processIntermediates属性的值。
     *
     * @return possible object is
     * {@link GRecipeMaterialsType }
     */
    public GRecipeMaterialsType getProcessIntermediates() {
        return processIntermediates;
    }

    /**
     * 设置processIntermediates属性的值。
     *
     * @param value allowed object is
     *              {@link GRecipeMaterialsType }
     */
    public void setProcessIntermediates(GRecipeMaterialsType value) {
        this.processIntermediates = value;
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

}
