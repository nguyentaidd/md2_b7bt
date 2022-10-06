package ra;

public class Square extends Shape{
    private double side;

    public Square(double side, String color, boolean filled) {
        super( color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side =side;

    }





    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side = percent;

    }
}
