package model;

/**
 *
 * @author GabrielaBonatelliPrates
 */
public class Retangulo extends FiguraGeometrica {

    private double x;
    private double y;

    public Retangulo() {
        this("", 0, 0);
    }

    public Retangulo(String cor, double x, double y) {
        super(cor);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return (getX() * getY());
    }
}
