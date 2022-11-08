package Lessons43;

import java.util.Objects;

public class Lemon extends Fruit{
    private int degreeSolid;

    public Lemon(String name, int price, int degreeSolid) {
        super(name, price);
        this.degreeSolid = degreeSolid;
    }

    @Override
    public String toString() {
        return "Lemon{" +
                "degreeSolid=" + degreeSolid +
                '}'+super.toString();
    }

    public int getDegreeSolid() {
        return degreeSolid;
    }

    public void setDegreeSolid(int degreeSolid) {
        this.degreeSolid = degreeSolid;
    }

    @Override
    public boolean equals(Object o) {
        Lemon lemon = (Lemon) o;
        return degreeSolid == lemon.degreeSolid && super.equals(o);

    }

}
