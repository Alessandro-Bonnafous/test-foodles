package test.java.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.model.Output;
import main.java.service.Sentence;


class SentenceTest {

	@Test
	void testAllGood() {
		int n = 3;
		List<Output> list = Sentence.toList("baz bar foo foo zblah zblah zblah baz toto bar", n);
		
		assertThat(list.size(), is(n));
		
		Output output = list.get(0);
		assertThat(output.getWord(), is("zblah"));
		assertThat(output.getOccurence(), is(3));
		
		output = list.get(1);
		assertThat(output.getWord(), is("bar"));
		assertThat(output.getOccurence(), is(2));
		
		output = list.get(2);
		assertThat(output.getWord(), is("baz"));
		assertThat(output.getOccurence(), is(2));
	}

	@Test
	void testErrorListToSmall() {
		int n = 3;
		List<Output> list = Sentence.toList("foo foo zblah zblah zblah", n);
		assertThat(list.size(), is(0));
	}

}
