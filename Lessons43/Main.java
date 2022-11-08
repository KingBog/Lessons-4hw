package Lessons43;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<>();
        Scanner scn= new Scanner(System.in);
        apples.add(new Apple("Голден",15,"красный"));
        apples.add(new Apple("Спартан",20,"зеленый"));
        apples.add(new Apple("Гала",50,"красный"));
        ArrayList<Lemon>lemons= new ArrayList<>();
        lemons.add(new Lemon("Lemon1",20,4));
        lemons.add(new Lemon("Lemon2",18,3));
        lemons.add(new Lemon("Lemon3",40,1));
        lemons.add(new Lemon("Lemon4",7,5));

        while (true){
            System.out.println("1.Вывести все яблоки\n"+ "2. Узнать цену яблока\n"+ "3. Вывести все лимоны\n"+ "4. Узнать цену лимона");
            int input=scn.nextInt();
            if (input==1){
                for (int i = 0; i <apples.size() ; i++) {
                    System.out.println(apples.get(i));
                }
            }else if (input==2){
                    System.out.println(" Введите  сорт яблока");
                    String valName=scn.next();
                    System.out.println("Введите цвет яблока");
                    String valColor= scn.next();
                for (int i = 0; i < apples.size() ; i++) {
                    if (apples.get(i).getName().equals(valName)&&apples.get(i).getColorApple().equals(valColor)){
                        System.out.println(apples.get(i).getPrice()+" грн");
                    }

                    }

                }else  if (input==3){
                for (int i = 0; i < lemons.size() ; i++) {
                    System.out.println(lemons.get(i));
                }

            }else if (input==4){
                System.out.println(" Введите  название лемона");
                String valName=scn.next();
                System.out.println("Введите его кислотность");
                int valSolid= scn.nextInt();
                for (int i = 0; i < lemons.size(); i++) {
                    if (lemons.get(i).getName().equals(valName)&&lemons.get(i).getDegreeSolid()==valSolid){
                        System.out.println(lemons.get(i).getPrice());
                    }

                }
            }


                }
            }
        }



