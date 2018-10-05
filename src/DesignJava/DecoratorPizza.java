package DesignJava;

interface Pizza {
    String info();
}

class Capsicum implements Pizza{
    private String color;

    public Capsicum(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String info(){
        return "Topping of capsicum is of color: " +color;
    }
}

class Olives implements Pizza{
    private String color;
    public Olives(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String info() {
        return "Color of olives is: " +color;
    }
}

class Cheese implements Pizza{
    private Pizza pizza;
    private String extra_cheese;

    public Cheese(Pizza pizza, String extra_cheese) {
        this.pizza=pizza;
        this.extra_cheese = extra_cheese;

    }

    public String getExtra_cheese() {
        return extra_cheese;
    }

    public void setExtra_cheese(String extra_cheese) {
        this.extra_cheese = extra_cheese;
    }

    @Override
    public String info() {
        return pizza.info() + " Want extra cheese or not ? : " +extra_cheese;
    }
}

class Sause implements Pizza{
    private Pizza pizza;
    private String want_sauce;

    public Sause(Pizza pizza,String want_sauce) {
        this.pizza=pizza;
        this.want_sauce = want_sauce;
    }

    public String getWant_sauce() {
        return want_sauce;
    }

    public void setWant_sauce(String want_sauce) {
        this.want_sauce = want_sauce;
    }

    @Override
    public String info() {
        return pizza.info() + " Want some sauce? : "+want_sauce;
    }
}
public class DecoratorPizza {
    public static void main(String[] args) {
        Capsicum capsicum = new Capsicum("green");
        System.out.println(capsicum.info());
        Cheese cheese= new Cheese(new Capsicum("Red"),"Yes");
        System.out.println(cheese.info());
        Sause sause= new Sause(new Cheese(new Olives("black"),"yes"),"yes");
        System.out.println(sause.info());

    }
}