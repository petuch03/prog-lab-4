package persons;

import actions.ActionForAllPersons;
import actions.ActionToBeAfraid;

public abstract class Person implements ActionForAllPersons {
    private String name;
    private Gender gender;

    public Person(){

    }

    public Person(String name, Gender gender){
        this.gender = gender;
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public void beAfraidOf(ActionToBeAfraid action) {
        System.out.println(name + " боится " + (action == ActionToBeAfraid.MOVE ? "двигаться" : "произнести слово"));
    }

    @Override
    public void beExcited() {
        System.out.println(name + " возбужден");
    }

    @Override
    public void silence() {
        System.out.println(name + " молчит");
    }

    @Override
    public void beExpected() {
        System.out.println(name + " полн больших надежд");
    }
}
