//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.02.29 时间 12:47:56 AM CST 
//


package org.mesa.xml.b2mml.commonenums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DataTypeEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DataTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Amount"/>
 *     &lt;enumeration value="BinaryObject"/>
 *     &lt;enumeration value="Code"/>
 *     &lt;enumeration value="DateTime"/>
 *     &lt;enumeration value="Identifier"/>
 *     &lt;enumeration value="Indicator"/>
 *     &lt;enumeration value="Measure"/>
 *     &lt;enumeration value="Numeric"/>
 *     &lt;enumeration value="Quantity"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="byte"/>
 *     &lt;enumeration value="unsignedByte"/>
 *     &lt;enumeration value="binary"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="positiveInteger"/>
 *     &lt;enumeration value="negativeInteger"/>
 *     &lt;enumeration value="nonNegativeInteger"/>
 *     &lt;enumeration value="nonPositiveInteger"/>
 *     &lt;enumeration value="int"/>
 *     &lt;enumeration value="unsignedInt"/>
 *     &lt;enumeration value="long"/>
 *     &lt;enumeration value="unsignedLong"/>
 *     &lt;enumeration value="short"/>
 *     &lt;enumeration value="unsignedShort"/>
 *     &lt;enumeration value="decimal"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="time"/>
 *     &lt;enumeration value="timeInstant"/>
 *     &lt;enumeration value="timePeriod"/>
 *     &lt;enumeration value="duration"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="month"/>
 *     &lt;enumeration value="year"/>
 *     &lt;enumeration value="century"/>
 *     &lt;enumeration value="recurringDay"/>
 *     &lt;enumeration value="recurringDate"/>
 *     &lt;enumeration value="recurringDuration"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="QName"/>
 *     &lt;enumeration value="NCName"/>
 *     &lt;enumeration value="uriReference"/>
 *     &lt;enumeration value="language"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IDREF"/>
 *     &lt;enumeration value="IDREFS"/>
 *     &lt;enumeration value="ENTITY"/>
 *     &lt;enumeration value="ENTITIES"/>
 *     &lt;enumeration value="NOTATION"/>
 *     &lt;enumeration value="NMTOKEN"/>
 *     &lt;enumeration value="NMTOKENS"/>
 *     &lt;enumeration value="Enumeration"/>
 *     &lt;enumeration value="SVG"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTypeEnum")
@XmlEnum
public enum DataTypeEnum {

    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("BinaryObject")
    BINARY_OBJECT("BinaryObject"),
    @XmlEnumValue("Code")
    CODE("Code"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Identifier")
    IDENTIFIER("Identifier"),
    @XmlEnumValue("Indicator")
    INDICATOR("Indicator"),
    @XmlEnumValue("Measure")
    MEASURE("Measure"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Quantity")
    QUANTITY("Quantity"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("byte")
    BYTE("byte"),
    @XmlEnumValue("unsignedByte")
    UNSIGNED_BYTE("unsignedByte"),
    @XmlEnumValue("binary")
    BINARY("binary"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("positiveInteger")
    POSITIVE_INTEGER("positiveInteger"),
    @XmlEnumValue("negativeInteger")
    NEGATIVE_INTEGER("negativeInteger"),
    @XmlEnumValue("nonNegativeInteger")
    NON_NEGATIVE_INTEGER("nonNegativeInteger"),
    @XmlEnumValue("nonPositiveInteger")
    NON_POSITIVE_INTEGER("nonPositiveInteger"),
    @XmlEnumValue("int")
    INT("int"),
    @XmlEnumValue("unsignedInt")
    UNSIGNED_INT("unsignedInt"),
    @XmlEnumValue("long")
    LONG("long"),
    @XmlEnumValue("unsignedLong")
    UNSIGNED_LONG("unsignedLong"),
    @XmlEnumValue("short")
    SHORT("short"),
    @XmlEnumValue("unsignedShort")
    UNSIGNED_SHORT("unsignedShort"),
    @XmlEnumValue("decimal")
    DECIMAL("decimal"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("timeInstant")
    TIME_INSTANT("timeInstant"),
    @XmlEnumValue("timePeriod")
    TIME_PERIOD("timePeriod"),
    @XmlEnumValue("duration")
    DURATION("duration"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("month")
    MONTH("month"),
    @XmlEnumValue("year")
    YEAR("year"),
    @XmlEnumValue("century")
    CENTURY("century"),
    @XmlEnumValue("recurringDay")
    RECURRING_DAY("recurringDay"),
    @XmlEnumValue("recurringDate")
    RECURRING_DATE("recurringDate"),
    @XmlEnumValue("recurringDuration")
    RECURRING_DURATION("recurringDuration"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("QName")
    Q_NAME("QName"),
    @XmlEnumValue("NCName")
    NC_NAME("NCName"),
    @XmlEnumValue("uriReference")
    URI_REFERENCE("uriReference"),
    @XmlEnumValue("language")
    LANGUAGE("language"),
    ID("ID"),
    IDREF("IDREF"),
    IDREFS("IDREFS"),
    ENTITY("ENTITY"),
    ENTITIES("ENTITIES"),
    NOTATION("NOTATION"),
    NMTOKEN("NMTOKEN"),
    NMTOKENS("NMTOKENS"),
    @XmlEnumValue("Enumeration")
    ENUMERATION("Enumeration"),
    SVG("SVG"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DataTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTypeEnum fromValue(String v) {
        for (DataTypeEnum c: DataTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
