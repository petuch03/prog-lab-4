import actions.ActionToBeAfraid;
import exceptions.CannotGiveSweet;
import objects.*;
import persons.*;

public class Main {
    public static void main(String[] args) {
        final class People { //локальный класс
            final Vse vse = new Vse();
            final Papa papa = new Papa();
            final Mama mama = new Mama();
        }
        People people = new People();
        people.mama.setSweets(6);
        people.papa.setSweets(7);

        Listochek[] listochki = new Listochek[3];
        listochki[0] = new Listochek("большая");
        listochki[1] = new Listochek("крутая");
        listochki[2] = new Listochek("рукопись");

        ReadablePaper rukopis = new ReadablePaper() { // анонимный класс

            public final Paper[] content = new Paper[10];

            @Override
            public String read() {
                StringBuilder stringBuilder = new StringBuilder();
                int i = 0;
                while (content[i] != null) {
                    stringBuilder.append(content[i].getText()).append(" ");
                    i++;
                }
                return stringBuilder.toString();
            }

            @Override
            public void setContent(Paper newContent) {
                int i = 0;
                while (this.content[i] != null) {
                    i++;
                    if (i == 10) {
                        System.out.println("рукопись полная");
                        return;
                    }
                }
                content[i] = newContent;
            }
        };

        people.papa.collectPapers(listochki[0]);
        people.papa.collectPapers(listochki[1]);
        people.papa.collectPapers(listochki[2]);


        rukopis.setContent(listochki[0]);
        rukopis.setContent(listochki[1]);
        rukopis.setContent(listochki[2]);

        people.papa.work("вовсю");

        System.out.print("\n");
        people.vse.silence();
        people.vse.beAfraidOf(ActionToBeAfraid.SAY_WORD);
        people.vse.beAfraidOf(ActionToBeAfraid.MOVE);
        System.out.print("\n");

        listochki[0].finish(people.papa);
        people.papa.read(rukopis);
        System.out.print("\n");

        try {
            people.mama.giveSweet(people.papa);
            people.mama.giveSweet(people.papa);
            people.mama.giveSweet(people.papa);
            people.mama.giveSweet(people.papa);
            people.mama.giveSweet(people.papa);
            people.mama.giveSweet(people.papa);
            people.mama.giveSweet(people.papa);
        } catch (CannotGiveSweet | RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.print("\n");

            people.vse.beExcited();
            people.vse.beExpected();
        }
    }
}
