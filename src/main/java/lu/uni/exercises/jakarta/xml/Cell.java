package lu.uni.exercises.jakarta.xml;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "C")
@XmlAccessorType (XmlAccessType.FIELD)

public class Cell {
	private int v;

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public Cell() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
