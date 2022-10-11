import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> addresses = new ArrayList<>();
        addresses.add("123 treeforest road, newark, DE 19711");
        addresses.add("456 oaklane drive, newark, DE 19713");

        IceCream iceCream = new IceCream("Vanilla", 5.00, Size.L);
        Battery battery = new Battery("Duracell", 4, null);
        PostalStamp postalStamp = new PostalStamp("Stamp", .50, null , 3);

        Product[] products = {iceCream, battery, postalStamp};


        Admin admin = new Admin("Karem", "Karem123");

        Customer customer1 = new Customer("Bob", "Bob123", 90, 100.00, addresses, null, products);
        Customer customer2 = new Customer("Chris", "Chris123", 0, 500.00, addresses, null, products);
        Customer customer3 = new Customer("Sam", "Sam123", 0, 250.00, addresses, null, products);


        System.out.println("===Get and print out customer1's balance====");
        customer1.setAccountBalance(-150.00);
        System.out.println(customer1.getAccountBalance());
        System.out.println("===useRewardPoints===");
        customer1.setRewardPoints(1000);
        customer1.useRewardPoints(100);
        System.out.println("===getSecondaryAddressOfCustomer of customer1===");
        System.out.println(App.getSecondaryAddressOfCustomer(customer1));
        System.out.println("===Print customer1's info with the print() method===");
        customer1.setSize(Size.M);
        customer1.print();
        System.out.println("===Consume all consumable according to the UML===");
        Consumable[] consumables = {iceCream, battery};
        App.consumeConsumable(consumables);
        System.out.println("===Print all printable objects===");
        IPrint[] iprints = {customer1, customer2, customer3, postalStamp, admin};
        App.printAllPrintableObjects(iprints);
        System.out.println("===getTotalPriceOfCustomerProducts===");
        App.getTotalPriceOfCustomerProduct(customer1);
        System.out.println("===reverseSortAndPrintAllProductsByPrice===");
        System.out.println("===getListOfProductsGreaterThanThePriceOfProductGiven===");
        System.out.println("===addASingleProductToDirectoryTiedToCustomerByNameThenPrint===");

    }
}
