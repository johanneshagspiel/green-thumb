package helper;

import java.util.List;

import entity.User;

public class Sort {

	@SuppressWarnings("null")
	public static void mergeSort(List<User> arg) {
		
		int size = arg.size();
		
		if (size < 2 ) {
			return;
		}else if (size == 2) {
			if(arg.get(0).getUser_name().compareTo(arg.get(1).getUser_name()) > 0) {
				String temp = arg.get(0).getUser_name();
				arg.get(0).setUser_name(arg.get(1).getUser_name());
				arg.get(1).setUser_name(temp);
			}else {
				return;
			}
		}else {
			List<User> left = null;
			List<User> right = null;
			for(int i = 0; i < size; i++) {
				if (i < size/2) {
					left.add(arg.get(i));
				} else {
					right.add(arg.get(i));
				}
			}
			mergeSort(left); 
			mergeSort(right);

			int j = 0;
			int i = 0;
			int h = 0;
			boolean sorted = false;
			arg = null;
			
			while (!sorted) {
				if (left.get(i).getUser_name().compareTo(right.get(j).getUser_name()) > 0) {
					arg.add(right.get(j));
					j++;
					h++;
					if (h == size) {
						sorted = true;
					}
				} else {
					arg.add(right.get(i));
					i++;
					h++;
					if (h == size) {
						sorted = true;
					}
				}
			}
		}
	}
}
