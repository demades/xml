package lu.uni.exercises.jakarta.xml;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Data")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class Data {
	
	@XmlElement(name = "Rows")
    private List<Rows> rowsList;
 

	
    

}
