//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package isa95.aps.interfaces.b2mml.confirmBOD;

import isa95.aps.domain.entity.common.Text;
import isa95.aps.domain.entity.common.TransApplicationArea;
import isa95.aps.domain.entity.common.TransUserArea;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>BODType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="BODType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalApplicationArea" type="{http://www.mesa.org/xml/B2MML}TransApplicationAreaType" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}FreeFormTextGroup"/>
 *         &lt;element name="UserArea" type="{http://www.mesa.org/xml/B2MML}TransUserAreaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BODType", propOrder = {
        "originalApplicationArea",
        "description",
        "note",
        "userArea"
})
public class BODType {

    @XmlElement(name = "OriginalApplicationArea")
    protected TransApplicationArea originalApplicationArea;
    @XmlElement(name = "DescriptionType")
    protected List<Text> description;
    @XmlElement(name = "Note")
    protected List<Text> note;
    @XmlElement(name = "UserArea")
    protected TransUserArea userArea;

    /**
     * 获取originalApplicationArea属性的值。
     *
     * @return possible object is
     * {@link TransApplicationArea }
     */
    public TransApplicationArea getOriginalApplicationArea() {
        return originalApplicationArea;
    }

    /**
     * 设置originalApplicationArea属性的值。
     *
     * @param value allowed object is
     *              {@link TransApplicationArea }
     */
    public void setOriginalApplicationArea(TransApplicationArea value) {
        this.originalApplicationArea = value;
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
     * {@link Text }
     */
    public List<Text> getDescription() {
        if (description == null) {
            description = new ArrayList<Text>();
        }
        return this.description;
    }

    /**
     * Gets the value of the note property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     */
    public List<Text> getNote() {
        if (note == null) {
            note = new ArrayList<Text>();
        }
        return this.note;
    }

    /**
     * 获取userArea属性的值。
     *
     * @return possible object is
     * {@link TransUserArea }
     */
    public TransUserArea getUserArea() {
        return userArea;
    }

    /**
     * 设置userArea属性的值。
     *
     * @param value allowed object is
     *              {@link TransUserArea }
     */
    public void setUserArea(TransUserArea value) {
        this.userArea = value;
    }

}
