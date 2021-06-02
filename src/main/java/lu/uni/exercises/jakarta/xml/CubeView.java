package lu.uni.exercises.jakarta.xml;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CubeView")
@XmlAccessorType (XmlAccessType.FIELD)
public class CubeView {
	
	@XmlElement(name = "Data")
	private Data data = null;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}




	
	

}
