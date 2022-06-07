package task1;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String name;
    // private Date dateOfBirth;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        // this.dateOfBirth = dateOfBirth;
        this.age = age;
    }


    public String getName() {
        return name;
    }

//    public Date getDateOfBirth() {
//        return dateOfBirth;
//    }

    public int getAge() {
        return age;
    }


//    int getAge(LocalDate localDate, Date dateOfBirth){
//
//        return
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                // ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                '}';
    }


}
