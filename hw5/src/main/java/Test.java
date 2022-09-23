public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client firstClient = bank.createClient("James", 25);
        Client secondClient = bank.createClient("Joe", 17);
        Client thirdClient = bank.createClient("Jack", 55);
        Client searchClient = bank.createClient("Jack", 55);
        bank.openAccount(firstClient, 50);
        bank.openAccount(firstClient, 150);
        bank.openAccount(secondClient, 150);
        Account account = bank.openAccount(thirdClient, 1500);
        bank.openAccount(thirdClient, 4000);

        System.out.println(bank.getAccounts(searchClient));
        System.out.println(bank.getClients());
        System.out.println(bank.findClient(account));
    }
}
