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
 * <p>nameUsePrimitive的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="nameUsePrimitive">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Usual"/>
 *     &lt;enumeration value="Official"/>
 *     &lt;enumeration value="Temp"/>
 *     &lt;enumeration value="Nickname"/>
 *     &lt;enumeration value="Anonymous"/>
 *     &lt;enumeration value="Old"/>
 *     &lt;enumeration value="Maiden"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nameUsePrimitive")
@XmlEnum
public enum NameUsePrimitive {


    /**
     * 常用名
     * 
     */
    @XmlEnumValue("Usual")
    USUAL("Usual"),

    /**
     * 正式名字
     * 
     */
    @XmlEnumValue("Official")
    OFFICIAL("Official"),

    /**
     * 临时名字
     * 
     */
    @XmlEnumValue("Temp")
    TEMP("Temp"),

    /**
     * 昵称、网名、号
     * 
     */
    @XmlEnumValue("Nickname")
    NICKNAME("Nickname"),

    /**
     * 别名（字）
     * 
     */
    @XmlEnumValue("Anonymous")
    ANONYMOUS("Anonymous"),

    /**
     * 曾用名
     * 
     */
    @XmlEnumValue("Old")
    OLD("Old"),

    /**
     * 婚前名
     * 
     */
    @XmlEnumValue("Maiden")
    MAIDEN("Maiden");
    private final java.lang.String value;

    NameUsePrimitive(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NameUsePrimitive fromValue(java.lang.String v) {
        for (NameUsePrimitive c: NameUsePrimitive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
