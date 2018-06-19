package org.stockHelper.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Client_Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private Date buyDate;

    @Column
    private Date sellDate;

    @Column
    private Integer countStocks;

    @Column
    private Double buyPrice;

    @Column
    private Double sellPrice;

    @Column
    private Double comission;

    @ManyToOne
    @JoinColumn(name = "id_stock", referencedColumnName = "id")
    private Stock stock;

    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "id")
    private Client client;

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public Date getSellDate() {
        return sellDate;
    }

    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }

    public Integer getCountStocks() {
        return countStocks;
    }

    public void setCountStocks(Integer countStocks) {
        this.countStocks = countStocks;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Double getComission() {
        return comission;
    }

    public void setComission(Double comission) {
        this.comission = comission;
    }
}
