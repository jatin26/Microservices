package com.jatinMicroservices;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Data saveData(Data data) {

		return employeeDao.save(data);
	}

	@Override
	public List<Data> getAllDataList() {

		return employeeDao.findAll();
	}

	@Override
	public Data updateData(Data data) {
		// TODO Auto-generated method stub
		return employeeDao.saveAndFlush(data);
	}

	@Override
	public void deleteData(Long id) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(id);
	}

}
