//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 12:57:50 PM CST 
//


package isa95.aps.interfaces.b2mml.physicalasset;

import isa95.aps.interfaces.b2mml.common.TransApplicationAreaType;
import isa95.aps.interfaces.b2mml.common.TransChangeType;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ChangePhysicalAssetType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ChangePhysicalAssetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationArea" type="{http://www.mesa.org/xml/B2MML}TransApplicationAreaType"/>
 *         &lt;element name="DataArea">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Change" type="{http://www.mesa.org/xml/B2MML}TransChangeType"/>
 *                   &lt;element name="PhysicalAsset" type="{http://www.mesa.org/xml/B2MML}PhysicalAssetType" maxOccurs="unbounded"/>
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
@XmlType(name = "ChangePhysicalAssetType", propOrder = {
        "applicationArea",
        "dataArea"
})
public class ChangePhysicalAssetType {

    @XmlElement(name = "ApplicationArea", required = true)
    protected TransApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected ChangePhysicalAssetType.DataArea dataArea;
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
     * {@link ChangePhysicalAssetType.DataArea }
     */
    public ChangePhysicalAssetType.DataArea getDataArea() {
        return dataArea;
    }

    /**
     * 设置dataArea属性的值。
     *
     * @param value allowed object is
     *              {@link ChangePhysicalAssetType.DataArea }
     */
    public void setDataArea(ChangePhysicalAssetType.DataArea value) {
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
     *         &lt;element name="Change" type="{http://www.mesa.org/xml/B2MML}TransChangeType"/>
     *         &lt;element name="PhysicalAsset" type="{http://www.mesa.org/xml/B2MML}PhysicalAssetType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "change",
            "physicalAsset"
    })
    public static class DataArea {

        @XmlElement(name = "Change", required = true)
        protected TransChangeType change;
        @XmlElement(name = "PhysicalAsset", required = true)
        protected List<PhysicalAssetType> physicalAsset;

        /**
         * 获取change属性的值。
         *
         * @return possible object is
         * {@link TransChangeType }
         */
        public TransChangeType getChange() {
            return change;
        }

        /**
         * 设置change属性的值。
         *
         * @param value allowed object is
         *              {@link TransChangeType }
         */
        public void setChange(TransChangeType value) {
            this.change = value;
        }

        /**
         * Gets the value of the physicalAsset property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the physicalAsset property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhysicalAsset().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PhysicalAssetType }
         */
        public List<PhysicalAssetType> getPhysicalAsset() {
            if (physicalAsset == null) {
                physicalAsset = new ArrayList<PhysicalAssetType>();
            }
            return this.physicalAsset;
        }

    }

}
