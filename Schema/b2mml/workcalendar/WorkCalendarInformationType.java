//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 02:10:04 PM CST 
//


package isa95.aps.interfaces.b2mml.workcalendar;

import isa95.aps.interfaces.b2mml.common.DateTimeType;
import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.HierarchyScopeType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkCalendarInformationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkCalendarInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="WorkCalendar" type="{http://www.mesa.org/xml/B2MML}WorkCalendarType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkCalendarDefinition" type="{http://www.mesa.org/xml/B2MML}WorkCalendarDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}WorkCalendarInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkCalendarInformationType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "publishedDate",
        "workCalendar",
        "workCalendarDefinition"
})
public class WorkCalendarInformationType {

    @XmlElementRef(name = "ID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentifierType> id;
    @XmlElement(name = "DescriptionType", nillable = true)
    protected List<DescriptionType> description;
    @XmlElementRef(name = "HierarchyScopeType", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<HierarchyScopeType> hierarchyScope;
    @XmlElementRef(name = "PublishedDate", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> publishedDate;
    @XmlElement(name = "WorkCalendar", nillable = true)
    protected List<WorkCalendarType> workCalendar;
    @XmlElement(name = "WorkCalendarDefinition", nillable = true)
    protected List<WorkCalendarDefinitionType> workCalendarDefinition;

    /**
     * 获取id属性的值。
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     */
    public JAXBElement<IdentifierType> getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     */
    public void setID(JAXBElement<IdentifierType> value) {
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
     * {@link JAXBElement }{@code <}{@link HierarchyScopeType }{@code >}
     */
    public JAXBElement<HierarchyScopeType> getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * 设置hierarchyScope属性的值。
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link HierarchyScopeType }{@code >}
     */
    public void setHierarchyScope(JAXBElement<HierarchyScopeType> value) {
        this.hierarchyScope = value;
    }

    /**
     * 获取publishedDate属性的值。
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     */
    public JAXBElement<DateTimeType> getPublishedDate() {
        return publishedDate;
    }

    /**
     * 设置publishedDate属性的值。
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     */
    public void setPublishedDate(JAXBElement<DateTimeType> value) {
        this.publishedDate = value;
    }

    /**
     * Gets the value of the workCalendar property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workCalendar property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkCalendar().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkCalendarType }
     */
    public List<WorkCalendarType> getWorkCalendar() {
        if (workCalendar == null) {
            workCalendar = new ArrayList<WorkCalendarType>();
        }
        return this.workCalendar;
    }

    /**
     * Gets the value of the workCalendarDefinition property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workCalendarDefinition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkCalendarDefinition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkCalendarDefinitionType }
     */
    public List<WorkCalendarDefinitionType> getWorkCalendarDefinition() {
        if (workCalendarDefinition == null) {
            workCalendarDefinition = new ArrayList<WorkCalendarDefinitionType>();
        }
        return this.workCalendarDefinition;
    }

}
