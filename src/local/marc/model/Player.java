package local.marc.model;

public class Player {
    public String name;
    public int spaceNr;
    public double account;

    /**
     * Prints a message to the console
     * Appends the player name to the text
     * @param txt - message to print
     */
    void message(String txt){
        System.out.println(name + ": " + txt);
    }

    /**
     * Gives the player the opportunity to answer the question
     * @param txt - question
     * @return true if the players answers yes, else false
     */
    public boolean question(String txt){
        String question = name + ": Do you want to " + txt + "?";
        String ans = javax.swing.JOptionPane.showInputDialog(question, "yes");
        System.out.println(question + " " + ans);
        if (ans != null && ans.equals("yes"))
            return true;
        else
            return false;
    }

    /**
     * Used to make any transaction to or from the player
     * @param value - the amount to be deposit or withdrawn from the player
     */
    public void transaction(double value){
        account += value;
        System.out.println(name + ": your account is now: " + account);
    }

    /**
     * Used to pay another player an amount
     * @param pl - the player who receives the amount
     * @param amount - the amount to be payed
     */
    public void pay(Player pl, double amount) {
        System.out.println(name + ": pays " + pl.name + " " + amount);
        transaction(-amount);
        pl.transaction(amount);
    }
}
