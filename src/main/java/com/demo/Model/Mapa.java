package com.demo.Model;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="mapa")
public class Mapa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String naziv;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Column
	private Date datumKreiranja;
	
	@Column(nullable=true)
	private int brojDokumenata;
	
	@Column
	private String oznakaPoduzeca;
	
	@OneToOne
	private Korisnik korisnik;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Date getDatumKreiranja() {
		return datumKreiranja;
	}

	public void setDatumKreiranja(Date datumKreiranja) {
		this.datumKreiranja = datumKreiranja;
	}

	public int getBrojDokumenata() {
		return brojDokumenata;
	}

	public void setBrojDokumenata(int brojDokumenata) {
		this.brojDokumenata = brojDokumenata;
	}

	public String getOznakaPoduzeca() {
		return oznakaPoduzeca;
	}

	public void setOznakaPoduzeca(String oznakaPoduzeca) {
		this.oznakaPoduzeca = oznakaPoduzeca;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	
	
	
}
