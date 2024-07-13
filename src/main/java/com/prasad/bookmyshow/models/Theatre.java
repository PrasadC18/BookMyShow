package com.prasad.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Theatre extends BaseModel {
    private String theatreName;
    private Region region;
    private List<Screen> screens;
}
