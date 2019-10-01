//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import java.util.List;

@Entity(name = "SegmentDependency")
public class SegmentDependencyType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private DependencyType dependency;
    private List<ValueType> timingFactor;
    private UnitOfMeasureType unitOfMeasure;
    @XmlElementRefs({
            @XmlElementRef(name = "ProductSegmentID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ProcessSegmentID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SegmentID", namespace = "http://www.mesa.org/xml/B2MML", type = JAXBElement.class, required = false)
    })
    private List<JAXBElement<IdentifierType>> productSegmentIDOrProcessSegmentIDOrSegmentID;

    public IdentifierType getId() {
        return id;
    }

    public void setId(IdentifierType id) {
        this.id = id;
    }

    public List<DescriptionType> getDescription() {
        return description;
    }

    public void setDescription(List<DescriptionType> description) {
        this.description = description;
    }

    public DependencyType getDependency() {
        return dependency;
    }

    public void setDependency(DependencyType dependency) {
        this.dependency = dependency;
    }

    public List<ValueType> getTimingFactor() {
        return timingFactor;
    }

    public void setTimingFactor(List<ValueType> timingFactor) {
        this.timingFactor = timingFactor;
    }

    public UnitOfMeasureType getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasureType unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public List<JAXBElement<IdentifierType>> getProductSegmentIDOrProcessSegmentIDOrSegmentID() {
        return productSegmentIDOrProcessSegmentIDOrSegmentID;
    }

    public void setProductSegmentIDOrProcessSegmentIDOrSegmentID(List<JAXBElement<IdentifierType>> productSegmentIDOrProcessSegmentIDOrSegmentID) {
        this.productSegmentIDOrProcessSegmentIDOrSegmentID = productSegmentIDOrProcessSegmentIDOrSegmentID;
    }
}
