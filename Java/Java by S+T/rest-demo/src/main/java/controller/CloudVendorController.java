package controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.CloudVendor;
import service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	CloudVendorService cloudVendorService;
	
	public CloudVendorController(CloudVendorService cloudVendorService) {	//generate constructor
		super();
		this.cloudVendorService = cloudVendorService;
	}

	//Read specific cloud vendor details from DB
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		return cloudVendorService.getCloudVendor(vendorId);
	}
	
	//Read all cloud vendor details from DB
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails() {
		return cloudVendorService.getAllCloudVendors();
	}
	
	@PostMapping
	public String createCloudvendorDetails(@RequestBody CloudVendor cloudVendor) {
		return cloudVendorService.createCloudvendor(cloudVendor);
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		return cloudVendorService.updateCloudVendor(cloudVendor);
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVectorDetails(@PathVariable("vendorId") String vendorId) {
		return cloudVendorService.deleteCloudVendor(vendorId);
	}
}
