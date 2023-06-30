package com.quiz.booking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/booking")
@Controller
public class BookingController {
	

	@GetMapping("/booking_list_view")
	public String bookingListView() {
		return "/booking/bookingList";
	}
	
	@GetMapping("/booking_check_view")
	public String bookingCheckView() {
		return "/booking/bookingCheck";
	}
	
	
	
}
