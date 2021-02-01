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
import javax.xml.bind.annotation.XmlType;


/**
 * 机构查询参数
 * 
 * <p>OrganizationBrief complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrganizationBrief">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.chiss.org.cn/rhin/2015}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="classCode" type="{http://www.chiss.org.cn/rhin/2015}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.chiss.org.cn/rhin/2015}Address" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://www.chiss.org.cn/rhin/2015}Telecom" minOccurs="0"/>
 *         &lt;element name="partOf" type="{http://www.chiss.org.cn/rhin/2015}OrganizationBrief" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationBrief", propOrder = {
    "identifier",
    "classCode",
    "name",
    "address",
    "telecom",
    "partOf"
})
public class OrganizationBrief {

    protected List<Identifier> identifier;
    protected List<Coding> classCode;
    protected String name;
    protected Address address;
    protected Telecom telecom;
    protected OrganizationBrief partOf;

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
     * Gets the value of the classCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getClassCode() {
        if (classCode == null) {
            classCode = new ArrayList<Coding>();
        }
        return this.classCode;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * 获取partOf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrganizationBrief }
     *     
     */
    public OrganizationBrief getPartOf() {
        return partOf;
    }

    /**
     * 设置partOf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationBrief }
     *     
     */
    public void setPartOf(OrganizationBrief value) {
        this.partOf = value;
    }

}
