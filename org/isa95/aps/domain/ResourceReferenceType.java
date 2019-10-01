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
 * <p>ResourceReferenceType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ResourceReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ResourceID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ResourceType" type="{http://www.mesa.org/xml/B2MML}ResourceReferenceTypeType" minOccurs="0"/>
 *         &lt;element name="ResourceProperty" type="{http://www.mesa.org/xml/B2MML}ResourcePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}ResourceReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceReferenceType", propOrder = {
        "id",
        "resourceID",
        "resourceType",
        "resourceProperty"
})
public class ResourceReferenceType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "ResourceID")
    protected IdentifierType resourceID;
    @XmlElement(name = "ResourceType")
    protected ResourceReferenceTypeType resourceType;
    @XmlElement(name = "ResourceProperty")
    protected List<ResourcePropertyType> resourceProperty;

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
     * 获取resourceID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getResourceID() {
        return resourceID;
    }

    /**
     * 设置resourceID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setResourceID(IdentifierType value) {
        this.resourceID = value;
    }

    /**
     * 获取resourceType属性的值。
     *
     * @return possible object is
     * {@link ResourceReferenceTypeType }
     */
    public ResourceReferenceTypeType getResourceType() {
        return resourceType;
    }

    /**
     * 设置resourceType属性的值。
     *
     * @param value allowed object is
     *              {@link ResourceReferenceTypeType }
     */
    public void setResourceType(ResourceReferenceTypeType value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the resourceProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourcePropertyType }
     */
    public List<ResourcePropertyType> getResourceProperty() {
        if (resourceProperty == null) {
            resourceProperty = new ArrayList<ResourcePropertyType>();
        }
        return this.resourceProperty;
    }

}
