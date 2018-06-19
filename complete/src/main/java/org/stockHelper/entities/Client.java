package org.stockHelper.entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String login;

    @Column
    private String password;

    //token for registration

    //token jwt

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Client_Stock> stockList;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Client_Role> clientRoles;


    public List<Client_Role> getClientRoles() {
        return clientRoles;
    }

    public void setClientRoles(List<Client_Role> clientRoles) {
        this.clientRoles = clientRoles;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Client_Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Client_Stock> stockList) {
        this.stockList = stockList;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

