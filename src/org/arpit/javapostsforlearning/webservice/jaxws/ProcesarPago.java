
package org.arpit.javapostsforlearning.webservice.jaxws;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "procesarPago", namespace = "http://webservice.javapostsforlearning.arpit.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "procesarPago", namespace = "http://webservice.javapostsforlearning.arpit.org/")
public class ProcesarPago {

    @XmlElement(name = "arg0", namespace = "")
    private int arg0;

    /**
     * 
     * @return
     *     returns String
     */
    public int getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(int arg0) {
        this.arg0 = arg0;
    }

    @XmlElement(name="arg1", namespace = "")
    private int arg1;

    public int getArg1() { return this.arg1; }

    public void setArg1(int arg1) {this.arg1 = arg1;}

}
