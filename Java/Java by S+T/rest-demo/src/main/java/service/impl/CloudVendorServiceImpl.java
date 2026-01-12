package service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import model.CloudVendor;
import repository.CloudVendorRepository;
import service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
	
	CloudVendorRepository cloudVendorRepository;

	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {	//adding constructor
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudvendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudVendorRepository.findAll();
	}
	
}
