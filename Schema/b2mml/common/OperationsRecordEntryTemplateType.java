//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>OperationsRecordEntryTemplateType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="OperationsRecordEntryTemplateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InformationObject" type="{http://www.mesa.org/xml/B2MML}TextType" minOccurs="0"/>
 *         &lt;element name="InformationObjectID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="EffectiveTimestamp" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="RecordTimestamp" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="InformationObjectType" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}OperationsRecordEntryTemplate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationsRecordEntryTemplateType", propOrder = {
        "id",
        "description",
        "informationObject",
        "informationObjectID",
        "effectiveTimestamp",
        "recordTimestamp",
        "informationObjectType"
})
public class OperationsRecordEntryTemplateType {

    @XmlElement(name = "ID", required = true)
    private IdentifierType id;
    @XmlElement(name = "DescriptionType")
    private List<DescriptionType> description;
    @XmlElement(name = "InformationObject")
    private TextType informationObject;
    @XmlElement(name = "InformationObjectID")
    private IdentifierType informationObjectID;
    @XmlElement(name = "EffectiveTimestamp")
    private DateTimeType effectiveTimestamp;
    @XmlElement(name = "RecordTimestamp")
    private DateTimeType recordTimestamp;
    @XmlElement(name = "InformationObjectType")
    private IdentifierType informationObjectType;

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
     * 获取informationObject属性的值。
     *
     * @return possible object is
     * {@link TextType }
     */
    public TextType getInformationObject() {
        return informationObject;
    }

    /**
     * 设置informationObject属性的值。
     *
     * @param value allowed object is
     *              {@link TextType }
     */
    public void setInformationObject(TextType value) {
        this.informationObject = value;
    }

    /**
     * 获取informationObjectID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getInformationObjectID() {
        return informationObjectID;
    }

    /**
     * 设置informationObjectID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setInformationObjectID(IdentifierType value) {
        this.informationObjectID = value;
    }

    /**
     * 获取effectiveTimestamp属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getEffectiveTimestamp() {
        return effectiveTimestamp;
    }

    /**
     * 设置effectiveTimestamp属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setEffectiveTimestamp(DateTimeType value) {
        this.effectiveTimestamp = value;
    }

    /**
     * 获取recordTimestamp属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getRecordTimestamp() {
        return recordTimestamp;
    }

    /**
     * 设置recordTimestamp属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setRecordTimestamp(DateTimeType value) {
        this.recordTimestamp = value;
    }

    /**
     * 获取informationObjectType属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getInformationObjectType() {
        return informationObjectType;
    }

    /**
     * 设置informationObjectType属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setInformationObjectType(IdentifierType value) {
        this.informationObjectType = value;
    }

}
