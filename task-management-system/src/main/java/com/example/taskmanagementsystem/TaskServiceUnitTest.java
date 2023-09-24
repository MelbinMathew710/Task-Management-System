package com.example.taskmanagementsystem;

import com.example.taskmanagementsystem.Models.Task;
import com.example.taskmanagementsystem.Repositories.TaskRepository;
import com.example.taskmanagementsystem.Services.TaskService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TaskServiceUnitTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    public void testCreateTask() {
        // Mock the behavior of the repository
        Mockito.when(taskRepository.save(Mockito.any(Task.class))).thenReturn(new Task());

        // Call the service method
        Task task = taskService.createTask(new Task());

        // Assertions
        Assertions.assertNotNull(task);
        // Add more assertions as needed
    }

}
