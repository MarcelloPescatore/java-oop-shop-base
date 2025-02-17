package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    Random random = new Random();

    // dichiaro le caratteristiche
    int codice = random.nextInt(99999); //genero il codice randomicamente
    String nome;
    String descrizione;
    BigDecimal prezzo;
    BigDecimal iva;

    // costruttore per inizializzare le caratteristiche
    Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva ) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva; 
    };

    // Metodi per esporre informazioni
    BigDecimal getPrezzo() {
        return this.prezzo;
    };

    BigDecimal getPrezzoConIva() {
        if (prezzo != null && iva != null) {
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    };

    String getNomeEsteso() {
        if (nome != null) {
            return codice + "-" + nome;
        }
        return null;
    }
}
