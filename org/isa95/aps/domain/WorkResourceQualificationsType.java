//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkResourceQualificationsType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="WorkResourceQualificationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResourceQualificationsManifest" type="{http://www.mesa.org/xml/B2MML}WorkResourceQualificationsManifestType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkResourceQualificationsType", propOrder = {
        "resourceQualificationsManifest"
})
public class WorkResourceQualificationsType {

    @XmlElement(name = "ResourceQualificationsManifest")
    protected List<WorkResourceQualificationsManifestType> resourceQualificationsManifest;

    /**
     * Gets the value of the resourceQualificationsManifest property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceQualificationsManifest property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceQualificationsManifest().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkResourceQualificationsManifestType }
     */
    public List<WorkResourceQualificationsManifestType> getResourceQualificationsManifest() {
        if (resourceQualificationsManifest == null) {
            resourceQualificationsManifest = new ArrayList<WorkResourceQualificationsManifestType>();
        }
        return this.resourceQualificationsManifest;
    }

}
