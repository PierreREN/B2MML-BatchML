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
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SegmentDependencyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SegmentDependencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Dependency" type="{http://www.mesa.org/xml/B2MML}DependencyType"/>
 *         &lt;element name="TimingFactor" type="{http://www.mesa.org/xml/B2MML}ValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.mesa.org/xml/B2MML}UnitOfMeasureType" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="ProductSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *           &lt;element name="ProcessSegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *           &lt;element name="SegmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}SegmentDependency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentDependencyType", propOrder = {
    "id",
    "description",
    "dependency",
    "timingFactor",
    "unitOfMeasure",
    "productSegmentIDOrProcessSegmentIDOrSegmentID"
})
public class SegmentDependencyType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Dependency", required = true)
    protected DependencyType dependency;
    @XmlElement(name = "TimingFactor")
    protected List<ValueType> timingFactor;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitOfMeasureType> unitOfMeasure;
    @XmlElementRefs({
        @XmlElementRef(name = "ProductSegmentID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ProcessSegmentID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SegmentID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<IdentifierType>> productSegmentIDOrProcessSegmentIDOrSegmentID;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
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
     * 获取dependency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DependencyType }
     *     
     */
    public DependencyType getDependency() {
        return dependency;
    }

    /**
     * 设置dependency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DependencyType }
     *     
     */
    public void setDependency(DependencyType value) {
        this.dependency = value;
    }

    /**
     * Gets the value of the timingFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timingFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimingFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     * 
     * 
     */
    public List<ValueType> getTimingFactor() {
        if (timingFactor == null) {
            timingFactor = new ArrayList<ValueType>();
        }
        return this.timingFactor;
    }

    /**
     * 获取unitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitOfMeasureType }{@code >}
     *     
     */
    public JAXBElement<UnitOfMeasureType> getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitOfMeasureType }{@code >}
     *     
     */
    public void setUnitOfMeasure(JAXBElement<UnitOfMeasureType> value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the productSegmentIDOrProcessSegmentIDOrSegmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSegmentIDOrProcessSegmentIDOrSegmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSegmentIDOrProcessSegmentIDOrSegmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<IdentifierType>> getProductSegmentIDOrProcessSegmentIDOrSegmentID() {
        if (productSegmentIDOrProcessSegmentIDOrSegmentID == null) {
            productSegmentIDOrProcessSegmentIDOrSegmentID = new ArrayList<JAXBElement<IdentifierType>>();
        }
        return this.productSegmentIDOrProcessSegmentIDOrSegmentID;
    }

}
