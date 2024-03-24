//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.29 at 01:43:42 PM ICT 
//


package com.net.running_web_service;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="runningEvent" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="runningEventName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="confidence" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "runningEvent"
})
@XmlRootElement(name = "getRecommendEventResponse")
public class GetRecommendEventResponse {

    protected List<GetRecommendEventResponse.RunningEvent> runningEvent;

    /**
     * Gets the value of the runningEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the runningEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunningEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetRecommendEventResponse.RunningEvent }
     * 
     * 
     */
    public List<GetRecommendEventResponse.RunningEvent> getRunningEvent() {
        if (runningEvent == null) {
            runningEvent = new ArrayList<GetRecommendEventResponse.RunningEvent>();
        }
        return this.runningEvent;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="runningEventName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="confidence" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "runningEventName",
        "confidence"
    })
    public static class RunningEvent {

        @XmlElement(required = true)
        protected String runningEventName;
        @XmlElement(required = true)
        protected String confidence;

        /**
         * Gets the value of the runningEventName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRunningEventName() {
            return runningEventName;
        }

        /**
         * Sets the value of the runningEventName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRunningEventName(String value) {
            this.runningEventName = value;
        }

        /**
         * Gets the value of the confidence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfidence() {
            return confidence;
        }

        /**
         * Sets the value of the confidence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfidence(String value) {
            this.confidence = value;
        }

    }

}
