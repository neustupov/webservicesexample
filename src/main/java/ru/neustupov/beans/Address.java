package ru.neustupov.beans;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Address {

  private String street,city, zip, type = "город";

}
