package com.prasad.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

// below anotations will add getters and setters automatically
@Getter
@Setter
public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date lastModifiedAt;
}
