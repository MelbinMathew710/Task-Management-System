package com.example.taskmanagementsystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.taskmanagementsystem.Models.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{} ;