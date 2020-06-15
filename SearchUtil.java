package com.classEx;

import java.util.List;

public class SearchUtil {

	public void searchEmpInfo(int id, List<Employee> list)
			throws EmployeeRecordNotFound {

		int flag = 0;

		for (Employee e : list) {
			if (e.id == id) {
				flag = 1;
				break;
			}
		}

		if (flag == 1) {
			System.out.println("Record Found");
		} else {
			throw new EmployeeRecordNotFound();
		}

	}

}
