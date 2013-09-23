package graph;

/**
 * Created with IntelliJ IDEA.
 * User: jonathan
 * Date: 2013/09/18
 * Time: 9:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class Coordinates {
    private int x, y;

    public Coordinates() {
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString(){
        return String.valueOf(x) + "."  +String.valueOf(y);
    }
}
