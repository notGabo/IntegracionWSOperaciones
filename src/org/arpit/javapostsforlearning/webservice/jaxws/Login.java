
package org.arpit.javapostsforlearning.webservice.jaxws;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "login", namespace = "http://webservice.javapostsforlearning.arpit.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "login", namespace = "http://webservice.javapostsforlearning.arpit.org/")
public class Login {

    @XmlElement(name = "arg0", namespace = "")
    private String arg0;

    /**
     * 
     * @return
     *     returns String
     */
    public String getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(String arg0) {
        this.arg0 = arg0;
    }

    @XmlElement(name="arg1", namespace = "")
    private String arg1;

    public String getArg1() { return this.arg1; }

    public void setArg1(String arg1) {this.arg1 = arg1;}

}
