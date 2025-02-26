package es.uah.mat.comp.mp.ejb.e5;

public class TestCustomerandAccount {
        public static void main(String[] args) {
//Test Customer
            // Test constructors and toString()
            Customer c1 = new Customer(1, "hola", 'f');
            System.out.println(c1);
            //getters
            System.out.println("el id es: " + c1.getId());
            System.out.println("el nombre es: " + c1.getName());
            System.out.println("el gender es: " + c1.getGender());
//Test Account
            Customer c2 = new Customer(1, "hola", 'f');
            Account a1= new Account(12,c2,0.0);
            System.out.println(a1);
            a1.setBalance(10);
            System.out.println(a1);
            System.out.println("el id es: " +a1.getId());
            System.out.println("el cliente es: " + a1.getCustomer()); // Customer's toString()
            System.out.println("el balance es: " + a1.getBalance());
            System.out.println("el nombre del cliente es: " + a1.getCustomerName());
            System.out.println("la cuenta es: " + a1.deposit(4));
            System.out.println("la cuenta es:"+ a1.withdraw(15));


        }
}




