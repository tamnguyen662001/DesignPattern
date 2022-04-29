package FactoryPattern;

public abstract class Shape {
    public String brush, paper, frame;
    abstract String draw(String brush, String paper, String frame);
}
