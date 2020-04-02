package service;

import java.util.List;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAO employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new EmployeeDAOImpl();
	}

	@Override
	public Employee save(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee findById(int id) {
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	public void remove(int id) {
		employeeDao.remove(id);
		
	}

}
