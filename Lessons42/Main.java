package Lessons42;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        ArrayList<Cat> cats= new ArrayList<>();
        cats.add(new Cat("Rozi",20,"green"));
        cats.add(new Cat("Robi ",15,"green"));
        cats.add(new Cat("Tom",17,"black"));
        cats.add(new Cat("Barsik",19,"white"));
        boolean var= true;
        while (var){
            System.out.println("1.Ввывести всех котов\n"+
                    "2.Ввести имя кота и цвет что бы узнать вес\n"+
                    "3.Удалить кота из списка(нужно знать имя и вес)");
            int input= scn.nextInt();
            if (input==1){
                for (int i = 0; i <cats.size() ; i++) {
                    System.out.println(cats.get(i));
                }
            }else if (input==2){
                System.out.println("Введите имя кота");
                String nameCat=scn.next();
                System.out.println("Введите цвет кота ");
                String colorCat=scn.next();
                for (int i = 0; i < cats.size(); i++) {
                    if (cats.get(i).getName().equals(nameCat)&&cats.get(i).getColor().equals(colorCat)){
                        System.out.println(cats.get(i));
                    }
                }
            }else if (input==3){
                System.out.println("Введите имя кота");
                String nameCat=scn.next();
                System.out.println("Введитя вес кота");
                int weightCat=scn.nextInt();
                for (int i = 0; i < cats.size(); i++) {
                    if (cats.get(i).getName().equals(nameCat)&&cats.get(i).getWeight()==weightCat){
                        cats.remove(i);
                    }
                }
                for (int i = 0; i < cats.size(); i++) {
                    System.out.println(cats.get(i));

                }



            }
        }


    }
}
