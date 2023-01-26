package Homework.JAVA_HW9_OOP;

import java.util.function.*;

public class HW9_Program {
    public static void main(String[] args) {

        FamilyTreeIntMethod family = new FamilyTreeIntMethod();

        //family.setDataMan("Евгений", "Сергеевич", "Ермилов", "06.12.1985");

        family.setDataChild1("Дочь", "Юлиана", "Артёмовна", "Ермилова", "04.10.2007");
        family.setDataChild2("Сын", "Ярослав", null, "Ермилов", "08.07.2009");
        family.setDataMother("Марина", "Александровна", "Ермилова", "03.06.1963");
        family.setDataFather("Сергей", "Геннадьевич", "Ермилов", "18.03.1960");

        // family.showFamily();
        // family.showChildrens();
        // family.showParents();

        Consumer<String> fun = x -> {
            if (x.equals("Дети")) {
                if (family.getDataChild1Ki() != null || family.getDataChild2Ki() != null) {
                    System.out.println();
                    if (family.getDataChild1Ki() != null)
                        family.showChildren1();
                    if (family.getDataChild2Ki() != null)
                        family.showChildren2();
                    System.out.println();
                } else
                    System.out.println("Нет детей");
            }
            if (x.equals("Родители")) {
                if (family.getDataFatherNe() != null || family.getDataMotherNe() != null) {
                    System.out.println();
                    if (family.getDataFatherNe() != null)
                        family.showFather();
                    if (family.getDataMotherNe() != null)
                        family.showMother();
                    System.out.println();
                } else
                    System.out.println("Нет родителей");
            }

            if (x.equals("Семья")) {
                if (family.getDataFatherNe() != null || family.getDataMotherNe() != null
                        || family.getDataChild1Ki() != null || family.getDataChild2Ki() != null) {
                    System.out.println();
                    if (family.getDataChild1Ki() != null)
                        family.showChildren1();
                    if (family.getDataChild2Ki() != null)
                        family.showChildren2();
                    if (family.getDataFatherNe() != null)
                        family.showFather();
                    if (family.getDataMotherNe() != null)
                        family.showMother();
                    System.out.println();
                } else
                    System.out.println("Нет родственников");
            }

            String fam = "";
            if (x.equals("Сын") || x.equals("Дочь")
                    || x.equals("Отец") || x.equals("Мать")) {
                fam = x;
            }

            if (x.equals(fam)) {
                System.out.println();
                if (family.getDataChild1Ki().equals(fam) && family.getDataChild1Ki() != null) {
                    family.showChildren1();

                } else if (family.getDataChild2Ki().equals(fam) && family.getDataChild2Ki() != null) {
                    family.showChildren2();

                } else if (family.getDataFatherKi().equals(fam) && family.getDataFatherNe() != null) {
                    family.showFather();

                } else if (family.getDataMotherKi().equals(fam) && family.getDataMotherNe() != null) {
                    family.showFather();

                } else if (x.equals("Сын")) {
                    System.out.println("Нет сына");

                } else if (x.equals("Дочь")) {
                    System.out.println("Нет дочери");

                } else if (x.equals("Отец")) {
                    System.out.println("Нет отца");

                } else if (x.equals("Мать"))
                    System.out.println("Нет матери");

                System.out.println();
            }

            if (x.equals("Изучаемы человек")) {
                System.out.println();
                family.showMan();
                System.out.println();
            }

            

        };

        fun.accept("Изучаемы человек"); // Слова для выполнения алгоритма Дети, Родители, 
        //Семья, Сын, Дочь, Отец, Мать, Изучаемы человек

    }
}
