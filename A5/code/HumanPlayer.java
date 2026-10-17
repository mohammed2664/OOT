package A5.code;


public class HumanPlayer extends Player {

    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public String getTurnBanner() {
        return getName() + "'s Turn (" + getSymbol() + ")";
    }
}