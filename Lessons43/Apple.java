package Lessons43;

import java.util.Objects;

public class Apple extends Fruit{
    private String colorApple;

    public Apple(String name, int price, String colorApple) {
        super(name, price);
        this.colorApple = colorApple;
    }

    @Override
    public boolean equals(Object o) {
        Apple apple = (Apple) o;
        return Objects.equals(colorApple, apple.colorApple)&& super.equals(apple);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorApple);
    }

    public String getColorApple() {
        return colorApple;
    }

    public void setColorApple(String colorApple) {
        this.colorApple = colorApple;
    }

    @Override
    public String toString() {
        return super.toString()+
                " цвет '"+ colorApple +"' " +
                '}';
    }
}
