package lu.uni.exercises.jakarta.pojo;

public class C {
    private String headers;

    private String f;

    private String v;

    private String content;

    public String getHeaders ()
    {
        return headers;
    }

    public void setHeaders (String headers)
    {
        this.headers = headers;
    }

    public String getF ()
    {
        return f;
    }

    public void setF (String f)
    {
        this.f = f;
    }

    public String getV ()
    {
        return v;
    }

    public void setV (String v)
    {
        this.v = v;
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
        return "ClassPojo [headers = "+headers+", f = "+f+", v = "+v+", content = "+content+"]";
    }

}
