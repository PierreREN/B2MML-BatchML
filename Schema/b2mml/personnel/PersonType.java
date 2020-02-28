//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.28 时间 09:00:39 PM CST 
//


package isa95.aps.interfaces.b2mml.personnel;

import org.mesa.xml.b2mml.entity.common.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>PersonType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="PersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.mesa.org/xml/B2MML}IdentifierType"/>
 *         &lt;element name="DescriptionType" type="{http://www.mesa.org/xml/B2MML}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HierarchyScopeType" type="{http://www.mesa.org/xml/B2MML}HierarchyScopeType" minOccurs="0"/>
 *         &lt;element name="PersonNameType" type="{http://www.mesa.org/xml/B2MML}PersonNameType" minOccurs="0"/>
 *         &lt;element name="SpatialDefinitionType" type="{http://www.mesa.org/xml/B2MML}SpatialDefinitionType" minOccurs="0"/>
 *         &lt;element name="OperationalLocation" type="{http://www.mesa.org/xml/B2MML}ResourceLocationTypeType" minOccurs="0"/>
 *         &lt;element name="PersonProperty" type="{http://www.mesa.org/xml/B2MML}PersonPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonnelClassID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="QualificationTestSpecificationID" type="{http://www.mesa.org/xml/B2MML}IdentifierType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.mesa.org/xml/B2MML-AllExtensions}Person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
        "id",
        "description",
        "hierarchyScope",
        "personName",
        "spatialDefinition",
        "operationalLocation",
        "personProperty",
        "personnelClassID",
        "qualificationTestSpecificationID"
})
public class PersonType {

    @XmlElement(name = "ID", required = true)
    protected IdentifierType id;
    @XmlElement(name = "DescriptionType")
    protected List<DescriptionType> description;
    @XmlElement(name = "HierarchyScopeType")
    protected HierarchyScopeType hierarchyScope;
    @XmlElement(name = "PersonNameType")
    protected PersonNameType personName;
    @XmlElement(name = "SpatialDefinitionType")
    protected SpatialDefinitionType spatialDefinition;
    @XmlElement(name = "OperationalLocation")
    protected ResourceLocationType operationalLocation;
    @XmlElement(name = "PersonProperty")
    protected List<PersonPropertyType> personProperty;
    @XmlElement(name = "PersonnelClassID")
    protected List<IdentifierType> personnelClassID;
    @XmlElement(name = "QualificationTestSpecificationID")
    protected List<IdentifierType> qualificationTestSpecificationID;

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
     * 获取hierarchyScope属性的值。
     *
     * @return possible object is
     * {@link HierarchyScopeType }
     */
    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    /**
     * 设置hierarchyScope属性的值。
     *
     * @param value allowed object is
     *              {@link HierarchyScopeType }
     */
    public void setHierarchyScope(HierarchyScopeType value) {
        this.hierarchyScope = value;
    }

    /**
     * 获取personName属性的值。
     *
     * @return possible object is
     * {@link PersonNameType }
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * 设置personName属性的值。
     *
     * @param value allowed object is
     *              {@link PersonNameType }
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * 获取spatialDefinition属性的值。
     *
     * @return possible object is
     * {@link SpatialDefinitionType }
     */
    public SpatialDefinitionType getSpatialDefinition() {
        return spatialDefinition;
    }

    /**
     * 设置spatialDefinition属性的值。
     *
     * @param value allowed object is
     *              {@link SpatialDefinitionType }
     */
    public void setSpatialDefinition(SpatialDefinitionType value) {
        this.spatialDefinition = value;
    }

    /**
     * 获取operationalLocation属性的值。
     *
     * @return possible object is
     * {@link ResourceLocationType }
     */
    public ResourceLocationType getOperationalLocation() {
        return operationalLocation;
    }

    /**
     * 设置operationalLocation属性的值。
     *
     * @param value allowed object is
     *              {@link ResourceLocationType }
     */
    public void setOperationalLocation(ResourceLocationType value) {
        this.operationalLocation = value;
    }

    /**
     * Gets the value of the personProperty property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personProperty property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonPropertyType }
     */
    public List<PersonPropertyType> getPersonProperty() {
        if (personProperty == null) {
            personProperty = new ArrayList<PersonPropertyType>();
        }
        return this.personProperty;
    }

    /**
     * Gets the value of the personnelClassID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelClassID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelClassID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getPersonnelClassID() {
        if (personnelClassID == null) {
            personnelClassID = new ArrayList<IdentifierType>();
        }
        return this.personnelClassID;
    }

    /**
     * Gets the value of the qualificationTestSpecificationID property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualificationTestSpecificationID property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualificationTestSpecificationID().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
     */
    public List<IdentifierType> getQualificationTestSpecificationID() {
        if (qualificationTestSpecificationID == null) {
            qualificationTestSpecificationID = new ArrayList<IdentifierType>();
        }
        return this.qualificationTestSpecificationID;
    }

}
