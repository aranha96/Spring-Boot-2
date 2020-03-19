package br.jus.tjpb.swrsn.rebeldes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RebeldeService {
	
	@Autowired
	private RebeldeRepository repo;
	
	public Rebelde find(Integer id) {
		Optional<Rebelde> reb = repo.findById(id);
		return reb.orElse(null);
	}
	
	public void updateLocation(Rebelde reb, Integer latitude, Integer longitude, String nomeBase) {
		
		reb.setLatitude(latitude);
		reb.setLongitude(longitude);
		reb.setNomeBase(nomeBase);
	}
	
	public void reportTraitor(Rebelde acusado) {
		
		Integer reportesAnteriores = acusado.getAcusado();
		Integer acusacoesAtualizadas = reportesAnteriores++;
		acusado.setAcusado(acusacoesAtualizadas);
		
	}
	

}