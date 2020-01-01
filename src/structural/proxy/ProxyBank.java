package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank {
    private RealBank realBank;
    private static List<String> bannedClient = new ArrayList<>();

    static {
        bannedClient.add("abcd");
        bannedClient.add("efgh");
    }

    @Override
    public void withdrawMoney(String customerName) throws Exception {
        if(bannedClient.contains(customerName.toLowerCase())) {
            throw new Exception("Access Denied! '" + customerName + "' is not allowed");
        }

        realBank = new RealBank();
        realBank.withdrawMoney(customerName);
    }
}
