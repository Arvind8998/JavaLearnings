package imperative;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerFunction {
    public static void main(String[] args) {
        Customer tom = new Customer("3232323232", "Tom");

        getCustomerDetail.accept(tom);
        doubleCustomerDetail.accept(tom, false  );
        doubleCustomerDetail.accept(tom, true);
    }

    static Consumer<Customer> getCustomerDetail = (Customer customer) -> {
        System.out.println("Hello my Name is" + customer.Name + "And my phone no is" + customer.phoneNo);
    };

    static BiConsumer<Customer, Boolean> doubleCustomerDetail = (Customer customer, Boolean show) -> {
        System.out.println("Hello my Name is" + customer.Name + "And my phone no is" + (show ? customer.phoneNo : "*****"));
    };

    static class Customer{
        private String phoneNo;
        private String Name;

        Customer(String phoneNo, String Name){
            this.phoneNo = phoneNo;
            this.Name = Name;
        }

        @Override
        public String toString(){
            return "Hello my Name is" + this.Name + "And my phone no is" + this.phoneNo;
        }

    }
}
