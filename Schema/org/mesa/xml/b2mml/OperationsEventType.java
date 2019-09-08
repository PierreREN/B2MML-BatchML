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


/**
 * <p>OperationsEventType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OperationsEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="EffectiveTimeStamp" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="RecordTimeStamp" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.mesa.org/xml/B2MML}NumericType" minOccurs="0"/>
 *         &lt;element name="OperationsEventType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="OperationsEventLevel" type="{http://www.mesa.org/xml/B2MML}NumericType" minOccurs="0"/>
 *         &lt;element name="OperationsType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="MOMFunction" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EnterpriseFunction" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Acknowledgement" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="OperationsEvent" type="{http://www.mesa.org/xml/B2MML}OperationsEventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsEventRecord" type="{http://www.mesa.org/xml/B2MML}OperationsRecordEntryTemplateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationsEvent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsEventType", propOrder = {
    "id",
    "description",
    "hierarchyScope",
    "effectiveTimeStamp",
    "recordTimeStamp",
    "priority",
    "operationsEventType",
    "operationsEventLevel",
    "operationsType",
    "momFunction",
    "enterpriseFunction",
    "category",
    "acknowledgement",
    "source",
    "operationsDefinitionID",
    "operationsEvent",
    "operationsEventRecord"
})
public class OperationsEventType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "EffectiveTimeStamp")
    protected DateTimeType effectiveTimeStamp;
    @XmlElement(name = "RecordTimeStamp")
    protected DateTimeType recordTimeStamp;
    @XmlElement(name = "Priority")
    protected NumericType priority;
    @XmlElement(name = "OperationsEventType")
    protected OperationsTypeType operationsEventType;
    @XmlElement(name = "OperationsEventLevel")
    protected NumericType operationsEventLevel;
    @XmlElement(name = "OperationsType")
    protected OperationsTypeType operationsType;
    @XmlElement(name = "MOMFunction")
    protected List<IdentifierType> momFunction;
    @XmlElement(name = "EnterpriseFunction")
    protected List<IdentifierType> enterpriseFunction;
    @XmlElement(name = "Category")
    protected List<IdentifierType> category;
    @XmlElement(name = "Acknowledgement")
    protected List<IdentifierType> acknowledgement;
    @XmlElement(name = "Source")
    protected List<IdentifierType> source;
    @XmlElement(name = "OperationsDefinitionID")
    protected IdentifierType operationsDefinitionID;
    @XmlElement(name = "OperationsEvent")
    protected List<OperationsEventType> operationsEvent;
    @XmlElement(name = "OperationsEventRecord")
    protected List<OperationsRecordEntryTemplateType> operationsEventRecord;

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
     * 获取effectiveTimeStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEffectiveTimeStamp() {
        return effectiveTimeStamp;
    }

    /**
     * 设置effectiveTimeStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEffectiveTimeStamp(DateTimeType value) {
        this.effectiveTimeStamp = value;
    }

    /**
     * 获取recordTimeStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getRecordTimeStamp() {
        return recordTimeStamp;
    }

    /**
     * 设置recordTimeStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setRecordTimeStamp(DateTimeType value) {
        this.recordTimeStamp = value;
    }

    /**
     * 获取priority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setPriority(NumericType value) {
        this.priority = value;
    }

    /**
     * 获取operationsEventType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperationsTypeType }
     *     
     */
    public OperationsTypeType getOperationsEventType() {
        return operationsEventType;
    }

    /**
     * 设置operationsEventType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperationsTypeType }
     *     
     */
    public void setOperationsEventType(OperationsTypeType value) {
        this.operationsEventType = value;
    }

    /**
     * 获取operationsEventLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getOperationsEventLevel() {
        return operationsEventLevel;
    }

    /**
     * 设置operationsEventLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setOperationsEventLevel(NumericType value) {
        this.operationsEventLevel = value;
    }

    /**
     * 获取operationsType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperationsTypeType }
     *     
     */
    public OperationsTypeType getOperationsType() {
        return operationsType;
    }

    /**
     * 设置operationsType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperationsTypeType }
     *     
     */
    public void setOperationsType(OperationsTypeType value) {
        this.operationsType = value;
    }

    /**
     * Gets the value of the momFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the momFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMOMFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getMOMFunction() {
        if (momFunction == null) {
            momFunction = new ArrayList<IdentifierType>();
        }
        return this.momFunction;
    }

    /**
     * Gets the value of the enterpriseFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enterpriseFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnterpriseFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getEnterpriseFunction() {
        if (enterpriseFunction == null) {
            enterpriseFunction = new ArrayList<IdentifierType>();
        }
        return this.enterpriseFunction;
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
     * 
     * 
     */
    public List<IdentifierType> getCategory() {
        if (category == null) {
            category = new ArrayList<IdentifierType>();
        }
        return this.category;
    }

    /**
     * Gets the value of the acknowledgement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acknowledgement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcknowledgement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getAcknowledgement() {
        if (acknowledgement == null) {
            acknowledgement = new ArrayList<IdentifierType>();
        }
        return this.acknowledgement;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getSource() {
        if (source == null) {
            source = new ArrayList<IdentifierType>();
        }
        return this.source;
    }

    /**
     * 获取operationsDefinitionID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getOperationsDefinitionID() {
        return operationsDefinitionID;
    }

    /**
     * 设置operationsDefinitionID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setOperationsDefinitionID(IdentifierType value) {
        this.operationsDefinitionID = value;
    }

    /**
     * Gets the value of the operationsEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsEventType }
     * 
     * 
     */
    public List<OperationsEventType> getOperationsEvent() {
        if (operationsEvent == null) {
            operationsEvent = new ArrayList<OperationsEventType>();
        }
        return this.operationsEvent;
    }

    /**
     * Gets the value of the operationsEventRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsRecordEntryTemplateType }
     * 
     * 
     */
    public List<OperationsRecordEntryTemplateType> getOperationsEventRecord() {
        if (operationsEventRecord == null) {
            operationsEventRecord = new ArrayList<OperationsRecordEntryTemplateType>();
        }
        return this.operationsEventRecord;
    }

}
