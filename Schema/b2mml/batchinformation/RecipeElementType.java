//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:35:35 PM CST 
//


package isa95.aps.interfaces.b2mml.batchinformation;

import isa95.aps.interfaces.b2mml.common.DateTimeType;
import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;
import isa95.aps.interfaces.b2mml.common.VersionType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RecipeElementType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="RecipeElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML}VersionType" minOccurs="0"/>
 *         &lt;element name="VersionDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecipeElementType" type="{http://www.mesa.org/xml/B2MML}RecipeElementTypeType"/>
 *         &lt;element name="BuildingBlockElementID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="BuildingBlockElementVersion" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ActualEquipmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Header" type="{http://www.mesa.org/xml/B2MML}HeaderType" minOccurs="0"/>
 *         &lt;element name="EquipmentRequirement" type="{http://www.mesa.org/xml/B2MML}BatchEquipmentRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Parameter" type="{http://www.mesa.org/xml/B2MML}BatchParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcedureLogic" type="{http://www.mesa.org/xml/B2MML}ProcedureLogicType" minOccurs="0"/>
 *         &lt;element name="RecipeElement" type="{http://www.mesa.org/xml/B2MML}RecipeElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherInformation" type="{http://www.mesa.org/xml/B2MML}OtherInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}RecipeElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeElementType", propOrder = {
        "id",
        "version",
        "versionDate",
        "description",
        "recipeElementType",
        "buildingBlockElementID",
        "buildingBlockElementVersion",
        "actualEquipmentID",
        "header",
        "equipmentRequirement",
        "parameter",
        "procedureLogic",
        "recipeElement",
        "otherInformation"
})
public class RecipeElementType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Version")
    protected VersionType version;
    @XmlElement(name = "VersionDate")
    protected DateTimeType versionDate;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "RecipeElementType", required = true)
    protected RecipeElementTypeType recipeElementType;
    @XmlElement(name = "BuildingBlockElementID")
    protected IdentifierType buildingBlockElementID;
    @XmlElement(name = "BuildingBlockElementVersion")
    protected IdentifierType buildingBlockElementVersion;
    @XmlElement(name = "ActualEquipmentID")
    protected List<IdentifierType> actualEquipmentID;
    @XmlElement(name = "Header")
    protected HeaderType header;
    @XmlElement(name = "EquipmentRequirement")
    protected List<BatchEquipmentRequirementType> equipmentRequirement;
    @XmlElement(name = "Parameter")
    protected List<BatchParameterType> parameter;
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
     * 获取recipeElementType属性的值。
     *
     * @return possible object is
     * {@link RecipeElementTypeType }
     */
    public RecipeElementTypeType getRecipeElementType() {
        return recipeElementType;
    }

    /**
     * 设置recipeElementType属性的值。
     *
     * @param value allowed object is
     *              {@link RecipeElementTypeType }
     */
    public void setRecipeElementType(RecipeElementTypeType value) {
        this.recipeElementType = value;
    }

    /**
     * 获取buildingBlockElementID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getBuildingBlockElementID() {
        return buildingBlockElementID;
    }

    /**
     * 设置buildingBlockElementID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setBuildingBlockElementID(IdentifierType value) {
        this.buildingBlockElementID = value;
    }

    /**
     * 获取buildingBlockElementVersion属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getBuildingBlockElementVersion() {
        return buildingBlockElementVersion;
    }

    /**
     * 设置buildingBlockElementVersion属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setBuildingBlockElementVersion(IdentifierType value) {
        this.buildingBlockElementVersion = value;
    }

    /**
     * Gets the value of the actualEquipmentID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actualEquipmentID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualEquipmentID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getActualEquipmentID() {
        if (actualEquipmentID == null) {
            actualEquipmentID = new ArrayList<IdentifierType>();
        }
        return this.actualEquipmentID;
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
     */
    public List<BatchParameterType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<BatchParameterType>();
        }
        return this.parameter;
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
