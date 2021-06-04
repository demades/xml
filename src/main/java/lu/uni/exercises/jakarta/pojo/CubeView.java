package lu.uni.exercises.jakarta.pojo;

public class CubeView {
    private MemberNotes MemberNotes;

    private String CubeNotes;

    private String ReportTitle;

    private String Category;

    private String SourceInfo;

    private Data Data;

    private String lang;

    private String script;

    public MemberNotes getMemberNotes ()
    {
        return MemberNotes;
    }

    public void setMemberNotes (MemberNotes MemberNotes)
    {
        this.MemberNotes = MemberNotes;
    }

    public String getCubeNotes ()
    {
        return CubeNotes;
    }

    public void setCubeNotes (String CubeNotes)
    {
        this.CubeNotes = CubeNotes;
    }

    public String getReportTitle ()
    {
        return ReportTitle;
    }

    public void setReportTitle (String ReportTitle)
    {
        this.ReportTitle = ReportTitle;
    }

    public String getCategory ()
    {
        return Category;
    }

    public void setCategory (String Category)
    {
        this.Category = Category;
    }

    public String getSourceInfo ()
    {
        return SourceInfo;
    }

    public void setSourceInfo (String SourceInfo)
    {
        this.SourceInfo = SourceInfo;
    }

    public Data getData ()
    {
        return Data;
    }

    public void setData (Data Data)
    {
        this.Data = Data;
    }

    public String getLang ()
    {
        return lang;
    }

    public void setLang (String lang)
    {
        this.lang = lang;
    }

    public String getScript ()
    {
        return script;
    }

    public void setScript (String script)
    {
        this.script = script;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [MemberNotes = "+MemberNotes+", CubeNotes = "+CubeNotes+", ReportTitle = "+ReportTitle+", Category = "+Category+", SourceInfo = "+SourceInfo+", Data = "+Data+", lang = "+lang+", script = "+script+"]";
    }

}
