//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package isa95.aps.interfaces.b2mml.masterdataprofile;

import isa95.aps.domain.entity.common.DateTime;
import isa95.aps.domain.entity.common.Identifier;
import isa95.aps.domain.entity.common.Text;
import isa95.aps.domain.entity.common.Version;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>MasterDataProfileHeaderType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="MasterDataProfileHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="VersionType" type="{http://www.mesa.org/xml/B2MML}VersionType"/>
 *         &lt;element name="Name" type="{http://www.mesa.org/xml/B2MML}TextType"/>
 *         &lt;element name="Scope" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Abbreviation" type="{http://www.mesa.org/xml/B2MML}TextType" minOccurs="0"/>
 *         &lt;element name="ReleaseDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="URILocation" type="{http://www.mesa.org/xml/B2MML}TextType" minOccurs="0"/>
 *         &lt;element name="OwningAuthority" type="{http://www.mesa.org/xml/B2MML}TextType" minOccurs="0"/>
 *         &lt;element name="ContactInformation" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Keyword" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NormativeReference" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Terms" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterDataProfileHeaderType", propOrder = {
        "id",
        "version",
        "name",
        "scope",
        "abbreviation",
        "releaseDate",
        "uriLocation",
        "owningAuthority",
        "contactInformation",
        "keyword",
        "normativeReference",
        "terms"
})
public class MasterDataProfileHeaderType {

    @XmlElement(name = "ID", required = true)
    protected Identifier id;
    @XmlElement(name = "VersionType", required = true)
    protected Version version;
    @XmlElement(name = "Name", required = true)
    protected Text name;
    @XmlElement(name = "Scope")
    protected List<Text> scope;
    @XmlElement(name = "Abbreviation")
    protected Text abbreviation;
    @XmlElement(name = "ReleaseDate")
    protected DateTime releaseDate;
    @XmlElement(name = "URILocation")
    protected Text uriLocation;
    @XmlElement(name = "OwningAuthority")
    protected Text owningAuthority;
    @XmlElement(name = "ContactInformation")
    protected List<Text> contactInformation;
    @XmlElement(name = "Keyword")
    protected List<Text> keyword;
    @XmlElement(name = "NormativeReference")
    protected List<Text> normativeReference;
    @XmlElement(name = "Terms")
    protected List<Text> terms;

    /**
     * 获取id属性的值。
     *
     * @return possible object is
     * {@link Identifier }
     */
    public Identifier getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     *
     * @param value allowed object is
     *              {@link Identifier }
     */
    public void setID(Identifier value) {
        this.id = value;
    }

    /**
     * 获取version属性的值。
     *
     * @return possible object is
     * {@link Version }
     */
    public Version getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     *
     * @param value allowed object is
     *              {@link Version }
     */
    public void setVersion(Version value) {
        this.version = value;
    }

    /**
     * 获取name属性的值。
     *
     * @return possible object is
     * {@link Text }
     */
    public Text getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     *
     * @param value allowed object is
     *              {@link Text }
     */
    public void setName(Text value) {
        this.name = value;
    }

    /**
     * Gets the value of the scope property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     */
    public List<Text> getScope() {
        if (scope == null) {
            scope = new ArrayList<Text>();
        }
        return this.scope;
    }

    /**
     * 获取abbreviation属性的值。
     *
     * @return possible object is
     * {@link Text }
     */
    public Text getAbbreviation() {
        return abbreviation;
    }

    /**
     * 设置abbreviation属性的值。
     *
     * @param value allowed object is
     *              {@link Text }
     */
    public void setAbbreviation(Text value) {
        this.abbreviation = value;
    }

    /**
     * 获取releaseDate属性的值。
     *
     * @return possible object is
     * {@link DateTime }
     */
    public DateTime getReleaseDate() {
        return releaseDate;
    }

    /**
     * 设置releaseDate属性的值。
     *
     * @param value allowed object is
     *              {@link DateTime }
     */
    public void setReleaseDate(DateTime value) {
        this.releaseDate = value;
    }

    /**
     * 获取uriLocation属性的值。
     *
     * @return possible object is
     * {@link Text }
     */
    public Text getURILocation() {
        return uriLocation;
    }

    /**
     * 设置uriLocation属性的值。
     *
     * @param value allowed object is
     *              {@link Text }
     */
    public void setURILocation(Text value) {
        this.uriLocation = value;
    }

    /**
     * 获取owningAuthority属性的值。
     *
     * @return possible object is
     * {@link Text }
     */
    public Text getOwningAuthority() {
        return owningAuthority;
    }

    /**
     * 设置owningAuthority属性的值。
     *
     * @param value allowed object is
     *              {@link Text }
     */
    public void setOwningAuthority(Text value) {
        this.owningAuthority = value;
    }

    /**
     * Gets the value of the contactInformation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     */
    public List<Text> getContactInformation() {
        if (contactInformation == null) {
            contactInformation = new ArrayList<Text>();
        }
        return this.contactInformation;
    }

    /**
     * Gets the value of the keyword property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     */
    public List<Text> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<Text>();
        }
        return this.keyword;
    }

    /**
     * Gets the value of the normativeReference property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normativeReference property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormativeReference().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     */
    public List<Text> getNormativeReference() {
        if (normativeReference == null) {
            normativeReference = new ArrayList<Text>();
        }
        return this.normativeReference;
    }

    /**
     * Gets the value of the terms property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terms property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerms().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     */
    public List<Text> getTerms() {
        if (terms == null) {
            terms = new ArrayList<Text>();
        }
        return this.terms;
    }

}
