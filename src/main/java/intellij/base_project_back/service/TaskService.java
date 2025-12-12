package intellij.base_project_back.service;

import intellij.base_project_back.entity.Task;
import intellij.base_project_back.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

  private final TaskRepository repo;

  public List<Task> findAll() {
    List<Task> tasks = repo.findAll();
    if(tasks.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Aucune tâche trouvée");
    return tasks;
  }

  // autres méthodes CRUD
}

