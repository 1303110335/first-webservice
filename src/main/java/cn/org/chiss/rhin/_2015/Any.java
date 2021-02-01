//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.02.01 时间 10:16:45 AM CST 
//


package cn.org.chiss.rhin._2015;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Any complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Any">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="nullFlavor" type="{http://www.chiss.org.cn/rhin/2015}nullFlavorPrimitive" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Any")
@XmlSeeAlso({
    Base64Binary.class,
    Address.class,
    NameUse.class,
    String.class,
    DateTime.class,
    NCName.class,
    Identifier.class,
    Decimal.class,
    Coding.class,
    Boolean.class,
    UUID.class,
    Instant.class,
    Period.class,
    Duration.class,
    OID.class,
    Code.class,
    UnsignedInt.class,
    CodeableConcept.class,
    Time.class,
    URI.class,
    URN.class,
    ObjectStatus.class,
    HumanName.class,
    AddressUse.class,
    Language.class,
    ID.class,
    QName.class,
    Reference.class,
    Quantity.class,
    TelecomMode.class,
    Date.class,
    Integer.class,
    BackboneElement.class,
    AddressType.class
})
public abstract class Any {

    @XmlAttribute(name = "nullFlavor")
    protected NullFlavorPrimitive nullFlavor;

    /**
     * 获取nullFlavor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NullFlavorPrimitive }
     *     
     */
    public NullFlavorPrimitive getNullFlavor() {
        return nullFlavor;
    }

    /**
     * 设置nullFlavor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NullFlavorPrimitive }
     *     
     */
    public void setNullFlavor(NullFlavorPrimitive value) {
        this.nullFlavor = value;
    }

}
