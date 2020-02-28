//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 02:10:04 PM CST 
//


package isa95.aps.interfaces.b2mml.workcalendar;

import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;
import isa95.aps.interfaces.b2mml.common.ValueType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkCalendarDefinitionPropertyType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkCalendarDefinitionPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValueType" type="{http://www.mesa.org/xml/B2MML}ValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Property" type="{http://www.mesa.org/xml/B2MML}WorkCalendarDefinitionPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}WorkCalendarDefinitionProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkCalendarDefinitionPropertyType", propOrder = {
        "id",
        "description",
        "value",
        "property"
})
public class WorkCalendarDefinitionPropertyType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "ValueType")
    protected List<ValueType> value;
    @XmlElement(name = "Property")
    protected List<WorkCalendarDefinitionPropertyType> property;

    /**
     * 获取id属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setID(IdentifierType value) {
        this.id = value;
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
     * Gets the value of the value property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     */
    public List<ValueType> getValue() {
        if (value == null) {
            value = new ArrayList<ValueType>();
        }
        return this.value;
    }

    /**
     * Gets the value of the property property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkCalendarDefinitionPropertyType }
     */
    public List<WorkCalendarDefinitionPropertyType> getProperty() {
        if (property == null) {
            property = new ArrayList<WorkCalendarDefinitionPropertyType>();
        }
        return this.property;
    }

}
