//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:45:07 PM CST 
//


package isa95.aps.interfaces.b2mml.batchproductionrecord;

import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>SingleEventType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="SingleEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}BatchProductionRecordEntryType"/>
 *         &lt;element name="EventType" type="{http://www.mesa.org/xml/B2MML}EventTypeType"/>
 *         &lt;element name="EventSubType" type="{http://www.mesa.org/xml/B2MML}EventSubTypeType"/>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.mesa.org/xml/B2MML}ValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PreviousValue" type="{http://www.mesa.org/xml/B2MML}ValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageText" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonID" type="{http://www.mesa.org/xml/B2MML}NameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ComputerID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProceduralElementReference" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AlarmData" type="{http://www.mesa.org/xml/B2MML}AlarmDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssociatedEventID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserAttribute" type="{http://www.mesa.org/xml/B2MML}UserAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleEventType", propOrder = {
        "entryID",
        "objectType",
        "timeStamp",
        "externalReference",
        "description",
        "eventType",
        "eventSubType",
        "equipmentID",
        "value",
        "previousValue",
        "messageText",
        "personID",
        "computerID",
        "physicalAssetID",
        "proceduralElementReference",
        "category",
        "alarmData",
        "associatedEventID",
        "userAttribute"
})
public class SingleEventType {

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
    @XmlElement(name = "EventType", required = true)
    protected EventTypeType eventType;
    @XmlElement(name = "EventSubType", required = true, nillable = true)
    protected EventSubTypeType eventSubType;
    @XmlElement(name = "EquipmentID")
    protected List<IdentifierType> equipmentID;
    @XmlElement(name = "Value")
    protected List<ValueType> value;
    @XmlElement(name = "PreviousValue")
    protected List<ValueType> previousValue;
    @XmlElement(name = "MessageText")
    protected List<TextType> messageText;
    @XmlElement(name = "PersonID")
    protected List<NameType> personID;
    @XmlElement(name = "ComputerID")
    protected List<IdentifierType> computerID;
    @XmlElement(name = "PhysicalAssetID")
    protected List<IdentifierType> physicalAssetID;
    @XmlElement(name = "ProceduralElementReference")
    protected List<IdentifierType> proceduralElementReference;
    @XmlElement(name = "Category")
    protected List<IdentifierType> category;
    @XmlElement(name = "AlarmData")
    protected List<AlarmDataType> alarmData;
    @XmlElement(name = "AssociatedEventID")
    protected List<IdentifierType> associatedEventID;
    @XmlElement(name = "UserAttribute")
    protected List<UserAttributeType> userAttribute;

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
     * 获取eventType属性的值。
     *
     * @return possible object is
     * {@link EventTypeType }
     */
    public EventTypeType getEventType() {
        return eventType;
    }

    /**
     * 设置eventType属性的值。
     *
     * @param value allowed object is
     *              {@link EventTypeType }
     */
    public void setEventType(EventTypeType value) {
        this.eventType = value;
    }

    /**
     * 获取eventSubType属性的值。
     *
     * @return possible object is
     * {@link EventSubTypeType }
     */
    public EventSubTypeType getEventSubType() {
        return eventSubType;
    }

    /**
     * 设置eventSubType属性的值。
     *
     * @param value allowed object is
     *              {@link EventSubTypeType }
     */
    public void setEventSubType(EventSubTypeType value) {
        this.eventSubType = value;
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
     * Gets the value of the value property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     */
    public List<ValueType> getValue() {
        if (value == null) {
            value = new ArrayList<ValueType>();
        }
        return this.value;
    }

    /**
     * Gets the value of the previousValue property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousValue property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     */
    public List<ValueType> getPreviousValue() {
        if (previousValue == null) {
            previousValue = new ArrayList<ValueType>();
        }
        return this.previousValue;
    }

    /**
     * Gets the value of the messageText property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageText property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageText().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     */
    public List<TextType> getMessageText() {
        if (messageText == null) {
            messageText = new ArrayList<TextType>();
        }
        return this.messageText;
    }

    /**
     * Gets the value of the personID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     */
    public List<NameType> getPersonID() {
        if (personID == null) {
            personID = new ArrayList<NameType>();
        }
        return this.personID;
    }

    /**
     * Gets the value of the computerID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computerID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputerID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getComputerID() {
        if (computerID == null) {
            computerID = new ArrayList<IdentifierType>();
        }
        return this.computerID;
    }

    /**
     * Gets the value of the physicalAssetID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getPhysicalAssetID() {
        if (physicalAssetID == null) {
            physicalAssetID = new ArrayList<IdentifierType>();
        }
        return this.physicalAssetID;
    }

    /**
     * Gets the value of the proceduralElementReference property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proceduralElementReference property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProceduralElementReference().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getProceduralElementReference() {
        if (proceduralElementReference == null) {
            proceduralElementReference = new ArrayList<IdentifierType>();
        }
        return this.proceduralElementReference;
    }

    /**
     * Gets the value of the category property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getCategory() {
        if (category == null) {
            category = new ArrayList<IdentifierType>();
        }
        return this.category;
    }

    /**
     * Gets the value of the alarmData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmDataType }
     */
    public List<AlarmDataType> getAlarmData() {
        if (alarmData == null) {
            alarmData = new ArrayList<AlarmDataType>();
        }
        return this.alarmData;
    }

    /**
     * Gets the value of the associatedEventID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedEventID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedEventID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getAssociatedEventID() {
        if (associatedEventID == null) {
            associatedEventID = new ArrayList<IdentifierType>();
        }
        return this.associatedEventID;
    }

    /**
     * Gets the value of the userAttribute property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAttribute property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserAttribute().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAttributeType }
     */
    public List<UserAttributeType> getUserAttribute() {
        if (userAttribute == null) {
            userAttribute = new ArrayList<UserAttributeType>();
        }
        return this.userAttribute;
    }

}
