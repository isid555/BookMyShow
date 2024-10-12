package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class City  extends BaseModel{
private String name;
private String pinCode;

//private List<Theatre> theatres;
}
