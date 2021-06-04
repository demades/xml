package lu.uni.exercises.jakarta.xml.xmlComponents;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMixed;

@XmlAccessorType (XmlAccessType.FIELD)
public class Row {
	
  
	@XmlElement(name="Cells")
	private Cells cells = null;
	
	@XmlElement(name="RowLabels")
	private RowLabels rowLabels = null;

	public Cells getCells() {
		return cells;
	}

	public void setCells(Cells cells) {
		this.cells = cells;
	}

	public RowLabels getRowLabels() {
		return rowLabels;
	}

	public void setRowLabels(RowLabels rowLabels) {
		this.rowLabels = rowLabels;
	}



	
	

}
