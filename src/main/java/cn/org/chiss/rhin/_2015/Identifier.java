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
 * 标识域ID
 * 
 * <p>Identifier complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Identifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}Any">
 *       &lt;sequence>
 *         &lt;element name="system" type="{http://www.chiss.org.cn/rhin/2015}URI" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.chiss.org.cn/rhin/2015}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifier", propOrder = {
    "system",
    "value"
})
public class Identifier
    extends Any
{

    protected URI system;
    protected ID value;

    /**
     * 获取system属性的值。
     * 
     * @return
     *     possible object is
     *     {@link URI }
     *     
     */
    public URI getSystem() {
        return system;
    }

    /**
     * 设置system属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link URI }
     *     
     */
    public void setSystem(URI value) {
        this.system = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setValue(ID value) {
        this.value = value;
    }

}
