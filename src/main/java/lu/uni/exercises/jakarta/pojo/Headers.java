package lu.uni.exercises.jakarta.pojo;

public class Headers {
    private String colspan;

    private Slicer Slicer;

    private String rowspan;

    private RowHeader RowHeader;

    private ColHeader ColHeader;

    public String getColspan ()
    {
        return colspan;
    }

    public void setColspan (String colspan)
    {
        this.colspan = colspan;
    }

    public Slicer getSlicer ()
    {
        return Slicer;
    }

    public void setSlicer (Slicer Slicer)
    {
        this.Slicer = Slicer;
    }

    public String getRowspan ()
    {
        return rowspan;
    }

    public void setRowspan (String rowspan)
    {
        this.rowspan = rowspan;
    }

    public RowHeader getRowHeader ()
    {
        return RowHeader;
    }

    public void setRowHeader (RowHeader RowHeader)
    {
        this.RowHeader = RowHeader;
    }

    public ColHeader getColHeader ()
    {
        return ColHeader;
    }

    public void setColHeader (ColHeader ColHeader)
    {
        this.ColHeader = ColHeader;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [colspan = "+colspan+", Slicer = "+Slicer+", rowspan = "+rowspan+", RowHeader = "+RowHeader+", ColHeader = "+ColHeader+"]";
    }


}
