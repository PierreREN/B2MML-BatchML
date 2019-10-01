//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>BatchListEntryType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="BatchListEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BatchListEntryType" type="{http://www.mesa.org/xml/B2MML}BatchListEntryTypeType"/>
 *         &lt;element name="Status" type="{http://www.mesa.org/xml/B2MML}BatchStatusType" minOccurs="0"/>
 *         &lt;element name="Mode" type="{http://www.mesa.org/xml/B2MML}ModeType" minOccurs="0"/>
 *         &lt;element name="ExternalID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="RecipeID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="RecipeVersion" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="BatchID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="LotID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="CampaignID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="OrderID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="StartCondition" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="RequestedStartTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ActualStartTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="RequestedEndTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ActualEndTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="BatchPriority" type="{http://www.mesa.org/xml/B2MML}BatchPriorityType" minOccurs="0"/>
 *         &lt;element name="RequestedBatchSize" type="{http://www.mesa.org/xml/B2MML}RequestedBatchSizeType" minOccurs="0"/>
 *         &lt;element name="ActualBatchSize" type="{http://www.mesa.org/xml/B2MML}ActualBatchSizeType" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.mesa.org/xml/B2MML}UnitOfMeasureType" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.mesa.org/xml/B2MML}NoteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Parameter" type="{http://www.mesa.org/xml/B2MML}BatchParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="EquipmentClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="ActualEquipmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BatchListEntry" type="{http://www.mesa.org/xml/B2MML}BatchListEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}BatchListEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchListEntryType", propOrder = {
        "id",
        "description",
        "batchListEntryType",
        "status",
        "mode",
        "externalID",
        "recipeID",
        "recipeVersion",
        "batchID",
        "lotID",
        "campaignID",
        "productID",
        "orderID",
        "startCondition",
        "requestedStartTime",
        "actualStartTime",
        "requestedEndTime",
        "actualEndTime",
        "batchPriority",
        "requestedBatchSize",
        "actualBatchSize",
        "unitOfMeasure",
        "note",
        "parameter",
        "equipmentIDOrEquipmentClassID",
        "actualEquipmentID",
        "batchListEntry"
})
public class BatchListEntryType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "BatchListEntryType", required = true)
    protected BatchListEntryTypeType batchListEntryType;
    @XmlElement(name = "Status")
    protected BatchStatusType status;
    @XmlElement(name = "Mode")
    protected ModeType mode;
    @XmlElement(name = "ExternalID")
    protected IdentifierType externalID;
    @XmlElement(name = "RecipeID")
    protected IdentifierType recipeID;
    @XmlElement(name = "RecipeVersion")
    protected IdentifierType recipeVersion;
    @XmlElement(name = "BatchID")
    protected IdentifierType batchID;
    @XmlElement(name = "LotID")
    protected IdentifierType lotID;
    @XmlElement(name = "CampaignID")
    protected IdentifierType campaignID;
    @XmlElement(name = "ProductID")
    protected IdentifierType productID;
    @XmlElement(name = "OrderID")
    protected IdentifierType orderID;
    @XmlElement(name = "StartCondition")
    protected DateTimeType startCondition;
    @XmlElement(name = "RequestedStartTime")
    protected DateTimeType requestedStartTime;
    @XmlElement(name = "ActualStartTime")
    protected DateTimeType actualStartTime;
    @XmlElement(name = "RequestedEndTime")
    protected DateTimeType requestedEndTime;
    @XmlElement(name = "ActualEndTime")
    protected DateTimeType actualEndTime;
    @XmlElement(name = "BatchPriority")
    protected BatchPriorityType batchPriority;
    @XmlElement(name = "RequestedBatchSize")
    protected RequestedBatchSizeType requestedBatchSize;
    @XmlElement(name = "ActualBatchSize")
    protected ActualBatchSizeType actualBatchSize;
    @XmlElement(name = "UnitOfMeasure")
    protected UnitOfMeasureType unitOfMeasure;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "Parameter")
    protected List<BatchParameterType> parameter;
    @XmlElementRefs({
            @XmlElementRef(name = "EquipmentID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "EquipmentClassID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<IdentifierType>> equipmentIDOrEquipmentClassID;
    @XmlElement(name = "ActualEquipmentID")
    protected List<IdentifierType> actualEquipmentID;
    @XmlElement(name = "BatchListEntry")
    protected List<BatchListEntryType> batchListEntry;

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
     * 获取batchListEntryType属性的值。
     *
     * @return possible object is
     * {@link BatchListEntryTypeType }
     */
    public BatchListEntryTypeType getBatchListEntryType() {
        return batchListEntryType;
    }

    /**
     * 设置batchListEntryType属性的值。
     *
     * @param value allowed object is
     *              {@link BatchListEntryTypeType }
     */
    public void setBatchListEntryType(BatchListEntryTypeType value) {
        this.batchListEntryType = value;
    }

    /**
     * 获取status属性的值。
     *
     * @return possible object is
     * {@link BatchStatusType }
     */
    public BatchStatusType getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     *
     * @param value allowed object is
     *              {@link BatchStatusType }
     */
    public void setStatus(BatchStatusType value) {
        this.status = value;
    }

    /**
     * 获取mode属性的值。
     *
     * @return possible object is
     * {@link ModeType }
     */
    public ModeType getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     *
     * @param value allowed object is
     *              {@link ModeType }
     */
    public void setMode(ModeType value) {
        this.mode = value;
    }

    /**
     * 获取externalID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getExternalID() {
        return externalID;
    }

    /**
     * 设置externalID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setExternalID(IdentifierType value) {
        this.externalID = value;
    }

    /**
     * 获取recipeID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getRecipeID() {
        return recipeID;
    }

    /**
     * 设置recipeID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setRecipeID(IdentifierType value) {
        this.recipeID = value;
    }

    /**
     * 获取recipeVersion属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getRecipeVersion() {
        return recipeVersion;
    }

    /**
     * 设置recipeVersion属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setRecipeVersion(IdentifierType value) {
        this.recipeVersion = value;
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
     * 获取lotID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getLotID() {
        return lotID;
    }

    /**
     * 设置lotID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setLotID(IdentifierType value) {
        this.lotID = value;
    }

    /**
     * 获取campaignID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getCampaignID() {
        return campaignID;
    }

    /**
     * 设置campaignID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setCampaignID(IdentifierType value) {
        this.campaignID = value;
    }

    /**
     * 获取productID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getProductID() {
        return productID;
    }

    /**
     * 设置productID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setProductID(IdentifierType value) {
        this.productID = value;
    }

    /**
     * 获取orderID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getOrderID() {
        return orderID;
    }

    /**
     * 设置orderID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setOrderID(IdentifierType value) {
        this.orderID = value;
    }

    /**
     * 获取startCondition属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getStartCondition() {
        return startCondition;
    }

    /**
     * 设置startCondition属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setStartCondition(DateTimeType value) {
        this.startCondition = value;
    }

    /**
     * 获取requestedStartTime属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getRequestedStartTime() {
        return requestedStartTime;
    }

    /**
     * 设置requestedStartTime属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setRequestedStartTime(DateTimeType value) {
        this.requestedStartTime = value;
    }

    /**
     * 获取actualStartTime属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getActualStartTime() {
        return actualStartTime;
    }

    /**
     * 设置actualStartTime属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setActualStartTime(DateTimeType value) {
        this.actualStartTime = value;
    }

    /**
     * 获取requestedEndTime属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getRequestedEndTime() {
        return requestedEndTime;
    }

    /**
     * 设置requestedEndTime属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setRequestedEndTime(DateTimeType value) {
        this.requestedEndTime = value;
    }

    /**
     * 获取actualEndTime属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getActualEndTime() {
        return actualEndTime;
    }

    /**
     * 设置actualEndTime属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setActualEndTime(DateTimeType value) {
        this.actualEndTime = value;
    }

    /**
     * 获取batchPriority属性的值。
     *
     * @return possible object is
     * {@link BatchPriorityType }
     */
    public BatchPriorityType getBatchPriority() {
        return batchPriority;
    }

    /**
     * 设置batchPriority属性的值。
     *
     * @param value allowed object is
     *              {@link BatchPriorityType }
     */
    public void setBatchPriority(BatchPriorityType value) {
        this.batchPriority = value;
    }

    /**
     * 获取requestedBatchSize属性的值。
     *
     * @return possible object is
     * {@link RequestedBatchSizeType }
     */
    public RequestedBatchSizeType getRequestedBatchSize() {
        return requestedBatchSize;
    }

    /**
     * 设置requestedBatchSize属性的值。
     *
     * @param value allowed object is
     *              {@link RequestedBatchSizeType }
     */
    public void setRequestedBatchSize(RequestedBatchSizeType value) {
        this.requestedBatchSize = value;
    }

    /**
     * 获取actualBatchSize属性的值。
     *
     * @return possible object is
     * {@link ActualBatchSizeType }
     */
    public ActualBatchSizeType getActualBatchSize() {
        return actualBatchSize;
    }

    /**
     * 设置actualBatchSize属性的值。
     *
     * @param value allowed object is
     *              {@link ActualBatchSizeType }
     */
    public void setActualBatchSize(ActualBatchSizeType value) {
        this.actualBatchSize = value;
    }

    /**
     * 获取unitOfMeasure属性的值。
     *
     * @return possible object is
     * {@link UnitOfMeasureType }
     */
    public UnitOfMeasureType getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     *
     * @param value allowed object is
     *              {@link UnitOfMeasureType }
     */
    public void setUnitOfMeasure(UnitOfMeasureType value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the note property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
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
     * Gets the value of the equipmentIDOrEquipmentClassID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentIDOrEquipmentClassID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentIDOrEquipmentClassID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     */
    public List<JAXBElement<IdentifierType>> getEquipmentIDOrEquipmentClassID() {
        if (equipmentIDOrEquipmentClassID == null) {
            equipmentIDOrEquipmentClassID = new ArrayList<JAXBElement<IdentifierType>>();
        }
        return this.equipmentIDOrEquipmentClassID;
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
     * Gets the value of the batchListEntry property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchListEntry property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchListEntry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchListEntryType }
     */
    public List<BatchListEntryType> getBatchListEntry() {
        if (batchListEntry == null) {
            batchListEntry = new ArrayList<BatchListEntryType>();
        }
        return this.batchListEntry;
    }

}
