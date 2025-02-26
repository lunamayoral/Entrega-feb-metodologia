package es.uah.mat.comp.mp.ejc.e7;

public class LineSub extends Point {
    Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getGradient() {
        return Math.atan2(end.getY() - super.getY(), end.getX() - super.getX());
    }

    @Override
    public String toString() {
        return "MyLine[begin=" + super.toString() + ",end=" + end + "]";
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public void setBegin(Point begin) {
        setX(begin.getX());
        setY(begin.getY());
    }

    public int getBeginX() {
        return getX();
    }

    public void setBeginX(int x) {
        setX(x);
    }

    public int getBeginY() {
        return getY();
    }

    public void setBeginY(int y) {
        setY(y);
    }

    public void setBeginXY(int x, int y) {
        setXY(x, y);
    }

    public int getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}