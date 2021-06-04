package lu.uni.exercises.jakarta.pojo;

public class MemberNotes {

    private Notes[] Notes;

    public Notes[] getNotes ()
    {
        return Notes;
    }

    public void setNotes (Notes[] Notes)
    {
        this.Notes = Notes;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Notes = "+Notes+"]";
    }
}
