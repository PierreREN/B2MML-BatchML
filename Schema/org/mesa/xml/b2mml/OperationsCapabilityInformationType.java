//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OperationsCapabilityInformationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OperationsCapabilityInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="OperationsCapability" type="{http://www.mesa.org/xml/B2MML}OperationsCapabilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationsCapabilityInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsCapabilityInformationType", propOrder = {
    "id",
    "description",
    "hierarchyScope",
    "publishedDate",
    "operationsCapability"
})
public class OperationsCapabilityInformationType {

    @XmlElementRef(name = "ID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentifierType> id;
    @XmlElement(name = "Description", nillable = true)
    protected List<DescriptionType> description;
    @XmlElementRef(name = "HierarchyScope", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<HierarchyScopeType> hierarchyScope;
    @XmlElementRef(name = "PublishedDate", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> publishedDate;
    @XmlElement(name = "OperationsCapability", nillable = true)
    protected List<OperationsCapabilityType> operationsCapability;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     *     
     */
    public JAXBElement<IdentifierType> getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     *     
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
     * 
     * 
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
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HierarchyScopeType }{@code >}
     *     
     */
    public JAXBElement<HierarchyScopeType> getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * 设置hierarchyScope属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HierarchyScopeType }{@code >}
     *     
     */
    public void setHierarchyScope(JAXBElement<HierarchyScopeType> value) {
        this.hierarchyScope = value;
    }

    /**
     * 获取publishedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getPublishedDate() {
        return publishedDate;
    }

    /**
     * 设置publishedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setPublishedDate(JAXBElement<DateTimeType> value) {
        this.publishedDate = value;
    }

    /**
     * Gets the value of the operationsCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsCapabilityType }
     * 
     * 
     */
    public List<OperationsCapabilityType> getOperationsCapability() {
        if (operationsCapability == null) {
            operationsCapability = new ArrayList<OperationsCapabilityType>();
        }
        return this.operationsCapability;
    }

}
