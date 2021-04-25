public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstname, String lastname) {
        firstName = firstname;
        lastName = lastname;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acc) {
        account = acc;
    }
}

