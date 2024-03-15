package com.example.saigontech.controller;

import com.example.saigontech.controller.dto.Task;
import com.example.saigontech.controller.dto.TaskDto;
import com.example.saigontech.controller.dto.TaskRepository;
import com.example.saigontech.controller.dto.TaskStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @PostMapping("/tasks")
    public ResponseEntity<Long> createdTask(@RequestBody TaskDto taskDto) {
        String title = taskDto.getTitle();
        String description = taskDto.getDescription();
        Task task = new Task(title);
        task.setDescription(description);
        Long id = taskRepository.save(task).getId();
        return ResponseEntity.ok(id);
    }

    @GetMapping("/tasks/{id}")
    public ResponseEntity<TaskDto> createdTask(@PathVariable Long id) {
        Optional<Task> taskOptional = taskRepository.findById(id);
        if (taskOptional.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(taskOptional.get().toDto());
    }

    @PutMapping("/tasks/{id}")
    public ResponseEntity<String> updateTask(@PathVariable Long id, @RequestBody TaskDto taskDto) {
        Optional<Task> taskOption = taskRepository.findById(id);
        if (taskOption.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        Task task = taskOption.get();
        if (taskDto.getTitle() != null) {
            task.setTitle(taskDto.getTitle());
        }
        if (taskDto.getDescription() != null) {
            task.setDescription(taskDto.getDescription());
        }
        try {
            TaskStatus status = TaskStatus.valueOf(taskDto.getStatus());
            if (taskDto.getStatus() != null) {
                task.setStatus(status);
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            String status = Arrays.stream(TaskStatus.values())
                    .map(TaskStatus::toString)
                    .collect(Collectors.joining(","));
            return ResponseEntity.ok().body("Available status in .........." + status + ".");
        }
        taskRepository.save(task);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("tasks/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        Optional<Task> taskOptional = taskRepository.findById(id);
        if (taskOptional.isEmpty())
            return ResponseEntity.noContent().build();
        taskRepository.delete(taskOptional.get());
        return ResponseEntity.ok().build();
    }

    @GetMapping("tasks/describe/{id}")
    public ResponseEntity<String> getDescriptionById(@PathVariable Long id) {
        Optional<Task> taskOptional = taskRepository.findById(id);
        String res;
        if (taskOptional.isEmpty()) {
            res = String.format("Task with id = %d does not exist", id);
        } else {
            res = String.format("Description of task [%d: %s] is: %s", id, taskOptional.get().getTitle(), taskOptional.get().getDescription());
        }
        return ResponseEntity.ok().body(res);
    }

    @GetMapping("tasks")
    public ResponseEntity<List<String>> getAllTask() {
        String string = String.format("Task with id = %d does not exist");
        List<Task> tasks = taskRepository.findAll();
        List<String> res = new ArrayList<>();
        for (Task task : tasks) {
            res.add(string);
        }
        return ResponseEntity.ok().body(res);
    }

    @GetMapping("/x")
    public ResponseEntity<String> getX() {
        return ResponseEntity.ok().body("anh em oi");
    }

    @GetMapping("/y")
    public ResponseEntity<String> getY() {
        return ResponseEntity.ok("X");
    }

}
