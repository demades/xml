package lu.uni.exercises.jakarta.pojo;

public class Notes {
    private String member;

    private String dim;

    private String content;

    public String getMember ()
    {
        return member;
    }

    public void setMember (String member)
    {
        this.member = member;
    }

    public String getDim ()
    {
        return dim;
    }

    public void setDim (String dim)
    {
        this.dim = dim;
    }

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [member = "+member+", dim = "+dim+", content = "+content+"]";
    }

}
