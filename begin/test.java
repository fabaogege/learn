package begin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		List<String>  s = (List<String>) Collections.synchronizedCollection(a);
	}
}
