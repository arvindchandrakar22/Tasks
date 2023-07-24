package net.springrest.springboot.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="employees_details")
@ApiModel(description = "Details about the Entity Class - 'Employee'")
public class Employee {
    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "The UNIQUE ID of the contact")
    private  long id;
    @Column(name = "first_name")
    @ApiModelProperty(notes = "Employee's First Name")
    private String firstName;
    @Column(name = "last_name")
    @ApiModelProperty(notes = "Employee's Last Name")
    private String lastName;
    @Column(name = "email")
    @ApiModelProperty(notes = "Employee's Email ID")
    private String email;
}
