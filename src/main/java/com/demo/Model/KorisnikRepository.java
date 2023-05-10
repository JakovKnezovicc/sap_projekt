package com.demo.Model;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {
	@Query(value="SELECT * FROM korisnik", nativeQuery =true)
			Collection<Korisnik> sviKorisnici();
}
