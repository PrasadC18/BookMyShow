package com.prasad.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Movie extends BaseModel{
    private String movieName;
    private Date ReleaseDate;
    private List<Feature> features;
}
