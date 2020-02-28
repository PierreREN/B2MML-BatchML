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
 * <p>BinaryObjectType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="BinaryObjectType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mimeCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="encodingCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="characterSetCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="filename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryObjectType", propOrder = {
        "value"
})
public class BinaryObjectType {

    @XmlValue
    private byte[] value;
    @XmlAttribute(name = "format")
    private String format;
    @XmlAttribute(name = "mimeCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    private String mimeCode;
    @XmlAttribute(name = "encodingCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    private String encodingCode;
    @XmlAttribute(name = "characterSetCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    private String characterSetCode;
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    private String uri;
    @XmlAttribute(name = "filename")
    private String filename;

    /**
     * 获取value属性的值。
     *
     * @return possible object is
     * byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
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

}
