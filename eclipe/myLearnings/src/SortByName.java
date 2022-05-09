

import java.util.Comparator;

public class SortByName implements Comparator<StudentDetails>{

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
