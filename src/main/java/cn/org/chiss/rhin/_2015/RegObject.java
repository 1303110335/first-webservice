//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.02.01 时间 10:16:45 AM CST 
//


package cn.org.chiss.rhin._2015;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RegObject complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RegObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.chiss.org.cn/rhin/2015}MainID" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.chiss.org.cn/rhin/2015}ObjectStatus" minOccurs="0"/>
 *         &lt;element name="classCode" type="{http://www.chiss.org.cn/rhin/2015}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.chiss.org.cn/rhin/2015}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegObject", propOrder = {
    "id",
    "statusCode",
    "classCode",
    "extension"
})
@XmlSeeAlso({
    Practitioner.class,
    Person.class,
    Organization.class,
    Patient.class
})
public abstract class RegObject {

    protected MainID id;
    protected ObjectStatus statusCode;
    protected CodeableConcept classCode;
    protected List<Extension> extension;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MainID }
     *     
     */
    public MainID getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MainID }
     *     
     */
    public void setId(MainID value) {
        this.id = value;
    }

    /**
     * 获取statusCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ObjectStatus }
     *     
     */
    public ObjectStatus getStatusCode() {
        return statusCode;
    }

    /**
     * 设置statusCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectStatus }
     *     
     */
    public void setStatusCode(ObjectStatus value) {
        this.statusCode = value;
    }

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setClassCode(CodeableConcept value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

}
