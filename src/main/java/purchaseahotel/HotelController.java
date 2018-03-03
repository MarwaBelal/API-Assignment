package purchaseahotel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import purchaseahotel.all;
import purchaseahotel.contactinfo;
import purchaseahotel.location;
@RestController
public class HotelController {
	@RequestMapping("/amenities/{num}") 
	amenities  status(@PathVariable int num)
	{
		RestTemplate s = new RestTemplate();
		all hotel= s.getForObject("https://private-anon-a113f05447-allmyles.apiary-mock.com/hotels/"+num,all.class);
		return hotel.getHotel_details().getAmenities();
	}
	@RequestMapping("/phonenumbers/{num}")
	String[]  phonenumber(@PathVariable int num)
	{
		RestTemplate s = new RestTemplate();
		all hotel= s.getForObject("https://private-anon-a113f05447-allmyles.apiary-mock.com/hotels/"+num,all.class);
		return hotel.getHotel_details().getContact_info().getPhone_numbers();
	}
	@RequestMapping("/location/{num}")
	location  location(@PathVariable int num)
	{
		RestTemplate s = new RestTemplate();
		all hotel= s.getForObject("https://private-anon-a113f05447-allmyles.apiary-mock.com/hotels/"+num,all.class);
		return hotel.getHotel_details().getLocation();
	}
	@RequestMapping("/description/{num}")
	String  description(@PathVariable int num)
	{
		RestTemplate s = new RestTemplate();
		all hotel= s.getForObject("https://private-anon-a113f05447-allmyles.apiary-mock.com/hotels/"+num,all.class);
		return hotel.getHotel_details().getDescription();
	}
	@RequestMapping("/photos/{num}")
	String [] photos(@PathVariable int num)
	{
		RestTemplate s = new RestTemplate();
		all hotel= s.getForObject("https://private-anon-a113f05447-allmyles.apiary-mock.com/hotels/"+num,all.class);
		return hotel.getHotel_details().getPhotos();
	}
	
	
}
