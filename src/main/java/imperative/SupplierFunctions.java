package imperative;

import java.util.function.Supplier;

public class SupplierFunctions {
     static Supplier<String> getDbConnection = () -> "localhost:3000";

    public static void main(String[] args) {
        System.out.println(getDbConnection.get());
    }

}
