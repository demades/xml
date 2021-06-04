package lu.uni.exercises.jakarta.pojo;

public class ColHeader {
    private String coldimcount;

    private ColDim ColDim;

    public String getColdimcount ()
    {
        return coldimcount;
    }

    public void setColdimcount (String coldimcount)
    {
        this.coldimcount = coldimcount;
    }

    public ColDim getColDim ()
    {
        return ColDim;
    }

    public void setColDim (ColDim ColDim)
    {
        this.ColDim = ColDim;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [coldimcount = "+coldimcount+", ColDim = "+ColDim+"]";
    }

}
