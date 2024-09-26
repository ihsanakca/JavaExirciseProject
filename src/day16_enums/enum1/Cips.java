package day16_enums.enum1;

public enum Cips {

    DORITOS (60, 3.99),
    LAYS (70, 6.99),
    PATOS (100,2.99),
    PRINGLES (90, 7.99);


    final int lezzetSeviyesi;
    final double price;


    Cips(int lezzetSeviyesi, double price){
        this.lezzetSeviyesi = lezzetSeviyesi;
        this.price = price;
    }

    public int getLezzetSeviyesi() {
        return lezzetSeviyesi;
    }

    public double getPrice() {
        return price;
    }
}
