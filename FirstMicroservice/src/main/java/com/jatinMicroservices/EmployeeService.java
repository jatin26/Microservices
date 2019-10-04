package com.jatinMicroservices;

import java.util.List;


public interface EmployeeService {

	Data saveData(Data data);
	
	List<Data> getAllDataList();

	Data updateData(Data data);

	void deleteData(Long id);
	
	
}
