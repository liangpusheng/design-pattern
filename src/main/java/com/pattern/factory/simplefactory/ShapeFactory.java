package com.pattern.factory.simplefactory;

public class ShapeFactory {

    public static Shape getShape(String type) {
        Shape shape = null;
        if (type.equalsIgnoreCase("rect")) {
            shape = new RectShape();
        } else if (type.equalsIgnoreCase("circle")) {
            shape = new CircleShape();
        } else if (type.equalsIgnoreCase("triangle")) {
            shape = new TriangleShape();
        }
        return shape;
    }
}
