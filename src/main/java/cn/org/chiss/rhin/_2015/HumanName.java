//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.02.01 时间 10:16:45 AM CST 
//


package cn.org.chiss.rhin._2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 人的姓名
 * 
 * <p>HumanName complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HumanName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}Any">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="use" type="{http://www.chiss.org.cn/rhin/2015}NameUse" minOccurs="0"/>
 *         &lt;element name="family" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="given" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="prefix" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.chiss.org.cn/rhin/2015}Period" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" type="{http://www.chiss.org.cn/rhin/2015}stringPrimitive" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HumanName", propOrder = {
    "use",
    "family",
    "given",
    "prefix",
    "suffix",
    "period",
    "text"
})
public class HumanName
    extends Any
{

    protected NameUse use;
    protected cn.org.chiss.rhin._2015.String family;
    protected cn.org.chiss.rhin._2015.String given;
    protected cn.org.chiss.rhin._2015.String prefix;
    protected cn.org.chiss.rhin._2015.String suffix;
    protected Period period;
    protected cn.org.chiss.rhin._2015.String text;
    @XmlAttribute(name = "value")
    protected java.lang.String value;

    /**
     * 获取use属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameUse }
     *     
     */
    public NameUse getUse() {
        return use;
    }

    /**
     * 设置use属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameUse }
     *     
     */
    public void setUse(NameUse value) {
        this.use = value;
    }

    /**
     * 获取family属性的值。
     * 
     * @return
     *     possible object is
     *     {@link cn.org.chiss.rhin._2015.String }
     *     
     */
    public cn.org.chiss.rhin._2015.String getFamily() {
        return family;
    }

    /**
     * 设置family属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link cn.org.chiss.rhin._2015.String }
     *     
     */
    public void setFamily(cn.org.chiss.rhin._2015.String value) {
        this.family = value;
    }

    /**
     * 获取given属性的值。
     * 
     * @return
     *     possible object is
     *     {@link cn.org.chiss.rhin._2015.String }
     *     
     */
    public cn.org.chiss.rhin._2015.String getGiven() {
        return given;
    }

    /**
     * 设置given属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link cn.org.chiss.rhin._2015.String }
     *     
     */
    public void setGiven(cn.org.chiss.rhin._2015.String value) {
        this.given = value;
    }

    /**
     * 获取prefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link cn.org.chiss.rhin._2015.String }
     *     
     */
    public cn.org.chiss.rhin._2015.String getPrefix() {
        return prefix;
    }

    /**
     * 设置prefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link cn.org.chiss.rhin._2015.String }
     *     
     */
    public void setPrefix(cn.org.chiss.rhin._2015.String value) {
        this.prefix = value;
    }

    /**
     * 获取suffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link cn.org.chiss.rhin._2015.String }
     *     
     */
    public cn.org.chiss.rhin._2015.String getSuffix() {
        return suffix;
    }

    /**
     * 设置suffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link cn.org.chiss.rhin._2015.String }
     *     
     */
    public void setSuffix(cn.org.chiss.rhin._2015.String value) {
        this.suffix = value;
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

    /**
     * 获取text属性的值。
     * 
     * @return
     *     possible object is
     *     {@link cn.org.chiss.rhin._2015.String }
     *     
     */
    public cn.org.chiss.rhin._2015.String getText() {
        return text;
    }

    /**
     * 设置text属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link cn.org.chiss.rhin._2015.String }
     *     
     */
    public void setText(cn.org.chiss.rhin._2015.String value) {
        this.text = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

}
