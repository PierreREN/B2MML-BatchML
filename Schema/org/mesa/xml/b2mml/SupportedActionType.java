//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>SupportedActionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupportedActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionVerb" type="{http://www.mesa.org/xml/B2MML}TransactionVerbType"/>
 *         &lt;element name="TransactionNoun" type="{http://www.mesa.org/xml/B2MML}TransactionNounType"/>
 *         &lt;element name="InformationUser" type="{http://www.mesa.org/xml/B2MML}IndicatorType" minOccurs="0"/>
 *         &lt;element name="InformationProvider" type="{http://www.mesa.org/xml/B2MML}IndicatorType" minOccurs="0"/>
 *         &lt;element name="InformationSender" type="{http://www.mesa.org/xml/B2MML}IndicatorType" minOccurs="0"/>
 *         &lt;element name="InformationReceiver" type="{http://www.mesa.org/xml/B2MML}IndicatorType" minOccurs="0"/>
 *         &lt;element name="ObjectWildcardSupported" type="{http://www.mesa.org/xml/B2MML}IndicatorType" minOccurs="0"/>
 *         &lt;element name="PropertyWildcardSupported" type="{http://www.mesa.org/xml/B2MML}IndicatorType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}SupportedAction" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="releaseID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="versionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedActionType", propOrder = {
    "id",
    "description",
    "transactionVerb",
    "transactionNoun",
    "informationUser",
    "informationProvider",
    "informationSender",
    "informationReceiver",
    "objectWildcardSupported",
    "propertyWildcardSupported"
})
public class SupportedActionType {

    @XmlElement(name = "ID")
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "TransactionVerb", required = true)
    protected TransactionVerbType transactionVerb;
    @XmlElement(name = "TransactionNoun", required = true)
    protected TransactionNounType transactionNoun;
    @XmlElement(name = "InformationUser")
    protected Boolean informationUser;
    @XmlElement(name = "InformationProvider")
    protected Boolean informationProvider;
    @XmlElement(name = "InformationSender")
    protected Boolean informationSender;
    @XmlElement(name = "InformationReceiver")
    protected Boolean informationReceiver;
    @XmlElement(name = "ObjectWildcardSupported")
    protected Boolean objectWildcardSupported;
    @XmlElement(name = "PropertyWildcardSupported")
    protected Boolean propertyWildcardSupported;
    @XmlAttribute(name = "releaseID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String releaseID;
    @XmlAttribute(name = "versionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String versionID;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
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
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * 获取transactionVerb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionVerbType }
     *     
     */
    public TransactionVerbType getTransactionVerb() {
        return transactionVerb;
    }

    /**
     * 设置transactionVerb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionVerbType }
     *     
     */
    public void setTransactionVerb(TransactionVerbType value) {
        this.transactionVerb = value;
    }

    /**
     * 获取transactionNoun属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionNounType }
     *     
     */
    public TransactionNounType getTransactionNoun() {
        return transactionNoun;
    }

    /**
     * 设置transactionNoun属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionNounType }
     *     
     */
    public void setTransactionNoun(TransactionNounType value) {
        this.transactionNoun = value;
    }

    /**
     * 获取informationUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInformationUser() {
        return informationUser;
    }

    /**
     * 设置informationUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInformationUser(Boolean value) {
        this.informationUser = value;
    }

    /**
     * 获取informationProvider属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInformationProvider() {
        return informationProvider;
    }

    /**
     * 设置informationProvider属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInformationProvider(Boolean value) {
        this.informationProvider = value;
    }

    /**
     * 获取informationSender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInformationSender() {
        return informationSender;
    }

    /**
     * 设置informationSender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInformationSender(Boolean value) {
        this.informationSender = value;
    }

    /**
     * 获取informationReceiver属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInformationReceiver() {
        return informationReceiver;
    }

    /**
     * 设置informationReceiver属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInformationReceiver(Boolean value) {
        this.informationReceiver = value;
    }

    /**
     * 获取objectWildcardSupported属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObjectWildcardSupported() {
        return objectWildcardSupported;
    }

    /**
     * 设置objectWildcardSupported属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObjectWildcardSupported(Boolean value) {
        this.objectWildcardSupported = value;
    }

    /**
     * 获取propertyWildcardSupported属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropertyWildcardSupported() {
        return propertyWildcardSupported;
    }

    /**
     * 设置propertyWildcardSupported属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyWildcardSupported(Boolean value) {
        this.propertyWildcardSupported = value;
    }

    /**
     * 获取releaseID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseID() {
        return releaseID;
    }

    /**
     * 设置releaseID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseID(String value) {
        this.releaseID = value;
    }

    /**
     * 获取versionID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionID() {
        return versionID;
    }

    /**
     * 设置versionID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionID(String value) {
        this.versionID = value;
    }

}
