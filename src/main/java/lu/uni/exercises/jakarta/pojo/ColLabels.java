package lu.uni.exercises.jakarta.pojo;

public class ColLabels {
    private ColLabel[] ColLabel;

    public ColLabel[] getColLabel ()
    {
        return ColLabel;
    }

    public void setColLabel (ColLabel[] ColLabel)
    {
        this.ColLabel = ColLabel;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ColLabel = "+ColLabel+"]";
    }

}
