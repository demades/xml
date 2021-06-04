package lu.uni.exercises.jakarta.pojo;

public class Data {
    private String colspan;

    private String rowPos;

    private String d;

    private Headers Headers;

    private String rowspan;

    private String colPos;

    private String rows;

    private String cols;

    private Rows Rows;

    public String getColspan ()
    {
        return colspan;
    }

    public void setColspan (String colspan)
    {
        this.colspan = colspan;
    }

    public String getRowPos ()
    {
        return rowPos;
    }

    public void setRowPos (String rowPos)
    {
        this.rowPos = rowPos;
    }

    public String getD ()
    {
        return d;
    }

    public void setD (String d)
    {
        this.d = d;
    }

    public Headers getHeaders ()
    {
        return Headers;
    }

    public void setHeaders (Headers Headers)
    {
        this.Headers = Headers;
    }

    public String getRowspan ()
    {
        return rowspan;
    }

    public void setRowspan (String rowspan)
    {
        this.rowspan = rowspan;
    }

    public String getColPos ()
    {
        return colPos;
    }

    public void setColPos (String colPos)
    {
        this.colPos = colPos;
    }

    public String getRows ()
    {
        return rows;
    }

    public void setRows (String rows)
    {
        this.rows = rows;
    }

    public String getCols ()
    {
        return cols;
    }

    public void setCols (String cols)
    {
        this.cols = cols;
    }

    public void setRows (Rows Rows)
    {
        this.Rows = Rows;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [colspan = "+colspan+", rowPos = "+rowPos+", d = "+d+", Headers = "+Headers+", rowspan = "+rowspan+", colPos = "+colPos+", rows = "+rows+", cols = "+cols+", Rows = "+Rows+"]";
    }
}
