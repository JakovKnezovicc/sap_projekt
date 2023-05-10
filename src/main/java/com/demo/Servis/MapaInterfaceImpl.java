package com.demo.Servis;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.demo.Model.Mapa;
import com.demo.Model.MapaRepository;

@Service
@Transactional
public class MapaInterfaceImpl implements MapaInterface {

	@Autowired
	private MapaRepository repo;
	
	@Override
	public Mapa kreirajMapu(Mapa mapa) {
		
		return repo.save(mapa);
	}

	@Override
	public Mapa azurirajMapu(Mapa mapa) throws Exception {
		if(repo.findById(mapa.getId())!=null) {
			Optional<Mapa>Stub=this.repo.findById(mapa.getId());
			Mapa mapaUpdate=Stub.get();
			mapaUpdate.setNaziv(mapa.getNaziv());;
			mapaUpdate.setOznakaPoduzeca(mapa.getOznakaPoduzeca());
			repo.save(mapaUpdate);
			return mapaUpdate;
		}
		else {
			throw new Exception("Zapis nije pronađen");
		}
	}

	@Override
	public Iterable<Mapa> sveMape() {
		return repo.sveMape();
	}

	@Override
	public void izbrisiMapu(Long id) {
		repo.deleteById(id);
	}

}
