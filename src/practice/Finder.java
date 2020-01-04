package practice;

import java.util.ArrayList;

public class Finder {

	public int lastIndexOf(ArrayList<String> arrayList, String string) {
		int lastIndex = -1;
		for (int i = 0; i < arrayList.size(); i++) {

			if (arrayList.get(i).toLowerCase().equals(string.toLowerCase())) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}

}
