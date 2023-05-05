package com.esprit.microservice.Volservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VolService {

	@Autowired
	private VolRepository volRepository;

	public Vol addVol(Vol vol) {
		return volRepository.save(vol);
	}
	public Vol updateVol(int id, Vol newVol) {
		if (volRepository.findById(id).isPresent()) {
			Vol existingVol = volRepository.findById(id).get();
			existingVol.setName(newVol.getName());
			existingVol.setPrice(newVol.getPrice());
			existingVol.setDescription(newVol.getDescription());

			return volRepository.save(existingVol);
		} else
			return null;
	}
	public String deleteVol(int id) {
		if (volRepository.findById(id).isPresent()) {
			volRepository.deleteById(id);
			return "vol supprimé";
		} else
			return "vol non supprimé";
	}
}
