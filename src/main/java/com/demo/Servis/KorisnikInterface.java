package com.demo.Servis;

import com.demo.Model.Korisnik;

public interface KorisnikInterface {

	Korisnik kreirajKorisnika(Korisnik korisnik);
	Korisnik azurirajKorisnika(Korisnik korisnik);
	Iterable<Korisnik> sviKorisnici();
	void obrisiKorisnika(Long id);
}
