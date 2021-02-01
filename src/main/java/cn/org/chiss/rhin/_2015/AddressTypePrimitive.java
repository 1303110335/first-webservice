//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.02.01 时间 10:16:45 AM CST 
//


package cn.org.chiss.rhin._2015;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addressTypePrimitive的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="addressTypePrimitive">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Postal"/>
 *     &lt;enumeration value="Physical"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "addressTypePrimitive")
@XmlEnum
public enum AddressTypePrimitive {


    /**
     * 投递地址
     * 
     */
    @XmlEnumValue("Postal")
    POSTAL("Postal"),

    /**
     * 地理位置.
     * 
     */
    @XmlEnumValue("Physical")
    PHYSICAL("Physical"),

    /**
     * 投递地址与地理位置通用.
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final java.lang.String value;

    AddressTypePrimitive(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AddressTypePrimitive fromValue(java.lang.String v) {
        for (AddressTypePrimitive c: AddressTypePrimitive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
