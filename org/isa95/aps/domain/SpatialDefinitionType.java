//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.persistence.Embeddable;

@Embeddable
public class SpatialDefinitionType {

    private TextType value;
    private IdentifierType format;
    private IdentifierType srid;
    private TextType sridAuthority;

    public TextType getValue() {
        return value;
    }

    public void setValue(TextType value) {
        this.value = value;
    }

    public IdentifierType getFormat() {
        return format;
    }

    public void setFormat(IdentifierType format) {
        this.format = format;
    }

    public IdentifierType getSrid() {
        return srid;
    }

    public void setSrid(IdentifierType srid) {
        this.srid = srid;
    }

    public TextType getSridAuthority() {
        return sridAuthority;
    }

    public void setSridAuthority(TextType sridAuthority) {
        this.sridAuthority = sridAuthority;
    }
}
