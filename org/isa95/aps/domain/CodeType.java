//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.09.08 时间 12:19:36 AM CST 
//


package org.isa95.aps.domain;

import javax.persistence.Embeddable;

@Embeddable
public class CodeType {

    private String value;
    private String listID;
    private String listAgencyID;
    private String listAgencyName;
    private String listName;
    private String listVersionID;
    private String name;
    private String languageID;
    private String listURI;
    private String listSchemeURI;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getListID() {
        return listID;
    }

    public void setListID(String listID) {
        this.listID = listID;
    }

    public String getListAgencyID() {
        return listAgencyID;
    }

    public void setListAgencyID(String listAgencyID) {
        this.listAgencyID = listAgencyID;
    }

    public String getListAgencyName() {
        return listAgencyName;
    }

    public void setListAgencyName(String listAgencyName) {
        this.listAgencyName = listAgencyName;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getListVersionID() {
        return listVersionID;
    }

    public void setListVersionID(String listVersionID) {
        this.listVersionID = listVersionID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguageID() {
        return languageID;
    }

    public void setLanguageID(String languageID) {
        this.languageID = languageID;
    }

    public String getListURI() {
        return listURI;
    }

    public void setListURI(String listURI) {
        this.listURI = listURI;
    }

    public String getListSchemeURI() {
        return listSchemeURI;
    }

    public void setListSchemeURI(String listSchemeURI) {
        this.listSchemeURI = listSchemeURI;
    }
}
