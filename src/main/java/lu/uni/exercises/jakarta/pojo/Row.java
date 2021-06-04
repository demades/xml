package lu.uni.exercises.jakarta.pojo;

public class Row {
    private RowLabels RowLabels;

    private Cells Cells;

    public RowLabels getRowLabels ()
    {
        return RowLabels;
    }

    public void setRowLabels (RowLabels RowLabels)
    {
        this.RowLabels = RowLabels;
    }

    public Cells getCells ()
    {
        return Cells;
    }

    public void setCells (Cells Cells)
    {
        this.Cells = Cells;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [RowLabels = "+RowLabels+", Cells = "+Cells+"]";
    }

}
