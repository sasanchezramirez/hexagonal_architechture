package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.models.Task;
import com.hexagonal.tasks.domain.ports.in.UpdateTaskUseCase;
import com.hexagonal.tasks.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {
    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
    private final TaskRepositoryPort taskRepositoryPort;
}
