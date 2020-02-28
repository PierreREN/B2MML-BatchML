//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:45:07 PM CST 
//


package isa95.aps.interfaces.b2mml.batchproductionrecord;

import isa95.aps.domain.entity.batchinformation.MasterRecipeType;
import isa95.aps.interfaces.b2mml.common.DateTimeType;
import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>MasterRecipeRecordType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="MasterRecipeRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}BatchProductionRecordEntryType"/>
 *         &lt;element name="MasterRecipe" type="{http://www.mesa.org/xml/B2MML}MasterRecipeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterRecipeRecordType", propOrder = {
        "entryID",
        "objectType",
        "timeStamp",
        "externalReference",
        "description",
        "masterRecipe"
})
public class MasterRecipeRecordType {

    @XmlElement(name = "EntryID", required = true)
    protected IdentifierType entryID;
    @XmlElement(name = "ObjectType", required = true)
    protected RecordObjectTypeType objectType;
    @XmlElement(name = "TimeStamp")
    protected DateTimeType timeStamp;
    @XmlElement(name = "ExternalReference")
    protected IdentifierType externalReference;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "MasterRecipe", required = true)
    protected MasterRecipeType masterRecipe;

    /**
     * 获取entryID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getEntryID() {
        return entryID;
    }

    /**
     * 设置entryID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setEntryID(IdentifierType value) {
        this.entryID = value;
    }

    /**
     * 获取objectType属性的值。
     *
     * @return possible object is
     * {@link RecordObjectTypeType }
     */
    public RecordObjectTypeType getObjectType() {
        return objectType;
    }

    /**
     * 设置objectType属性的值。
     *
     * @param value allowed object is
     *              {@link RecordObjectTypeType }
     */
    public void setObjectType(RecordObjectTypeType value) {
        this.objectType = value;
    }

    /**
     * 获取timeStamp属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getTimeStamp() {
        return timeStamp;
    }

    /**
     * 设置timeStamp属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setTimeStamp(DateTimeType value) {
        this.timeStamp = value;
    }

    /**
     * 获取externalReference属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getExternalReference() {
        return externalReference;
    }

    /**
     * 设置externalReference属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setExternalReference(IdentifierType value) {
        this.externalReference = value;
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
     * 获取masterRecipe属性的值。
     *
     * @return possible object is
     * {@link MasterRecipeType }
     */
    public MasterRecipeType getMasterRecipe() {
        return masterRecipe;
    }

    /**
     * 设置masterRecipe属性的值。
     *
     * @param value allowed object is
     *              {@link MasterRecipeType }
     */
    public void setMasterRecipe(MasterRecipeType value) {
        this.masterRecipe = value;
    }

}
