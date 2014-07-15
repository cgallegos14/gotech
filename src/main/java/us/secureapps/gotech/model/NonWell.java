package us.secureapps.gotech.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "nonwell" database table.
 * 
 */
@Entity
@Table(name="\"nonwell\"")
@NamedQuery(name="NonWell.findAll", query="SELECT n FROM NonWell n")
public class NonWell implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="\"id\"", unique=true, nullable=false)
    private int id;

    @Column(name="\"api\"", nullable=false, length=10)
    private String api;

    @Column(name="\"countyID\"")
    private int countyID;

    @Column(name="\"countyName\"", length=25)
    private String countyName;

    @Column(name="\"CumCO2\"")
    private int cumCO2;

    @Column(name="\"CumDays\"")
    private int cumDays;

    @Column(name="\"CumGas\"")
    private int cumGas;

    @Column(name="\"CumOil\"")
    private int cumOil;

    @Column(name="\"CumWater\"")
    private int cumWater;

    @Column(length=1)
    private String ew;

    @Column(name="\"FtgEW\"")
    private int ftgEW;

    @Column(name="\"FtgNS\"")
    private int ftgNS;

    @Column(name="\"Lat\"", length=8)
    private String lat;

    @Column(name="\"leaseid\"", length=6)
    private String leaseid;

    @Column(name="\"leasename\"", length=35)
    private String leasename;

    @Column(name="\"Long\"", length=10)
    private String long_;

    @Column(length=1)
    private String ns;

    @Column(name="\"range\"", length=3)
    private String range;

    @Column(name="\"section\"")
    private int section;

    @Column(name="\"Status\"", length=1)
    private String status;

    @Column(name="\"township\"", length=3)
    private String township;

    @Column(name="\"unit\"", length=1)
    private String unit;

    @Column(name="\"wellnumb\"")
    private int wellnumb;

    public NonWell() {
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

    public int getCountyID() {
        return this.countyID;
    }

    public void setCountyID(int countyID) {
        this.countyID = countyID;
    }

    public String getCountyName() {
        return this.countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCumCO2() {
        return this.cumCO2;
    }

    public void setCumCO2(int cumCO2) {
        this.cumCO2 = cumCO2;
    }

    public int getCumDays() {
        return this.cumDays;
    }

    public void setCumDays(int cumDays) {
        this.cumDays = cumDays;
    }

    public int getCumGas() {
        return this.cumGas;
    }

    public void setCumGas(int cumGas) {
        this.cumGas = cumGas;
    }

    public int getCumOil() {
        return this.cumOil;
    }

    public void setCumOil(int cumOil) {
        this.cumOil = cumOil;
    }

    public int getCumWater() {
        return this.cumWater;
    }

    public void setCumWater(int cumWater) {
        this.cumWater = cumWater;
    }

    public String getEw() {
        return this.ew;
    }

    public void setEw(String ew) {
        this.ew = ew;
    }

    public int getFtgEW() {
        return this.ftgEW;
    }

    public void setFtgEW(int ftgEW) {
        this.ftgEW = ftgEW;
    }

    public int getFtgNS() {
        return this.ftgNS;
    }

    public void setFtgNS(int ftgNS) {
        this.ftgNS = ftgNS;
    }

    public String getLat() {
        return this.lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLeaseid() {
        return this.leaseid;
    }

    public void setLeaseid(String leaseid) {
        this.leaseid = leaseid;
    }

    public String getLeasename() {
        return this.leasename;
    }

    public void setLeasename(String leasename) {
        this.leasename = leasename;
    }

    public String getLong_() {
        return this.long_;
    }

    public void setLong_(String long_) {
        this.long_ = long_;
    }

    public String getNs() {
        return this.ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getRange() {
        return this.range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public int getSection() {
        return this.section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTownship() {
        return this.township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWellnumb() {
        return this.wellnumb;
    }

    public void setWellnumb(int wellnumb) {
        this.wellnumb = wellnumb;
    }

}