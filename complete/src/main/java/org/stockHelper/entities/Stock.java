package org.stockHelper.entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String ticker;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL)
    private List<Client_Stock> clientStocks;

    public List<Client_Stock> getClientStocks() {
        return clientStocks;
    }

    public void setClientStocks(List<Client_Stock> clientStocks) {
        this.clientStocks = clientStocks;
    }

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

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

}
