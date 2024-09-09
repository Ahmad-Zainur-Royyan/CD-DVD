package Tokoo;

public class DVDTester {
    public static void main(String[] args) {
        DVD s = new DVD();


        s.setNumber(2);
        s.setName("Reborn");
        s.setQuantity(12);
        s.setPrice(2000.0);
        s.setLength(300);
        s.setRating("PG");
        s.setStudio("NewLine Cinema");

        s.print();
        
    }
}   
