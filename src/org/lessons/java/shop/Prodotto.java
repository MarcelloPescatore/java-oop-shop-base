package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    // dichiaro le caratteristiche
    private int codice; //genero il codice randomicamente
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    // costruttore per inizializzare le caratteristiche
    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva ) {
        Random random = new Random();
        this.codice = random.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva; 
    };

    // Metodi per esporre e modificare le informazioni
    public int getCodice() {
        return this.codice;
    };


    public String getNome() {
        return this.nome;
    };

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return this.descrizione;
    };

    public void setDescrizione (String descrizione) {
        this.descrizione = descrizione;
    }


    public BigDecimal getPrezzo() {
        return this.prezzo;
    };

    public void setPrezzo (BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getIva() {
        return this.iva;
    };

    public void setIva (BigDecimal iva) {
        this.iva = iva;
    }


    public BigDecimal getPrezzoConIva() {
        if (prezzo != null && iva != null) {
            return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    };

    public String getNomeEsteso() {
        if (nome != null) {
            return codice + "-" + nome;
        }
        return null;
    }
}
