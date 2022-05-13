package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import main.java.model.Output;
import main.java.service.Sentence;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("sentence = ");
        String sentence = br.readLine();
        System.out.println("n = ");
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch(NumberFormatException nfe) {
            System.err.println("Invalid Format!");
        }
        
        List<Output> result = Sentence.toList(sentence, n);
        System.out.println("Output:");
        System.out.println("[");
        for(Output o : result) {
        	System.out.println("    (\"" + o.getWord() + "\", " + o.getOccurence() + "),");
        }
        System.out.println("[");
	}

}
