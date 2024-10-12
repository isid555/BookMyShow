package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity(name = "shows")

public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Screen screen;
    @Enumerated(EnumType.ORDINAL) // 0,1,2,3,4 instead  of Stirnng
    @ElementCollection
    private List<Feature>features;
    private String language;
}
