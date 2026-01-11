package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Scanner sc = new Scanner(System.in);
		
		Department department = new Department();
		
		
//		System.out.println("=== TEST 1: department insert ====");
//		Department newDepartment = new Department(null, "Contabil");
//		departmentDao.insert(newDepartment);
//		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("=== TEST 2: department find by Id ====");
		Department depFindById = departmentDao.findById(6);
		System.out.println(depFindById);
	
//		System.out.println("=== TEST 3: department update ====");
//		department = departmentDao.findById(7);
//		System.out.println("Digite o nome do novo departamento: ");
//		String name  = sc.nextLine();
//		department.setName(name);
//		departmentDao.update(department);
//		System.out.println("Update completed!");
		
//		System.out.println("=== TEST 4: department delete ====");
//		System.out.println("Digite o numero do departamento que deseja excluir: ");
//		int id = sc.nextInt();
//		departmentDao.deleteById(id);
//		System.out.println("Delete completed");
		
		
		System.out.println("=== TEST 5: department findAll ====");
		List<Department> dep = new ArrayList<>();
		dep = departmentDao.findAll();
		for(Department d : dep) {
			System.out.println(d);
		}
		
		
		sc.close();
	}

}
