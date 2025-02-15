package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    Random random = new Random();

    // dichiaro le caratteristiche
    int codice = random.nextInt(127); //genero il codice randomicamente
    String nome;
    String descrizione;
    float prezzo;
    int iva;

    // costruttore per inizializzare le caratteristiche
    Prodotto(String nome, String descrizione, float prezzo, int iva ) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva; 
    };

    // Metodi per esporre informazioni
    void mostraPrezzo() {
        System.out.println(prezzo + "$");
    };

    void mostraPrezzoConIva() {
        float prezzoConIva = prezzo + (prezzo * iva / 100);
        System.out.format("%.2f$%n", prezzoConIva);
    };

    void mostraNomeEsteso() {
        System.out.println(codice + "-" + nome);
    }

}
