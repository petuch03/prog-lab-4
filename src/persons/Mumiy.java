package persons;

import actions.ActionForAllMumiys;
import exceptions.CannotGiveSweet;
import exceptions.NoPlaceForSweets;
import objects.Paper;
import objects.ReadablePaper;
import objects.Sweet;

public class Mumiy extends Person implements ActionForAllMumiys {
    public Sweet[] sweets = new Sweet[10];

    public Mumiy() {
        super();
    }

    public Mumiy(String name, Gender gender) {
        super(name, gender);
    }

    @Override
    public void giveSweet(Mumiy toWhom) throws CannotGiveSweet {
        int i = 0;
        while (this.sweets[i] != null) {
            i++;
            if (i == 10) {
                break;
            }
        }
        if (i == 0) {
            throw new CannotGiveSweet(this.getName() + " не может дать конфетку " + toWhom.getName());
        }
        i--;

        int j = 0;
        while (toWhom.sweets[j] != null) {
            j++;
            if (j == 10) {
                throw new NoPlaceForSweets(toWhom.getName() + " не примет конфетку, свои есть");
            }
        }

        toWhom.sweets[j] = this.sweets[i];
        this.sweets[i] = null;
        System.out.println(this.getName() + " передал конфетку " + toWhom.getName());
    }

    @Override
    public void collectPapers(Paper paper) {
        System.out.println(this.getName() + " взял листочек с надписью: " + paper.read());
    }

    @Override
    public void read(ReadablePaper paper) {
        System.out.println(this.getName() + " читает: " + paper.read());
    }

    @Override
    public void work(String how) {
        System.out.println(this.getName() + " трудится " + how);
    }

    public void setSweets(int number) {
        for (int i = 0; i < number; i++) {
            this.sweets[i] = new Sweet();
        }
    }

    @Override
    public String toString() {
        return "Mumiy{" +
                "name='" + super.getName() + '\'' +
                ", gender=" + super.getGender() +
                '}';
    }

}
