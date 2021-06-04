package lu.uni.exercises.jakarta.pojo;

public class RowHeader {

    private String rowdimcount;

    private RowDim RowDim;

    public String getRowdimcount ()
    {
        return rowdimcount;
    }

    public void setRowdimcount (String rowdimcount)
    {
        this.rowdimcount = rowdimcount;
    }

    public RowDim getRowDim ()
    {
        return RowDim;
    }

    public void setRowDim (RowDim RowDim)
    {
        this.RowDim = RowDim;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [rowdimcount = "+rowdimcount+", RowDim = "+RowDim+"]";
    }
}
