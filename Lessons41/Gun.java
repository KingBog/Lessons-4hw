package Lessons41;

public class Gun {
    private String name;
    private int damage;

    //Все методы пишем после конструкторов (надо опустить вниз)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    //Поля стараемся писать в одном месте до конструкторов и методов (надо поднять наверх)
    private int prise; 
    //Конструкторы пишем после полей (надо поднять наверх)
    public Gun(String name, int damage, int prise) {
        this.name = name;
        this.damage = damage;
        this.prise = prise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gun gun = (Gun) o;
        return name.equals(gun.name);
    }



    @Override
    public String toString() {
        return "Gun{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", prise=" + prise +
                '}';
    }
}
