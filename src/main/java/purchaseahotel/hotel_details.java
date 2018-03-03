package purchaseahotel;

public class hotel_details {
	private amenities  amenities ;

	public amenities getAmenities() {
		return amenities;
	}

	public void setAmenities(amenities amenities) {
		this.amenities = amenities;
	}
	private contactinfo contact_info;

	public contactinfo getContact_info() {
		return contact_info;
	}

	public void setContact_info(contactinfo contact_info) {
		this.contact_info = contact_info;
	}
	private location location;

	public location getLocation() {
		return location;
	}

	public void setLocation(location location) {
		this.location = location;
	}
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	private String[] photos;

	public String[] getPhotos() {
		return photos;
	}

	public void setPhotos(String[] photos) {
		this.photos = photos;
	}
	

}
