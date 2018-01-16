package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ExampleTest {
	@Test
	public void listShouldBeEmptyWhenInitialised() {
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		assertThat(recentlyUsedList.getLength(), is(0));
	}

	@Test
	public void shouldBeAbleToAddThingsToList() {
		RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
		recentlyUsedList.add("thing");
		assertThat(recentlyUsedList.getLength(), is(1));
	}

}
