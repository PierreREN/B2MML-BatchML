//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.xml.datatype.Duration;
import java.util.List;

@Entity(name = "TestSpecification")
public class TestSpecificationType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private HierarchyScopeType hierarchyScope;
    private VersionType version;
    private DateTimeType effectiveStartDate;
    private DateTimeType effectiveEndDate;
    private DateTimeType publishedEndDate;
    private ValueType testSampleSize;
    private ValueType recurrenceQuantity;
    private Duration recurrenceTimeInterval;
    private Boolean physicalSampleRequired;
    private List<TestSpecificationType> testSpecification;
    private List<TestSpecificationPropertyType> testSpecificationProperty;
    private List<TestSpecificationCriteriaType> testSpecificationCriteria;
    private List<TestSpecificationEvaluatedPropertyType> evaluatedProperty;

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

    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    public void setHierarchyScope(HierarchyScopeType hierarchyScope) {
        this.hierarchyScope = hierarchyScope;
    }

    public VersionType getVersion() {
        return version;
    }

    public void setVersion(VersionType version) {
        this.version = version;
    }

    public DateTimeType getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(DateTimeType effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public DateTimeType getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public void setEffectiveEndDate(DateTimeType effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    public DateTimeType getPublishedEndDate() {
        return publishedEndDate;
    }

    public void setPublishedEndDate(DateTimeType publishedEndDate) {
        this.publishedEndDate = publishedEndDate;
    }

    public ValueType getTestSampleSize() {
        return testSampleSize;
    }

    public void setTestSampleSize(ValueType testSampleSize) {
        this.testSampleSize = testSampleSize;
    }

    public ValueType getRecurrenceQuantity() {
        return recurrenceQuantity;
    }

    public void setRecurrenceQuantity(ValueType recurrenceQuantity) {
        this.recurrenceQuantity = recurrenceQuantity;
    }

    public Duration getRecurrenceTimeInterval() {
        return recurrenceTimeInterval;
    }

    public void setRecurrenceTimeInterval(Duration recurrenceTimeInterval) {
        this.recurrenceTimeInterval = recurrenceTimeInterval;
    }

    public Boolean getPhysicalSampleRequired() {
        return physicalSampleRequired;
    }

    public void setPhysicalSampleRequired(Boolean physicalSampleRequired) {
        this.physicalSampleRequired = physicalSampleRequired;
    }

    public List<TestSpecificationType> getTestSpecification() {
        return testSpecification;
    }

    public void setTestSpecification(List<TestSpecificationType> testSpecification) {
        this.testSpecification = testSpecification;
    }

    public List<TestSpecificationPropertyType> getTestSpecificationProperty() {
        return testSpecificationProperty;
    }

    public void setTestSpecificationProperty(List<TestSpecificationPropertyType> testSpecificationProperty) {
        this.testSpecificationProperty = testSpecificationProperty;
    }

    public List<TestSpecificationCriteriaType> getTestSpecificationCriteria() {
        return testSpecificationCriteria;
    }

    public void setTestSpecificationCriteria(List<TestSpecificationCriteriaType> testSpecificationCriteria) {
        this.testSpecificationCriteria = testSpecificationCriteria;
    }

    public List<TestSpecificationEvaluatedPropertyType> getEvaluatedProperty() {
        return evaluatedProperty;
    }

    public void setEvaluatedProperty(List<TestSpecificationEvaluatedPropertyType> evaluatedProperty) {
        this.evaluatedProperty = evaluatedProperty;
    }
}
