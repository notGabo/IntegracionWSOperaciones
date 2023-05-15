
package org.arpit.javapostsforlearning.webservice.jaxws;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "procesarPagoResponse", namespace = "http://webservice.javapostsforlearning.arpit.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "procesarPagoResponse", namespace = "http://webservice.javapostsforlearning.arpit.org/")
public class ProcesarPagoResponse {

    @XmlElement(name = "return", namespace = "")
    private Integer _return;

    /**
     * 
     * @return
     *     returns String
     */
    public Integer getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Integer _return) {
        this._return = _return;
    }

}
