package PointInRectangle;

public class Rectangle {

    private Point2D bottomLeft;
    private Point2D topRight;

    public Rectangle(Point2D bottomLeft, Point2D topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point2D point) {
                 // Horizontal
        return this.bottomLeft.getX() <= point.getX()
                && this.topRight.getX() >= point.getX()
                // Vertical
                && this.bottomLeft.getY() <= point.getY()
                && this.topRight.getY() >= point.getY();
    }

    public Point2D getBottomLeft() {
        return bottomLeft;
    }

    public Point2D getTopRight() {
        return topRight;
    }
}
