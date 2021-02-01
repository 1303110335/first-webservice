//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.02.01 时间 10:16:45 AM CST 
//


package cn.org.chiss.rhin._2015;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>nullFlavorPrimitive的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="nullFlavorPrimitive">
 *   &lt;restriction base="{http://www.chiss.org.cn/rhin/2015}stringPrimitive">
 *     &lt;enumeration value="UNK"/>
 *     &lt;enumeration value="NAV"/>
 *     &lt;enumeration value="NASK"/>
 *     &lt;enumeration value="ASKU"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="NI"/>
 *     &lt;enumeration value="MSK"/>
 *     &lt;enumeration value="OTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nullFlavorPrimitive")
@XmlEnum
public enum NullFlavorPrimitive {

    UNK,
    NAV,
    NASK,
    ASKU,
    NP,
    NA,
    NI,
    MSK,
    OTH;

    public java.lang.String value() {
        return name();
    }

    public static NullFlavorPrimitive fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
