package com.example.ngyenquanghuyyy.entity;
import javax.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "wage", nullable = false)
    private Integer wage;




    public EmployeesEntity(String name, Integer wage) {
        this.name = name;
        this.wage = wage;
    }

    public EmployeesEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWage() {
        return wage;
    }

    public void setWage(Integer wage) {
        this.wage = wage;
    }
}
