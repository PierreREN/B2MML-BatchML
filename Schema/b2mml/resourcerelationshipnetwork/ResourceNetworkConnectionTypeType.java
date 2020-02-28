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
 * <p>ResourceNetworkConnectionTypeType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ResourceNetworkConnectionTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResourceNetworkConnectionID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ConnectionProperty" type="{http://www.mesa.org/xml/B2MML}ResourcePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}ResourceNetworkConnectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceNetworkConnectionTypeType", propOrder = {
        "id",
        "description",
        "resourceNetworkConnectionID",
        "connectionProperty"
})
public class ResourceNetworkConnectionTypeType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "ResourceNetworkConnectionID")
    protected IdentifierType resourceNetworkConnectionID;
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
