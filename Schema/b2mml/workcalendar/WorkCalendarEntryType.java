//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 02:10:04 PM CST 
//


package isa95.aps.interfaces.b2mml.workcalendar;

import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkCalendarEntryType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkCalendarEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="FinishDateTime" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EntryType" type="{http://www.mesa.org/xml/B2MML}CodeType" minOccurs="0"/>
 *         &lt;element name="WorkCalendarEntry" type="{http://www.mesa.org/xml/B2MML}WorkCalendarEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Property" type="{http://www.mesa.org/xml/B2MML}WorkCalendarPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}WorkCalendarEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkCalendarEntryType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "startDateTimeType",
        "finishDateTimeType",
        "entryType",
        "workCalendarEntry",
        "property"
})
public class WorkCalendarEntryType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "StartDateTime")
    protected DateTimeType startDateTime;
    @XmlElement(name = "FinishDateTime")
    protected DateTimeType finishDateTime;
    @XmlElement(name = "EntryType")
    protected CodeType entryType;
    @XmlElement(name = "WorkCalendarEntry")
    protected List<WorkCalendarEntryType> workCalendarEntry;
    @XmlElement(name = "Property")
    protected List<WorkCalendarPropertyType> property;

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
     * 获取startDateTime属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getStartDateTime() {
        return startDateTime;
    }

    /**
     * 设置startDateTime属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setStartDateTime(DateTimeType value) {
        this.startDateTime = value;
    }

    /**
     * 获取finishDateTime属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getFinishDateTime() {
        return finishDateTime;
    }

    /**
     * 设置finishDateTime属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setFinishDateTime(DateTimeType value) {
        this.finishDateTime = value;
    }

    /**
     * 获取entryType属性的值。
     *
     * @return possible object is
     * {@link CodeType }
     */
    public CodeType getEntryType() {
        return entryType;
    }

    /**
     * 设置entryType属性的值。
     *
     * @param value allowed object is
     *              {@link CodeType }
     */
    public void setEntryType(CodeType value) {
        this.entryType = value;
    }

    /**
     * Gets the value of the workCalendarEntry property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workCalendarEntry property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkCalendarEntry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkCalendarEntryType }
     */
    public List<WorkCalendarEntryType> getWorkCalendarEntry() {
        if (workCalendarEntry == null) {
            workCalendarEntry = new ArrayList<WorkCalendarEntryType>();
        }
        return this.workCalendarEntry;
    }

    /**
     * Gets the value of the property property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkCalendarPropertyType }
     */
    public List<WorkCalendarPropertyType> getProperty() {
        if (property == null) {
            property = new ArrayList<WorkCalendarPropertyType>();
        }
        return this.property;
    }

}
