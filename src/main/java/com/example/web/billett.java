package com.example.web;

public class billett {
    public String film;
    public String antall;
    public String fornavn;
    public String etternavn;
    public String telefonnr;
    public String epost;

    public billett(String film, String antall, String fornavn, String etternavn, String telefonnr, String epost) {
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
    }
}
