class Person
{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}

class GetterSetter
{
    public static void main(String[] args)
    {
        Person p = new Person();
        p.setName("Raju");
        p.setAge(25);
        System.out.println("Name = " + p.getName());
        System.out.println("Age = " + p.getAge());
    }
}
