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
 * 科室、机构
 * 
 * <p>Organization complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}RegObject">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.chiss.org.cn/rhin/2015}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.chiss.org.cn/rhin/2015}String" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="healthcareFacilityTypeCode" type="{http://www.chiss.org.cn/rhin/2015}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="practiceSettingCode" type="{http://www.chiss.org.cn/rhin/2015}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.chiss.org.cn/rhin/2015}Address" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://www.chiss.org.cn/rhin/2015}Telecom" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{http://www.chiss.org.cn/rhin/2015}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "identifier",
    "name",
    "healthcareFacilityTypeCode",
    "practiceSettingCode",
    "address",
    "telecom",
    "effectiveTime"
})
public class Organization
    extends RegObject
{

    protected List<Identifier> identifier;
    protected List<String> name;
    protected CodeableConcept healthcareFacilityTypeCode;
    protected CodeableConcept practiceSettingCode;
    protected Address address;
    protected Telecom telecom;
    protected DateTime effectiveTime;

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
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getName() {
        if (name == null) {
            name = new ArrayList<String>();
        }
        return this.name;
    }

    /**
     * 获取healthcareFacilityTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getHealthcareFacilityTypeCode() {
        return healthcareFacilityTypeCode;
    }

    /**
     * 设置healthcareFacilityTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setHealthcareFacilityTypeCode(CodeableConcept value) {
        this.healthcareFacilityTypeCode = value;
    }

    /**
     * 获取practiceSettingCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getPracticeSettingCode() {
        return practiceSettingCode;
    }

    /**
     * 设置practiceSettingCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setPracticeSettingCode(CodeableConcept value) {
        this.practiceSettingCode = value;
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
     *     {@link DateTime }
     *     
     */
    public DateTime getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * 设置effectiveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEffectiveTime(DateTime value) {
        this.effectiveTime = value;
    }

}
