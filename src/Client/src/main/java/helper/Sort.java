package helper;

import java.util.ArrayList;
import java.util.List;

import entity.User;

public class Sort {

	@SuppressWarnings("null")
	public static List<User> mergeSort(List<User> Input) {
		if (Input.size() == 1) {
			return Input;
		} else {
			int mid = Input.size() / 2;
			List<User> left = new ArrayList<User>(mid);
			List<User> right = new ArrayList<User>(Input.size() - mid);

			for (int i = 0; i < mid; i++) {
				left.add(Input.get(i));
			}

			for (int i = 0; i < Input.size() - mid; i++) {
				right.add(Input.get(i));
			}

			left = mergeSort(left);
			right = mergeSort(right);
			Input = merge(left, right, Input);
		}
		return Input;
	}

	public static List<User> merge(List<User> left, List<User> right, List<User> Input) {
		int i1 = 0;// left Index
		int i2 = 0;// right Index
		List<User> Input1 = new ArrayList<User>();

		for (int i = 0; i < Input1.size(); i++) {
			if (i2 >= right.size() || (i1 < left.size() && left.get(i).getUser_name().compareTo(right.get(i).getUser_name()) < 0)) {
				Input1.add(left.get(i1));
			} else {
				Input1.add(right.get(i2));
			}
		}
		return Input1;
	}

}
