public class Admin extends User{
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void print() {
        System.out.println("Admin's name is " + getUsername());

    }
}
