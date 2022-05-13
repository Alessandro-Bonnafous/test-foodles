package main.java.model;

public class Output implements Comparable<Output> {

	private final String word;
	private final Integer occurence;

	public Output(String word, int occurence) {
		this.word = word;
		this.occurence = occurence;
	}

	public String getWord() {
		return word;
	}

	public Integer getOccurence() {
		return occurence;
	}

	@Override
	public int compareTo(Output output) {
		if(getWord() == null || output.getWord() == null) {
			return 0;
		}
		int weight = getOccurence().compareTo(output.getOccurence());
		if(weight != 0) {
			return weight;
		}
		return output.getWord().compareTo(getWord());
	}

}
