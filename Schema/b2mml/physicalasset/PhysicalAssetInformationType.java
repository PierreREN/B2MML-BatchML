//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 12:57:50 PM CST 
//


package isa95.aps.interfaces.b2mml.physicalasset;

import isa95.aps.interfaces.b2mml.common.DateTimeType;
import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.HierarchyScopeType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;
import isa95.aps.interfaces.b2mml.testspecification.TestSpecificationType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>PhysicalAssetInformationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="PhysicalAssetInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PhysicalAsset" type="{http://www.mesa.org/xml/B2MML}PhysicalAssetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetClass" type="{http://www.mesa.org/xml/B2MML}PhysicalAssetClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhysicalAssetCapabilityTestSpecification" type="{http://www.mesa.org/xml/B2MML}TestSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}PhysicalAssetInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalAssetInformationType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "publishedDate",
        "physicalAsset",
        "physicalAssetClass",
        "physicalAssetCapabilityTestSpecification"
})
public class PhysicalAssetInformationType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "PublishedDate")
    protected DateTimeType publishedDate;
    @XmlElement(name = "PhysicalAsset")
    protected List<PhysicalAssetType> physicalAsset;
    @XmlElement(name = "PhysicalAssetClass")
    protected List<PhysicalAssetClassType> physicalAssetClass;
    @XmlElement(name = "PhysicalAssetCapabilityTestSpecification")
    protected List<TestSpecificationType> physicalAssetCapabilityTestSpecification;

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
     * Gets the value of the physicalAsset property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAsset property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAsset().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAssetType }
     */
    public List<PhysicalAssetType> getPhysicalAsset() {
        if (physicalAsset == null) {
            physicalAsset = new ArrayList<PhysicalAssetType>();
        }
        return this.physicalAsset;
    }

    /**
     * Gets the value of the physicalAssetClass property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetClass property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetClass().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAssetClassType }
     */
    public List<PhysicalAssetClassType> getPhysicalAssetClass() {
        if (physicalAssetClass == null) {
            physicalAssetClass = new ArrayList<PhysicalAssetClassType>();
        }
        return this.physicalAssetClass;
    }

    /**
     * Gets the value of the physicalAssetCapabilityTestSpecification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAssetCapabilityTestSpecification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAssetCapabilityTestSpecification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationType }
     */
    public List<TestSpecificationType> getPhysicalAssetCapabilityTestSpecification() {
        if (physicalAssetCapabilityTestSpecification == null) {
            physicalAssetCapabilityTestSpecification = new ArrayList<TestSpecificationType>();
        }
        return this.physicalAssetCapabilityTestSpecification;
    }

}
