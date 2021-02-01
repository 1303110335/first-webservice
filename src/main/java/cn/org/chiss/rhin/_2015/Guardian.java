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
 * <p>Guardian complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Guardian">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.chiss.org.cn/rhin/2015}Identifier" maxOccurs="unbounded"/>
 *         &lt;element name="code" type="{http://www.chiss.org.cn/rhin/2015}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.chiss.org.cn/rhin/2015}Address" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://www.chiss.org.cn/rhin/2015}Telecom" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{http://www.chiss.org.cn/rhin/2015}Period" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="guardianPerson" type="{http://www.chiss.org.cn/rhin/2015}Person" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="guardianOrganization" type="{http://www.chiss.org.cn/rhin/2015}Organization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Guardian", propOrder = {
    "identifier",
    "code",
    "address",
    "telecom",
    "effectiveTime",
    "guardianPerson",
    "guardianOrganization"
})
public class Guardian {

    @XmlElement(required = true)
    protected List<Identifier> identifier;
    protected CodeableConcept code;
    protected Address address;
    protected Telecom telecom;
    protected Period effectiveTime;
    protected List<Person> guardianPerson;
    protected List<Organization> guardianOrganization;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
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
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * 获取telecom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Telecom }
     *     
     */
    public Telecom getTelecom() {
        return telecom;
    }

    /**
     * 设置telecom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Telecom }
     *     
     */
    public void setTelecom(Telecom value) {
        this.telecom = value;
    }

    /**
     * 获取effectiveTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * 设置effectiveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setEffectiveTime(Period value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the guardianPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guardianPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuardianPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * 
     * 
     */
    public List<Person> getGuardianPerson() {
        if (guardianPerson == null) {
            guardianPerson = new ArrayList<Person>();
        }
        return this.guardianPerson;
    }

    /**
     * Gets the value of the guardianOrganization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guardianOrganization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuardianOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organization }
     * 
     * 
     */
    public List<Organization> getGuardianOrganization() {
        if (guardianOrganization == null) {
            guardianOrganization = new ArrayList<Organization>();
        }
        return this.guardianOrganization;
    }

}
