//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.02.01 时间 10:16:45 AM CST 
//


package cn.org.chiss.rhin._2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HealthHistoryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HealthHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.chiss.org.cn/rhin/2015}CodeableConcept"/>
 *         &lt;element name="confirmedTime" type="{http://www.chiss.org.cn/rhin/2015}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthHistoryType", propOrder = {
    "name",
    "confirmedTime"
})
public class HealthHistoryType {

    @XmlElement(required = true)
    protected CodeableConcept name;
    protected DateTime confirmedTime;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setName(CodeableConcept value) {
        this.name = value;
    }

    /**
     * 获取confirmedTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getConfirmedTime() {
        return confirmedTime;
    }

    /**
     * 设置confirmedTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setConfirmedTime(DateTime value) {
        this.confirmedTime = value;
    }

}
