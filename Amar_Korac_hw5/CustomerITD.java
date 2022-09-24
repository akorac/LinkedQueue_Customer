public class CustomerITD {

    private String firstName;
    private String lastName;
    private int serviceNumber;

    static int random = (int) (Math.random() * 9000) + 1000;

    public CustomerITD(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.serviceNumber = random++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + ", " + this.serviceNumber;
    }
}
