package lu.uni.exercises.jakarta.xml;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType (XmlAccessType.FIELD)
public class Row {
	
	@XmlElement(name="Cells")
	private List<Cells> cells = null;

}
