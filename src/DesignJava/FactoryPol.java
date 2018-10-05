//Implement Factory Pattern to get the Polygon of differnt type.

package DesignJava;

interface TypeOfPolygon
{
    void type();
}

class Triangle implements TypeOfPolygon
{

    @Override
    public void type() {
        System.out.println("This is a triangle with 3 sides");
    }

}


class Circle implements TypeOfPolygon
{

    @Override
    public void type() {
        System.out.println("This is a circle with radius 'r'");
    }
}

class Polygon
{
    TypeOfPolygon typeOfPolygon;

    public TypeOfPolygon getTypeOfPolygon() {
        return typeOfPolygon;
    }

    public void setTypeOfPolygon(TypeOfPolygon typeOfPolygon) {
        this.typeOfPolygon = typeOfPolygon;
    }
}


class polygonFactory
{
    static Polygon getTypeofPolygon(String str)
    {
        Polygon polygon=new Polygon();
        switch (str)
        {
            case "Circle":
                polygon.setTypeOfPolygon(new Circle());
                break;
            case "Triangle":
                polygon.setTypeOfPolygon(new Triangle());
                break;
        }
        return polygon;
    }
}
public class FactoryPol {
    public static void main(String[] args) {
        Polygon polygonIsCircle=polygonFactory.getTypeofPolygon("Circle");
        polygonIsCircle.getTypeOfPolygon().type();

        Polygon polygonIsTriangle=polygonFactory.getTypeofPolygon("Triangle");
        polygonIsTriangle.getTypeOfPolygon().type();
    }
}
