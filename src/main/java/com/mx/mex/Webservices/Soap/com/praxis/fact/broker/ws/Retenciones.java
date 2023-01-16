
package com.mx.mex.Webservices.Soap.com.praxis.fact.broker.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para retenciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="retenciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listRetencion" type="{http://ws.broker.fact.praxis.com/}retencion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retenciones", propOrder = {
    "listRetencion"
})
public class Retenciones {

    @XmlElement(nillable = true)
    protected List<Retencion> listRetencion;

    /**
     * Gets the value of the listRetencion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listRetencion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListRetencion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Retencion }
     * 
     * 
     */
    public List<Retencion> getListRetencion() {
        if (listRetencion == null) {
            listRetencion = new ArrayList<Retencion>();
        }
        return this.listRetencion;
    }

}
