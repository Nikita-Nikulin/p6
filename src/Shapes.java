public class Shapes {
    public static abstract class Shape {
        public String color;
        public boolean filled;

        Shape() {
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void isFilled(boolean filled) {
            this.filled = filled;
        }

        public abstract double getArea(double area);

        public abstract double getPerimeter(double perimeter);

        public String getColor() {
            return color;
        }

        public boolean isFilled() {
            return filled;
        }

        public abstract String toString();
    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius, String color, boolean filled) {
            this.color = color;
            this.filled = filled;
            this.radius = radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public double getArea(double area) {
            return radius * radius * 3.14;
        }

        @Override
        public double getPerimeter(double perimeter) {
            return radius * 2 * 3.14;
        }

        public String toString() {
            return "radius - " + radius + ", color - " + color + ", filled/notfileed - " + filled;
        }
    }

    static class Rectangle extends Shape {
        double width, length;

        Rectangle(double width, double length, String color, boolean filled) {
            this.width = width;
            this.length = length;
            this.filled = filled;
            this.color = color;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        public double getArea(double area) {
            return length * width;
        }

        public double getPerimeter(double perimeter) {
            return (length + width) * 2;
        }

        public String toString() {
            return "width = " + width + ", length = " + length + ", color - " + color + ", filled/notfileed - " + filled;
        }
    }

    static class Square extends Shape {
        double side;

        Square(double side, String color, boolean filled) {
            this.side = side;
            this.filled = filled;
            this.color = color;
        }

        public void setSide(double side) {
            this.side = side;
        }

        public double getSide() {
            return side;
        }

        public double getArea(double area) {
            return side * side;
        }

        public double getPerimeter(double perimeter) {
            return side * 4;
        }


        public String toString() {
            return "side = " + side + ", color - " + color + ", filled/notfileed - " + filled;
        }
    }
}
