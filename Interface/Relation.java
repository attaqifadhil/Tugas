package Interface;

public interface Relation {
    boolean isGreater(Object a, Object b);

    boolean isLess(Object a, Object b);

    boolean isEqual(Object a, Object b);
}

class Line implements Relation {
    private final double x1;
    private final double x2;
    private final double y1;
    private final double y2;

    public Line(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getLength() {
        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return length;
    }

    public boolean isGreater(Object a, Object b) {
        double alen = ((Line) a).getLength();
        double blen = ((Line) b).getLength();
        return (alen > blen);
    }

    public boolean isLess(Object a, Object b) {
        double alen = ((Line) a).getLength();
        double blen = ((Line) b).getLength();
        return (alen < blen);
    }
    public boolean isEqual(Object a, Object b) {
        double alen = ((Line) a).getLength();
        double blen = ((Line) b).getLength();
        return (alen == blen);
    }
}
