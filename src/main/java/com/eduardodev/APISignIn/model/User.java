package com.eduardodev.APISignIn.model;

import javax.persistence.*;
import java.util.Objects;


@Entity // Notação do JPA, é uma entidade, mapeada para uma tabela chamada User  no Banco de Dados.
public class User {
    @Id // Comporta-se como uma Primary Key
    @GeneratedValue( strategy = GenerationType.IDENTITY) //Delego a responsabilidade de incrementar esse ID para o Banco de Dados
    private Long id;

    @Column( nullable = false)
    private String name;
    @Column (nullable = false)
    private String lastname;
    @Column (nullable = false)
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(lastname, user.lastname);
    }
}


