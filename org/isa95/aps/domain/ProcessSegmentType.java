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

@Entity(name = "ProcessSegment")
public class ProcessSegmentType {

    @EmbeddedId
    private IdentifierType id;
    private List<DescriptionType> description;
    private OperationsTypeType operationsType;
    private HierarchyScopeType hierarchyScope;
    private DefinitionTypeType definitionType;
    private DateTimeType publishedDate;
    private List<PersonnelSegmentSpecificationType> personnelSegmentSpecification;
    private List<EquipmentSegmentSpecificationType> equipmentSegmentSpecification;
    private List<PhysicalAssetSegmentSpecificationType> physicalAssetSegmentSpecification;
    private List<MaterialSegmentSpecificationType> materialSegmentSpecification;
    private List<ParameterType> parameter;
    private List<SegmentDependencyType> segmentDependency;
    private List<ProcessSegmentType> processSegment;
    private List<ProcessSegmentType> includesPropertiesOfProcessSegment;
    private List<WorkMasterType> correspondsToWorkMaster;
    private List<OperationsSegmentType> correspondsToOperationsSegment;
    private List<OpSegmentRequirementType> correspondsToSegmentRequirement;

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

    public OperationsTypeType getOperationsType() {
        return operationsType;
    }

    public void setOperationsType(OperationsTypeType operationsType) {
        this.operationsType = operationsType;
    }

    public HierarchyScopeType getHierarchyScope() {
        return hierarchyScope;
    }

    public void setHierarchyScope(HierarchyScopeType hierarchyScope) {
        this.hierarchyScope = hierarchyScope;
    }

    public DefinitionTypeType getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(DefinitionTypeType definitionType) {
        this.definitionType = definitionType;
    }

    public DateTimeType getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(DateTimeType publishedDate) {
        this.publishedDate = publishedDate;
    }

    public List<PersonnelSegmentSpecificationType> getPersonnelSegmentSpecification() {
        return personnelSegmentSpecification;
    }

    public void setPersonnelSegmentSpecification(List<PersonnelSegmentSpecificationType> personnelSegmentSpecification) {
        this.personnelSegmentSpecification = personnelSegmentSpecification;
    }

    public List<EquipmentSegmentSpecificationType> getEquipmentSegmentSpecification() {
        return equipmentSegmentSpecification;
    }

    public void setEquipmentSegmentSpecification(List<EquipmentSegmentSpecificationType> equipmentSegmentSpecification) {
        this.equipmentSegmentSpecification = equipmentSegmentSpecification;
    }

    public List<PhysicalAssetSegmentSpecificationType> getPhysicalAssetSegmentSpecification() {
        return physicalAssetSegmentSpecification;
    }

    public void setPhysicalAssetSegmentSpecification(List<PhysicalAssetSegmentSpecificationType> physicalAssetSegmentSpecification) {
        this.physicalAssetSegmentSpecification = physicalAssetSegmentSpecification;
    }

    public List<MaterialSegmentSpecificationType> getMaterialSegmentSpecification() {
        return materialSegmentSpecification;
    }

    public void setMaterialSegmentSpecification(List<MaterialSegmentSpecificationType> materialSegmentSpecification) {
        this.materialSegmentSpecification = materialSegmentSpecification;
    }

    public List<ParameterType> getParameter() {
        return parameter;
    }

    public void setParameter(List<ParameterType> parameter) {
        this.parameter = parameter;
    }

    public List<SegmentDependencyType> getSegmentDependency() {
        return segmentDependency;
    }

    public void setSegmentDependency(List<SegmentDependencyType> segmentDependency) {
        this.segmentDependency = segmentDependency;
    }

    public List<ProcessSegmentType> getProcessSegment() {
        return processSegment;
    }

    public void setProcessSegment(List<ProcessSegmentType> processSegment) {
        this.processSegment = processSegment;
    }

    public List<ProcessSegmentType> getIncludesPropertiesOfProcessSegment() {
        return includesPropertiesOfProcessSegment;
    }

    public void setIncludesPropertiesOfProcessSegment(List<ProcessSegmentType> includesPropertiesOfProcessSegment) {
        this.includesPropertiesOfProcessSegment = includesPropertiesOfProcessSegment;
    }

    public List<WorkMasterType> getCorrespondsToWorkMaster() {
        return correspondsToWorkMaster;
    }

    public void setCorrespondsToWorkMaster(List<WorkMasterType> correspondsToWorkMaster) {
        this.correspondsToWorkMaster = correspondsToWorkMaster;
    }

    public List<OperationsSegmentType> getCorrespondsToOperationsSegment() {
        return correspondsToOperationsSegment;
    }

    public void setCorrespondsToOperationsSegment(List<OperationsSegmentType> correspondsToOperationsSegment) {
        this.correspondsToOperationsSegment = correspondsToOperationsSegment;
    }

    public List<OpSegmentRequirementType> getCorrespondsToSegmentRequirement() {
        return correspondsToSegmentRequirement;
    }

    public void setCorrespondsToSegmentRequirement(List<OpSegmentRequirementType> correspondsToSegmentRequirement) {
        this.correspondsToSegmentRequirement = correspondsToSegmentRequirement;
    }
}
