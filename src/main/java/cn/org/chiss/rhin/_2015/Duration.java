//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.02.01 时间 10:16:45 AM CST 
//


package cn.org.chiss.rhin._2015;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Duration complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Duration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.chiss.org.cn/rhin/2015}Any">
 *       &lt;attribute name="value" type="{http://www.chiss.org.cn/rhin/2015}unsignedIntPrimitive" />
 *       &lt;attribute name="unit" type="{http://www.chiss.org.cn/rhin/2015}durationUnitPrimitive" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Duration")
public class Duration
    extends Any
{

    @XmlAttribute(name = "value")
    protected BigInteger value;
    @XmlAttribute(name = "unit")
    protected DurationUnitPrimitive unit;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitPrimitive }
     *     
     */
    public DurationUnitPrimitive getUnit() {
        return unit;
    }

    /**
     * 设置unit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitPrimitive }
     *     
     */
    public void setUnit(DurationUnitPrimitive value) {
        this.unit = value;
    }

}
