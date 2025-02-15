package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto monitor = new Prodotto("Odyssey", "Monitor Lg super performante", 29.99f, 22);
        
        monitor.mostraPrezzo();
        monitor.mostraPrezzoConIva();
        monitor.mostraNomeEsteso();

        Prodotto frullatore = new Prodotto("Demolitore", "Frullatore devastante", 30.89f, 22);

        frullatore.mostraNomeEsteso();
        frullatore.mostraPrezzo();
        frullatore.mostraPrezzoConIva();
    }
}
