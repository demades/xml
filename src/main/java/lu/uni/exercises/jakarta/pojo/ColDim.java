package lu.uni.exercises.jakarta.pojo;

public class ColDim {
	
    private String DimLabel;

    private String position;

    private ColLabels ColLabels;

    public String getDimLabel ()
    {
        return DimLabel;
    }

    public void setDimLabel (String DimLabel)
    {
        this.DimLabel = DimLabel;
    }

    public String getPosition ()
    {
        return position;
    }

    public void setPosition (String position)
    {
        this.position = position;
    }

    public ColLabels getColLabels ()
    {
        return ColLabels;
    }

    public void setColLabels (ColLabels ColLabels)
    {
        this.ColLabels = ColLabels;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DimLabel = "+DimLabel+", position = "+position+", ColLabels = "+ColLabels+"]";
    }

}
