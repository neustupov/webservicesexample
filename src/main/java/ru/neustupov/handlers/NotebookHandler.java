package ru.neustupov.handlers;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import ru.neustupov.beans.Address;
import ru.neustupov.beans.Person;

public class NotebookHandler extends DefaultHandler {

  static final String JAXP_SCHEMA_LANGUAGE = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";

  static final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";

  Person person;
  Address address;
  static List<Person> personList = new ArrayList<Person>();
  boolean inBirthday, inStreet, inCity, inZip, inWorkPhone, inHomePhone;

  public void startElement(String uri, String name, String qname, Attributes attributes){
    if(qname.equals("name")){
      person = new Person(attributes.getValue("first"),
          attributes.getValue("second"),
          attributes.getValue("surname"));
    }
  }
}
