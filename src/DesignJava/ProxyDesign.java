package DesignJava;

interface Accessable {

    void access();

}

class Admin{

    private String name;

    public Admin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Record implements Accessable

{
    Admin admin;
    public Record(Admin admin) {

        this.admin = admin;

    }

    @Override
    public void access()
    {
        System.out.println("You are Admin, you can access the record.");
    }
}

class Proxy extends Record
{
    public Proxy(Admin admin) {

        super(admin);
    }

    @Override
    public void access() {

        if(admin.getName().equals("Admin"))
        {
            System.out.println("Allowed");
            super.access();

        }

        else
        {
            System.out.println("Not allowed to access");
        }

    }

}

public class ProxyDesign {
    public static void main(String[] args)
    {
        Admin admin=new Admin("Admin");
        Record record=new Proxy(admin);
        record.access();


    }
}