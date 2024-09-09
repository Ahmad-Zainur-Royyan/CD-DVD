package Tokoo;

public class CDTester {
    public static void main(String[] args) {
        CD s = new CD();


        s.setNumber(2);
        s.setName("Reborn");
        s.setQuantity(12);
        s.setPrice(2000.0);
        s.setArtist("Lady Gaga");
        s.setNumSong(9);
        s.setLabel("Sony Music");

        s.print();
    }
}
