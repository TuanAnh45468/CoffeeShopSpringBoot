package finalProject.CoffeeShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finalProject.CoffeeShop.dao.AdditionalInfoRepository;
import finalProject.CoffeeShop.entity.AdditionalInfo;

@Service
public class AdditionalInfoServiceImpl implements AdditionalInfoService {

	private AdditionalInfoRepository infoRepository;
	
	@Autowired
	public AdditionalInfoServiceImpl(AdditionalInfoRepository theInfoRepository) {
		infoRepository = theInfoRepository;
	}
	
	@Override
	public List<AdditionalInfo> findAll() {
		return infoRepository.findAll();
	}

	@Override
	public AdditionalInfo findById(int theId) {
		Optional<AdditionalInfo> result = infoRepository.findById(theId);
		
		AdditionalInfo info = null;
		
		if(result.isPresent()) {
			info = result.get();
		} else {
			throw new RuntimeException("Did not find the id " + theId);
		}
		return info;
	}

	@Override
	public void save(AdditionalInfo theAdditionalInfo) {
		infoRepository.save(theAdditionalInfo);
	}

	@Override
	public void deleteById(int theId) {
		infoRepository.deleteById(theId);
	}

}
