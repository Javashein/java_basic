import java.util.*;

public class Bank {
    private List<Client> clients = new ArrayList<>();
    private Map<Account, Client> clientAccounts = new HashMap();

    private void setClient(Client client) {
        clients.add(client);
    }

    public List<Client> getClients() {
        return clients;
    }

    public Client createClient(String name, int age) {
        Client newClient = new Client(name, age);
        setClient(newClient);
        return newClient;
    }

    public Account openAccount(Client client, int countGoldCoints) {
        if (client.getAge() >= 18) {
            Account newAccount = new Account(countGoldCoints);
            client.setAccount(newAccount);
            clientAccounts.put(newAccount, client);
            System.out.println("Account is created!");
            return newAccount;
        } else {
            System.out.println("Client's age is less than 18!");
            return null;
        }
    }

    public List<Account> getAccounts(Client client) {
        return client.getAccount();
    }

    public Client findClient(Account account) {
        for (Map.Entry<Account, Client> accountClientEntry : clientAccounts.entrySet()) {
            if (accountClientEntry.getKey().equals(account)) {
                return accountClientEntry.getValue();
            }
        }
        System.out.println("No client with this account!");
        return null;
    }
}
