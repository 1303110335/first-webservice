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
 * <p>PhysicalCondition complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PhysicalCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="booldType" type="{http://www.chiss.org.cn/rhin/2015}BloodType" minOccurs="0"/>
 *         &lt;element name="allergicHistory" type="{http://www.chiss.org.cn/rhin/2015}HealthHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="diseaseHistory" type="{http://www.chiss.org.cn/rhin/2015}HealthHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operationHistory" type="{http://www.chiss.org.cn/rhin/2015}HealthHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rtaumaHistory" type="{http://www.chiss.org.cn/rhin/2015}HealthHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transfusionHistory" type="{http://www.chiss.org.cn/rhin/2015}HealthHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="geneticHistory" type="{http://www.chiss.org.cn/rhin/2015}HealthHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="familyHistory" type="{http://www.chiss.org.cn/rhin/2015}FamilyHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="disabilitySituation" type="{http://www.chiss.org.cn/rhin/2015}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalCondition", propOrder = {
    "booldType",
    "allergicHistory",
    "diseaseHistory",
    "operationHistory",
    "rtaumaHistory",
    "transfusionHistory",
    "geneticHistory",
    "familyHistory",
    "disabilitySituation"
})
public class PhysicalCondition {

    protected BloodType booldType;
    protected List<HealthHistoryType> allergicHistory;
    protected List<HealthHistoryType> diseaseHistory;
    protected List<HealthHistoryType> operationHistory;
    protected List<HealthHistoryType> rtaumaHistory;
    protected List<HealthHistoryType> transfusionHistory;
    protected List<HealthHistoryType> geneticHistory;
    protected List<FamilyHistoryType> familyHistory;
    protected List<CodeableConcept> disabilitySituation;

    /**
     * 获取booldType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BloodType }
     *     
     */
    public BloodType getBooldType() {
        return booldType;
    }

    /**
     * 设置booldType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BloodType }
     *     
     */
    public void setBooldType(BloodType value) {
        this.booldType = value;
    }

    /**
     * Gets the value of the allergicHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allergicHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllergicHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthHistoryType }
     * 
     * 
     */
    public List<HealthHistoryType> getAllergicHistory() {
        if (allergicHistory == null) {
            allergicHistory = new ArrayList<HealthHistoryType>();
        }
        return this.allergicHistory;
    }

    /**
     * Gets the value of the diseaseHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diseaseHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiseaseHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthHistoryType }
     * 
     * 
     */
    public List<HealthHistoryType> getDiseaseHistory() {
        if (diseaseHistory == null) {
            diseaseHistory = new ArrayList<HealthHistoryType>();
        }
        return this.diseaseHistory;
    }

    /**
     * Gets the value of the operationHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthHistoryType }
     * 
     * 
     */
    public List<HealthHistoryType> getOperationHistory() {
        if (operationHistory == null) {
            operationHistory = new ArrayList<HealthHistoryType>();
        }
        return this.operationHistory;
    }

    /**
     * Gets the value of the rtaumaHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rtaumaHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtaumaHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthHistoryType }
     * 
     * 
     */
    public List<HealthHistoryType> getRtaumaHistory() {
        if (rtaumaHistory == null) {
            rtaumaHistory = new ArrayList<HealthHistoryType>();
        }
        return this.rtaumaHistory;
    }

    /**
     * Gets the value of the transfusionHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transfusionHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransfusionHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthHistoryType }
     * 
     * 
     */
    public List<HealthHistoryType> getTransfusionHistory() {
        if (transfusionHistory == null) {
            transfusionHistory = new ArrayList<HealthHistoryType>();
        }
        return this.transfusionHistory;
    }

    /**
     * Gets the value of the geneticHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geneticHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneticHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthHistoryType }
     * 
     * 
     */
    public List<HealthHistoryType> getGeneticHistory() {
        if (geneticHistory == null) {
            geneticHistory = new ArrayList<HealthHistoryType>();
        }
        return this.geneticHistory;
    }

    /**
     * Gets the value of the familyHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyHistoryType }
     * 
     * 
     */
    public List<FamilyHistoryType> getFamilyHistory() {
        if (familyHistory == null) {
            familyHistory = new ArrayList<FamilyHistoryType>();
        }
        return this.familyHistory;
    }

    /**
     * Gets the value of the disabilitySituation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilitySituation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilitySituation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getDisabilitySituation() {
        if (disabilitySituation == null) {
            disabilitySituation = new ArrayList<CodeableConcept>();
        }
        return this.disabilitySituation;
    }

}
