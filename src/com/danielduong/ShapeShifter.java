package com.danielduong;
/*
Author: Daniel Duong
 */
public class ShapeShifter {
    public static void main(String[] args) {
        Drawer shape = new Drawer();
        System.out.println("Vertical Line:");
        shape.drawLine();
        System.out.println("Rectangle:");
        shape.drawRectangle();
        System.out.println("Triangle:");
        shape.drawTriangle();
        System.out.println("Festive Tree:");
        shape.drawTriangle();
        shape.drawTriangle();
        shape.drawLine();
        System.out.println("House:");
        shape.drawTriangle();
        shape.drawRectangle();
        System.out.println("Beaker");
        shape.drawLine();
        shape.drawTriangle();
        System.out.println("Popsicle");
        shape.drawRectangle();
        shape.drawLine();
    }
}

class Drawer {
    public void drawLine() {
        System.out.println("    *    ");
        System.out.println("    *    ");
    }
    public void drawRectangle() {
        System.out.println(" *******");
        System.out.println(" *     *");
        System.out.println(" *     *");
        System.out.println(" *     *");
        System.out.println(" *******");
    }
    public void drawTriangle() {
        System.out.println("    *   ");
        System.out.println("   * *  ");
        System.out.println("  *   * ");
        System.out.println(" *******");
    }
}