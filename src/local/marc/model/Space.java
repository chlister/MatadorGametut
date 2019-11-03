package local.marc.model;

public class Space {
    // class variables
    public String name;

    // methods
    public void passed(Player pl) {
        pl.message("You passed " + name);
    }

    public void landed(Player pl) {
        pl.message("You landed on " + name);
    }
}

