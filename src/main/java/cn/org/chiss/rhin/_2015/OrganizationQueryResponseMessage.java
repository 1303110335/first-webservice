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
 * IST-MIR2：响应信息数据类型
 * 
 * <p>OrganizationQueryResponseMessage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrganizationQueryResponseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalCount" type="{http://www.chiss.org.cn/rhin/2015}Integer"/>
 *         &lt;element name="from" type="{http://www.chiss.org.cn/rhin/2015}Integer" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.chiss.org.cn/rhin/2015}Integer" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://www.chiss.org.cn/rhin/2015}Organization" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationQueryResponseMessage", propOrder = {
    "totalCount",
    "from",
    "count",
    "organization"
})
public class OrganizationQueryResponseMessage {

    @XmlElement(required = true)
    protected Integer totalCount;
    protected Integer from;
    protected Integer count;
    protected List<Organization> organization;

    /**
     * 获取totalCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * 设置totalCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

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
     * 获取count属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置count属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organization }
     * 
     * 
     */
    public List<Organization> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<Organization>();
        }
        return this.organization;
    }

}
