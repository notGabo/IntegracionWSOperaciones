
package org.arpit.javapostsforlearning.webservice.jaxws;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "loginResponse", namespace = "http://webservice.javapostsforlearning.arpit.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginResponse", namespace = "http://webservice.javapostsforlearning.arpit.org/")
public class LoginResponse {

    @XmlElement(name = "return", namespace = "")
    private String _return;

    /**
     * 
     * @return
     *     returns String
     */
    public String getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(String _return) {
        this._return = _return;
    }

}
