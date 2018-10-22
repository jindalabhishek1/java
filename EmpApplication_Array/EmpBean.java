import java.util.*;

class EmpBean
{
    private int id, salary;
    private String name, branch, address;
    public int getId()
    {
        return id;
    }
    public int getSal()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public String getBranch()
    {
        return branch;
    }
    public String getAddr()
    {
        return address;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setSal(int salary)
    {
        this.salary = salary;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public void setAddr(String address)
    {
        this.address = address;
    }
}
