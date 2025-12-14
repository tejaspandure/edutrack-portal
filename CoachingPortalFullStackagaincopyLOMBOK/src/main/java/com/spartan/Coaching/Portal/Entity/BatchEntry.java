package com.spartan.Coaching.Portal.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="BatchDetails")
public class BatchEntry
{
    private ObjectId id;
    private String name;
    private int fess;

}
