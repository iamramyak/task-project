package com.springboot.taskproject.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDto {
    private Long id;
    private String taskName;
}
