//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 02:18:42 PM CST 
//


package isa95.aps.interfaces.b2mml.workrecord;

import isa95.aps.interfaces.b2mml.common.DateTimeType;
import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;
import isa95.aps.interfaces.b2mml.operationsdefinition.OperationsDefinitionType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WWorkOperationsDefinitionRecordType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WWorkOperationsDefinitionRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML}WorkRecordEntryType"/>
 *         &lt;element name="OperationsDefinition" type="{http://www.mesa.org/xml/B2MML}OperationsDefinitionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WWorkOperationsDefinitionRecordType", propOrder = {
        "entryID",
        "objectType",
        "timeStamp",
        "externalReference",
        "description",
        "operationsDefinition"
})
public class WWorkOperationsDefinitionRecordType {

    @XmlElement(name = "EntryID", required = true)
    protected IdentifierType entryID;
    @XmlElement(name = "ObjectType", required = true)
    protected WorkRecordObjectTypeType objectType;
    @XmlElement(name = "TimeStamp")
    protected DateTimeType timeStamp;
    @XmlElement(name = "ExternalReference")
    protected IdentifierType externalReference;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "OperationsDefinition", required = true)
    protected OperationsDefinitionType operationsDefinition;

    /**
     * 获取entryID属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getEntryID() {
        return entryID;
    }

    /**
     * 设置entryID属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setEntryID(IdentifierType value) {
        this.entryID = value;
    }

    /**
     * 获取objectType属性的值。
     *
     * @return possible object is
     * {@link WorkRecordObjectTypeType }
     */
    public WorkRecordObjectTypeType getObjectType() {
        return objectType;
    }

    /**
     * 设置objectType属性的值。
     *
     * @param value allowed object is
     *              {@link WorkRecordObjectTypeType }
     */
    public void setObjectType(WorkRecordObjectTypeType value) {
        this.objectType = value;
    }

    /**
     * 获取timeStamp属性的值。
     *
     * @return possible object is
     * {@link DateTimeType }
     */
    public DateTimeType getTimeStamp() {
        return timeStamp;
    }

    /**
     * 设置timeStamp属性的值。
     *
     * @param value allowed object is
     *              {@link DateTimeType }
     */
    public void setTimeStamp(DateTimeType value) {
        this.timeStamp = value;
    }

    /**
     * 获取externalReference属性的值。
     *
     * @return possible object is
     * {@link IdentifierType }
     */
    public IdentifierType getExternalReference() {
        return externalReference;
    }

    /**
     * 设置externalReference属性的值。
     *
     * @param value allowed object is
     *              {@link IdentifierType }
     */
    public void setExternalReference(IdentifierType value) {
        this.externalReference = value;
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
     * 获取operationsDefinition属性的值。
     *
     * @return possible object is
     * {@link OperationsDefinitionType }
     */
    public OperationsDefinitionType getOperationsDefinition() {
        return operationsDefinition;
    }

    /**
     * 设置operationsDefinition属性的值。
     *
     * @param value allowed object is
     *              {@link OperationsDefinitionType }
     */
    public void setOperationsDefinition(OperationsDefinitionType value) {
        this.operationsDefinition = value;
    }

}
