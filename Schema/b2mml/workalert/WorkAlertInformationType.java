//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:49:07 PM CST 
//


package isa95.aps.interfaces.b2mml.workalert;

import isa95.aps.interfaces.b2mml.common.DateTimeType;
import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.HierarchyScopeType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkAlertInformationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkAlertInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="WorkAlertDefinition" type="{http://www.mesa.org/xml/B2MML}WorkAlertDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorkAlert" type="{http://www.mesa.org/xml/B2MML}WorkAlertType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}WorkAlertInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkAlertInformationType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "publishedDate",
        "workAlertDefinition",
        "workAlert"
})
public class WorkAlertInformationType {

    @XmlElementRef(name = "ID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentifierType> id;
    @XmlElement(name = "DescriptionType", nillable = true)
    protected List<DescriptionType> description;
    @XmlElementRef(name = "HierarchyScopeType", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<HierarchyScopeType> hierarchyScope;
    @XmlElementRef(name = "PublishedDate", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> publishedDate;
    @XmlElement(name = "WorkAlertDefinition", nillable = true)
    protected List<WorkAlertDefinitionType> workAlertDefinition;
    @XmlElement(name = "WorkAlert", nillable = true)
    protected List<WorkAlertType> workAlert;

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
     * Gets the value of the workAlertDefinition property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workAlertDefinition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkAlertDefinition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkAlertDefinitionType }
     */
    public List<WorkAlertDefinitionType> getWorkAlertDefinition() {
        if (workAlertDefinition == null) {
            workAlertDefinition = new ArrayList<WorkAlertDefinitionType>();
        }
        return this.workAlertDefinition;
    }

    /**
     * Gets the value of the workAlert property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workAlert property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkAlert().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkAlertType }
     */
    public List<WorkAlertType> getWorkAlert() {
        if (workAlert == null) {
            workAlert = new ArrayList<WorkAlertType>();
        }
        return this.workAlert;
    }

}
