package com.demo.Servis;
import com.demo.Model.Mapa;

public interface MapaInterface {
	Mapa kreirajMapu(Mapa mapa);
	Mapa azurirajMapu(Mapa mapa) throws Exception;
	Iterable<Mapa> sveMape();
	void izbrisiMapu(Long id);
}
