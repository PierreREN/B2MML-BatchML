//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkTagSpecificationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkTagSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TagIndex" type="{http://www.mesa.org/xml/B2MML}NumericType"/>
 *         &lt;element name="DataType" type="{http://www.mesa.org/xml/B2MML}DataTypeType"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.mesa.org/xml/B2MML}UnitOfMeasureType"/>
 *         &lt;element name="DataSource" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProceduralElementReference" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Deadband" type="{http://www.mesa.org/xml/B2MML}ValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SignificantDigits" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataCompression" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SamplingType" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkTagSpecificationType", propOrder = {
        "tagIndex",
        "dataType",
        "unitOfMeasure",
        "dataSource",
        "alias",
        "description",
        "equipmentID",
        "physicalAssetID",
        "proceduralElementReference",
        "deadband",
        "significantDigits",
        "dataCompression",
        "samplingType"
})
public class WorkTagSpecificationType {

    @XmlElement(name = "TagIndex", required = true)
    protected NumericType tagIndex;
    @XmlElement(name = "DataType", required = true, nillable = true)
    protected DataTypeType dataType;
    @XmlElement(name = "UnitOfMeasure", required = true, nillable = true)
    protected UnitOfMeasureType unitOfMeasure;
    @XmlElement(name = "DataSource")
    protected List<IdentifierType> dataSource;
    @XmlElement(name = "Alias")
    protected List<IdentifierType> alias;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "EquipmentID")
    protected List<IdentifierType> equipmentID;
    @XmlElement(name = "PhysicalAssetID")
    protected List<IdentifierType> physicalAssetID;
    @XmlElement(name = "ProceduralElementReference")
    protected List<IdentifierType> proceduralElementReference;
    @XmlElement(name = "Deadband")
    protected List<ValueType> deadband;
    @XmlElement(name = "SignificantDigits")
    protected List<IdentifierType> significantDigits;
    @XmlElement(name = "DataCompression")
    protected List<IdentifierType> dataCompression;
    @XmlElement(name = "SamplingType")
    protected List<IdentifierType> samplingType;

    /**
     * 获取tagIndex属性的值。
     *
     * @return possible object is
     * {@link NumericType }
     */
    public NumericType getTagIndex() {
        return tagIndex;
    }

    /**
     * 设置tagIndex属性的值。
     *
     * @param value allowed object is
     *              {@link NumericType }
     */
    public void setTagIndex(NumericType value) {
        this.tagIndex = value;
    }

    /**
     * 获取dataType属性的值。
     *
     * @return possible object is
     * {@link DataTypeType }
     */
    public DataTypeType getDataType() {
        return dataType;
    }

    /**
     * 设置dataType属性的值。
     *
     * @param value allowed object is
     *              {@link DataTypeType }
     */
    public void setDataType(DataTypeType value) {
        this.dataType = value;
    }

    /**
     * 获取unitOfMeasure属性的值。
     *
     * @return possible object is
     * {@link UnitOfMeasureType }
     */
    public UnitOfMeasureType getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     *
     * @param value allowed object is
     *              {@link UnitOfMeasureType }
     */
    public void setUnitOfMeasure(UnitOfMeasureType value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the dataSource property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSource property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSource().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getDataSource() {
        if (dataSource == null) {
            dataSource = new ArrayList<IdentifierType>();
        }
        return this.dataSource;
    }

    /**
     * Gets the value of the alias property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getAlias() {
        if (alias == null) {
            alias = new ArrayList<IdentifierType>();
        }
        return this.alias;
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
     * Gets the value of the deadband property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deadband property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeadband().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     */
    public List<ValueType> getDeadband() {
        if (deadband == null) {
            deadband = new ArrayList<ValueType>();
        }
        return this.deadband;
    }

    /**
     * Gets the value of the significantDigits property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the significantDigits property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignificantDigits().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getSignificantDigits() {
        if (significantDigits == null) {
            significantDigits = new ArrayList<IdentifierType>();
        }
        return this.significantDigits;
    }

    /**
     * Gets the value of the dataCompression property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataCompression property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataCompression().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getDataCompression() {
        if (dataCompression == null) {
            dataCompression = new ArrayList<IdentifierType>();
        }
        return this.dataCompression;
    }

    /**
     * Gets the value of the samplingType property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the samplingType property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSamplingType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getSamplingType() {
        if (samplingType == null) {
            samplingType = new ArrayList<IdentifierType>();
        }
        return this.samplingType;
    }

}
