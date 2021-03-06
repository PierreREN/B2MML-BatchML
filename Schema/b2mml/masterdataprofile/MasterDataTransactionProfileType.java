//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package isa95.aps.interfaces.b2mml.masterdataprofile;

import isa95.aps.domain.entity.common.Identifier;
import isa95.aps.domain.entity.transactionprofile.TransactionProfileType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>MasterDataTransactionProfileType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="MasterDataTransactionProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="ApplicationRole" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="TransactionProfile" type="{http://www.mesa.org/xml/B2MML}TransactionProfileType"/>
 *         &lt;element name="ChannelTopic" type="{http://www.mesa.org/xml/B2MML}ChannelTopicType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterDataTransactionProfileType", propOrder = {
        "applicationID",
        "applicationRole",
        "transactionProfile",
        "channelTopic"
})
public class MasterDataTransactionProfileType {

    @XmlElement(name = "ApplicationID", required = true)
    protected Identifier applicationID;
    @XmlElement(name = "ApplicationRole", required = true)
    protected Identifier applicationRole;
    @XmlElement(name = "TransactionProfile", required = true)
    protected TransactionProfileType transactionProfile;
    @XmlElement(name = "ChannelTopic")
    protected List<ChannelTopicType> channelTopic;

    /**
     * 获取applicationID属性的值。
     *
     * @return possible object is
     * {@link Identifier }
     */
    public Identifier getApplicationID() {
        return applicationID;
    }

    /**
     * 设置applicationID属性的值。
     *
     * @param value allowed object is
     *              {@link Identifier }
     */
    public void setApplicationID(Identifier value) {
        this.applicationID = value;
    }

    /**
     * 获取applicationRole属性的值。
     *
     * @return possible object is
     * {@link Identifier }
     */
    public Identifier getApplicationRole() {
        return applicationRole;
    }

    /**
     * 设置applicationRole属性的值。
     *
     * @param value allowed object is
     *              {@link Identifier }
     */
    public void setApplicationRole(Identifier value) {
        this.applicationRole = value;
    }

    /**
     * 获取transactionProfile属性的值。
     *
     * @return possible object is
     * {@link TransactionProfileType }
     */
    public TransactionProfileType getTransactionProfile() {
        return transactionProfile;
    }

    /**
     * 设置transactionProfile属性的值。
     *
     * @param value allowed object is
     *              {@link TransactionProfileType }
     */
    public void setTransactionProfile(TransactionProfileType value) {
        this.transactionProfile = value;
    }

    /**
     * Gets the value of the channelTopic property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelTopic property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelTopic().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelTopicType }
     */
    public List<ChannelTopicType> getChannelTopic() {
        if (channelTopic == null) {
            channelTopic = new ArrayList<ChannelTopicType>();
        }
        return this.channelTopic;
    }

}
