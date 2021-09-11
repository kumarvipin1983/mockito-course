package com.in28minutes.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.in28minutes.data.api.TodoService;

public class TodoBusinessImplMockTest {

	/*
	 * What is mocking? Mocking is creating object that simulate the behavior of
	 * real objects. Unlike stubs, mocks can be dynamically created from code - at
	 * run time. Mocks offer more functionality than stubbing. You can verify method
	 * calls and a lot of other things.
	 */

	@Test
	public void testRetrieveTodosRelatedToSpring_usignAMock() throws Exception {

		List<String> todos = Arrays.asList("Learn Spring MCV", "Learn Spring", "Learn to Dance");
		
		TodoService todoServiceMock = mock(TodoService.class);
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos);

	}
}
