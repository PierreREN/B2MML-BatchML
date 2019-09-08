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
 * <p>OperationsEventDefinitionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OperationsEventDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.mesa.org/xml/B2MML}NumericType" minOccurs="0"/>
 *         &lt;element name="OperationsEventType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="OperationsEventLevel" type="{http://www.mesa.org/xml/B2MML}NumericType" minOccurs="0"/>
 *         &lt;element name="OperationsType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="MOMFunction" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EnterpriseFunction" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Acknowledgement" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsEventDefinition" type="{http://www.mesa.org/xml/B2MML}OperationsEventDefinitionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UsesPropertiesOfOperationsEventDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsEventDefinitionProperty" type="{http://www.mesa.org/xml/B2MML}OperationsEventClassPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsEventClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecordSpecification" type="{http://www.mesa.org/xml/B2MML}OperationsRecordSpecTemplateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationsEventDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsEventDefinitionType", propOrder = {
    "id",
    "description",
    "hierarchyScope",
    "priority",
    "operationsEventType",
    "operationsEventLevel",
    "operationsType",
    "momFunction",
    "enterpriseFunction",
    "category",
    "acknowledgement",
    "source",
    "operationsEventDefinition",
    "usesPropertiesOfOperationsEventDefinitionID",
    "operationsEventDefinitionProperty",
    "operationsEventClassID",
    "recordSpecification"
})
public class OperationsEventDefinitionType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
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
    @XmlElement(name = "OperationsEventDefinition")
    protected List<OperationsEventDefinitionType> operationsEventDefinition;
    @XmlElement(name = "UsesPropertiesOfOperationsEventDefinitionID")
    protected List<IdentifierType> usesPropertiesOfOperationsEventDefinitionID;
    @XmlElement(name = "OperationsEventDefinitionProperty")
    protected List<OperationsEventClassPropertyType> operationsEventDefinitionProperty;
    @XmlElement(name = "OperationsEventClassID")
    protected List<IdentifierType> operationsEventClassID;
    @XmlElement(name = "RecordSpecification")
    protected List<OperationsRecordSpecTemplateType> recordSpecification;

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
     * Gets the value of the operationsEventDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsEventDefinitionType }
     * 
     * 
     */
    public List<OperationsEventDefinitionType> getOperationsEventDefinition() {
        if (operationsEventDefinition == null) {
            operationsEventDefinition = new ArrayList<OperationsEventDefinitionType>();
        }
        return this.operationsEventDefinition;
    }

    /**
     * Gets the value of the usesPropertiesOfOperationsEventDefinitionID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usesPropertiesOfOperationsEventDefinitionID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsesPropertiesOfOperationsEventDefinitionID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getUsesPropertiesOfOperationsEventDefinitionID() {
        if (usesPropertiesOfOperationsEventDefinitionID == null) {
            usesPropertiesOfOperationsEventDefinitionID = new ArrayList<IdentifierType>();
        }
        return this.usesPropertiesOfOperationsEventDefinitionID;
    }

    /**
     * Gets the value of the operationsEventDefinitionProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventDefinitionProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventDefinitionProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsEventClassPropertyType }
     * 
     * 
     */
    public List<OperationsEventClassPropertyType> getOperationsEventDefinitionProperty() {
        if (operationsEventDefinitionProperty == null) {
            operationsEventDefinitionProperty = new ArrayList<OperationsEventClassPropertyType>();
        }
        return this.operationsEventDefinitionProperty;
    }

    /**
     * Gets the value of the operationsEventClassID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventClassID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventClassID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getOperationsEventClassID() {
        if (operationsEventClassID == null) {
            operationsEventClassID = new ArrayList<IdentifierType>();
        }
        return this.operationsEventClassID;
    }

    /**
     * Gets the value of the recordSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsRecordSpecTemplateType }
     * 
     * 
     */
    public List<OperationsRecordSpecTemplateType> getRecordSpecification() {
        if (recordSpecification == null) {
            recordSpecification = new ArrayList<OperationsRecordSpecTemplateType>();
        }
        return this.recordSpecification;
    }

}
