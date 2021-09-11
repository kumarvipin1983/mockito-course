package com.in28minutes.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.in28minutes.data.api.TodoService;
import com.in28minutes.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testTodoBusinessImpl() {
		TodoService todoService = new TodoServiceStub(); 
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> filteredTodos =  todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}
}
