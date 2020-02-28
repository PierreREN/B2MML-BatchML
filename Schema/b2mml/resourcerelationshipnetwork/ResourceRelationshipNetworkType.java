//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:31:46 PM CST 
//


package isa95.aps.interfaces.b2mml.resourcerelationshipnetwork;

import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ResourceRelationshipNetworkType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ResourceRelationshipNetworkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="RelationshipTypeType" type="{http://www.mesa.org/xml/B2MML}RelationshipTypeType" minOccurs="0"/>
 *         &lt;element name="RelationshipFormType" type="{http://www.mesa.org/xml/B2MML}RelationshipFormType" minOccurs="0"/>
 *         &lt;element name="PublishedDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="NetworkProperty" type="{http://www.mesa.org/xml/B2MML}ResourcePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResourceNetworkConnection" type="{http://www.mesa.org/xml/B2MML}ResourceNetworkConnectionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}ResourceRelationshipNetwork" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceRelationshipNetworkType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "relationshipType",
        "relationshipForm",
        "publishedDate",
        "networkProperty",
        "resourceNetworkConnection"
})
public class ResourceRelationshipNetworkType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "RelationshipTypeType")
    protected RelationshipTypeType relationshipType;
    @XmlElement(name = "RelationshipFormType")
    protected RelationshipFormType relationshipForm;
    @XmlElement(name = "PublishedDate")
    protected DateTimeType publishedDate;
    @XmlElement(name = "NetworkProperty")
    protected List<ResourcePropertyType> networkProperty;
    @XmlElement(name = "ResourceNetworkConnection")
    protected List<ResourceNetworkConnectionType> resourceNetworkConnection;

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
     * 获取relationshipType属性的值。
     *
     * @return possible object is
     * {@link RelationshipTypeType }
     */
    public RelationshipTypeType getRelationshipType() {
        return relationshipType;
    }

    /**
     * 设置relationshipType属性的值。
     *
     * @param value allowed object is
     *              {@link RelationshipTypeType }
     */
    public void setRelationshipType(RelationshipTypeType value) {
        this.relationshipType = value;
    }

    /**
     * 获取relationshipForm属性的值。
     *
     * @return possible object is
     * {@link RelationshipFormType }
     */
    public RelationshipFormType getRelationshipForm() {
        return relationshipForm;
    }

    /**
     * 设置relationshipForm属性的值。
     *
     * @param value allowed object is
     *              {@link RelationshipFormType }
     */
    public void setRelationshipForm(RelationshipFormType value) {
        this.relationshipForm = value;
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
     * Gets the value of the networkProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourcePropertyType }
     */
    public List<ResourcePropertyType> getNetworkProperty() {
        if (networkProperty == null) {
            networkProperty = new ArrayList<ResourcePropertyType>();
        }
        return this.networkProperty;
    }

    /**
     * Gets the value of the resourceNetworkConnection property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceNetworkConnection property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceNetworkConnection().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceNetworkConnectionType }
     */
    public List<ResourceNetworkConnectionType> getResourceNetworkConnection() {
        if (resourceNetworkConnection == null) {
            resourceNetworkConnection = new ArrayList<ResourceNetworkConnectionType>();
        }
        return this.resourceNetworkConnection;
    }

}
