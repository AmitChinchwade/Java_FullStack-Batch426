package com.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class MyController {

	// here we basically write the apis

	// rest is the @Response body and the controller is the @Controller
	// the Responce body checks the apis present or not and pass the data and
	// provides the status code

	// RestController will now generate the response now

	// we use the mapping in backend
	@GetMapping("/allmovies")
	public String getMovies() {

		return "Welcome to all Movies";

	}
	
	@GetMapping("/moviesbyid")
	public String getMovibyId() {

		return "Search the movies by id here";

	}
	
	@PostMapping("/addmovies")
	public String putMethodName() {
		//TODO: process PUT request
		
		return "The movies are added";
	}
	
	@PutMapping("/updatemovi")
	public String updateMovi() {

		return "The movi is updated to sholey";

	}
	
	@DeleteMapping("/deletemovi")
	public String deleteMovi() {

		return "The Movi Hero is Deleted";

	}
	
	@GetMapping("/theaters")
	public String alltheaters() {

		return "The list of theaters as follows : Vijay Theater, Ganesh Theater";

	}
	
	@PostMapping("/addtheater")
	public String addTheater() {

		return "The theater Umang is Added..";

	}
	
	@PutMapping("/updatetheater")
	public String updateTheater() {

		return "The theater name is updated";

	}
	
	@DeleteMapping("/deletetheater")
	public String deleteTheater() {

		return "The theater is deleted";

	}
	
	@PostMapping("/addshows")
	public String addShows() {

		return "The show Friends is added successfully";

	}
	
	@GetMapping("/getallshows")
	public String getallShows() {

		return "All the shows are as follows :  Friends, Gost, Bankers...";

	}
	
	@GetMapping("/getshowbymovie")
	public String getshowbyMovie() {

		return "The show by movi name as follows : Money Heist";

	}
	
	@PutMapping("/updateshowtiming")
	public String updatetimingshow() {

		return "The show timing is updated";

	}
	
	@PostMapping("/bookticket")
	public String bookTicket() {

		return "The ticket is booked successfully";

	}
	
	@GetMapping("/bookingdetails")
	public String getbookingDetails() {

		return "The Booking details are as follows : Show - Tik Tik , Timing : 1.45 pm";

	}
	
	@DeleteMapping("/cancelticket")
	public String cancelTicket() {

		return "The ticket is canceled successfully";

	}
	
	@GetMapping("allbookings")
	public String showallBookings() {

		return "The bookings are as follows : Pune - 45, Nagpur - 89";

	}
	
	@PostMapping("/registeruser")
	public String registerUser() {

		return "The user Registered Successfully..Enjoy the show!!";

	}
	
	@PostMapping("/loginuser")
	public String loginUser() {

		return "User logged in successfully....";

	}
	
	@GetMapping("/userprofile")
	public String seeProfile() {

		return "The user profile is as follows: Name- Ganesh , City - Pune";

	}
	

	
	
	
	

}
