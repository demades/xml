package lu.uni.exercises.jakarta.xml.xmlComponents;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="RowLabels")
@XmlAccessorType(XmlAccessType.FIELD)
public class RowLabel
{
    private String isParent;

    @XmlAttribute(name="member")
    private String member;

    private String handle;

    @XmlAttribute(name="id")
    private String id;

    private String isChild;

    @XmlAttribute(name="content")
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