package main.java.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import main.java.model.Output;

public class Sentence {

	public static List<Output> toList(String input, int n) {
		List<String> list = Arrays.asList(input.split(" "));
		Set<String> set = new HashSet<String>(list);
		if(set.size() < n) {
			return Arrays.asList();
		}

		List<Output> outputs = new ArrayList<Output>();
		for(String word : set) {
			Output output = new Output(word, Collections.frequency(list, word));
			outputs.add(output);
		}
		Collections.sort(outputs);
		Collections.reverse(outputs);
		return outputs.subList(0, n);
	}

}
