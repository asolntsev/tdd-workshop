package ee.devclub.extremestartup;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public abstract class Workshop {
	abstract String answer(String question);

	@Test
	public void HelloWorld() {
		assertThat(answer("Hello"), equalTo("World"));
	}

	@Test
	public void TwoPlusTwo() {
		assertThat(answer("2+2"), equalTo("4"));
	}
}
