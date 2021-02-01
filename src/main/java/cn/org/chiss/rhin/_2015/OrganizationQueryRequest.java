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
 * IST-MIR2：医疗机构信息查询条件数据类型
 *             
 * 
 * <p>OrganizationQueryRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrganizationQueryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="from" type="{http://www.chiss.org.cn/rhin/2015}Integer" minOccurs="0"/>
 *         &lt;element name="maxCount" type="{http://www.chiss.org.cn/rhin/2015}Integer" minOccurs="0"/>
 *         &lt;element name="adhocQuery" type="{http://www.chiss.org.cn/rhin/2015}AdhocQuery"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationQueryRequest", propOrder = {
    "from",
    "maxCount",
    "adhocQuery"
})
public class OrganizationQueryRequest {

    protected Integer from;
    protected Integer maxCount;
    @XmlElement(required = true)
    protected AdhocQuery adhocQuery;

    /**
     * 获取from属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFrom() {
        return from;
    }

    /**
     * 设置from属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrom(Integer value) {
        this.from = value;
    }

    /**
     * 获取maxCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    /**
     * 设置maxCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCount(Integer value) {
        this.maxCount = value;
    }

    /**
     * 获取adhocQuery属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdhocQuery }
     *     
     */
    public AdhocQuery getAdhocQuery() {
        return adhocQuery;
    }

    /**
     * 设置adhocQuery属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdhocQuery }
     *     
     */
    public void setAdhocQuery(AdhocQuery value) {
        this.adhocQuery = value;
    }

}
