//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:49:07 PM CST 
//


package isa95.aps.interfaces.b2mml.workalert;

import isa95.aps.interfaces.b2mml.common.TransApplicationAreaType;
import isa95.aps.interfaces.b2mml.common.TransRespondType;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>RespondWorkAlertType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="RespondWorkAlertType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationArea" type="{http://www.mesa.org/xml/B2MML}TransApplicationAreaType"/>
 *         &lt;element name="DataArea">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Respond" type="{http://www.mesa.org/xml/B2MML}TransRespondType"/>
 *                   &lt;element name="WorkAlert" type="{http://www.mesa.org/xml/B2MML}WorkAlertType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="releaseID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="versionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespondWorkAlertType", propOrder = {
        "applicationArea",
        "dataArea"
})
public class RespondWorkAlertType {

    @XmlElement(name = "ApplicationArea", required = true)
    protected TransApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected RespondWorkAlertType.DataArea dataArea;
    @XmlAttribute(name = "releaseID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String releaseID;
    @XmlAttribute(name = "versionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String versionID;

    /**
     * 获取applicationArea属性的值。
     *
     * @return possible object is
     * {@link TransApplicationAreaType }
     */
    public TransApplicationAreaType getApplicationArea() {
        return applicationArea;
    }

    /**
     * 设置applicationArea属性的值。
     *
     * @param value allowed object is
     *              {@link TransApplicationAreaType }
     */
    public void setApplicationArea(TransApplicationAreaType value) {
        this.applicationArea = value;
    }

    /**
     * 获取dataArea属性的值。
     *
     * @return possible object is
     * {@link RespondWorkAlertType.DataArea }
     */
    public RespondWorkAlertType.DataArea getDataArea() {
        return dataArea;
    }

    /**
     * 设置dataArea属性的值。
     *
     * @param value allowed object is
     *              {@link RespondWorkAlertType.DataArea }
     */
    public void setDataArea(RespondWorkAlertType.DataArea value) {
        this.dataArea = value;
    }

    /**
     * 获取releaseID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getReleaseID() {
        return releaseID;
    }

    /**
     * 设置releaseID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReleaseID(String value) {
        this.releaseID = value;
    }

    /**
     * 获取versionID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getVersionID() {
        return versionID;
    }

    /**
     * 设置versionID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVersionID(String value) {
        this.versionID = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Respond" type="{http://www.mesa.org/xml/B2MML}TransRespondType"/>
     *         &lt;element name="WorkAlert" type="{http://www.mesa.org/xml/B2MML}WorkAlertType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "respond",
            "workAlert"
    })
    public static class DataArea {

        @XmlElement(name = "Respond", required = true)
        protected TransRespondType respond;
        @XmlElement(name = "WorkAlert", required = true)
        protected List<WorkAlertType> workAlert;

        /**
         * 获取respond属性的值。
         *
         * @return possible object is
         * {@link TransRespondType }
         */
        public TransRespondType getRespond() {
            return respond;
        }

        /**
         * 设置respond属性的值。
         *
         * @param value allowed object is
         *              {@link TransRespondType }
         */
        public void setRespond(TransRespondType value) {
            this.respond = value;
        }

        /**
         * Gets the value of the workAlert property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workAlert property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorkAlert().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WorkAlertType }
         */
        public List<WorkAlertType> getWorkAlert() {
            if (workAlert == null) {
                workAlert = new ArrayList<WorkAlertType>();
            }
            return this.workAlert;
        }

    }

}
