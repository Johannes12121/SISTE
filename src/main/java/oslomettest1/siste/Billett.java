package oslomettest1.siste;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Billett {

    private Long billettNr;
    private String film;
    private Integer antall;
    private String fornavn;
    private String etternavn;
    private Integer telefon;
    private String epost;

    public Billett(String film, Integer antall, String fornavn, String etternavn, Integer telefon, String epost){
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn =etternavn;
        this.telefon = telefon;
        this.epost = epost;
    }
}