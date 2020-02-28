//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:35:35 PM CST 
//


package isa95.aps.interfaces.b2mml.batchinformation;

import isa95.aps.interfaces.b2mml.common.DescriptionType;
import isa95.aps.interfaces.b2mml.common.EquipmentElementLevelType;
import isa95.aps.interfaces.b2mml.common.IdentifierType;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>EquipmentElementType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="EquipmentElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="Description" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentElementType" type="{http://www.mesa.org/xml/B2MML}EquipmentElementTypeType"/>
 *         &lt;element name="EquipmentElementLevel" type="{http://www.mesa.org/xml/B2MML}EquipmentElementLevelType"/>
 *         &lt;element name="ClassInstanceAssociation" type="{http://www.mesa.org/xml/B2MML}ClassInstanceAssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Property" type="{http://www.mesa.org/xml/B2MML}EquipmentElementPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentProceduralElementClass" type="{http://www.mesa.org/xml/B2MML}EquipmentProceduralElementClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentProceduralElement" type="{http://www.mesa.org/xml/B2MML}EquipmentProceduralElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentConnection" type="{http://www.mesa.org/xml/B2MML}EquipmentConnectionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="EquipmentElement" type="{http://www.mesa.org/xml/B2MML}EquipmentElementType"/>
 *           &lt;element name="EquipmentElementID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}EquipmentElement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentElementType", propOrder = {
        "id",
        "description",
        "equipmentElementType",
        "equipmentElementLevel",
        "classInstanceAssociation",
        "property",
        "equipmentProceduralElementClass",
        "equipmentProceduralElement",
        "equipmentConnection",
        "equipmentElementOrEquipmentElementID"
})
public class EquipmentElementType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "EquipmentElementType", required = true)
    protected EquipmentElementTypeType equipmentElementType;
    @XmlElement(name = "EquipmentElementLevel", required = true)
    protected EquipmentElementLevelType equipmentElementLevel;
    @XmlElement(name = "ClassInstanceAssociation")
    protected List<ClassInstanceAssociationType> classInstanceAssociation;
    @XmlElement(name = "Property")
    protected List<EquipmentElementPropertyType> property;
    @XmlElement(name = "EquipmentProceduralElementClass")
    protected List<EquipmentProceduralElementClassType> equipmentProceduralElementClass;
    @XmlElement(name = "EquipmentProceduralElement")
    protected List<EquipmentProceduralElementType> equipmentProceduralElement;
    @XmlElement(name = "EquipmentConnection")
    protected List<EquipmentConnectionType> equipmentConnection;
    @XmlElements({
            @XmlElement(name = "EquipmentElement", type = EquipmentElementType.class),
            @XmlElement(name = "EquipmentElementID", type = IdentifierType.class)
    })
    protected List<Object> equipmentElementOrEquipmentElementID;

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
     * 获取equipmentElementType属性的值。
     *
     * @return possible object is
     * {@link EquipmentElementTypeType }
     */
    public EquipmentElementTypeType getEquipmentElementType() {
        return equipmentElementType;
    }

    /**
     * 设置equipmentElementType属性的值。
     *
     * @param value allowed object is
     *              {@link EquipmentElementTypeType }
     */
    public void setEquipmentElementType(EquipmentElementTypeType value) {
        this.equipmentElementType = value;
    }

    /**
     * 获取equipmentElementLevel属性的值。
     *
     * @return possible object is
     * {@link EquipmentElementLevelType }
     */
    public EquipmentElementLevelType getEquipmentElementLevel() {
        return equipmentElementLevel;
    }

    /**
     * 设置equipmentElementLevel属性的值。
     *
     * @param value allowed object is
     *              {@link EquipmentElementLevelType }
     */
    public void setEquipmentElementLevel(EquipmentElementLevelType value) {
        this.equipmentElementLevel = value;
    }

    /**
     * Gets the value of the classInstanceAssociation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classInstanceAssociation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassInstanceAssociation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassInstanceAssociationType }
     */
    public List<ClassInstanceAssociationType> getClassInstanceAssociation() {
        if (classInstanceAssociation == null) {
            classInstanceAssociation = new ArrayList<ClassInstanceAssociationType>();
        }
        return this.classInstanceAssociation;
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
     * {@link EquipmentElementPropertyType }
     */
    public List<EquipmentElementPropertyType> getProperty() {
        if (property == null) {
            property = new ArrayList<EquipmentElementPropertyType>();
        }
        return this.property;
    }

    /**
     * Gets the value of the equipmentProceduralElementClass property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentProceduralElementClass property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentProceduralElementClass().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentProceduralElementClassType }
     */
    public List<EquipmentProceduralElementClassType> getEquipmentProceduralElementClass() {
        if (equipmentProceduralElementClass == null) {
            equipmentProceduralElementClass = new ArrayList<EquipmentProceduralElementClassType>();
        }
        return this.equipmentProceduralElementClass;
    }

    /**
     * Gets the value of the equipmentProceduralElement property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentProceduralElement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentProceduralElement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentProceduralElementType }
     */
    public List<EquipmentProceduralElementType> getEquipmentProceduralElement() {
        if (equipmentProceduralElement == null) {
            equipmentProceduralElement = new ArrayList<EquipmentProceduralElementType>();
        }
        return this.equipmentProceduralElement;
    }

    /**
     * Gets the value of the equipmentConnection property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentConnection property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentConnection().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentConnectionType }
     */
    public List<EquipmentConnectionType> getEquipmentConnection() {
        if (equipmentConnection == null) {
            equipmentConnection = new ArrayList<EquipmentConnectionType>();
        }
        return this.equipmentConnection;
    }

    /**
     * Gets the value of the equipmentElementOrEquipmentElementID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentElementOrEquipmentElementID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentElementOrEquipmentElementID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentElementType }
     * {@link IdentifierType }
     */
    public List<Object> getEquipmentElementOrEquipmentElementID() {
        if (equipmentElementOrEquipmentElementID == null) {
            equipmentElementOrEquipmentElementID = new ArrayList<Object>();
        }
        return this.equipmentElementOrEquipmentElementID;
    }

}
