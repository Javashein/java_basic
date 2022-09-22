import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return countGoldCoins == account.countGoldCoins;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countGoldCoins);
    }
}
