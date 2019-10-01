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
 * <p>LinkType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="LinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="FromID" type="{http://www.mesa.org/xml/B2MML}FromIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ToID" type="{http://www.mesa.org/xml/B2MML}ToIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LinkType" type="{http://www.mesa.org/xml/B2MML}LinkTypeType"/>
 *         &lt;element name="Depiction" type="{http://www.mesa.org/xml/B2MML}DepictionType"/>
 *         &lt;element name="EvaluationOrder" type="{http://www.mesa.org/xml/B2MML}EvaluationOrderType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}Link" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkType", propOrder = {
        "id",
        "fromID",
        "toID",
        "linkType",
        "depiction",
        "evaluationOrder",
        "description"
})
public class LinkType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "FromID")
    protected List<FromIDType> fromID;
    @XmlElement(name = "ToID")
    protected List<ToIDType> toID;
    @XmlElement(name = "LinkType", required = true)
    protected LinkTypeType linkType;
    @XmlElement(name = "Depiction", required = true)
    protected DepictionType depiction;
    @XmlElement(name = "EvaluationOrder")
    protected EvaluationOrderType evaluationOrder;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;

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
     * Gets the value of the fromID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FromIDType }
     */
    public List<FromIDType> getFromID() {
        if (fromID == null) {
            fromID = new ArrayList<FromIDType>();
        }
        return this.fromID;
    }

    /**
     * Gets the value of the toID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToIDType }
     */
    public List<ToIDType> getToID() {
        if (toID == null) {
            toID = new ArrayList<ToIDType>();
        }
        return this.toID;
    }

    /**
     * 获取linkType属性的值。
     *
     * @return possible object is
     * {@link LinkTypeType }
     */
    public LinkTypeType getLinkType() {
        return linkType;
    }

    /**
     * 设置linkType属性的值。
     *
     * @param value allowed object is
     *              {@link LinkTypeType }
     */
    public void setLinkType(LinkTypeType value) {
        this.linkType = value;
    }

    /**
     * 获取depiction属性的值。
     *
     * @return possible object is
     * {@link DepictionType }
     */
    public DepictionType getDepiction() {
        return depiction;
    }

    /**
     * 设置depiction属性的值。
     *
     * @param value allowed object is
     *              {@link DepictionType }
     */
    public void setDepiction(DepictionType value) {
        this.depiction = value;
    }

    /**
     * 获取evaluationOrder属性的值。
     *
     * @return possible object is
     * {@link EvaluationOrderType }
     */
    public EvaluationOrderType getEvaluationOrder() {
        return evaluationOrder;
    }

    /**
     * 设置evaluationOrder属性的值。
     *
     * @param value allowed object is
     *              {@link EvaluationOrderType }
     */
    public void setEvaluationOrder(EvaluationOrderType value) {
        this.evaluationOrder = value;
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

}
