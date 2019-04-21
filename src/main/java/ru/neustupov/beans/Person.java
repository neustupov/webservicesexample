package ru.neustupov.beans;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Person {

  private String firstName, secondName, surname, birthday;
  private List<Address> addresses;
  private List<String> workPhone;
  private List<String> homePhone;

  public Person(String firstName, String secondName, String surname) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.surname = surname;
  }

  public void addAddress(Address addr){
    if (addresses == null){
      addresses = new ArrayList<Address>();
      addresses.add(addr);
    }
  }
  public void removeAddress(Address addr){
    if(addresses != null){
      addresses.remove(addr);
    }
  }

  public void addWorkPhone(String phone){
    if(workPhone == null){
      workPhone = new ArrayList<String>();
      workPhone.add(phone);
    }
  }

  public void removeWorkPhone(String phone){
    if(workPhone != null){
      workPhone.remove(phone);
    }
  }

  public void addHomePhone(String phone){
    if(homePhone == null){
      homePhone = new ArrayList<String>();
      homePhone.add(phone);
    }
  }

  public void removeHomePhone(String phone){
    if(homePhone != null){
      homePhone.remove(phone);
    }
  }
}
