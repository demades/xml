package lu.uni.exercises.jakarta.pojo;

public class Rows {
    private Row[] Row;

    public Row[] getRow ()
    {
        return Row;
    }

    public void setRow (Row[] Row)
    {
        this.Row = Row;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Row = "+Row+"]";
    }

}
