package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		int[] a = {1,2,3,3  };
		Value v = frequency(a);
		if (v == null)
			System.out.println("array is empty");
		else if (v.freq > 1) {
			System.out.println("The most frequent element : " + v.element);
			System.out.println("Its frequency : " + v.freq);

		} else
			System.out.println("No frequent element. All elements are unique.");
	}

	private static Value frequency(int[] a) {
		if (a.length == 0)
			return null;
		else {
			HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
			for (int i = 0; i < a.length; i++) {
				if (m.containsKey(a[i])) {
					m.put(a[i], m.get(a[i]) + 1);
				} else
					m.put(a[i], 1);

			}
			Set s = m.entrySet();
			Iterator itr = s.iterator();
			int freq = 1;
			int element = 0;
			while (itr.hasNext()) {
				Map.Entry m1 = (Map.Entry) itr.next();
				int val = (int) m1.getValue();
				if (val > freq) {
					freq = val;
					element = (int) m1.getKey();
				}

			}
			Value v = new Value();
			v.element = element;
			v.freq = freq;
			return v;
		}

	}
}

class Value {
	int element;
	int freq;
}
