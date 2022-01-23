package org.ringcentral.library.model.employee;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
public class Employee extends RepresentationModel<Employee> {

  private Long id;

  private String name;

  private String email;
}
