package com.shf.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class User {
    @Value("shf")
    private String name;
}
