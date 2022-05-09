package com.tyss.finalassesment;

import java.util.Comparator;

public class SortByMark implements Comparator<StudentDetails> {

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		// TODO Auto-generated method stub
		return (int) (o2.mark-o1.mark);
	}

}
