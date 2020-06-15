package com.classEx;

import java.util.Collections;
import java.util.List;

public class SortUtil {

	public void sort(List<Employee> list) {

		Collections.sort(list);
		
		

	}

	public void sortBySal(List<Employee> list) {
		Collections.sort(list, new SortBySal());

	}

}
