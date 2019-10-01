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
 * <p>OperationsDefinitionType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OperationsDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML}VersionType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScope" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="OperationsType" type="{http://www.mesa.org/xml/B2MML}OperationsTypeType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="BillOfMaterialsID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="WorkDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="BillOfResourcesID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="OperationsMaterialBill" type="{http://www.mesa.org/xml/B2MML}OperationsMaterialBillType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationsSegment" type="{http://www.mesa.org/xml/B2MML}OperationsSegmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UsesPropertiesOfOperationsDefinitionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationsDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsDefinitionType", propOrder = {
        "id",
        "version",
        "description",
        "hierarchyScope",
        "operationsType",
        "publishedDate",
        "billOfMaterialsID",
        "workDefinitionID",
        "billOfResourcesID",
        "operationsMaterialBill",
        "operationsSegment",
        "usesPropertiesOfOperationsDefinitionID"
})
public class OperationsDefinitionType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Version")
    protected VersionType version;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScope")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "OperationsType")
    protected OperationsTypeType operationsType;
    @XmlElement(name = "PublishedDate")
    protected DateTimeType publishedDate;
    @XmlElement(name = "BillOfMaterialsID")
    protected IdentifierType billOfMaterialsID;
    @XmlElement(name = "WorkDefinitionID")
    protected IdentifierType workDefinitionID;
    @XmlElement(name = "BillOfResourcesID")
    protected IdentifierType billOfResourcesID;
    @XmlElement(name = "OperationsMaterialBill")
    protected List<OperationsMaterialBillType> operationsMaterialBill;
    @XmlElement(name = "OperationsSegment")
    protected List<OperationsSegmentType> operationsSegment;
    @XmlElement(name = "UsesPropertiesOfOperationsDefinitionID")
    protected List<IdentifierType> usesPropertiesOfOperationsDefinitionID;

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
     * 获取version属性的值。
     *
     * @return possible object is
     * {@link VersionType }
     */
    public VersionType getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     *
     * @param value allowed object is
     *              {@link VersionType }
     */
    public void setVersion(VersionType value) {
        this.version = value;
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
     * 获取operationsType属性的值。
     *
     * @return possible object is
     * {@link OperationsTypeType }
     */
    public OperationsTypeType getOperationsType() {
        return operationsType;
    }

    /**
     * 设置operationsType属性的值。
     *
     * @param value allowed object is
     *              {@link OperationsTypeType }
     */
    public void setOperationsType(OperationsTypeType value) {
        this.operationsType = value;
    }

    /**
     * 获取publishedDate属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getPublishedDate() {
        return publishedDate;
    }

    /**
     * 设置publishedDate属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setPublishedDate(DateTimeType value) {
        this.publishedDate = value;
    }

    /**
     * 获取billOfMaterialsID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getBillOfMaterialsID() {
        return billOfMaterialsID;
    }

    /**
     * 设置billOfMaterialsID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setBillOfMaterialsID(IdentifierType value) {
        this.billOfMaterialsID = value;
    }

    /**
     * 获取workDefinitionID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getWorkDefinitionID() {
        return workDefinitionID;
    }

    /**
     * 设置workDefinitionID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setWorkDefinitionID(IdentifierType value) {
        this.workDefinitionID = value;
    }

    /**
     * 获取billOfResourcesID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getBillOfResourcesID() {
        return billOfResourcesID;
    }

    /**
     * 设置billOfResourcesID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setBillOfResourcesID(IdentifierType value) {
        this.billOfResourcesID = value;
    }

    /**
     * Gets the value of the operationsMaterialBill property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsMaterialBill property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsMaterialBill().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsMaterialBillType }
     */
    public List<OperationsMaterialBillType> getOperationsMaterialBill() {
        if (operationsMaterialBill == null) {
            operationsMaterialBill = new ArrayList<OperationsMaterialBillType>();
        }
        return this.operationsMaterialBill;
    }

    /**
     * Gets the value of the operationsSegment property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationsSegment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationsSegment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationsSegmentType }
     */
    public List<OperationsSegmentType> getOperationsSegment() {
        if (operationsSegment == null) {
            operationsSegment = new ArrayList<OperationsSegmentType>();
        }
        return this.operationsSegment;
    }

    /**
     * Gets the value of the usesPropertiesOfOperationsDefinitionID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usesPropertiesOfOperationsDefinitionID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsesPropertiesOfOperationsDefinitionID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getUsesPropertiesOfOperationsDefinitionID() {
        if (usesPropertiesOfOperationsDefinitionID == null) {
            usesPropertiesOfOperationsDefinitionID = new ArrayList<IdentifierType>();
        }
        return this.usesPropertiesOfOperationsDefinitionID;
    }

}
