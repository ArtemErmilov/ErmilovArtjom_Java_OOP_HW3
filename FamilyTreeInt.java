package Homework.JAVA_HW9_OOP;

/**
 * Интерфейс - Генеалогическое древо.
 * 
 * setDataPerson -  Ввод Ф.И.О.ДР изучаемого человека.
 * setDataChild1 - Ввод степени родства.Ф.И.О.ДР 1-го ребёнка.
 * setDataChild2 - Ввод степени родства.Ф.И.О.ДР 2-го ребёнка.
 * setDataFather - Ввод Ф.И.О.ДР отца.
 * setDataMother - Ввод Ф.И.О.ДР матери.
 * 
 * showPersonData - вывод данных изучаемого человека.
 */

public interface FamilyTreeInt {

    String namePerson = "Артём";
    String patronymicPerson = "Сергеевич";
    String surnamePerson = "Ермилов";
    String dateOfBirthPerson = "17.12.1984";

    default void setDataPerson(String name, String patronymic, String surname, String  dateOfBirth)
    {
        
    }

    void setDataChild1(String kinship, String name, String patronymic, String surname, String  dateOfBirth);

    void setDataChild2(String kinship, String name, String patronymic, String surname, String  dateOfBirth);

    void setDataFather( String name, String patronymic, String surname, String  dateOfBirth);

    void setDataMother( String name, String patronymic, String surname, String  dateOfBirth);

    default String getNamePerson(){
        return namePerson;
    }

    default void showPersonData (){
        System.out.print(namePerson+" ");
        if (patronymicPerson!=null) {System.out.print(patronymicPerson+" ");}
        if (surnamePerson!=null) {System.out.print(surnamePerson+ " ");}
        if (dateOfBirthPerson!=null) {System.out.print(dateOfBirthPerson+ " ");}
        System.out.println("");
    }


    
}
