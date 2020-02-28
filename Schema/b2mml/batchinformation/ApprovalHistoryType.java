//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:35:35 PM CST 
//


package isa95.aps.interfaces.b2mml.batchinformation;

import isa95.aps.interfaces.b2mml.common.DateTimeType;
import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.VersionType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ApprovalHistoryType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ApprovalHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinalApprovalDate" type="{http://www.mesa.org/xml/B2MML}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.mesa.org/xml/B2MML}VersionType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndividualApproval" type="{http://www.mesa.org/xml/B2MML}IndividualApprovalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}ApprovalHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalHistoryType", propOrder = {
        "finalApprovalDate",
        "version",
        "description",
        "individualApproval"
})
public class ApprovalHistoryType {

    @XmlElement(name = "FinalApprovalDate")
    protected DateTimeType finalApprovalDate;
    @XmlElement(name = "Version")
    protected VersionType version;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "IndividualApproval")
    protected List<IndividualApprovalType> individualApproval;

    /**
     * 获取finalApprovalDate属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getFinalApprovalDate() {
        return finalApprovalDate;
    }

    /**
     * 设置finalApprovalDate属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setFinalApprovalDate(DateTimeType value) {
        this.finalApprovalDate = value;
    }

    /**
     * 获取version属性的值。
     *
     * @return possible object is
     * {@link VersionType }
     */
    public VersionType getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     *
     * @param value allowed object is
     *              {@link VersionType }
     */
    public void setVersion(VersionType value) {
        this.version = value;
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
     * {@link DescriptionType }
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the individualApproval property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualApproval property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualApproval().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualApprovalType }
     */
    public List<IndividualApprovalType> getIndividualApproval() {
        if (individualApproval == null) {
            individualApproval = new ArrayList<IndividualApprovalType>();
        }
        return this.individualApproval;
    }

}
