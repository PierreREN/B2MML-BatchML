//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.02 时间 09:51:12 PM CST 
//


package isa95.aps.interfaces.b2mml.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the type of the property. Defined types are
 * - ClassType: the property value is defined for the class and there is no value associated with an instance;
 * - InstanceType: the property value of the class is undefined; and
 * - DefaultType: the property value is defined for the class as the default instance value, but individual instances of the class may redefine specific values.
 *
 *
 * <p>ClassPropertyTypeType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ClassPropertyTypeType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.mesa.org/xml/B2MML>CodeType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassPropertyTypeType")
public class ClassPropertyTypeType
        extends CodeType {


}
