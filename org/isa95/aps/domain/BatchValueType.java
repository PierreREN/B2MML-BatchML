//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>BatchValueType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="BatchValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueString" type="{http://www.mesa.org/xml/B2MML}ValueStringType" maxOccurs="unbounded"/>
 *         &lt;element name="DataInterpretation" type="{http://www.mesa.org/xml/B2MML}DataInterpretationType"/>
 *         &lt;element name="DataType" type="{http://www.mesa.org/xml/B2MML}DataTypeType"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.mesa.org/xml/B2MML}UnitOfMeasureType"/>
 *         &lt;element name="EnumerationSetID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}BatchValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchValueType", propOrder = {
        "content"
})
public class BatchValueType {

    @XmlElementRefs({
            @XmlElementRef(name = "DataType", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class),
            @XmlElementRef(name = "UnitOfMeasure", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class),
            @XmlElementRef(name = "ValueString", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class),
            @XmlElementRef(name = "EnumerationSetID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class),
            @XmlElementRef(name = "DataInterpretation", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitOfMeasureType }{@code >}
     * {@link JAXBElement }{@code <}{@link DataInterpretationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueStringType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
