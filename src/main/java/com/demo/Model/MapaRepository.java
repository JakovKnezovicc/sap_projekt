package com.demo.Model;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MapaRepository extends JpaRepository<Mapa, Long> {
	@Query(value = "SELECT * FROM mapa",nativeQuery = true)
	Collection<Mapa> sveMape();
}
