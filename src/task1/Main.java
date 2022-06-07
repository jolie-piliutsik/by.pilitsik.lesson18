package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Василий", 1));
        personList.add(new Person("Василий", 1));
        personList.add(new Person("Василий", 3));
        personList.add(new Person("Ольга", 1));
        personList.add(new Person("Ольга", 5));

        personList.add(new Person("Мария", 7));
        personList.add(new Person("Алеся", 8));
        personList.add(new Person("Виктория", 9));
        personList.add(new Person("Роман", 10));
        personList.add(new Person("Ольга", 6));


        PersonStatistics personStatistics = new PersonStatistics();

        Map<String, PersonStatistics> stringPersonStatisticsMap = populatePersonStatistics(personList, personStatistics);

        System.out.println(stringPersonStatisticsMap);


    }

    public static Map<String, PersonStatistics> populatePersonStatistics(List<Person> personList, PersonStatistics personStatistics) {
        Map<String, PersonStatistics> mapResult = new HashMap<>();
        // List<Person> personList1 = new ArrayList<>();

        int count = 0;
        int age = 0;
        int avAge = 0;
        String n = " ";


        for (Person person : personList) {
            if (person.getName() == personList.) {

                //  n = person.getName();
                personStatistics.setPersonCount(++count);
                age += person.getAge();
                personStatistics.setAgeSum(age);


            }
            mapResult.put(person.getName(), personStatistics);


        }
        return mapResult;
    }
}




