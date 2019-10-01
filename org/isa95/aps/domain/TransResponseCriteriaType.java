//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransResponseCriteriaType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TransResponseCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseExpression" type="{http://www.mesa.org/xml/B2MML}TransExpressionType" minOccurs="0"/>
 *         &lt;element name="ChangeStatus" type="{http://www.mesa.org/xml/B2MML}TransChangeStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransResponseCriteriaType", propOrder = {
        "responseExpression",
        "changeStatus"
})
public class TransResponseCriteriaType {

    @XmlElement(name = "ResponseExpression")
    protected TransExpressionType responseExpression;
    @XmlElement(name = "ChangeStatus")
    protected TransChangeStatusType changeStatus;

    /**
     * 获取responseExpression属性的值。
     *
     * @return possible object is
     * {@link TransExpressionType }
     */
    public TransExpressionType getResponseExpression() {
        return responseExpression;
    }

    /**
     * 设置responseExpression属性的值。
     *
     * @param value allowed object is
     *              {@link TransExpressionType }
     */
    public void setResponseExpression(TransExpressionType value) {
        this.responseExpression = value;
    }

    /**
     * 获取changeStatus属性的值。
     *
     * @return possible object is
     * {@link TransChangeStatusType }
     */
    public TransChangeStatusType getChangeStatus() {
        return changeStatus;
    }

    /**
     * 设置changeStatus属性的值。
     *
     * @param value allowed object is
     *              {@link TransChangeStatusType }
     */
    public void setChangeStatus(TransChangeStatusType value) {
        this.changeStatus = value;
    }

}
