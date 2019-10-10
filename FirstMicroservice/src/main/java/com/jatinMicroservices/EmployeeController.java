package com.jatinMicroservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("employee")
@RestController
@RefreshScope
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public Data save(@RequestBody Data data)
	{
		return employeeService.saveData(data);
	}

	@GetMapping("/all")
	public List<Data> getData()
	{
		return employeeService.getAllDataList();
	}

	@PutMapping("/update")
	public Data updateData(@RequestBody Data data)
	{
		return employeeService.updateData(data);
	}

	@DeleteMapping("/delete/{aemp}")
	public void delete(@PathVariable(name="aemp") Long id)
	{
		employeeService.deleteData(id);
	}
}
