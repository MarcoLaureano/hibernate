package com.example.samplehibernateproject.model;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Empleats implements Serializable {
    private int numeroEmpleat;
    private LocalDate dataNaixement;
    private String nom;
    private String cognoms;
    private char genere;
    private LocalDate dataAlta;

    public Empleats() {
    }

    public Empleats(int numeroEmpleat, LocalDate dataNaixement, String nom, String cognoms, char genere, LocalDate dataAlta) {
        this.numeroEmpleat = numeroEmpleat;
        this.dataNaixement = dataNaixement;
        this.nom = nom;
        this.cognoms = cognoms;
        this.genere = genere;
        this.dataAlta = dataAlta;
    }


    public int getNumeroEmpleat() {
        return numeroEmpleat;
    }

    public void setNumeroEmpleat(int numeroEmpleat) {
        this.numeroEmpleat = numeroEmpleat;
    }

    public LocalDate getdataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(Date dataNaixement) {
        dataNaixement = dataNaixement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public char getGenere() {
        return genere;
    }

    public void setGenere(char genere) {
        this.genere = genere;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(LocalDate dataAlta) {
        this.dataAlta = dataAlta;
    }

    @Override
    public String toString() {
        return "Empleats{" +
                "numeroEmpleat=" + numeroEmpleat +
                ", DataNaixement=" + dataNaixement +
                ", nom='" + nom + '\'' +
                ", cognoms='" + cognoms + '\'' +
                ", genere=" + genere +
                ", dataAlta=" + dataAlta +
                '}';
    }


}
