//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResourceLocationTypeType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ResourceLocationTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location" type="{http://www.mesa.org/xml/B2MML}TextType"/>
 *         &lt;element name="LocationType" type="{http://www.mesa.org/xml/B2MML}ResourceLocationTypeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceLocationTypeType", propOrder = {
        "location",
        "locationType"
})
@Embeddable
public class ResourceLocationType {

    @XmlElement(name = "Location", required = true)
    private TextType location;
    @XmlElement(name = "LocationType", required = true)
    private ResourceLocationTypeType locationType;

    /**
     * 获取location属性的值。
     *
     * @return possible object is
     * {@link TextType }
     */
    public TextType getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     *
     * @param value allowed object is
     *              {@link TextType }
     */
    public void setLocation(TextType value) {
        this.location = value;
    }

    /**
     * 获取locationType属性的值。
     *
     * @return possible object is
     * {@link ResourceLocationTypeType }
     */
    public ResourceLocationTypeType getLocationType() {
        return locationType;
    }

    /**
     * 设置locationType属性的值。
     *
     * @param value allowed object is
     *              {@link ResourceLocationTypeType }
     */
    public void setLocationType(ResourceLocationTypeType value) {
        this.locationType = value;
    }

}
