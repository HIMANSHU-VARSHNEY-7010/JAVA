package QUES_4;

import java.util.Scanner;

public class QUES_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        AnimalFactory animalFactory = new AnimalFactory();
        System.out.println("Enter the Animal Name from (CAT, COW, DOG): ");
        String animalName = scn.nextLine();
        Animals animal = animalFactory.chooseAnimal(animalName);
        System.out.println(animalName + "'s meal :-");
        animal.meal();
    }
}
