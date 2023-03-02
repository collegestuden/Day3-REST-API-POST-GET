package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Day3Service;
import com.example.demo.Entity.Day3Entity;
@RestController

public class Day3Controller {
	@Autowired
	Day3Service stuSer;
	@PostMapping("/add")
	public Day3Entity addInfo( @RequestBody Day3Entity st) {
		return stuSer.saveDetails(st);
	}
	@GetMapping("/show")
	public List<Day3Entity> fetchDetails()
	{
		return stuSer.getDetails();
	}
	@PutMapping("/Update")
	public Day3Entity updateInfo(@RequestBody Day3Entity st1)
	{
		return stuSer.updateDetails(st1);
	}
	@DeleteMapping("/delete/{sid}")
	public String deleteInfo(@PathVariable("sid") int sid){
	stuSer.deleteDetails(sid);
	return "Deleted details";
	}
	//sorting
	@GetMapping("/product/{field}")
	public List<Day3Entity> getWithSort(@PathVariable String field) {
	return stuSer.getSorted(field);
			}

	// pagination
	@GetMapping("/u/{offset}/{pageSize}")
	public List<Day3Entity> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
	return stuSer.getWithPagination(offset, pageSize);
			}
	
	
}


	