package us.secureapps.gotech.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "firstprodtable" database table.
 * 
 */
@Entity
@Table(name="\"firstprodtable\"")
@NamedQuery(name="FirstProduction.findAll", query="SELECT f FROM FirstProduction f")
public class FirstProduction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="\"id\"", unique=true, nullable=false)
    private int id;

    @Column(nullable=false, length=10)
    private String api;

    private int co2;

    @Column(name="\"Gas\"")
    private int gas;

    @Column(name="\"Oil\"")
    private int oil;

    @Column(name="\"PoolId\"", nullable=false)
    private int poolId;

    @Column(name="\"ProdMonth\"", nullable=false, length=3)
    private String prodMonth;

    @Column(name="\"ProdYear\"", nullable=false)
    private int prodYear;

    @Column(name="\"Water\"")
    private int water;

    public FirstProduction() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApi() {
        return this.api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public int getCo2() {
        return this.co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }

    public int getGas() {
        return this.gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getOil() {
        return this.oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getPoolId() {
        return this.poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public String getProdMonth() {
        return this.prodMonth;
    }

    public void setProdMonth(String prodMonth) {
        this.prodMonth = prodMonth;
    }

    public int getProdYear() {
        return this.prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    public int getWater() {
        return this.water;
    }

    public void setWater(int water) {
        this.water = water;
    }

}