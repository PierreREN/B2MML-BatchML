//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:31:46 PM CST 
//


package isa95.aps.interfaces.b2mml.resourcerelationshipnetwork;

import isa95.aps.interfaces.b2mml.common.TransApplicationAreaType;
import isa95.aps.interfaces.b2mml.common.TransProcessType;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ProcessResourceRelationshipNetworkType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ProcessResourceRelationshipNetworkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationArea" type="{http://www.mesa.org/xml/B2MML}TransApplicationAreaType"/>
 *         &lt;element name="DataArea">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Process" type="{http://www.mesa.org/xml/B2MML}TransProcessType"/>
 *                   &lt;element name="ResourceRelationshipNetwork" type="{http://www.mesa.org/xml/B2MML}ResourceRelationshipNetworkType" maxOccurs="unbounded"/>
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
@XmlType(name = "ProcessResourceRelationshipNetworkType", propOrder = {
        "applicationArea",
        "dataArea"
})
public class ProcessResourceRelationshipNetworkType {

    @XmlElement(name = "ApplicationArea", required = true)
    protected TransApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected ProcessResourceRelationshipNetworkType.DataArea dataArea;
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
     * {@link ProcessResourceRelationshipNetworkType.DataArea }
     */
    public ProcessResourceRelationshipNetworkType.DataArea getDataArea() {
        return dataArea;
    }

    /**
     * 设置dataArea属性的值。
     *
     * @param value allowed object is
     *              {@link ProcessResourceRelationshipNetworkType.DataArea }
     */
    public void setDataArea(ProcessResourceRelationshipNetworkType.DataArea value) {
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
     *         &lt;element name="Process" type="{http://www.mesa.org/xml/B2MML}TransProcessType"/>
     *         &lt;element name="ResourceRelationshipNetwork" type="{http://www.mesa.org/xml/B2MML}ResourceRelationshipNetworkType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "process",
            "resourceRelationshipNetwork"
    })
    public static class DataArea {

        @XmlElement(name = "Process", required = true)
        protected TransProcessType process;
        @XmlElement(name = "ResourceRelationshipNetwork", required = true)
        protected List<ResourceRelationshipNetworkType> resourceRelationshipNetwork;

        /**
         * 获取process属性的值。
         *
         * @return possible object is
         * {@link TransProcessType }
         */
        public TransProcessType getProcess() {
            return process;
        }

        /**
         * 设置process属性的值。
         *
         * @param value allowed object is
         *              {@link TransProcessType }
         */
        public void setProcess(TransProcessType value) {
            this.process = value;
        }

        /**
         * Gets the value of the resourceRelationshipNetwork property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resourceRelationshipNetwork property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResourceRelationshipNetwork().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResourceRelationshipNetworkType }
         */
        public List<ResourceRelationshipNetworkType> getResourceRelationshipNetwork() {
            if (resourceRelationshipNetwork == null) {
                resourceRelationshipNetwork = new ArrayList<ResourceRelationshipNetworkType>();
            }
            return this.resourceRelationshipNetwork;
        }

    }

}
