package org.stockHelper.entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany( mappedBy = "role", cascade = CascadeType.ALL)
    private List<Client_Role> clientRoles;

    public List<Client_Role> getClientRoles() {
        return clientRoles;
    }

    public void setClientRoles(List<Client_Role> clientRoles) {
        this.clientRoles = clientRoles;
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
}
