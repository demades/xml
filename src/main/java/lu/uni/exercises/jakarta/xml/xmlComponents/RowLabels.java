package lu.uni.exercises.jakarta.xml.xmlComponents;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lu.uni.exercises.jakarta.pojo.RowLabel;

public class RowLabels {
	
    private RowLabel RowLabel;

    public RowLabel getRowLabel ()
    {
        return RowLabel;
    }

    public void setRowLabel (RowLabel RowLabel)
    {
        this.RowLabel = RowLabel;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [RowLabel = "+RowLabel+"]";
    }
	
}
