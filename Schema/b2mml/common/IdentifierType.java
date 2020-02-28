//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>IdentifierType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="IdentifierType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>normalizedString">
 *       &lt;attribute name="schemeID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="schemeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemeAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="schemeAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemeVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="schemeDataURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", propOrder = {
        "value"
})
@XmlSeeAlso({
        ProductProductionRuleType.class,
        CertificateOfAnalysisReferenceType.class,
        ConfidenceFactorType.class,
        PersonNameType.class,
        VersionType.class,
        StorageHierarchyScopeType.class
})
public class IdentifierType {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    private String value;
    @XmlAttribute(name = "schemeID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    private String schemeID;
    @XmlAttribute(name = "schemeName")
    private String schemeName;
    @XmlAttribute(name = "schemeAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    private String schemeAgencyID;
    @XmlAttribute(name = "schemeAgencyName")
    private String schemeAgencyName;
    @XmlAttribute(name = "schemeVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    private String schemeVersionID;
    @XmlAttribute(name = "schemeDataURI")
    @XmlSchemaType(name = "anyURI")
    private String schemeDataURI;
    @XmlAttribute(name = "schemeURI")
    @XmlSchemaType(name = "anyURI")
    private String schemeURI;

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
     * 获取schemeID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemeID() {
        return schemeID;
    }

    /**
     * 设置schemeID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemeID(String value) {
        this.schemeID = value;
    }

    /**
     * 获取schemeName属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemeName() {
        return schemeName;
    }

    /**
     * 设置schemeName属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemeName(String value) {
        this.schemeName = value;
    }

    /**
     * 获取schemeAgencyID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemeAgencyID() {
        return schemeAgencyID;
    }

    /**
     * 设置schemeAgencyID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemeAgencyID(String value) {
        this.schemeAgencyID = value;
    }

    /**
     * 获取schemeAgencyName属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemeAgencyName() {
        return schemeAgencyName;
    }

    /**
     * 设置schemeAgencyName属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemeAgencyName(String value) {
        this.schemeAgencyName = value;
    }

    /**
     * 获取schemeVersionID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemeVersionID() {
        return schemeVersionID;
    }

    /**
     * 设置schemeVersionID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemeVersionID(String value) {
        this.schemeVersionID = value;
    }

    /**
     * 获取schemeDataURI属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemeDataURI() {
        return schemeDataURI;
    }

    /**
     * 设置schemeDataURI属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemeDataURI(String value) {
        this.schemeDataURI = value;
    }

    /**
     * 获取schemeURI属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getSchemeURI() {
        return schemeURI;
    }

    /**
     * 设置schemeURI属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSchemeURI(String value) {
        this.schemeURI = value;
    }

}
