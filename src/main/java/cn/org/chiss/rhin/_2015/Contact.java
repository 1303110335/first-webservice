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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 联系人类型
 * 
 * <p>Contact complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.chiss.org.cn/rhin/2015}Identifier"/>
 *         &lt;element name="code" type="{http://www.chiss.org.cn/rhin/2015}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.chiss.org.cn/rhin/2015}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://www.chiss.org.cn/rhin/2015}Telecom" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assignedPerson" type="{http://www.chiss.org.cn/rhin/2015}Person"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "identifier",
    "code",
    "address",
    "telecom",
    "assignedPerson"
})
public class Contact {

    @XmlElement(required = true)
    protected Identifier identifier;
    protected CodeableConcept code;
    protected List<Address> address;
    protected List<Telecom> telecom;
    @XmlElement(required = true)
    protected Person assignedPerson;

    /**
     * 获取identifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * 设置identifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setCode(CodeableConcept value) {
        this.code = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telecom }
     * 
     * 
     */
    public List<Telecom> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<Telecom>();
        }
        return this.telecom;
    }

    /**
     * 获取assignedPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getAssignedPerson() {
        return assignedPerson;
    }

    /**
     * 设置assignedPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setAssignedPerson(Person value) {
        this.assignedPerson = value;
    }

}
