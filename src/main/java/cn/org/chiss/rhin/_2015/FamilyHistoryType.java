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
 * <p>FamilyHistoryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FamilyHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relatives" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="relativeType" type="{http://www.chiss.org.cn/rhin/2015}Coding"/>
 *                   &lt;element name="diseaseHistory" type="{http://www.chiss.org.cn/rhin/2015}HealthHistoryType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyHistoryType", propOrder = {
    "relatives"
})
public class FamilyHistoryType {

    @XmlElement(required = true)
    protected List<FamilyHistoryType.Relatives> relatives;

    /**
     * Gets the value of the relatives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyHistoryType.Relatives }
     * 
     * 
     */
    public List<FamilyHistoryType.Relatives> getRelatives() {
        if (relatives == null) {
            relatives = new ArrayList<FamilyHistoryType.Relatives>();
        }
        return this.relatives;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="relativeType" type="{http://www.chiss.org.cn/rhin/2015}Coding"/>
     *         &lt;element name="diseaseHistory" type="{http://www.chiss.org.cn/rhin/2015}HealthHistoryType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "relativeType",
        "diseaseHistory"
    })
    public static class Relatives {

        @XmlElement(required = true)
        protected Coding relativeType;
        @XmlElement(required = true)
        protected HealthHistoryType diseaseHistory;

        /**
         * 获取relativeType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Coding }
         *     
         */
        public Coding getRelativeType() {
            return relativeType;
        }

        /**
         * 设置relativeType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Coding }
         *     
         */
        public void setRelativeType(Coding value) {
            this.relativeType = value;
        }

        /**
         * 获取diseaseHistory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HealthHistoryType }
         *     
         */
        public HealthHistoryType getDiseaseHistory() {
            return diseaseHistory;
        }

        /**
         * 设置diseaseHistory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HealthHistoryType }
         *     
         */
        public void setDiseaseHistory(HealthHistoryType value) {
            this.diseaseHistory = value;
        }

    }

}
