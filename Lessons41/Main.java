package Lessons41;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Gun> list = new ArrayList<>();
        list.add(new Gun("Кряк", 15, 2000));
        list.add(new Gun("Мосинка", 30, 2500));
        list.add(new Gun("M24", 33, 1700));
        boolean val = true;
        while (val) {
            System.out.println("1.Ввывести все оружия на консоль\n" +
                    "2.Найти сомое мощное по урону оружие\n" +
                    "3.Юзер вводит название оружия, программа выводит его урон и цену \n" +
                    "4.Удалить любое оружие из списка");
            int input = scn.nextInt();
            if (input == 1) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            } else if (input == 2) {
                int power = 0;
                for (int i = 0; i < list.size(); i++) {
                    if ( list.get(i).getDamage()>power) {
                        power = list.get(i).getDamage();
                    }

                }
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getDamage() == power) {
                        System.out.println(list.get(i));
                    }
                }
            }else if (input==3){
                System.out.println("Введите название оружия: ");
                String var= scn.next();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getName().equals(var)){
                        System.out.println("Урон : "+list.get(i).getDamage()+" Цена : "+list.get(i).getPrise());
                    }

                }
            }
            else if (input==4){
                System.out.println("Введите оружие которое нужно удалить: ");
                String var=scn.next();
                for (int i=0; i<list.size();i++){
                    if (list.get(i).getName().equals(var)){
                        list.remove(i);
                    }
                }
                System.out.println(list);
            }
        }
    }
}
