package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {

    /**
     * Metodo que crea una figura dado el tipo
     * @param type tipo de la figura
     * @return figura que se creó según el tipo dado
     */
    public static Shape create (RegularShapeType type){

        Shape shape = null;
        switch(type){
            case Triangle:
                shape = new Triangle();
                break;
            case Quadrilateral:
                shape = new Quadrilateral();
                break;
            case Hexagon:
                shape = new Hexagon();
                break;
            case Pentagon:
                shape = new Pentagon();
                break;
            default:
                System.out.println("Esto no debería pasar");
        }
        return shape;
    }
}
