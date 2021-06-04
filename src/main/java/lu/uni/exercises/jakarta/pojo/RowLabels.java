package lu.uni.exercises.jakarta.pojo;

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
