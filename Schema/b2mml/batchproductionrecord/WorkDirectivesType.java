//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.08 时间 10:45:07 PM CST 
//


package isa95.aps.interfaces.b2mml.batchproductionrecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkDirectivesType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkDirectivesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkDirectiverRecord" type="{http://www.mesa.org/xml/B2MML}WorkDirectiveRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkDirectivesType", propOrder = {
        "workDirectiverRecord"
})
public class WorkDirectivesType {

    @XmlElement(name = "WorkDirectiverRecord")
    protected List<WorkDirectiveRecordType> workDirectiverRecord;

    /**
     * Gets the value of the workDirectiverRecord property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workDirectiverRecord property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkDirectiverRecord().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkDirectiveRecordType }
     */
    public List<WorkDirectiveRecordType> getWorkDirectiverRecord() {
        if (workDirectiverRecord == null) {
            workDirectiverRecord = new ArrayList<WorkDirectiveRecordType>();
        }
        return this.workDirectiverRecord;
    }

}
