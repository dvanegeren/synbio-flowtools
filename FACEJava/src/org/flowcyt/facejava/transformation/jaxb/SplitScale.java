//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.08.17 at 04:09:29 PM PDT 
//


package org.flowcyt.facejava.transformation.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				A split scale transformation
 * 				
 * 				The split scale transformation is defined as follows:
 * 				if(parameter less then t):	split(parameter) = a * parameter + b
 * 				otherwise:			split(parameter) = log10 (c * parameter) * r/d
 * 				
 * 				The split scale transformation is specified by the split element with the following attributes:
 * 				
 * 				parameter		The FCS parameter the transformation is applied to.
 * 				maxValue		Maximum value the transformation is applied to, e.g., 262144.
 * 				transitionChannel	Where to split the linear vs. logarithmical transformation, e.g., a quarter of the 
 * 							maximum value after the transformation	(e.g., 64 in case the max value 
 * 							after the transformation is 256).
 * 				r			Range of the logarithmical display, i.e., "maxChannel - transitionChannel" considering the
 * 							maxChannel as the maximum value to be obtained after the transformation.
 * 
 * 				The constants t, a, b, c, maxChannel, and d (needed to perform the transformation) are calculated as follows:
 * 				(le =  log10(e) = approx. 0.434294482)
 * 				
 * 				maxChannel = r + transitionChannel 
 * 					(maxChannel is the maximum value to be obtained after the transformation , e.g., 256 = 192 + 64)
 * 				b = transitionChannel / 2
 * 				d = 2*le*r / transitionChannel
 * 				t = 10^(-2*le*r / transitionChannel + log10(maxValue))
 * 				a = transitionChannel / (2*t)
 * 				c = (10^((a*t + b) * d / r)) / t
 * 			
 * 
 * <p>Java class for Split-scale complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Split-scale">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isac-net.org/std/Transformation-ML/v1.0/}AbstractPredefinedTransformation">
 *       &lt;attribute name="maxValue" use="required" type="{http://www.isac-net.org/std/common-types/v1.0/}PositiveDouble" />
 *       &lt;attribute name="r" use="required" type="{http://www.isac-net.org/std/common-types/v1.0/}PositiveDouble" />
 *       &lt;attribute name="transitionChannel" use="required" type="{http://www.isac-net.org/std/common-types/v1.0/}NonNegativeDouble" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Split-scale", namespace = "http://www.isac-net.org/std/Transformation-ML/v1.0/")
public class SplitScale
    extends AbstractPredefinedTransformation
{

    @XmlAttribute(namespace = "http://www.isac-net.org/std/Transformation-ML/v1.0/", required = true)
    protected double maxValue;
    @XmlAttribute(namespace = "http://www.isac-net.org/std/Transformation-ML/v1.0/", required = true)
    protected double r;
    @XmlAttribute(namespace = "http://www.isac-net.org/std/Transformation-ML/v1.0/", required = true)
    protected double transitionChannel;

    /**
     * Gets the value of the maxValue property.
     * 
     */
    public double getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     */
    public void setMaxValue(double value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the r property.
     * 
     */
    public double getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     */
    public void setR(double value) {
        this.r = value;
    }

    /**
     * Gets the value of the transitionChannel property.
     * 
     */
    public double getTransitionChannel() {
        return transitionChannel;
    }

    /**
     * Sets the value of the transitionChannel property.
     * 
     */
    public void setTransitionChannel(double value) {
        this.transitionChannel = value;
    }

}