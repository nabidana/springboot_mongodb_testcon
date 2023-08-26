package com.example.demo.DTO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("Testmongo")
@Data
public class Testmongo {
    
    @Id
    private String id;
    private String name;
    private String value;

    @Override
    public String toString(){
        return "NAME="+name+", VALUE="+value;
    }
}
