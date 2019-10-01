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
 * <p>BatchProductionRecordType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="BatchProductionRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}BatchProductionRecordEntryType"/>
 *         &lt;element name="EquipmentScope" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="BatchID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="BatchProductionRecordSpec" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="CampaignID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ChangeIndication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Delimiter" type="{http://www.mesa.org/xml/B2MML}TextType" minOccurs="0"/>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="LastChangedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LotID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="MaterialDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="RecordStatus" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ChangeHistory" type="{http://www.mesa.org/xml/B2MML}ChangeHistoryType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.mesa.org/xml/B2MML}CommentsType" minOccurs="0"/>
 *         &lt;element name="ControlRecipes" type="{http://www.mesa.org/xml/B2MML}ControlRecipesType" minOccurs="0"/>
 *         &lt;element name="DataSets" type="{http://www.mesa.org/xml/B2MML}DataSetsType" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://www.mesa.org/xml/B2MML}EventsType" minOccurs="0"/>
 *         &lt;element name="MasterRecipes" type="{http://www.mesa.org/xml/B2MML}MasterRecipesType" minOccurs="0"/>
 *         &lt;element name="PersonnelIdentification" type="{http://www.mesa.org/xml/B2MML}PersonnelIdentificationType" minOccurs="0"/>
 *         &lt;element name="OperationsDefinitions" type="{http://www.mesa.org/xml/B2MML}OperationsDefinitionsType" minOccurs="0"/>
 *         &lt;element name="OperationsPerformances" type="{http://www.mesa.org/xml/B2MML}OperationsPerformancesType" minOccurs="0"/>
 *         &lt;element name="OperationsSchedules" type="{http://www.mesa.org/xml/B2MML}OperationsSchedulesType" minOccurs="0"/>
 *         &lt;element name="RecipeElements" type="{http://www.mesa.org/xml/B2MML}RecipeElementsType" minOccurs="0"/>
 *         &lt;element name="ResourceQualifications" type="{http://www.mesa.org/xml/B2MML}ResourceQualificationsType" minOccurs="0"/>
 *         &lt;element name="Samples" type="{http://www.mesa.org/xml/B2MML}SamplesType" minOccurs="0"/>
 *         &lt;element name="WorkDirectives" type="{http://www.mesa.org/xml/B2MML}WorkDirectivesType" minOccurs="0"/>
 *         &lt;element name="WorkMasters" type="{http://www.mesa.org/xml/B2MML}WorkMastersType" minOccurs="0"/>
 *         &lt;element name="WorkPerformances" type="{http://www.mesa.org/xml/B2MML}WorkPerformancesType" minOccurs="0"/>
 *         &lt;element name="WorkSchedules" type="{http://www.mesa.org/xml/B2MML}WorkSchedulesType" minOccurs="0"/>
 *         &lt;element name="BatchProductionRecord" type="{http://www.mesa.org/xml/B2MML}BatchProductionRecordType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}BatchProductionRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchProductionRecordType", propOrder = {
        "id",
        "entryID",
        "objectType",
        "timeStamp",
        "externalReference",
        "description",
        "equipmentScope",
        "publishedDate",
        "creationDate",
        "batchID",
        "batchProductionRecordSpec",
        "campaignID",
        "changeIndication",
        "delimiter",
        "equipmentID",
        "expirationDate",
        "language",
        "lastChangedDate",
        "lotID",
        "materialDefinitionID",
        "physicalAssetID",
        "recordStatus",
        "version",
        "changeHistory",
        "comments",
        "controlRecipes",
        "dataSets",
        "events",
        "masterRecipes",
        "personnelIdentification",
        "operationsDefinitions",
        "operationsPerformances",
        "operationsSchedules",
        "recipeElements",
        "resourceQualifications",
        "samples",
        "workDirectives",
        "workMasters",
        "workPerformances",
        "workSchedules",
        "batchProductionRecord"
})
public class BatchProductionRecordType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
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
    @XmlElement(name = "EquipmentScope")
    protected IdentifierType equipmentScope;
    @XmlElement(name = "PublishedDate")
    protected DateTimeType publishedDate;
    @XmlElement(name = "CreationDate")
    protected DateTimeType creationDate;
    @XmlElement(name = "BatchID")
    protected IdentifierType batchID;
    @XmlElement(name = "BatchProductionRecordSpec")
    protected IdentifierType batchProductionRecordSpec;
    @XmlElement(name = "CampaignID")
    protected IdentifierType campaignID;
    @XmlElement(name = "ChangeIndication")
    protected String changeIndication;
    @XmlElement(name = "Delimiter")
    protected TextType delimiter;
    @XmlElement(name = "EquipmentID")
    protected IdentifierType equipmentID;
    @XmlElement(name = "ExpirationDate")
    protected DateTimeType expirationDate;
    @XmlElement(name = "Language")
    protected CodeType language;
    @XmlElement(name = "LastChangedDate")
    protected DateTimeType lastChangedDate;
    @XmlElement(name = "LotID")
    protected IdentifierType lotID;
    @XmlElement(name = "MaterialDefinitionID")
    protected IdentifierType materialDefinitionID;
    @XmlElement(name = "PhysicalAssetID")
    protected IdentifierType physicalAssetID;
    @XmlElement(name = "RecordStatus")
    protected CodeType recordStatus;
    @XmlElement(name = "Version")
    protected IdentifierType version;
    @XmlElement(name = "ChangeHistory")
    protected ChangeHistoryType changeHistory;
    @XmlElement(name = "Comments")
    protected CommentsType comments;
    @XmlElement(name = "ControlRecipes")
    protected ControlRecipesType controlRecipes;
    @XmlElement(name = "DataSets")
    protected DataSetsType dataSets;
    @XmlElement(name = "Events")
    protected EventsType events;
    @XmlElement(name = "MasterRecipes")
    protected MasterRecipesType masterRecipes;
    @XmlElement(name = "PersonnelIdentification")
    protected PersonnelIdentificationType personnelIdentification;
    @XmlElement(name = "OperationsDefinitions")
    protected OperationsDefinitionsType operationsDefinitions;
    @XmlElement(name = "OperationsPerformances")
    protected OperationsPerformancesType operationsPerformances;
    @XmlElement(name = "OperationsSchedules")
    protected OperationsSchedulesType operationsSchedules;
    @XmlElement(name = "RecipeElements")
    protected RecipeElementsType recipeElements;
    @XmlElement(name = "ResourceQualifications")
    protected ResourceQualificationsType resourceQualifications;
    @XmlElement(name = "Samples")
    protected SamplesType samples;
    @XmlElement(name = "WorkDirectives")
    protected WorkDirectivesType workDirectives;
    @XmlElement(name = "WorkMasters")
    protected WorkMastersType workMasters;
    @XmlElement(name = "WorkPerformances")
    protected WorkPerformancesType workPerformances;
    @XmlElement(name = "WorkSchedules")
    protected WorkSchedulesType workSchedules;
    @XmlElement(name = "BatchProductionRecord")
    protected BatchProductionRecordType batchProductionRecord;

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
     * 获取equipmentScope属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getEquipmentScope() {
        return equipmentScope;
    }

    /**
     * 设置equipmentScope属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setEquipmentScope(IdentifierType value) {
        this.equipmentScope = value;
    }

    /**
     * 获取publishedDate属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getPublishedDate() {
        return publishedDate;
    }

    /**
     * 设置publishedDate属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setPublishedDate(DateTimeType value) {
        this.publishedDate = value;
    }

    /**
     * 获取creationDate属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getCreationDate() {
        return creationDate;
    }

    /**
     * 设置creationDate属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setCreationDate(DateTimeType value) {
        this.creationDate = value;
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
     * 获取batchProductionRecordSpec属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getBatchProductionRecordSpec() {
        return batchProductionRecordSpec;
    }

    /**
     * 设置batchProductionRecordSpec属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setBatchProductionRecordSpec(IdentifierType value) {
        this.batchProductionRecordSpec = value;
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
     * 获取changeIndication属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getChangeIndication() {
        return changeIndication;
    }

    /**
     * 设置changeIndication属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChangeIndication(String value) {
        this.changeIndication = value;
    }

    /**
     * 获取delimiter属性的值。
     *
     * @return possible object is
     * {@link TextType }
     */
    public TextType getDelimiter() {
        return delimiter;
    }

    /**
     * 设置delimiter属性的值。
     *
     * @param value allowed object is
     *              {@link TextType }
     */
    public void setDelimiter(TextType value) {
        this.delimiter = value;
    }

    /**
     * 获取equipmentID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getEquipmentID() {
        return equipmentID;
    }

    /**
     * 设置equipmentID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setEquipmentID(IdentifierType value) {
        this.equipmentID = value;
    }

    /**
     * 获取expirationDate属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getExpirationDate() {
        return expirationDate;
    }

    /**
     * 设置expirationDate属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setExpirationDate(DateTimeType value) {
        this.expirationDate = value;
    }

    /**
     * 获取language属性的值。
     *
     * @return possible object is
     * {@link CodeType }
     */
    public CodeType getLanguage() {
        return language;
    }

    /**
     * 设置language属性的值。
     *
     * @param value allowed object is
     *              {@link CodeType }
     */
    public void setLanguage(CodeType value) {
        this.language = value;
    }

    /**
     * 获取lastChangedDate属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getLastChangedDate() {
        return lastChangedDate;
    }

    /**
     * 设置lastChangedDate属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setLastChangedDate(DateTimeType value) {
        this.lastChangedDate = value;
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
     * 获取materialDefinitionID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getMaterialDefinitionID() {
        return materialDefinitionID;
    }

    /**
     * 设置materialDefinitionID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setMaterialDefinitionID(IdentifierType value) {
        this.materialDefinitionID = value;
    }

    /**
     * 获取physicalAssetID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getPhysicalAssetID() {
        return physicalAssetID;
    }

    /**
     * 设置physicalAssetID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setPhysicalAssetID(IdentifierType value) {
        this.physicalAssetID = value;
    }

    /**
     * 获取recordStatus属性的值。
     *
     * @return possible object is
     * {@link CodeType }
     */
    public CodeType getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置recordStatus属性的值。
     *
     * @param value allowed object is
     *              {@link CodeType }
     */
    public void setRecordStatus(CodeType value) {
        this.recordStatus = value;
    }

    /**
     * 获取version属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setVersion(IdentifierType value) {
        this.version = value;
    }

    /**
     * 获取changeHistory属性的值。
     *
     * @return possible object is
     * {@link ChangeHistoryType }
     */
    public ChangeHistoryType getChangeHistory() {
        return changeHistory;
    }

    /**
     * 设置changeHistory属性的值。
     *
     * @param value allowed object is
     *              {@link ChangeHistoryType }
     */
    public void setChangeHistory(ChangeHistoryType value) {
        this.changeHistory = value;
    }

    /**
     * 获取comments属性的值。
     *
     * @return possible object is
     * {@link CommentsType }
     */
    public CommentsType getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     *
     * @param value allowed object is
     *              {@link CommentsType }
     */
    public void setComments(CommentsType value) {
        this.comments = value;
    }

    /**
     * 获取controlRecipes属性的值。
     *
     * @return possible object is
     * {@link ControlRecipesType }
     */
    public ControlRecipesType getControlRecipes() {
        return controlRecipes;
    }

    /**
     * 设置controlRecipes属性的值。
     *
     * @param value allowed object is
     *              {@link ControlRecipesType }
     */
    public void setControlRecipes(ControlRecipesType value) {
        this.controlRecipes = value;
    }

    /**
     * 获取dataSets属性的值。
     *
     * @return possible object is
     * {@link DataSetsType }
     */
    public DataSetsType getDataSets() {
        return dataSets;
    }

    /**
     * 设置dataSets属性的值。
     *
     * @param value allowed object is
     *              {@link DataSetsType }
     */
    public void setDataSets(DataSetsType value) {
        this.dataSets = value;
    }

    /**
     * 获取events属性的值。
     *
     * @return possible object is
     * {@link EventsType }
     */
    public EventsType getEvents() {
        return events;
    }

    /**
     * 设置events属性的值。
     *
     * @param value allowed object is
     *              {@link EventsType }
     */
    public void setEvents(EventsType value) {
        this.events = value;
    }

    /**
     * 获取masterRecipes属性的值。
     *
     * @return possible object is
     * {@link MasterRecipesType }
     */
    public MasterRecipesType getMasterRecipes() {
        return masterRecipes;
    }

    /**
     * 设置masterRecipes属性的值。
     *
     * @param value allowed object is
     *              {@link MasterRecipesType }
     */
    public void setMasterRecipes(MasterRecipesType value) {
        this.masterRecipes = value;
    }

    /**
     * 获取personnelIdentification属性的值。
     *
     * @return possible object is
     * {@link PersonnelIdentificationType }
     */
    public PersonnelIdentificationType getPersonnelIdentification() {
        return personnelIdentification;
    }

    /**
     * 设置personnelIdentification属性的值。
     *
     * @param value allowed object is
     *              {@link PersonnelIdentificationType }
     */
    public void setPersonnelIdentification(PersonnelIdentificationType value) {
        this.personnelIdentification = value;
    }

    /**
     * 获取operationsDefinitions属性的值。
     *
     * @return possible object is
     * {@link OperationsDefinitionsType }
     */
    public OperationsDefinitionsType getOperationsDefinitions() {
        return operationsDefinitions;
    }

    /**
     * 设置operationsDefinitions属性的值。
     *
     * @param value allowed object is
     *              {@link OperationsDefinitionsType }
     */
    public void setOperationsDefinitions(OperationsDefinitionsType value) {
        this.operationsDefinitions = value;
    }

    /**
     * 获取operationsPerformances属性的值。
     *
     * @return possible object is
     * {@link OperationsPerformancesType }
     */
    public OperationsPerformancesType getOperationsPerformances() {
        return operationsPerformances;
    }

    /**
     * 设置operationsPerformances属性的值。
     *
     * @param value allowed object is
     *              {@link OperationsPerformancesType }
     */
    public void setOperationsPerformances(OperationsPerformancesType value) {
        this.operationsPerformances = value;
    }

    /**
     * 获取operationsSchedules属性的值。
     *
     * @return possible object is
     * {@link OperationsSchedulesType }
     */
    public OperationsSchedulesType getOperationsSchedules() {
        return operationsSchedules;
    }

    /**
     * 设置operationsSchedules属性的值。
     *
     * @param value allowed object is
     *              {@link OperationsSchedulesType }
     */
    public void setOperationsSchedules(OperationsSchedulesType value) {
        this.operationsSchedules = value;
    }

    /**
     * 获取recipeElements属性的值。
     *
     * @return possible object is
     * {@link RecipeElementsType }
     */
    public RecipeElementsType getRecipeElements() {
        return recipeElements;
    }

    /**
     * 设置recipeElements属性的值。
     *
     * @param value allowed object is
     *              {@link RecipeElementsType }
     */
    public void setRecipeElements(RecipeElementsType value) {
        this.recipeElements = value;
    }

    /**
     * 获取resourceQualifications属性的值。
     *
     * @return possible object is
     * {@link ResourceQualificationsType }
     */
    public ResourceQualificationsType getResourceQualifications() {
        return resourceQualifications;
    }

    /**
     * 设置resourceQualifications属性的值。
     *
     * @param value allowed object is
     *              {@link ResourceQualificationsType }
     */
    public void setResourceQualifications(ResourceQualificationsType value) {
        this.resourceQualifications = value;
    }

    /**
     * 获取samples属性的值。
     *
     * @return possible object is
     * {@link SamplesType }
     */
    public SamplesType getSamples() {
        return samples;
    }

    /**
     * 设置samples属性的值。
     *
     * @param value allowed object is
     *              {@link SamplesType }
     */
    public void setSamples(SamplesType value) {
        this.samples = value;
    }

    /**
     * 获取workDirectives属性的值。
     *
     * @return possible object is
     * {@link WorkDirectivesType }
     */
    public WorkDirectivesType getWorkDirectives() {
        return workDirectives;
    }

    /**
     * 设置workDirectives属性的值。
     *
     * @param value allowed object is
     *              {@link WorkDirectivesType }
     */
    public void setWorkDirectives(WorkDirectivesType value) {
        this.workDirectives = value;
    }

    /**
     * 获取workMasters属性的值。
     *
     * @return possible object is
     * {@link WorkMastersType }
     */
    public WorkMastersType getWorkMasters() {
        return workMasters;
    }

    /**
     * 设置workMasters属性的值。
     *
     * @param value allowed object is
     *              {@link WorkMastersType }
     */
    public void setWorkMasters(WorkMastersType value) {
        this.workMasters = value;
    }

    /**
     * 获取workPerformances属性的值。
     *
     * @return possible object is
     * {@link WorkPerformancesType }
     */
    public WorkPerformancesType getWorkPerformances() {
        return workPerformances;
    }

    /**
     * 设置workPerformances属性的值。
     *
     * @param value allowed object is
     *              {@link WorkPerformancesType }
     */
    public void setWorkPerformances(WorkPerformancesType value) {
        this.workPerformances = value;
    }

    /**
     * 获取workSchedules属性的值。
     *
     * @return possible object is
     * {@link WorkSchedulesType }
     */
    public WorkSchedulesType getWorkSchedules() {
        return workSchedules;
    }

    /**
     * 设置workSchedules属性的值。
     *
     * @param value allowed object is
     *              {@link WorkSchedulesType }
     */
    public void setWorkSchedules(WorkSchedulesType value) {
        this.workSchedules = value;
    }

    /**
     * 获取batchProductionRecord属性的值。
     *
     * @return possible object is
     * {@link BatchProductionRecordType }
     */
    public BatchProductionRecordType getBatchProductionRecord() {
        return batchProductionRecord;
    }

    /**
     * 设置batchProductionRecord属性的值。
     *
     * @param value allowed object is
     *              {@link BatchProductionRecordType }
     */
    public void setBatchProductionRecord(BatchProductionRecordType value) {
        this.batchProductionRecord = value;
    }

}
