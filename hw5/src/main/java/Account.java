public class Account {
    private int countGoldCoins;

    public Account(int countGoldCoins) {
        this.countGoldCoins = countGoldCoins;
    }

    @Override
    public String toString() {
        return "Account{" +
                "countGoldCoins=" + countGoldCoins +
                '}';
    }
}
