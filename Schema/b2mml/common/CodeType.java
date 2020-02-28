//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.persistence.Transient;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>CodeType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>normalizedString">
 *       &lt;attribute name="listID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="listAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="listAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="listName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="languageID" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="listSchemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeType", propOrder = {
        "value"
})
@XmlSeeAlso({
        UnitOfMeasureType.class,
        DefinitionTypeType.class,
        EquipmentUseType.class,
        PersonnelUseType.class,
        AssemblyType1Type.class,
        CauseType.class,
        ResourceLocationType1Type.class,
        ReasonType.class,
        OtherDependencyType.class,
        WorkType1Type.class,
        ResourceReferenceType1Type.class,
        ResponseState1Type.class,
        CorrectionType.class,
        ClassPropertyTypeType.class,
        EquipmentElementLevel1Type.class,
        PhysicalAssetUseType.class,
        TransConfirmationCodeType.class,
        OperationsType1Type.class,
        RequiredByRequestedSegmentResponse1Type.class,
        Dependency1Type.class,
        JobOrderDispatchStatus1Type.class,
        JobOrderCommand1Type.class,
        ResourcesType.class,
        RelationshipType1Type.class,
        MaterialUse1Type.class,
        CapabilityType1Type.class,
        DataType1Type.class,
        AssemblyRelationship1Type.class,
        RelationshipForm1Type.class,
        RequestState1Type.class,
        StatusType.class,
        ProblemType.class
})
public class CodeType {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    private String value;
    @XmlAttribute(name = "listID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String listID;
    @XmlAttribute(name = "listAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String listAgencyID;
    @XmlAttribute(name = "listAgencyName")
    @Transient
    private String listAgencyName;
    @XmlAttribute(name = "listName")
    @Transient
    private String listName;
    @XmlAttribute(name = "listVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    @Transient
    private String listVersionID;
    @XmlAttribute(name = "name")
    @Transient
    private String name;
    @XmlAttribute(name = "languageID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    @Transient
    private String languageID;
    @XmlAttribute(name = "listURI")
    @XmlSchemaType(name = "anyURI")
    @Transient
    private String listURI;
    @XmlAttribute(name = "listSchemeURI")
    @XmlSchemaType(name = "anyURI")
    @Transient
    private String listSchemeURI;

    /**
     * 获取value属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取listID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListID() {
        return listID;
    }

    /**
     * 设置listID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * 获取listAgencyID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListAgencyID() {
        return listAgencyID;
    }

    /**
     * 设置listAgencyID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListAgencyID(String value) {
        this.listAgencyID = value;
    }

    /**
     * 获取listAgencyName属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListAgencyName() {
        return listAgencyName;
    }

    /**
     * 设置listAgencyName属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListAgencyName(String value) {
        this.listAgencyName = value;
    }

    /**
     * 获取listName属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListName() {
        return listName;
    }

    /**
     * 设置listName属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * 获取listVersionID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListVersionID() {
        return listVersionID;
    }

    /**
     * 设置listVersionID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListVersionID(String value) {
        this.listVersionID = value;
    }

    /**
     * 获取name属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取languageID属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * 设置languageID属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

    /**
     * 获取listURI属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListURI() {
        return listURI;
    }

    /**
     * 设置listURI属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListURI(String value) {
        this.listURI = value;
    }

    /**
     * 获取listSchemeURI属性的值。
     *
     * @return possible object is
     * {@link String }
     */
    public String getListSchemeURI() {
        return listSchemeURI;
    }

    /**
     * 设置listSchemeURI属性的值。
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setListSchemeURI(String value) {
        this.listSchemeURI = value;
    }

}
