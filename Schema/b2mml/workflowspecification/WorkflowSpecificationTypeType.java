//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 01:36:47 PM CST 
//


package isa95.aps.interfaces.b2mml.workflowspecification;

import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;
import isa95.aps.interfaces.b2mml.common.VersionType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkflowSpecificationTypeType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkflowSpecificationTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="VersionType" type="{http://www.mesa.org/xml/B2MML}VersionType" minOccurs="0"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NodeType" type="{http://www.mesa.org/xml/B2MML}WorkflowSpecificationNodeTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConnectionType" type="{http://www.mesa.org/xml/B2MML}WorkflowSpecificationConnectionTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}WorkflowSpecificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowSpecificationTypeType", propOrder = {
        "id",
        "version",
        "description",
        "nodeType",
        "connectionType"
})
public class WorkflowSpecificationTypeType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "VersionType")
    protected VersionType version;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "NodeType")
    protected List<WorkflowSpecificationNodeTypeType> nodeType;
    @XmlElement(name = "ConnectionType")
    protected List<WorkflowSpecificationConnectionTypeType> connectionType;

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
     * 获取version属性的值。
     *
     * @return possible object is
     * {@link VersionType }
     */
    public VersionType getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     *
     * @param value allowed object is
     *              {@link VersionType }
     */
    public void setVersion(VersionType value) {
        this.version = value;
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
     * Gets the value of the nodeType property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeType property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowSpecificationNodeTypeType }
     */
    public List<WorkflowSpecificationNodeTypeType> getNodeType() {
        if (nodeType == null) {
            nodeType = new ArrayList<WorkflowSpecificationNodeTypeType>();
        }
        return this.nodeType;
    }

    /**
     * Gets the value of the connectionType property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionType property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowSpecificationConnectionTypeType }
     */
    public List<WorkflowSpecificationConnectionTypeType> getConnectionType() {
        if (connectionType == null) {
            connectionType = new ArrayList<WorkflowSpecificationConnectionTypeType>();
        }
        return this.connectionType;
    }

}
