package com.quiz.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.store.bo.StoresBO;
import com.quiz.store.domain.Stores;

@RequestMapping("/store")
@Controller
public class StoresController {
	
	@Autowired
	private StoresBO storesBO;
	
	
	@GetMapping("/stores_view")
	public String storesView(Model model) {
		List<Stores> storesList = storesBO.getStoresList();
		model.addAttribute("storesList", storesList);
		return "stores/storesList";
	}
	
}
