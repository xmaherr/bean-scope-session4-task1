public class Circle implements Shape{

    Draw2D draw2D;
    Draw3D draw3D;

    public Circle(Draw2D draw2D, Draw3D draw3D) {
        this.draw2D = draw2D;
        this.draw3D = draw3D;
    }

    @Override
    public String getShapeName() {
        return "Cirlce";
    }

    void drawCircle(){
        this.draw2D.draw(getShapeName());
        this.draw3D.draw(getShapeName());
    }
}