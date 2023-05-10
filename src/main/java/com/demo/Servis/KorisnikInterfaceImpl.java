package com.demo.Servis;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.Model.Korisnik;

@Service
@Transactional
public class KorisnikInterfaceImpl implements KorisnikInterface {
	
	@Override
	public Korisnik kreirajKorisnika(Korisnik korisnik) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Korisnik azurirajKorisnika(Korisnik korisnik) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Korisnik> sviKorisnici() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void obrisiKorisnika(Long id) {
		// TODO Auto-generated method stub

	}

}
