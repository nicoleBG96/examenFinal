package com.ucbcba.taller.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String nombre;

    private Integer contador=0;

    public Integer getId() { return id; }

    public void setId(Integer id){this.id=id;}

    public String getNombre(){return nombre;}

    public void setNombre(String nombre){this.nombre=nombre;}

    public Integer getContador(){return contador;}

    public void setContador(Integer contador){this.contador=contador;}



}
