

import java.util.*;

public class SortById implements Comparator<StudentDetails> {

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		return o1.id-o2.id;
	}

}
