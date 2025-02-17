package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto monitor = new Prodotto("Odyssey", "Monitor Lg super performante", new BigDecimal(100), new BigDecimal(0.22));
        
        monitor.setPrezzo(new BigDecimal(200));

        System.out.println(monitor.getPrezzo());
        System.out.println(monitor.getPrezzoConIva());
        System.out.println(monitor.getNomeEsteso());

        Prodotto frullatore = new Prodotto("Demolitore", "Frullatore devastante",new BigDecimal(47), new BigDecimal(0.22));

        System.out.println(frullatore.getPrezzo());
        System.out.println(frullatore.getPrezzoConIva());
        System.out.println(frullatore.getNomeEsteso());
    }
}
