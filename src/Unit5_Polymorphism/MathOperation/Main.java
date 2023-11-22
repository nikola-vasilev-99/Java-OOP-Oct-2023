package Unit5_Polymorphism.MathOperation;

public class Main {
    public static void main(String[] args) {
        //Unit5_Polymorphism.MathOperation mathOperation = new Unit5_Polymorphism.MathOperation(); -> това вече е ненужно, поради статичните методи
        System.out.println(MathOperation.add(1, 2));
        System.out.println(MathOperation.add(1, 2, 3));
        System.out.println(MathOperation.add(1, 2, 3, 4));
        // в случая можем да направим методите в класа Unit5_Polymorphism.MathOperation
        // статични и по този начин няма да се налага да създаваме нова инстанция
        // (Unit5_Polymorphism.MathOperation mo = new Unit5_Polymorphism.MathOperation();), а ще можем директно да си извикаме метода add
        // върху Unit5_Polymorphism.MathOperation

    }
}
