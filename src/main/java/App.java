import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

public class App {
    public static void printAllPrintableObjects(IPrint[] print){
        for (int x = 0; x < print.length; x++) {
            print[x].print();
        }

    }

    public static void consumeConsumable(Consumable[] consumables) {
        for (int x = 0; x < consumables.length; x++) {
            consumables[x].consume();
        }
    }

    public static void getTotalPriceOfCustomerProduct(Customer customer){
        double result = customer.getProduct().length;



    }

    public static String getSecondaryAddressOfCustomer(Customer customer){
        String result = "";
        for(String c: customer.getAddresses()){
            result = c.valueOf(customer.getAddresses().get(1));
        } return result;



    }

    public static void reverseSortAndPrintAllProductByPrice(ArrayList<Product> products) {
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                if (product1.getPrice() > product2.getPrice()) {
                    return 1;
                } else return -1;
            }

        };
    }

//    public ArrayList<Double> getListOfProductPricesGreaterThanThePriceOfProductGiven(ArrayList<Product> products){
//
//    }
    public static void addASingleProductToDirectoryTiedToCustomerByNameThenPrint(Map<String, Product> map, Customer customer, Product product){

    }



}
