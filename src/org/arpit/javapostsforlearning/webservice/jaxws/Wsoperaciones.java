
package org.arpit.javapostsforlearning.webservice.jaxws;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "wsoperaciones", namespace = "http://webservice.javapostsforlearning.arpit.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsoperaciones", namespace = "http://webservice.javapostsforlearning.arpit.org/")
public class Wsoperaciones {

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

}
