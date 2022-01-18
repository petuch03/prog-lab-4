package objects;

import persons.Person;

public abstract class Paper implements ReadablePaper {
    private String text = "текст";

    public Paper() {

    }

    public Paper(String text) {
        this.text = text;
    }

    @Override
    public String read() {
        return this.text;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "text='" + text + '\'' +
                '}';
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void finish(Person person){
        System.out.println(person.getName() + " закончил рукопись");
    }
}
