//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>AnyGenericValueType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="AnyGenericValueType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="currencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="currencyCodeListVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="encodingCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="characterSetCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="listID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="listAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="listAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="listName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="languageLocaleID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="listSchemaURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="mimeCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemaID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="schemaName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemaAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="schemaAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemaVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="schemaDataURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="schemaURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="unitCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="unitCodeListID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="unitCodeListAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="unitCodeListAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitCodeListVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="filename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyGenericValueType", propOrder = {
        "value"
})
@XmlSeeAlso({
        ValueStringType.class,
        QuantityStringType.class
})
@Embeddable
@MappedSuperclass
public class AnyGenericValueType {

    @XmlValue
    private String value;
    @XmlAttribute(name = "currencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String currencyID;
    @XmlAttribute(name = "currencyCodeListVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String currencyCodeListVersionID;
    @XmlAttribute(name = "encodingCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String encodingCode;
    @XmlAttribute(name = "format")
    @Transient
    private String format;
    @XmlAttribute(name = "characterSetCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String characterSetCode;
    @XmlAttribute(name = "listID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String listID;
    @XmlAttribute(name = "listAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String listAgencyID;
    @XmlAttribute(name = "listAgencyName")
    @Transient
    private String listAgencyName;
    @XmlAttribute(name = "listName")
    @Transient
    private String listName;
    @XmlAttribute(name = "listVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String listVersionID;
    @XmlAttribute(name = "languageID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    @Transient
    private String languageID;
    @XmlAttribute(name = "languageLocaleID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String languageLocaleID;
    @XmlAttribute(name = "listURI")
    @XmlSchemaType(name = "anyURI")
    @Transient
    private String listURI;
    @XmlAttribute(name = "listSchemaURI")
    @XmlSchemaType(name = "anyURI")
    @Transient
    private String listSchemaURI;
    @XmlAttribute(name = "mimeCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String mimeCode;
    @XmlAttribute(name = "name")
    @Transient
    private String name;
    @XmlAttribute(name = "schemaID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String schemaID;
    @XmlAttribute(name = "schemaName")
    @Transient
    private String schemaName;
    @XmlAttribute(name = "schemaAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String schemaAgencyID;
    @XmlAttribute(name = "schemaAgencyName")
    @Transient
    private String schemaAgencyName;
    @XmlAttribute(name = "schemaVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String schemaVersionID;
    @XmlAttribute(name = "schemaDataURI")
    @XmlSchemaType(name = "anyURI")
    @Transient
    private String schemaDataURI;
    @XmlAttribute(name = "schemaURI")
    @XmlSchemaType(name = "anyURI")
    @Transient
    private String schemaURI;
    @XmlAttribute(name = "unitCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String unitCode;
    @XmlAttribute(name = "unitCodeListID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String unitCodeListID;
    @XmlAttribute(name = "unitCodeListAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String unitCodeListAgencyID;
    @XmlAttribute(name = "unitCodeListAgencyName")
    @Transient
    private String unitCodeListAgencyName;
    @XmlAttribute(name = "unitCodeListVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String unitCodeListVersionID;
    @XmlAttribute(name = "filename")
    @Transient
    private String filename;
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    @Transient
    private String uri;

    /**
     * 获取value属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取currencyID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrencyID() {
        return currencyID;
    }

    /**
     * 设置currencyID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrencyID(String value) {
        this.currencyID = value;
    }

    /**
     * 获取currencyCodeListVersionID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrencyCodeListVersionID() {
        return currencyCodeListVersionID;
    }

    /**
     * 设置currencyCodeListVersionID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrencyCodeListVersionID(String value) {
        this.currencyCodeListVersionID = value;
    }

    /**
     * 获取encodingCode属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getEncodingCode() {
        return encodingCode;
    }

    /**
     * 设置encodingCode属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEncodingCode(String value) {
        this.encodingCode = value;
    }

    /**
     * 获取format属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * 获取characterSetCode属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getCharacterSetCode() {
        return characterSetCode;
    }

    /**
     * 设置characterSetCode属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCharacterSetCode(String value) {
        this.characterSetCode = value;
    }

    /**
     * 获取listID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListID() {
        return listID;
    }

    /**
     * 设置listID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * 获取listAgencyID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListAgencyID() {
        return listAgencyID;
    }

    /**
     * 设置listAgencyID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListAgencyID(String value) {
        this.listAgencyID = value;
    }

    /**
     * 获取listAgencyName属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListAgencyName() {
        return listAgencyName;
    }

    /**
     * 设置listAgencyName属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListAgencyName(String value) {
        this.listAgencyName = value;
    }

    /**
     * 获取listName属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListName() {
        return listName;
    }

    /**
     * 设置listName属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * 获取listVersionID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListVersionID() {
        return listVersionID;
    }

    /**
     * 设置listVersionID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListVersionID(String value) {
        this.listVersionID = value;
    }

    /**
     * 获取languageID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * 设置languageID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

    /**
     * 获取languageLocaleID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguageLocaleID() {
        return languageLocaleID;
    }

    /**
     * 设置languageLocaleID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguageLocaleID(String value) {
        this.languageLocaleID = value;
    }

    /**
     * 获取listURI属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListURI() {
        return listURI;
    }

    /**
     * 设置listURI属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListURI(String value) {
        this.listURI = value;
    }

    /**
     * 获取listSchemaURI属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListSchemaURI() {
        return listSchemaURI;
    }

    /**
     * 设置listSchemaURI属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListSchemaURI(String value) {
        this.listSchemaURI = value;
    }

    /**
     * 获取mimeCode属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getMimeCode() {
        return mimeCode;
    }

    /**
     * 设置mimeCode属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMimeCode(String value) {
        this.mimeCode = value;
    }

    /**
     * 获取name属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取schemaID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemaID() {
        return schemaID;
    }

    /**
     * 设置schemaID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemaID(String value) {
        this.schemaID = value;
    }

    /**
     * 获取schemaName属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * 设置schemaName属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemaName(String value) {
        this.schemaName = value;
    }

    /**
     * 获取schemaAgencyID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemaAgencyID() {
        return schemaAgencyID;
    }

    /**
     * 设置schemaAgencyID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemaAgencyID(String value) {
        this.schemaAgencyID = value;
    }

    /**
     * 获取schemaAgencyName属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemaAgencyName() {
        return schemaAgencyName;
    }

    /**
     * 设置schemaAgencyName属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemaAgencyName(String value) {
        this.schemaAgencyName = value;
    }

    /**
     * 获取schemaVersionID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemaVersionID() {
        return schemaVersionID;
    }

    /**
     * 设置schemaVersionID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemaVersionID(String value) {
        this.schemaVersionID = value;
    }

    /**
     * 获取schemaDataURI属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemaDataURI() {
        return schemaDataURI;
    }

    /**
     * 设置schemaDataURI属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemaDataURI(String value) {
        this.schemaDataURI = value;
    }

    /**
     * 获取schemaURI属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemaURI() {
        return schemaURI;
    }

    /**
     * 设置schemaURI属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemaURI(String value) {
        this.schemaURI = value;
    }

    /**
     * 获取unitCode属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * 设置unitCode属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * 获取unitCodeListID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitCodeListID() {
        return unitCodeListID;
    }

    /**
     * 设置unitCodeListID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitCodeListID(String value) {
        this.unitCodeListID = value;
    }

    /**
     * 获取unitCodeListAgencyID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitCodeListAgencyID() {
        return unitCodeListAgencyID;
    }

    /**
     * 设置unitCodeListAgencyID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitCodeListAgencyID(String value) {
        this.unitCodeListAgencyID = value;
    }

    /**
     * 获取unitCodeListAgencyName属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitCodeListAgencyName() {
        return unitCodeListAgencyName;
    }

    /**
     * 设置unitCodeListAgencyName属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitCodeListAgencyName(String value) {
        this.unitCodeListAgencyName = value;
    }

    /**
     * 获取unitCodeListVersionID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getUnitCodeListVersionID() {
        return unitCodeListVersionID;
    }

    /**
     * 设置unitCodeListVersionID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitCodeListVersionID(String value) {
        this.unitCodeListVersionID = value;
    }

    /**
     * 获取filename属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置filename属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * 获取uri属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getUri() {
        return uri;
    }

    /**
     * 设置uri属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUri(String value) {
        this.uri = value;
    }

}
