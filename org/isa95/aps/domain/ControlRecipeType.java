//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ControlRecipeType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ControlRecipeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML}VersionType" minOccurs="0"/>
 *         &lt;element name="VersionDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BatchID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Header" type="{http://www.mesa.org/xml/B2MML}HeaderType" minOccurs="0"/>
 *         &lt;element name="EquipmentRequirement" type="{http://www.mesa.org/xml/B2MML}BatchEquipmentRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Formula" type="{http://www.mesa.org/xml/B2MML}FormulaType" minOccurs="0"/>
 *         &lt;element name="ProcedureLogic" type="{http://www.mesa.org/xml/B2MML}ProcedureLogicType" minOccurs="0"/>
 *         &lt;element name="RecipeElement" type="{http://www.mesa.org/xml/B2MML}RecipeElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherInformation" type="{http://www.mesa.org/xml/B2MML}OtherInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}ControlRecipe" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlRecipeType", propOrder = {
        "id",
        "version",
        "versionDate",
        "description",
        "batchID",
        "header",
        "equipmentRequirement",
        "formula",
        "procedureLogic",
        "recipeElement",
        "otherInformation"
})
public class ControlRecipeType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Version")
    protected VersionType version;
    @XmlElement(name = "VersionDate")
    protected DateTimeType versionDate;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "BatchID")
    protected IdentifierType batchID;
    @XmlElement(name = "Header")
    protected HeaderType header;
    @XmlElement(name = "EquipmentRequirement")
    protected List<BatchEquipmentRequirementType> equipmentRequirement;
    @XmlElement(name = "Formula")
    protected FormulaType formula;
    @XmlElement(name = "ProcedureLogic")
    protected ProcedureLogicType procedureLogic;
    @XmlElement(name = "RecipeElement")
    protected List<RecipeElementType> recipeElement;
    @XmlElement(name = "OtherInformation")
    protected List<OtherInformationType> otherInformation;

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
     * 获取version属性的值。
     *
     * @return possible object is
     * {@link VersionType }
     */
    public VersionType getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     *
     * @param value allowed object is
     *              {@link VersionType }
     */
    public void setVersion(VersionType value) {
        this.version = value;
    }

    /**
     * 获取versionDate属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getVersionDate() {
        return versionDate;
    }

    /**
     * 设置versionDate属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setVersionDate(DateTimeType value) {
        this.versionDate = value;
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
     * 获取batchID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getBatchID() {
        return batchID;
    }

    /**
     * 设置batchID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setBatchID(IdentifierType value) {
        this.batchID = value;
    }

    /**
     * 获取header属性的值。
     *
     * @return possible object is
     * {@link HeaderType }
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     *
     * @param value allowed object is
     *              {@link HeaderType }
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the equipmentRequirement property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentRequirement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentRequirement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchEquipmentRequirementType }
     */
    public List<BatchEquipmentRequirementType> getEquipmentRequirement() {
        if (equipmentRequirement == null) {
            equipmentRequirement = new ArrayList<BatchEquipmentRequirementType>();
        }
        return this.equipmentRequirement;
    }

    /**
     * 获取formula属性的值。
     *
     * @return possible object is
     * {@link FormulaType }
     */
    public FormulaType getFormula() {
        return formula;
    }

    /**
     * 设置formula属性的值。
     *
     * @param value allowed object is
     *              {@link FormulaType }
     */
    public void setFormula(FormulaType value) {
        this.formula = value;
    }

    /**
     * 获取procedureLogic属性的值。
     *
     * @return possible object is
     * {@link ProcedureLogicType }
     */
    public ProcedureLogicType getProcedureLogic() {
        return procedureLogic;
    }

    /**
     * 设置procedureLogic属性的值。
     *
     * @param value allowed object is
     *              {@link ProcedureLogicType }
     */
    public void setProcedureLogic(ProcedureLogicType value) {
        this.procedureLogic = value;
    }

    /**
     * Gets the value of the recipeElement property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipeElement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipeElement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipeElementType }
     */
    public List<RecipeElementType> getRecipeElement() {
        if (recipeElement == null) {
            recipeElement = new ArrayList<RecipeElementType>();
        }
        return this.recipeElement;
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
     * {@link OtherInformationType }
     */
    public List<OtherInformationType> getOtherInformation() {
        if (otherInformation == null) {
            otherInformation = new ArrayList<OtherInformationType>();
        }
        return this.otherInformation;
    }

}
