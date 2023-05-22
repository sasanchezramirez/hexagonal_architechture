package com.hexagonal.tasks.infrastructure.repositories;

import com.hexagonal.tasks.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
}
