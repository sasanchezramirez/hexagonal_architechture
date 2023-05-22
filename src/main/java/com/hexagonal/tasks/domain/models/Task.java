package com.hexagonal.tasks.domain.models;

import java.time.LocalDate;

public class Task {
    private Long id;
    private String title;
    private String description;
    private LocalDate creationTime;
    private Boolean completed;

    public Task(Long id, String title, String description, LocalDate creationTime, Boolean completed){
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationTime = creationTime;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDate creationTime) {
        this.creationTime = creationTime;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
