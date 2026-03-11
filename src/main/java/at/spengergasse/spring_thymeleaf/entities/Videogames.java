package at.spengergasse.spring_thymeleaf.entities;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
@Table
@Entity
public class Videogames {
    @Id
    @GeneratedValue
    private Integer vId;
    @Column(name="v_name")
    private String vName;
    @Column(name="v_genre")
    private String vGenre;
    @Column(name="v_releasedate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private String vReleaseDate;
    @Column(name="v_price")
    private double vPrice;

    public Videogames () {
    }

    public Videogames(String vName, String vGenre, String vReleaseDate, double vPrice) {
        this.vName = vName;
        this.vGenre = vGenre;
        this.vReleaseDate = vReleaseDate;
        this.vPrice = vPrice;
    }

    public void setvId(int vId) {
        this.vId = vId;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public void setvGenre(String vGenre) {
        this.vGenre = vGenre;
    }

    public void setvReleaseDate(String vReleaseDate) {
        this.vReleaseDate = vReleaseDate;
    }

    public void setvPrice(double vPrice) {
        this.vPrice = vPrice;
    }

    public int getvId() {
        return vId;
    }

    public String getvName() {
        return vName;
    }

    public String getvGenre() {
        return vGenre;
    }

    public String getvReleaseDate() {
        return vReleaseDate;
    }

    public double getvPrice() {
        return vPrice;
    }
}
