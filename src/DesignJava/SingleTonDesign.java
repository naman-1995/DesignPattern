//Implement Singleton Design Pattern on a dummy class.

package DesignJava;


class ToTheNew {

    private String s;
    private static ToTheNew instance=null;

    private ToTheNew() {
        try {
            Thread.sleep(2000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s="hello TTN";

    }

    public static ToTheNew getInstance()
    {
        if(instance==null)
        {
           instance=new ToTheNew();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "ToTheNew{" +
                "s='" + s + '\'' +
                '}';
    }
}

public class SingleTonDesign {


    public static void main(String[] args) {
        ToTheNew obj1=ToTheNew.getInstance();
        ToTheNew obj2=ToTheNew.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);

    }
}


