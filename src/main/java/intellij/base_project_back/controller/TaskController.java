package intellij.base_project_back.controller;

import intellij.base_project_back.entity.Task;
import intellij.base_project_back.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tasks")
@ControllerAdvice
@CrossOrigin(origins = "http://localhost:8080")
public class TaskController {

  private final TaskService service;

  @GetMapping
  public ResponseEntity<List<Task>> getAll() {
    return ResponseEntity.ok(service.findAll());
  }
}