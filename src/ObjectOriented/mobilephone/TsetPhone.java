package ObjectOriented.mobilephone;

public class TsetPhone {
    public static void main(String[] args) {
        phone p = new phone();
        p.brand("iPhone");
        p.call();
        int sale =p.Prosale(5999,1299);
        System.out.println(sale);
    }
}
