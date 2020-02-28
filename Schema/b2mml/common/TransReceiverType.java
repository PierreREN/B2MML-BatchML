//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>TransReceiverType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TransReceiverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ComponentID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransReceiverType", propOrder = {
        "logicalID",
        "componentID",
        "id"
})
public class TransReceiverType {

    @XmlElement(name = "LogicalID")
    protected IdentifierType logicalID;
    @XmlElement(name = "ComponentID")
    protected IdentifierType componentID;
    @XmlElement(name = "ID")
    protected List<IdentifierType> id;

    /**
     * 获取logicalID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getLogicalID() {
        return logicalID;
    }

    /**
     * 设置logicalID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setLogicalID(IdentifierType value) {
        this.logicalID = value;
    }

    /**
     * 获取componentID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getComponentID() {
        return componentID;
    }

    /**
     * 设置componentID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setComponentID(IdentifierType value) {
        this.componentID = value;
    }

    /**
     * Gets the value of the id property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getID() {
        if (id == null) {
            id = new ArrayList<IdentifierType>();
        }
        return this.id;
    }

}
