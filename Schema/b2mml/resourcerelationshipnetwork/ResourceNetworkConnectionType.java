//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:31:46 PM CST 
//


package isa95.aps.interfaces.b2mml.resourcerelationshipnetwork;

import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ResourceNetworkConnectionType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ResourceNetworkConnectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResourceNetworkConnectionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="FromResourceReference" type="{http://www.mesa.org/xml/B2MML}ResourceReferenceTypeType"/>
 *         &lt;element name="ToResourceReference" type="{http://www.mesa.org/xml/B2MML}ResourceReferenceTypeType"/>
 *         &lt;element name="ConnectionProperty" type="{http://www.mesa.org/xml/B2MML}ResourcePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}ResourceNetworkConnection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceNetworkConnectionType", propOrder = {
        "id",
        "description",
        "resourceNetworkConnectionID",
        "fromResourceReference",
        "toResourceReference",
        "connectionProperty"
})
public class ResourceNetworkConnectionType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "ResourceNetworkConnectionID")
    protected IdentifierType resourceNetworkConnectionID;
    @XmlElement(name = "FromResourceReference", required = true)
    protected ResourceReferenceType fromResourceReference;
    @XmlElement(name = "ToResourceReference", required = true)
    protected ResourceReferenceType toResourceReference;
    @XmlElement(name = "ConnectionProperty")
    protected List<ResourcePropertyType> connectionProperty;

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
     * 获取resourceNetworkConnectionID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getResourceNetworkConnectionID() {
        return resourceNetworkConnectionID;
    }

    /**
     * 设置resourceNetworkConnectionID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setResourceNetworkConnectionID(IdentifierType value) {
        this.resourceNetworkConnectionID = value;
    }

    /**
     * 获取fromResourceReference属性的值。
     *
     * @return possible object is
     * {@link ResourceReferenceType }
     */
    public ResourceReferenceType getFromResourceReference() {
        return fromResourceReference;
    }

    /**
     * 设置fromResourceReference属性的值。
     *
     * @param value allowed object is
     *              {@link ResourceReferenceType }
     */
    public void setFromResourceReference(ResourceReferenceType value) {
        this.fromResourceReference = value;
    }

    /**
     * 获取toResourceReference属性的值。
     *
     * @return possible object is
     * {@link ResourceReferenceType }
     */
    public ResourceReferenceType getToResourceReference() {
        return toResourceReference;
    }

    /**
     * 设置toResourceReference属性的值。
     *
     * @param value allowed object is
     *              {@link ResourceReferenceType }
     */
    public void setToResourceReference(ResourceReferenceType value) {
        this.toResourceReference = value;
    }

    /**
     * Gets the value of the connectionProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourcePropertyType }
     */
    public List<ResourcePropertyType> getConnectionProperty() {
        if (connectionProperty == null) {
            connectionProperty = new ArrayList<ResourcePropertyType>();
        }
        return this.connectionProperty;
    }

}
