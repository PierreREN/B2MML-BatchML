//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.mesa.xml.b2mml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConfirmBODType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ConfirmBODType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationArea" type="{http://www.mesa.org/xml/B2MML}TransApplicationAreaType"/>
 *         &lt;element name="DataArea">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Confirm" type="{http://www.mesa.org/xml/B2MML}TransConfirmType"/>
 *                   &lt;element name="BOD" type="{http://www.mesa.org/xml/B2MML}BODType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmBODType", propOrder = {
    "applicationArea",
    "dataArea"
})
public class ConfirmBODType {

    @XmlElement(name = "ApplicationArea", required = true)
    protected TransApplicationAreaType applicationArea;
    @XmlElement(name = "DataArea", required = true)
    protected ConfirmBODType.DataArea dataArea;

    /**
     * 获取applicationArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransApplicationAreaType }
     *     
     */
    public TransApplicationAreaType getApplicationArea() {
        return applicationArea;
    }

    /**
     * 设置applicationArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransApplicationAreaType }
     *     
     */
    public void setApplicationArea(TransApplicationAreaType value) {
        this.applicationArea = value;
    }

    /**
     * 获取dataArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConfirmBODType.DataArea }
     *     
     */
    public ConfirmBODType.DataArea getDataArea() {
        return dataArea;
    }

    /**
     * 设置dataArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmBODType.DataArea }
     *     
     */
    public void setDataArea(ConfirmBODType.DataArea value) {
        this.dataArea = value;
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
     *         &lt;element name="Confirm" type="{http://www.mesa.org/xml/B2MML}TransConfirmType"/>
     *         &lt;element name="BOD" type="{http://www.mesa.org/xml/B2MML}BODType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "confirm",
        "bod"
    })
    public static class DataArea {

        @XmlElement(name = "Confirm", required = true)
        protected TransConfirmType confirm;
        @XmlElement(name = "BOD", required = true)
        protected List<BODType> bod;

        /**
         * 获取confirm属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TransConfirmType }
         *     
         */
        public TransConfirmType getConfirm() {
            return confirm;
        }

        /**
         * 设置confirm属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TransConfirmType }
         *     
         */
        public void setConfirm(TransConfirmType value) {
            this.confirm = value;
        }

        /**
         * Gets the value of the bod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBOD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BODType }
         * 
         * 
         */
        public List<BODType> getBOD() {
            if (bod == null) {
                bod = new ArrayList<BODType>();
            }
            return this.bod;
        }

    }

}
