//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>TestSpecificationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TestSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML}VersionType" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PublishedEndDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="TestSampleSize" type="{http://www.mesa.org/xml/B2MML}ValueType" minOccurs="0"/>
 *         &lt;element name="RecurrenceQuantity" type="{http://www.mesa.org/xml/B2MML}ValueType" minOccurs="0"/>
 *         &lt;element name="RecurrenceTimeInterval" type="{http://www.mesa.org/xml/B2MML}DurationType" minOccurs="0"/>
 *         &lt;element name="PhysicalSampleRequired" type="{http://www.mesa.org/xml/B2MML}IndicatorType" minOccurs="0"/>
 *         &lt;element name="TestSpecification" type="{http://www.mesa.org/xml/B2MML}TestSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestSpecificationProperty" type="{http://www.mesa.org/xml/B2MML}TestSpecificationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestSpecificationCriteria" type="{http://www.mesa.org/xml/B2MML}TestSpecificationCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EvaluatedProperty" type="{http://www.mesa.org/xml/B2MML}TestSpecificationEvaluatedPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}TestSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestSpecificationType", propOrder = {
    "id",
    "description",
    "hierarchyScope",
    "version",
    "effectiveStartDate",
    "effectiveEndDate",
    "publishedEndDate",
    "testSampleSize",
    "recurrenceQuantity",
    "recurrenceTimeInterval",
    "physicalSampleRequired",
    "testSpecification",
    "testSpecificationProperty",
    "testSpecificationCriteria",
    "evaluatedProperty"
})
public class TestSpecificationType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "Version")
    protected VersionType version;
    @XmlElement(name = "EffectiveStartDate")
    protected DateTimeType effectiveStartDate;
    @XmlElement(name = "EffectiveEndDate")
    protected DateTimeType effectiveEndDate;
    @XmlElement(name = "PublishedEndDate")
    protected DateTimeType publishedEndDate;
    @XmlElement(name = "TestSampleSize")
    protected ValueType testSampleSize;
    @XmlElement(name = "RecurrenceQuantity")
    protected ValueType recurrenceQuantity;
    @XmlElement(name = "RecurrenceTimeInterval")
    protected Duration recurrenceTimeInterval;
    @XmlElement(name = "PhysicalSampleRequired")
    protected Boolean physicalSampleRequired;
    @XmlElement(name = "TestSpecification")
    protected List<TestSpecificationType> testSpecification;
    @XmlElement(name = "TestSpecificationProperty")
    protected List<TestSpecificationPropertyType> testSpecificationProperty;
    @XmlElement(name = "TestSpecificationCriteria")
    protected List<TestSpecificationCriteriaType> testSpecificationCriteria;
    @XmlElement(name = "EvaluatedProperty")
    protected List<TestSpecificationEvaluatedPropertyType> evaluatedProperty;

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
     * 获取hierarchyScope属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HierarchyScopeType }
     *     
     */
    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * 设置hierarchyScope属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyScopeType }
     *     
     */
    public void setHierarchyScope(HierarchyScopeType value) {
        this.hierarchyScope = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VersionType }
     *     
     */
    public VersionType getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VersionType }
     *     
     */
    public void setVersion(VersionType value) {
        this.version = value;
    }

    /**
     * 获取effectiveStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * 设置effectiveStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEffectiveStartDate(DateTimeType value) {
        this.effectiveStartDate = value;
    }

    /**
     * 获取effectiveEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * 设置effectiveEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEffectiveEndDate(DateTimeType value) {
        this.effectiveEndDate = value;
    }

    /**
     * 获取publishedEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPublishedEndDate() {
        return publishedEndDate;
    }

    /**
     * 设置publishedEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPublishedEndDate(DateTimeType value) {
        this.publishedEndDate = value;
    }

    /**
     * 获取testSampleSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getTestSampleSize() {
        return testSampleSize;
    }

    /**
     * 设置testSampleSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setTestSampleSize(ValueType value) {
        this.testSampleSize = value;
    }

    /**
     * 获取recurrenceQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getRecurrenceQuantity() {
        return recurrenceQuantity;
    }

    /**
     * 设置recurrenceQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setRecurrenceQuantity(ValueType value) {
        this.recurrenceQuantity = value;
    }

    /**
     * 获取recurrenceTimeInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRecurrenceTimeInterval() {
        return recurrenceTimeInterval;
    }

    /**
     * 设置recurrenceTimeInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRecurrenceTimeInterval(Duration value) {
        this.recurrenceTimeInterval = value;
    }

    /**
     * 获取physicalSampleRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhysicalSampleRequired() {
        return physicalSampleRequired;
    }

    /**
     * 设置physicalSampleRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhysicalSampleRequired(Boolean value) {
        this.physicalSampleRequired = value;
    }

    /**
     * Gets the value of the testSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationType }
     * 
     * 
     */
    public List<TestSpecificationType> getTestSpecification() {
        if (testSpecification == null) {
            testSpecification = new ArrayList<TestSpecificationType>();
        }
        return this.testSpecification;
    }

    /**
     * Gets the value of the testSpecificationProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSpecificationProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSpecificationProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationPropertyType }
     * 
     * 
     */
    public List<TestSpecificationPropertyType> getTestSpecificationProperty() {
        if (testSpecificationProperty == null) {
            testSpecificationProperty = new ArrayList<TestSpecificationPropertyType>();
        }
        return this.testSpecificationProperty;
    }

    /**
     * Gets the value of the testSpecificationCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSpecificationCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSpecificationCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationCriteriaType }
     * 
     * 
     */
    public List<TestSpecificationCriteriaType> getTestSpecificationCriteria() {
        if (testSpecificationCriteria == null) {
            testSpecificationCriteria = new ArrayList<TestSpecificationCriteriaType>();
        }
        return this.testSpecificationCriteria;
    }

    /**
     * Gets the value of the evaluatedProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evaluatedProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvaluatedProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationEvaluatedPropertyType }
     * 
     * 
     */
    public List<TestSpecificationEvaluatedPropertyType> getEvaluatedProperty() {
        if (evaluatedProperty == null) {
            evaluatedProperty = new ArrayList<TestSpecificationEvaluatedPropertyType>();
        }
        return this.evaluatedProperty;
    }

}
