package geometry;

public class Line {
    private Point start;
    private Point end;

    public Line (Point start, Point end) {
        this(start.x, start.y, end.x, end.y);
    }

    public Line(int xStart, int yStart, int xEnd, int yEnd) {
        this.start = new Point(xStart, yStart);
        this.end = new Point(xEnd, yEnd);
    }

    public int getLength() {
        return (int) Math.sqrt((start.x-start.y)*(start.x-start.y) + (end.x - end.y)*(end.x - end.y));
    }

    public String toString() {
        return String.format("Линия от %s, до %s", start, end);
    }
}
