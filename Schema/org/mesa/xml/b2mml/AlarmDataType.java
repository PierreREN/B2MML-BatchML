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
 * <p>AlarmDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AlarmDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlarmEvent" type="{http://www.mesa.org/xml/B2MML}CodeType"/>
 *         &lt;element name="AlarmType" type="{http://www.mesa.org/xml/B2MML}CodeType"/>
 *         &lt;element name="AlarmLimit" type="{http://www.mesa.org/xml/B2MML}ValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmDataType", propOrder = {
    "alarmEvent",
    "alarmType",
    "alarmLimit",
    "priority"
})
public class AlarmDataType {

    @XmlElement(name = "AlarmEvent", required = true)
    protected CodeType alarmEvent;
    @XmlElement(name = "AlarmType", required = true)
    protected CodeType alarmType;
    @XmlElement(name = "AlarmLimit")
    protected List<ValueType> alarmLimit;
    @XmlElement(name = "Priority")
    protected List<IdentifierType> priority;

    /**
     * 获取alarmEvent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAlarmEvent() {
        return alarmEvent;
    }

    /**
     * 设置alarmEvent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAlarmEvent(CodeType value) {
        this.alarmEvent = value;
    }

    /**
     * 获取alarmType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAlarmType() {
        return alarmType;
    }

    /**
     * 设置alarmType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAlarmType(CodeType value) {
        this.alarmType = value;
    }

    /**
     * Gets the value of the alarmLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarmLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarmLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     * 
     * 
     */
    public List<ValueType> getAlarmLimit() {
        if (alarmLimit == null) {
            alarmLimit = new ArrayList<ValueType>();
        }
        return this.alarmLimit;
    }

    /**
     * Gets the value of the priority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     * 
     * 
     */
    public List<IdentifierType> getPriority() {
        if (priority == null) {
            priority = new ArrayList<IdentifierType>();
        }
        return this.priority;
    }

}
