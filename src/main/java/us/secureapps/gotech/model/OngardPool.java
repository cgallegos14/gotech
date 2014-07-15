package us.secureapps.gotech.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "ongard_pool" database table.
 * 
 */
@Entity
@Table(name="\"ongard_pool\"")
@NamedQuery(name="OngardPool.findAll", query="SELECT o FROM OngardPool o")
public class OngardPool implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="\"poolID\"", unique=true, nullable=false)
    private int poolID;

    @Column(name="\"field\"", length=35)
    private String field;

    @Column(name="\"formation\"", length=35)
    private String formation;

    @Column(nullable=false)
    private int id;

    @Column(name="\"lastupdate\"")
    private Timestamp lastupdate;

    @Column(name="\"poolName\"", nullable=false, length=35)
    private String poolName;

    @Column(name="\"poolType\"")
    private int poolType;

    @Column(name="\"updateby\"", length=30)
    private String updateby;

    public OngardPool() {
    }

    public int getPoolID() {
        return this.poolID;
    }

    public void setPoolID(int poolID) {
        this.poolID = poolID;
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getFormation() {
        return this.formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getLastupdate() {
        return this.lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getPoolName() {
        return this.poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public int getPoolType() {
        return this.poolType;
    }

    public void setPoolType(int poolType) {
        this.poolType = poolType;
    }

    public String getUpdateby() {
        return this.updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

}