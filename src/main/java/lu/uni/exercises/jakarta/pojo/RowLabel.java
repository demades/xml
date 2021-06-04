package lu.uni.exercises.jakarta.pojo;

public class RowLabel {
    private String isParent;

    private String member;

    private String handle;

    private String id;

    private String isChild;

    private String content;

    public String getIsParent ()
    {
        return isParent;
    }

    public void setIsParent (String isParent)
    {
        this.isParent = isParent;
    }

    public String getMember ()
    {
        return member;
    }

    public void setMember (String member)
    {
        this.member = member;
    }

    public String getHandle ()
    {
        return handle;
    }

    public void setHandle (String handle)
    {
        this.handle = handle;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getIsChild ()
    {
        return isChild;
    }

    public void setIsChild (String isChild)
    {
        this.isChild = isChild;
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
        return "ClassPojo [isParent = "+isParent+", member = "+member+", handle = "+handle+", id = "+id+", isChild = "+isChild+", content = "+content+"]";
    }

}
