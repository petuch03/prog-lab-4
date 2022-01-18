package actions;

import exceptions.CannotGiveSweet;
import objects.Paper;
import objects.ReadablePaper;
import persons.Mumiy;

public interface ActionForAllMumiys {
    public void giveSweet(Mumiy toWhom) throws CannotGiveSweet;

    public void collectPapers(Paper paper);

    public void read(ReadablePaper paper);

    public void work(String how);
}
