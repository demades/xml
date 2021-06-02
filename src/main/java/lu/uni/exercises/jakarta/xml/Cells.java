package lu.uni.exercises.jakarta.xml;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType (XmlAccessType.FIELD)
public class Cells {
	@XmlElement(name="C")
	private List<C> c = null;

}
