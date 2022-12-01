package java8.classes;

import java8.enums.Gender;
import java8.service.myExsaptton;

import java.time.LocalDate;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    private LocalDate dateOfbirth;

    public Student(String name, int age, Gender gender, LocalDate dateOfbirth) throws myExsaptton {
        if(name.matches("[a-zA-Za-яA-Я]*")){
            this.name = name;
        }else {
            this.name="error";
        }
       if (age<120){
           if(age>0){
               this.age = age;
           }else {
               this.age=0;
           }
       }else {
           this.age=0;
       }

        this.gender = gender;
       LocalDate localDate1 = LocalDate.now();
       int localDate = dateOfbirth.compareTo(localDate1);
       if(localDate==0){
            throw new myExsaptton("rovno localdate");
       } else if (localDate<0) {
          this.dateOfbirth=dateOfbirth;
       }else {
           throw new myExsaptton("rovno localdate");
       }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfbirth=" + dateOfbirth +
                '}';
    }
}
