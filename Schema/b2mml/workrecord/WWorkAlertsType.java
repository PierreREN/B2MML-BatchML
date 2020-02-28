//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.12.29 时间 02:18:42 PM CST 
//


package isa95.aps.interfaces.b2mml.workrecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WWorkAlertsType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WWorkAlertsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkAlertRecord" type="{http://www.mesa.org/xml/B2MML}WWorkAlertRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WWorkAlertsType", propOrder = {
        "workAlertRecord"
})
public class WWorkAlertsType {

    @XmlElement(name = "WorkAlertRecord")
    protected List<WWorkAlertRecordType> workAlertRecord;

    /**
     * Gets the value of the workAlertRecord property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workAlertRecord property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkAlertRecord().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WWorkAlertRecordType }
     */
    public List<WWorkAlertRecordType> getWorkAlertRecord() {
        if (workAlertRecord == null) {
            workAlertRecord = new ArrayList<WWorkAlertRecordType>();
        }
        return this.workAlertRecord;
    }

}
