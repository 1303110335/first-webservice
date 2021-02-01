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
 * <p>Address complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}Any">
 *       &lt;sequence>
 *         &lt;element name="use" type="{http://www.chiss.org.cn/rhin/2015}AddressUse" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.chiss.org.cn/rhin/2015}AddressType" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="administrativeDivision" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="town" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="houseNumber" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="line" type="{http://www.chiss.org.cn/rhin/2015}String" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.chiss.org.cn/rhin/2015}Period" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "use",
    "type",
    "text",
    "administrativeDivision",
    "country",
    "state",
    "city",
    "district",
    "town",
    "street",
    "houseNumber",
    "line",
    "postalCode",
    "period"
})
public class Address
    extends Any
{

    protected AddressUse use;
    protected AddressType type;
    protected String text;
    protected String administrativeDivision;
    protected String country;
    protected String state;
    protected String city;
    protected String district;
    protected String town;
    protected String street;
    protected String houseNumber;
    protected List<String> line;
    protected String postalCode;
    protected Period period;

    /**
     * 获取use属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressUse }
     *     
     */
    public AddressUse getUse() {
        return use;
    }

    /**
     * 设置use属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUse }
     *     
     */
    public void setUse(AddressUse value) {
        this.use = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setType(AddressType value) {
        this.type = value;
    }

    /**
     * 获取text属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * 设置text属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * 获取administrativeDivision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrativeDivision() {
        return administrativeDivision;
    }

    /**
     * 设置administrativeDivision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrativeDivision(String value) {
        this.administrativeDivision = value;
    }

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * 获取district属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置district属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * 获取town属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * 设置town属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * 获取street属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置street属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * 获取houseNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * 设置houseNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLine() {
        if (line == null) {
            line = new ArrayList<String>();
        }
        return this.line;
    }

    /**
     * 获取postalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置postalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * 获取period属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * 设置period属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

}
