//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>TransExpressionType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TransExpressionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.mesa.org/xml/B2MML>TransExpression1Type">
 *       &lt;attribute name="actionCode" use="required" type="{http://www.mesa.org/xml/B2MML}TransActionCodeType" />
 *       &lt;attribute name="expressionLanguage" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransExpressionType")
public class TransExpressionType
        extends TransExpression1Type {

    @XmlAttribute(name = "actionCode", required = true)
    protected String actionCode;
    @XmlAttribute(name = "expressionLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String expressionLanguage;

    /**
     * 获取actionCode属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * 设置actionCode属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * 获取expressionLanguage属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getExpressionLanguage() {
        return expressionLanguage;
    }

    /**
     * 设置expressionLanguage属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExpressionLanguage(String value) {
        this.expressionLanguage = value;
    }

}
