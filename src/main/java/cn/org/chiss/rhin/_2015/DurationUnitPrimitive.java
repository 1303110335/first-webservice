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
 * <p>durationUnitPrimitive的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="durationUnitPrimitive">
 *   &lt;restriction base="{http://www.chiss.org.cn/rhin/2015}stringPrimitive">
 *     &lt;enumeration value="yr"/>
 *     &lt;enumeration value="mth"/>
 *     &lt;enumeration value="wk"/>
 *     &lt;enumeration value="d"/>
 *     &lt;enumeration value="h"/>
 *     &lt;enumeration value="min"/>
 *     &lt;enumeration value="s"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "durationUnitPrimitive")
@XmlEnum
public enum DurationUnitPrimitive {

    @XmlEnumValue("yr")
    YR("yr"),
    @XmlEnumValue("mth")
    MTH("mth"),
    @XmlEnumValue("wk")
    WK("wk"),
    @XmlEnumValue("d")
    D("d"),
    @XmlEnumValue("h")
    H("h"),
    @XmlEnumValue("min")
    MIN("min"),
    @XmlEnumValue("s")
    S("s");
    private final java.lang.String value;

    DurationUnitPrimitive(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DurationUnitPrimitive fromValue(java.lang.String v) {
        for (DurationUnitPrimitive c: DurationUnitPrimitive.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
