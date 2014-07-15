package us.secureapps.gotech.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "AllWells" database table.
 * 
 */
@Entity
@Table(name="\"AllWells\"")
@NamedQuery(name="AllWell.findAll", query="SELECT a FROM AllWell a")
public class AllWell implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="\"id_pk\"", unique=true, nullable=false)
    private int idPk;

    @Column(length=255)
    private String api;

    @Column(name="\"Choke\"", length=255)
    private String choke;

    @Column(name="\"CompDate\"")
    private Timestamp compDate;

    @Column(name="\"County\"", length=255)
    private String county;

    @Column(name="\"EorW\"", length=255)
    private String eorW;

    @Column(name="\"EWFoot\"", precision=53)
    private double EWFoot;

    @Column(name="\"Gas(MCFGPD)\"", length=255)
    private String gas_MCFGPD_;

    @Column(length=255)
    private String gor;

    @Column(name="\"Grav\"", length=255)
    private String grav;

    @Column(nullable=false)
    private int id;

    @Column(name="\"NorS\"", length=255)
    private String norS;

    @Column(name="\"NSFoot\"", precision=53)
    private double NSFoot;

    @Column(name="\"Oil(BOPD)\"", length=255)
    private String oil_BOPD_;

    @Column(name="\"Operator\"", length=255)
    private String operator;

    @Column(name="\"PBDepth\"", length=255)
    private String PBDepth;

    @Column(name="\"PerfBottom\"", length=255)
    private String perfBottom;

    @Column(name="\"PerfTop\"", length=255)
    private String perfTop;

    @Column(name="\"ProducingFormation\"", length=255)
    private String producingFormation;

    @Column(name="\"Range\"", length=255)
    private String range;

    @Column(name="\"Section\"", precision=53)
    private double section;

    @Column(name="\"Status\"", length=255)
    private String status;

    @Column(name="\"TDDepth\"", precision=53)
    private double TDDepth;

    @Column(name="\"TDFormation\"", length=255)
    private String TDFormation;

    @Column(name="\"Township\"", length=255)
    private String township;

    @Column(name="\"Water(BWPD)\"", length=255)
    private String water_BWPD_;

    @Column(name="\"WellName\"", length=255)
    private String wellName;

    public AllWell() {
    }

    public int getIdPk() {
        return this.idPk;
    }

    public void setIdPk(int idPk) {
        this.idPk = idPk;
    }

    public String getApi() {
        return this.api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getChoke() {
        return this.choke;
    }

    public void setChoke(String choke) {
        this.choke = choke;
    }

    public Timestamp getCompDate() {
        return this.compDate;
    }

    public void setCompDate(Timestamp compDate) {
        this.compDate = compDate;
    }

    public String getCounty() {
        return this.county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getEorW() {
        return this.eorW;
    }

    public void setEorW(String eorW) {
        this.eorW = eorW;
    }

    public double getEWFoot() {
        return this.EWFoot;
    }

    public void setEWFoot(double EWFoot) {
        this.EWFoot = EWFoot;
    }

    public String getGas_MCFGPD_() {
        return this.gas_MCFGPD_;
    }

    public void setGas_MCFGPD_(String gas_MCFGPD_) {
        this.gas_MCFGPD_ = gas_MCFGPD_;
    }

    public String getGor() {
        return this.gor;
    }

    public void setGor(String gor) {
        this.gor = gor;
    }

    public String getGrav() {
        return this.grav;
    }

    public void setGrav(String grav) {
        this.grav = grav;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNorS() {
        return this.norS;
    }

    public void setNorS(String norS) {
        this.norS = norS;
    }

    public double getNSFoot() {
        return this.NSFoot;
    }

    public void setNSFoot(double NSFoot) {
        this.NSFoot = NSFoot;
    }

    public String getOil_BOPD_() {
        return this.oil_BOPD_;
    }

    public void setOil_BOPD_(String oil_BOPD_) {
        this.oil_BOPD_ = oil_BOPD_;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getPBDepth() {
        return this.PBDepth;
    }

    public void setPBDepth(String PBDepth) {
        this.PBDepth = PBDepth;
    }

    public String getPerfBottom() {
        return this.perfBottom;
    }

    public void setPerfBottom(String perfBottom) {
        this.perfBottom = perfBottom;
    }

    public String getPerfTop() {
        return this.perfTop;
    }

    public void setPerfTop(String perfTop) {
        this.perfTop = perfTop;
    }

    public String getProducingFormation() {
        return this.producingFormation;
    }

    public void setProducingFormation(String producingFormation) {
        this.producingFormation = producingFormation;
    }

    public String getRange() {
        return this.range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public double getSection() {
        return this.section;
    }

    public void setSection(double section) {
        this.section = section;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTDDepth() {
        return this.TDDepth;
    }

    public void setTDDepth(double TDDepth) {
        this.TDDepth = TDDepth;
    }

    public String getTDFormation() {
        return this.TDFormation;
    }

    public void setTDFormation(String TDFormation) {
        this.TDFormation = TDFormation;
    }

    public String getTownship() {
        return this.township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getWater_BWPD_() {
        return this.water_BWPD_;
    }

    public void setWater_BWPD_(String water_BWPD_) {
        this.water_BWPD_ = water_BWPD_;
    }

    public String getWellName() {
        return this.wellName;
    }

    public void setWellName(String wellName) {
        this.wellName = wellName;
    }

}