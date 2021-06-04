package lu.uni.exercises.jakarta.xml.xmlComponents;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType (XmlAccessType.FIELD)
public class C {

    @XmlAttribute(name="v")
    private String v;

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}



}
