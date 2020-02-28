//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>TransProcessType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TransProcessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionCriteria" type="{http://www.mesa.org/xml/B2MML}TransActionCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="acknowledgeCode" type="{http://www.mesa.org/xml/B2MML}TransResponseCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransProcessType", propOrder = {
        "actionCriteria"
})
public class TransProcessType {

    @XmlElement(name = "ActionCriteria")
    protected List<TransActionCriteriaType> actionCriteria;
    @XmlAttribute(name = "acknowledgeCode")
    protected TransResponseCodeType acknowledgeCode;

    /**
     * Gets the value of the actionCriteria property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionCriteria property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionCriteria().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransActionCriteriaType }
     */
    public List<TransActionCriteriaType> getActionCriteria() {
        if (actionCriteria == null) {
            actionCriteria = new ArrayList<TransActionCriteriaType>();
        }
        return this.actionCriteria;
    }

    /**
     * 获取acknowledgeCode属性的值。
     *
     * @return possible object is
     * {@link TransResponseCodeType }
     */
    public TransResponseCodeType getAcknowledgeCode() {
        return acknowledgeCode;
    }

    /**
     * 设置acknowledgeCode属性的值。
     *
     * @param value allowed object is
     *              {@link TransResponseCodeType }
     */
    public void setAcknowledgeCode(TransResponseCodeType value) {
        this.acknowledgeCode = value;
    }

}
