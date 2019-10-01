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
 * <p>WorkRecordType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}WorkRecordEntryType"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="WorkRecordSpec" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ChangeIndication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Delimiter" type="{http://www.mesa.org/xml/B2MML}TextType" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="LastChangedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="RecordStatus" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="CampaignID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LotID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BatchID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaterialDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChangeHistory" type="{http://www.mesa.org/xml/B2MML}WorkChangeHistoryType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.mesa.org/xml/B2MML}WorkCommentsType" minOccurs="0"/>
 *         &lt;element name="DataSets" type="{http://www.mesa.org/xml/B2MML}WorkDataSetsType" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://www.mesa.org/xml/B2MML}WorkEventsType" minOccurs="0"/>
 *         &lt;element name="PersonnelIdentification" type="{http://www.mesa.org/xml/B2MML}WorkPersonnelIdentificationType" minOccurs="0"/>
 *         &lt;element name="OperationsDefinitions" type="{http://www.mesa.org/xml/B2MML}WWorkOperationsDefinitionsType" minOccurs="0"/>
 *         &lt;element name="OperationsPerformances" type="{http://www.mesa.org/xml/B2MML}WWorkOperationsPerformancesType" minOccurs="0"/>
 *         &lt;element name="OperationsSchedules" type="{http://www.mesa.org/xml/B2MML}WWorkOperationsSchedulesType" minOccurs="0"/>
 *         &lt;element name="ResourceQualifications" type="{http://www.mesa.org/xml/B2MML}WorkResourceQualificationsType" minOccurs="0"/>
 *         &lt;element name="Samples" type="{http://www.mesa.org/xml/B2MML}WorkSamplesType" minOccurs="0"/>
 *         &lt;element name="WorkAlerts" type="{http://www.mesa.org/xml/B2MML}WWorkAlertsType" minOccurs="0"/>
 *         &lt;element name="WorkCalendars" type="{http://www.mesa.org/xml/B2MML}WWorkCalendarsType" minOccurs="0"/>
 *         &lt;element name="WorkDirectives" type="{http://www.mesa.org/xml/B2MML}WWorkDirectivesType" minOccurs="0"/>
 *         &lt;element name="WorkMasters" type="{http://www.mesa.org/xml/B2MML}WWorkMastersType" minOccurs="0"/>
 *         &lt;element name="WorkPerformances" type="{http://www.mesa.org/xml/B2MML}WWorkPerformancesType" minOccurs="0"/>
 *         &lt;element name="WorkSchedules" type="{http://www.mesa.org/xml/B2MML}WWorkSchedulesType" minOccurs="0"/>
 *         &lt;element name="BatchProductionRecord" type="{http://www.mesa.org/xml/B2MML}BatchProductionRecordType" minOccurs="0"/>
 *         &lt;element name="WorkRecord" type="{http://www.mesa.org/xml/B2MML}WorkRecordType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}WorkRecord" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkRecordType", propOrder = {
        "id",
        "entryID",
        "objectType",
        "timeStamp",
        "externalReference",
        "description",
        "hierarchyScope",
        "publishedDate",
        "creationDate",
        "workRecordSpec",
        "changeIndication",
        "delimiter",
        "language",
        "lastChangedDate",
        "expirationDate",
        "recordStatus",
        "version",
        "campaignID",
        "lotID",
        "batchID",
        "materialDefinitionID",
        "equipmentID",
        "changeHistory",
        "comments",
        "dataSets",
        "events",
        "personnelIdentification",
        "operationsDefinitions",
        "operationsPerformances",
        "operationsSchedules",
        "resourceQualifications",
        "samples",
        "workAlerts",
        "workCalendars",
        "workDirectives",
        "workMasters",
        "workPerformances",
        "workSchedules",
        "batchProductionRecord",
        "workRecord"
})
public class WorkRecordType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "EntryID", required = true)
    protected IdentifierType entryID;
    @XmlElement(name = "ObjectType", required = true)
    protected WorkRecordObjectTypeType objectType;
    @XmlElement(name = "TimeStamp")
    protected DateTimeType timeStamp;
    @XmlElement(name = "ExternalReference")
    protected IdentifierType externalReference;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "PublishedDate")
    protected DateTimeType publishedDate;
    @XmlElement(name = "CreationDate")
    protected DateTimeType creationDate;
    @XmlElement(name = "WorkRecordSpec")
    protected IdentifierType workRecordSpec;
    @XmlElement(name = "ChangeIndication")
    protected String changeIndication;
    @XmlElement(name = "Delimiter")
    protected TextType delimiter;
    @XmlElement(name = "Language")
    protected CodeType language;
    @XmlElement(name = "LastChangedDate")
    protected DateTimeType lastChangedDate;
    @XmlElement(name = "ExpirationDate")
    protected DateTimeType expirationDate;
    @XmlElement(name = "RecordStatus")
    protected CodeType recordStatus;
    @XmlElement(name = "Version")
    protected IdentifierType version;
    @XmlElement(name = "CampaignID")
    protected List<IdentifierType> campaignID;
    @XmlElement(name = "LotID")
    protected List<IdentifierType> lotID;
    @XmlElement(name = "BatchID")
    protected List<IdentifierType> batchID;
    @XmlElement(name = "MaterialDefinitionID")
    protected List<IdentifierType> materialDefinitionID;
    @XmlElement(name = "EquipmentID")
    protected List<IdentifierType> equipmentID;
    @XmlElement(name = "ChangeHistory")
    protected WorkChangeHistoryType changeHistory;
    @XmlElement(name = "Comments")
    protected WorkCommentsType comments;
    @XmlElement(name = "DataSets")
    protected WorkDataSetsType dataSets;
    @XmlElement(name = "Events")
    protected WorkEventsType events;
    @XmlElement(name = "PersonnelIdentification")
    protected WorkPersonnelIdentificationType personnelIdentification;
    @XmlElement(name = "OperationsDefinitions")
    protected WWorkOperationsDefinitionsType operationsDefinitions;
    @XmlElement(name = "OperationsPerformances")
    protected WWorkOperationsPerformancesType operationsPerformances;
    @XmlElement(name = "OperationsSchedules")
    protected WWorkOperationsSchedulesType operationsSchedules;
    @XmlElement(name = "ResourceQualifications")
    protected WorkResourceQualificationsType resourceQualifications;
    @XmlElement(name = "Samples")
    protected WorkSamplesType samples;
    @XmlElement(name = "WorkAlerts")
    protected WWorkAlertsType workAlerts;
    @XmlElement(name = "WorkCalendars")
    protected WWorkCalendarsType workCalendars;
    @XmlElement(name = "WorkDirectives")
    protected WWorkDirectivesType workDirectives;
    @XmlElement(name = "WorkMasters")
    protected WWorkMastersType workMasters;
    @XmlElement(name = "WorkPerformances")
    protected WWorkPerformancesType workPerformances;
    @XmlElement(name = "WorkSchedules")
    protected WWorkSchedulesType workSchedules;
    @XmlElement(name = "BatchProductionRecord")
    protected BatchProductionRecordType batchProductionRecord;
    @XmlElement(name = "WorkRecord")
    protected WorkRecordType workRecord;

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
     * {@link WorkRecordObjectTypeType }
     */
    public WorkRecordObjectTypeType getObjectType() {
        return objectType;
    }

    /**
     * 设置objectType属性的值。
     *
     * @param value allowed object is
     *              {@link WorkRecordObjectTypeType }
     */
    public void setObjectType(WorkRecordObjectTypeType value) {
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
     * 获取hierarchyScope属性的值。
     *
     * @return possible object is
     * {@link HierarchyScopeType }
     */
    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * 设置hierarchyScope属性的值。
     *
     * @param value allowed object is
     *              {@link HierarchyScopeType }
     */
    public void setHierarchyScope(HierarchyScopeType value) {
        this.hierarchyScope = value;
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
     * 获取workRecordSpec属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getWorkRecordSpec() {
        return workRecordSpec;
    }

    /**
     * 设置workRecordSpec属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setWorkRecordSpec(IdentifierType value) {
        this.workRecordSpec = value;
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
     * Gets the value of the campaignID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getCampaignID() {
        if (campaignID == null) {
            campaignID = new ArrayList<IdentifierType>();
        }
        return this.campaignID;
    }

    /**
     * Gets the value of the lotID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getLotID() {
        if (lotID == null) {
            lotID = new ArrayList<IdentifierType>();
        }
        return this.lotID;
    }

    /**
     * Gets the value of the batchID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getBatchID() {
        if (batchID == null) {
            batchID = new ArrayList<IdentifierType>();
        }
        return this.batchID;
    }

    /**
     * Gets the value of the materialDefinitionID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialDefinitionID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialDefinitionID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getMaterialDefinitionID() {
        if (materialDefinitionID == null) {
            materialDefinitionID = new ArrayList<IdentifierType>();
        }
        return this.materialDefinitionID;
    }

    /**
     * Gets the value of the equipmentID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getEquipmentID() {
        if (equipmentID == null) {
            equipmentID = new ArrayList<IdentifierType>();
        }
        return this.equipmentID;
    }

    /**
     * 获取changeHistory属性的值。
     *
     * @return possible object is
     * {@link WorkChangeHistoryType }
     */
    public WorkChangeHistoryType getChangeHistory() {
        return changeHistory;
    }

    /**
     * 设置changeHistory属性的值。
     *
     * @param value allowed object is
     *              {@link WorkChangeHistoryType }
     */
    public void setChangeHistory(WorkChangeHistoryType value) {
        this.changeHistory = value;
    }

    /**
     * 获取comments属性的值。
     *
     * @return possible object is
     * {@link WorkCommentsType }
     */
    public WorkCommentsType getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     *
     * @param value allowed object is
     *              {@link WorkCommentsType }
     */
    public void setComments(WorkCommentsType value) {
        this.comments = value;
    }

    /**
     * 获取dataSets属性的值。
     *
     * @return possible object is
     * {@link WorkDataSetsType }
     */
    public WorkDataSetsType getDataSets() {
        return dataSets;
    }

    /**
     * 设置dataSets属性的值。
     *
     * @param value allowed object is
     *              {@link WorkDataSetsType }
     */
    public void setDataSets(WorkDataSetsType value) {
        this.dataSets = value;
    }

    /**
     * 获取events属性的值。
     *
     * @return possible object is
     * {@link WorkEventsType }
     */
    public WorkEventsType getEvents() {
        return events;
    }

    /**
     * 设置events属性的值。
     *
     * @param value allowed object is
     *              {@link WorkEventsType }
     */
    public void setEvents(WorkEventsType value) {
        this.events = value;
    }

    /**
     * 获取personnelIdentification属性的值。
     *
     * @return possible object is
     * {@link WorkPersonnelIdentificationType }
     */
    public WorkPersonnelIdentificationType getPersonnelIdentification() {
        return personnelIdentification;
    }

    /**
     * 设置personnelIdentification属性的值。
     *
     * @param value allowed object is
     *              {@link WorkPersonnelIdentificationType }
     */
    public void setPersonnelIdentification(WorkPersonnelIdentificationType value) {
        this.personnelIdentification = value;
    }

    /**
     * 获取operationsDefinitions属性的值。
     *
     * @return possible object is
     * {@link WWorkOperationsDefinitionsType }
     */
    public WWorkOperationsDefinitionsType getOperationsDefinitions() {
        return operationsDefinitions;
    }

    /**
     * 设置operationsDefinitions属性的值。
     *
     * @param value allowed object is
     *              {@link WWorkOperationsDefinitionsType }
     */
    public void setOperationsDefinitions(WWorkOperationsDefinitionsType value) {
        this.operationsDefinitions = value;
    }

    /**
     * 获取operationsPerformances属性的值。
     *
     * @return possible object is
     * {@link WWorkOperationsPerformancesType }
     */
    public WWorkOperationsPerformancesType getOperationsPerformances() {
        return operationsPerformances;
    }

    /**
     * 设置operationsPerformances属性的值。
     *
     * @param value allowed object is
     *              {@link WWorkOperationsPerformancesType }
     */
    public void setOperationsPerformances(WWorkOperationsPerformancesType value) {
        this.operationsPerformances = value;
    }

    /**
     * 获取operationsSchedules属性的值。
     *
     * @return possible object is
     * {@link WWorkOperationsSchedulesType }
     */
    public WWorkOperationsSchedulesType getOperationsSchedules() {
        return operationsSchedules;
    }

    /**
     * 设置operationsSchedules属性的值。
     *
     * @param value allowed object is
     *              {@link WWorkOperationsSchedulesType }
     */
    public void setOperationsSchedules(WWorkOperationsSchedulesType value) {
        this.operationsSchedules = value;
    }

    /**
     * 获取resourceQualifications属性的值。
     *
     * @return possible object is
     * {@link WorkResourceQualificationsType }
     */
    public WorkResourceQualificationsType getResourceQualifications() {
        return resourceQualifications;
    }

    /**
     * 设置resourceQualifications属性的值。
     *
     * @param value allowed object is
     *              {@link WorkResourceQualificationsType }
     */
    public void setResourceQualifications(WorkResourceQualificationsType value) {
        this.resourceQualifications = value;
    }

    /**
     * 获取samples属性的值。
     *
     * @return possible object is
     * {@link WorkSamplesType }
     */
    public WorkSamplesType getSamples() {
        return samples;
    }

    /**
     * 设置samples属性的值。
     *
     * @param value allowed object is
     *              {@link WorkSamplesType }
     */
    public void setSamples(WorkSamplesType value) {
        this.samples = value;
    }

    /**
     * 获取workAlerts属性的值。
     *
     * @return possible object is
     * {@link WWorkAlertsType }
     */
    public WWorkAlertsType getWorkAlerts() {
        return workAlerts;
    }

    /**
     * 设置workAlerts属性的值。
     *
     * @param value allowed object is
     *              {@link WWorkAlertsType }
     */
    public void setWorkAlerts(WWorkAlertsType value) {
        this.workAlerts = value;
    }

    /**
     * 获取workCalendars属性的值。
     *
     * @return possible object is
     * {@link WWorkCalendarsType }
     */
    public WWorkCalendarsType getWorkCalendars() {
        return workCalendars;
    }

    /**
     * 设置workCalendars属性的值。
     *
     * @param value allowed object is
     *              {@link WWorkCalendarsType }
     */
    public void setWorkCalendars(WWorkCalendarsType value) {
        this.workCalendars = value;
    }

    /**
     * 获取workDirectives属性的值。
     *
     * @return possible object is
     * {@link WWorkDirectivesType }
     */
    public WWorkDirectivesType getWorkDirectives() {
        return workDirectives;
    }

    /**
     * 设置workDirectives属性的值。
     *
     * @param value allowed object is
     *              {@link WWorkDirectivesType }
     */
    public void setWorkDirectives(WWorkDirectivesType value) {
        this.workDirectives = value;
    }

    /**
     * 获取workMasters属性的值。
     *
     * @return possible object is
     * {@link WWorkMastersType }
     */
    public WWorkMastersType getWorkMasters() {
        return workMasters;
    }

    /**
     * 设置workMasters属性的值。
     *
     * @param value allowed object is
     *              {@link WWorkMastersType }
     */
    public void setWorkMasters(WWorkMastersType value) {
        this.workMasters = value;
    }

    /**
     * 获取workPerformances属性的值。
     *
     * @return possible object is
     * {@link WWorkPerformancesType }
     */
    public WWorkPerformancesType getWorkPerformances() {
        return workPerformances;
    }

    /**
     * 设置workPerformances属性的值。
     *
     * @param value allowed object is
     *              {@link WWorkPerformancesType }
     */
    public void setWorkPerformances(WWorkPerformancesType value) {
        this.workPerformances = value;
    }

    /**
     * 获取workSchedules属性的值。
     *
     * @return possible object is
     * {@link WWorkSchedulesType }
     */
    public WWorkSchedulesType getWorkSchedules() {
        return workSchedules;
    }

    /**
     * 设置workSchedules属性的值。
     *
     * @param value allowed object is
     *              {@link WWorkSchedulesType }
     */
    public void setWorkSchedules(WWorkSchedulesType value) {
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

    /**
     * 获取workRecord属性的值。
     *
     * @return possible object is
     * {@link WorkRecordType }
     */
    public WorkRecordType getWorkRecord() {
        return workRecord;
    }

    /**
     * 设置workRecord属性的值。
     *
     * @param value allowed object is
     *              {@link WorkRecordType }
     */
    public void setWorkRecord(WorkRecordType value) {
        this.workRecord = value;
    }

}
