import java.util.ArrayList;
import java.util.Arrays;

public class Customer extends User {
    private int rewardPoints;
    private double accountBalance;
    private ArrayList<String> addresses;
    private Size size;
    private Product[] product;

    public Customer(String username, String password, int rewardPoints, double accountBalance, ArrayList<String> addresses, Size size, Product[] product) {
        super(username, password);
        this.rewardPoints = rewardPoints;
        this.accountBalance = accountBalance;
        this.addresses = addresses;
        this.size = size;
        this.product = product;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance < 0){
            System.out.println();
        }
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.addresses = addresses;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public void useRewardPoints(int n){
        double result = rewardPoints - n;
        System.out.println("You have: " + rewardPoints +" points. You used " + n+ " points. Now you have "   +result);

    }

    @Override
    public void print() {
        System.out.println("Username: " + getUsername() +"\n" + "reward points:" + getRewardPoints()+ "\n" + "accountBalance: " + getAccountBalance() + "\n" + "Size: " + size + "\n" + "===================" );

    }

    @Override
    public String toString() {
        return "Customer{" +
                "rewardPoints=" + rewardPoints +
                ", accountBalance=" + accountBalance +
                ", addresses=" + addresses +
                ", size=" + size +
                ", product=" + Arrays.toString(product) +
                '}';
    }
}
