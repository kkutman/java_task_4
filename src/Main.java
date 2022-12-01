import java8.classes.Student;
import java8.enums.Gender;
import java8.service.impl.StudentServicesImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java8.service.myExsaptton;

public class Main {
    public static void main(String[] args) throws Exception {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        try {
            Student student1 = new Student("kutmanA", 150, Gender.MALE, LocalDate.of(2022, 12, 3));
            Student student2 = new Student("kutmanB", 18, Gender.MALE, LocalDate.of(2004, 6, 3));
            Student student3 = new Student("kutmanV", 18, Gender.FAMALE, LocalDate.of(2004, 6, 3));
            Student student4 = new Student("kutmanC", 18, Gender.MALE, LocalDate.of(2004, 6, 3));
            Student student5 = new Student("kutmanN", 18, Gender.FAMALE, LocalDate.of(2004, 6, 3));
            Student student6 = new Student("kutmanM", 18, Gender.MALE, LocalDate.of(2004, 6, 3));
            ArrayList<Student> students = new ArrayList<>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student4);
            students.add(student5);
            students.add(student6);
            StudentServicesImpl studentServices = new StudentServicesImpl();
            Scanner scanner = new Scanner(System.in);


            System.out.println("""
                1===findByName
                2===getFamelle
                3===getMale""");
            int num = 0;
            try {
                num = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("1-3 san jaz");
            }

            switch (num) {
                case 1:
                    System.out.print("name  ");
                    String n = scanner.nextLine();
                    String name = scanner.nextLine();
                    if (studentServices.findByName(name, students) == null) {
                        System.out.println("tura jaz");
                    } else {
                        System.out.println(studentServices.findByName(name, students));
                    }


                    break;
                case 2:
                    System.out.println(studentServices.getFamele(students));
                    break;
                case 3:
                    System.out.println(studentServices.getMele(students));
                    break;
                default:
                    System.out.println("tura jaz");
            }











        }catch (myExsaptton e){
            System.out.println("не проавильно заполниль обьект!");
        }


    }
}