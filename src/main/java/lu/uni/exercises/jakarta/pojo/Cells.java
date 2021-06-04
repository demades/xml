package lu.uni.exercises.jakarta.pojo;

public class Cells {

    private C[] C;

    public C[] getC ()
    {
        return C;
    }

    public void setC (C[] C)
    {
        this.C = C;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [C = "+C+"]";
    }
}
