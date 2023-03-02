package com.example.demo.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.domain.Page;
import com.example.demo.Entity.Day3Entity;
import com.example.demo.Repository.Day3Repository;
@Service

public class Day3Service

	{
		@Autowired(required=true)
		Day3Repository stRepo;
		
		public Day3Entity saveDetails(Day3Entity e)
		{
			return stRepo.save(e);
		}
		public List<Day3Entity> getDetails()
		{
			return stRepo.findAll();
		}
		public Day3Entity updateDetails(Day3Entity e1)
		{
			return stRepo.saveAndFlush(e1);
		}
		public void deleteDetails(int id)
		{
			stRepo.deleteById(id);
		}
		public List<Day3Entity> getSorted(String field)
		{
			return stRepo.findAll(Sort.by(Sort.Direction.ASC,field));
		}
		public List<Day3Entity> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
			Page<Day3Entity> page =stRepo.findAll(PageRequest.of(offset, pageSize));
			return page.getContent();
		}   
		
	}