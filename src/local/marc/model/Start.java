package local.marc.model;

public class Start extends Space {
    private double prize;

    /**
     * Default prize is 4000
     */
    public Start(){
        prize = 4000;
    }

    /**
     * Used if you want to define the prize given when passing Start
     * @param prize - amount of prize
     */
    public Start(double prize){
        this.prize = prize;
    }

    /**
     * Once a player passes the Start space they receive a prize
     * @param pl - The player who receives the prize
     */
    @Override
    public void passed(Player pl) {
        super.passed(pl);
        pl.transaction(prize);
    }
}
