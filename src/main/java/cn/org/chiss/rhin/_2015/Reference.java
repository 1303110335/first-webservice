//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.02.01 时间 10:16:45 AM CST 
//


package cn.org.chiss.rhin._2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 引用
 * 
 * <p>Reference complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Reference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}Any">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{http://www.chiss.org.cn/rhin/2015}Identifier" minOccurs="0"/>
 *         &lt;element name="display" type="{http://www.chiss.org.cn/rhin/2015}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference", propOrder = {
    "reference",
    "display"
})
public class Reference
    extends Any
{

    protected Identifier reference;
    protected String display;

    /**
     * 获取reference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getReference() {
        return reference;
    }

    /**
     * 设置reference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setReference(Identifier value) {
        this.reference = value;
    }

    /**
     * 获取display属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplay() {
        return display;
    }

    /**
     * 设置display属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplay(String value) {
        this.display = value;
    }

}
