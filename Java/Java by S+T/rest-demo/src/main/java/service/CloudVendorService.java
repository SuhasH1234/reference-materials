package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.CloudVendor;

@Service
public interface CloudVendorService {
	public String createCloudvendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String cloudVendorId);
	public CloudVendor getCloudVendor(String cloudVendorId);
	public List<CloudVendor> getAllCloudVendors();
}
