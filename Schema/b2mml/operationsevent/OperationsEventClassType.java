//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 02:02:03 PM CST 
//


package isa95.aps.interfaces.b2mml.operationsevent;

import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.HierarchyScopeType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;
import isa95.aps.interfaces.b2mml.common.OperationsRecordSpecTemplateType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>OperationsEventClassType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OperationsEventClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsEventClass" type="{http://www.mesa.org/xml/B2MML}OperationsEventClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UsesPropertiesOfOperationsEventClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsEventClassProperty" type="{http://www.mesa.org/xml/B2MML}OperationsEventClassPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsEventDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecordSpecification" type="{http://www.mesa.org/xml/B2MML}OperationsRecordSpecTemplateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationsEventClass" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsEventClassType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "extension",
        "operationsEventClass",
        "usesPropertiesOfOperationsEventClassID",
        "operationsEventClassProperty",
        "operationsEventDefinitionID",
        "recordSpecification"
})
public class OperationsEventClassType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "Extension")
    protected List<IdentifierType> extension;
    @XmlElement(name = "OperationsEventClass")
    protected List<OperationsEventClassType> operationsEventClass;
    @XmlElement(name = "UsesPropertiesOfOperationsEventClassID")
    protected List<IdentifierType> usesPropertiesOfOperationsEventClassID;
    @XmlElement(name = "OperationsEventClassProperty")
    protected List<OperationsEventClassPropertyType> operationsEventClassProperty;
    @XmlElement(name = "OperationsEventDefinitionID")
    protected List<IdentifierType> operationsEventDefinitionID;
    @XmlElement(name = "RecordSpecification")
    protected List<OperationsRecordSpecTemplateType> recordSpecification;

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
     * Gets the value of the extension property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<IdentifierType>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the operationsEventClass property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventClass property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventClass().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsEventClassType }
     */
    public List<OperationsEventClassType> getOperationsEventClass() {
        if (operationsEventClass == null) {
            operationsEventClass = new ArrayList<OperationsEventClassType>();
        }
        return this.operationsEventClass;
    }

    /**
     * Gets the value of the usesPropertiesOfOperationsEventClassID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usesPropertiesOfOperationsEventClassID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsesPropertiesOfOperationsEventClassID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getUsesPropertiesOfOperationsEventClassID() {
        if (usesPropertiesOfOperationsEventClassID == null) {
            usesPropertiesOfOperationsEventClassID = new ArrayList<IdentifierType>();
        }
        return this.usesPropertiesOfOperationsEventClassID;
    }

    /**
     * Gets the value of the operationsEventClassProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventClassProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventClassProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsEventClassPropertyType }
     */
    public List<OperationsEventClassPropertyType> getOperationsEventClassProperty() {
        if (operationsEventClassProperty == null) {
            operationsEventClassProperty = new ArrayList<OperationsEventClassPropertyType>();
        }
        return this.operationsEventClassProperty;
    }

    /**
     * Gets the value of the operationsEventDefinitionID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsEventDefinitionID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsEventDefinitionID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getOperationsEventDefinitionID() {
        if (operationsEventDefinitionID == null) {
            operationsEventDefinitionID = new ArrayList<IdentifierType>();
        }
        return this.operationsEventDefinitionID;
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
     */
    public List<OperationsRecordSpecTemplateType> getRecordSpecification() {
        if (recordSpecification == null) {
            recordSpecification = new ArrayList<OperationsRecordSpecTemplateType>();
        }
        return this.recordSpecification;
    }

}
