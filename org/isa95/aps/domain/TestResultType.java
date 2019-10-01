//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.List;

@Entity(name = "TestResult")
public class TestResultType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private HierarchyScopeType hierarchyScope;
    private DateTimeType evaluationDate;
    private TextType evaluatedCriterionResult;
    private DateTimeType expiration;
    private List<TestResultType> testResult;
    private List<TestPropertyMeasurementType> propertyMeasurement;

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

    public DateTimeType getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(DateTimeType evaluationDate) {
        this.evaluationDate = evaluationDate;
    }

    public TextType getEvaluatedCriterionResult() {
        return evaluatedCriterionResult;
    }

    public void setEvaluatedCriterionResult(TextType evaluatedCriterionResult) {
        this.evaluatedCriterionResult = evaluatedCriterionResult;
    }

    public DateTimeType getExpiration() {
        return expiration;
    }

    public void setExpiration(DateTimeType expiration) {
        this.expiration = expiration;
    }

    public List<TestResultType> getTestResult() {
        return testResult;
    }

    public void setTestResult(List<TestResultType> testResult) {
        this.testResult = testResult;
    }

    public List<TestPropertyMeasurementType> getPropertyMeasurement() {
        return propertyMeasurement;
    }

    public void setPropertyMeasurement(List<TestPropertyMeasurementType> propertyMeasurement) {
        this.propertyMeasurement = propertyMeasurement;
    }
}
