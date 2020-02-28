//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:41:05 PM CST 
//


package isa95.aps.interfaces.b2mml.generalrecipe;

import isa95.aps.interfaces.b2mml.common.TransApplicationAreaType;
import isa95.aps.interfaces.b2mml.common.TransSyncType;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>SyncResourceConstraintLibraryType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="SyncResourceConstraintLibraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationArea" type="{http://www.mesa.org/xml/B2MML}TransApplicationAreaType"/>
 *         &lt;element name="DataArea">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Sync" type="{http://www.mesa.org/xml/B2MML}TransSyncType"/>
 *                   &lt;element name="ResourceConstraintLibrary" type="{http://www.mesa.org/xml/B2MML}ResourceConstraintLibraryType" maxOccurs="unbounded"/>
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
@XmlType(name = "SyncResourceConstraintLibraryType", propOrder = {
        "applicationArea",
        "dataArea"
})
public class SyncResourceConstraintLibraryType {

    @XmlElement(name = "ApplicationArea", required = true)
    protected TransApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected DataArea dataArea;
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
     * {@link DataArea }
     */
    public DataArea getDataArea() {
        return dataArea;
    }

    /**
     * 设置dataArea属性的值。
     *
     * @param value allowed object is
     *              {@link DataArea }
     */
    public void setDataArea(DataArea value) {
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
     *         &lt;element name="Sync" type="{http://www.mesa.org/xml/B2MML}TransSyncType"/>
     *         &lt;element name="ResourceConstraintLibrary" type="{http://www.mesa.org/xml/B2MML}ResourceConstraintLibraryType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "sync",
            "resourceConstraintLibrary"
    })
    public static class DataArea {

        @XmlElement(name = "Sync", required = true)
        protected TransSyncType sync;
        @XmlElement(name = "ResourceConstraintLibrary", required = true)
        protected List<ResourceConstraintLibraryType> resourceConstraintLibrary;

        /**
         * 获取sync属性的值。
         *
         * @return possible object is
         * {@link TransSyncType }
         */
        public TransSyncType getSync() {
            return sync;
        }

        /**
         * 设置sync属性的值。
         *
         * @param value allowed object is
         *              {@link TransSyncType }
         */
        public void setSync(TransSyncType value) {
            this.sync = value;
        }

        /**
         * Gets the value of the resourceConstraintLibrary property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resourceConstraintLibrary property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResourceConstraintLibrary().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResourceConstraintLibraryType }
         */
        public List<ResourceConstraintLibraryType> getResourceConstraintLibrary() {
            if (resourceConstraintLibrary == null) {
                resourceConstraintLibrary = new ArrayList<ResourceConstraintLibraryType>();
            }
            return this.resourceConstraintLibrary;
        }

    }

}
