//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package isa95.aps.interfaces.b2mml.masterdataprofile;

import isa95.aps.domain.entity.common.Text;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>ChannelTopicType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ChannelTopicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChannelURI" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="ChannelDescription" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Topic" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="TopicDescription" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageSpec" type="{http://www.mesa.org/xml/B2MML}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelTopicType", propOrder = {
        "channelURI",
        "channelDescription",
        "topic",
        "topicDescription",
        "messageSpec"
})
public class ChannelTopicType {

    @XmlElement(name = "ChannelURI", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String channelURI;
    @XmlElement(name = "ChannelDescription")
    protected List<Text> channelDescription;
    @XmlElement(name = "Topic", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String topic;
    @XmlElement(name = "TopicDescription")
    protected List<Text> topicDescription;
    @XmlElement(name = "MessageSpec")
    protected List<Text> messageSpec;

    /**
     * 获取channelURI属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getChannelURI() {
        return channelURI;
    }

    /**
     * 设置channelURI属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChannelURI(String value) {
        this.channelURI = value;
    }

    /**
     * Gets the value of the channelDescription property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelDescription property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     */
    public List<Text> getChannelDescription() {
        if (channelDescription == null) {
            channelDescription = new ArrayList<Text>();
        }
        return this.channelDescription;
    }

    /**
     * 获取topic属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getTopic() {
        return topic;
    }

    /**
     * 设置topic属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * Gets the value of the topicDescription property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicDescription property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     */
    public List<Text> getTopicDescription() {
        if (topicDescription == null) {
            topicDescription = new ArrayList<Text>();
        }
        return this.topicDescription;
    }

    /**
     * Gets the value of the messageSpec property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageSpec property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageSpec().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     */
    public List<Text> getMessageSpec() {
        if (messageSpec == null) {
            messageSpec = new ArrayList<Text>();
        }
        return this.messageSpec;
    }

}
