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
 * <p>CodeableConcept complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CodeableConcept">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}Any">
 *       &lt;sequence>
 *         &lt;element name="coding" type="{http://www.chiss.org.cn/rhin/2015}Coding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeableConcept", propOrder = {
    "coding",
    "text"
})
public class CodeableConcept
    extends Any
{

    protected List<Coding> coding;
    protected String text;

    /**
     * Gets the value of the coding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    public List<Coding> getCoding() {
        if (coding == null) {
            coding = new ArrayList<Coding>();
        }
        return this.coding;
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

}
