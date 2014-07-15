package us.secureapps.gotech.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "nonprod" database table.
 * 
 */
@Entity
@Table(name="\"nonprod\"")
@NamedQuery(name="NonProd.findAll", query="SELECT n FROM NonProd n")
public class NonProd implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="\"id\"", unique=true, nullable=false)
    private int id;

    @Column(name="\"api\"", nullable=false, length=10)
    private String api;

    @Column(name="\"co2vol1\"")
    private int co2vol1;

    @Column(name="\"co2vol10\"")
    private int co2vol10;

    @Column(name="\"co2vol11\"")
    private int co2vol11;

    @Column(name="\"co2vol12\"")
    private int co2vol12;

    @Column(name="\"co2vol2\"")
    private int co2vol2;

    @Column(name="\"co2vol3\"")
    private int co2vol3;

    @Column(name="\"co2vol4\"")
    private int co2vol4;

    @Column(name="\"co2vol5\"")
    private int co2vol5;

    @Column(name="\"co2vol6\"")
    private int co2vol6;

    @Column(name="\"co2vol7\"")
    private int co2vol7;

    @Column(name="\"co2vol8\"")
    private int co2vol8;

    @Column(name="\"co2vol9\"")
    private int co2vol9;

    @Column(name="\"countyID\"")
    private int countyID;

    @Column(name="\"daysprod1\"")
    private int daysprod1;

    @Column(name="\"daysprod10\"")
    private int daysprod10;

    @Column(name="\"daysprod11\"")
    private int daysprod11;

    @Column(name="\"daysprod12\"")
    private int daysprod12;

    @Column(name="\"daysprod2\"")
    private int daysprod2;

    @Column(name="\"daysprod3\"")
    private int daysprod3;

    @Column(name="\"daysprod4\"")
    private int daysprod4;

    @Column(name="\"daysprod5\"")
    private int daysprod5;

    @Column(name="\"daysprod6\"")
    private int daysprod6;

    @Column(name="\"daysprod7\"")
    private int daysprod7;

    @Column(name="\"daysprod8\"")
    private int daysprod8;

    @Column(name="\"daysprod9\"")
    private int daysprod9;

    @Column(name="\"gasvol1\"")
    private int gasvol1;

    @Column(name="\"gasvol10\"")
    private int gasvol10;

    @Column(name="\"gasvol11\"")
    private int gasvol11;

    @Column(name="\"gasvol12\"")
    private int gasvol12;

    @Column(name="\"gasvol2\"")
    private int gasvol2;

    @Column(name="\"gasvol3\"")
    private int gasvol3;

    @Column(name="\"gasvol4\"")
    private int gasvol4;

    @Column(name="\"gasvol5\"")
    private int gasvol5;

    @Column(name="\"gasvol6\"")
    private int gasvol6;

    @Column(name="\"gasvol7\"")
    private int gasvol7;

    @Column(name="\"gasvol8\"")
    private int gasvol8;

    @Column(name="\"gasvol9\"")
    private int gasvol9;

    @Column(name="\"leaseid\"", length=6)
    private String leaseid;

    @Column(name="\"NonProductionYears\"", length=200)
    private String nonProductionYears;

    @Column(name="\"oilvol1\"")
    private int oilvol1;

    @Column(name="\"oilvol10\"")
    private int oilvol10;

    @Column(name="\"oilvol11\"")
    private int oilvol11;

    @Column(name="\"oilvol12\"")
    private int oilvol12;

    @Column(name="\"oilvol2\"")
    private int oilvol2;

    @Column(name="\"oilvol3\"")
    private int oilvol3;

    @Column(name="\"oilvol4\"")
    private int oilvol4;

    @Column(name="\"oilvol5\"")
    private int oilvol5;

    @Column(name="\"oilvol6\"")
    private int oilvol6;

    @Column(name="\"oilvol7\"")
    private int oilvol7;

    @Column(name="\"oilvol8\"")
    private int oilvol8;

    @Column(name="\"oilvol9\"")
    private int oilvol9;

    @Column(name="\"poolid\"", nullable=false)
    private int poolid;

    @Column(name="\"poolname\"", nullable=false, length=50)
    private String poolname;

    @Column(name="\"proddate\"", nullable=false)
    private int proddate;

    @Column(name="\"status1\"", length=1)
    private String status1;

    @Column(name="\"status10\"", length=1)
    private String status10;

    @Column(name="\"status11\"", length=1)
    private String status11;

    @Column(name="\"status12\"", length=1)
    private String status12;

    @Column(name="\"status2\"", length=1)
    private String status2;

    @Column(name="\"status3\"", length=1)
    private String status3;

    @Column(name="\"status4\"", length=10)
    private String status4;

    @Column(name="\"status5\"", length=1)
    private String status5;

    @Column(name="\"status6\"", length=1)
    private String status6;

    @Column(name="\"status7\"", length=1)
    private String status7;

    @Column(name="\"status8\"", length=1)
    private String status8;

    @Column(name="\"status9\"", length=1)
    private String status9;

    @Column(name="\"watervol1\"")
    private int watervol1;

    @Column(name="\"watervol10\"")
    private int watervol10;

    @Column(name="\"watervol11\"")
    private int watervol11;

    @Column(name="\"watervol12\"")
    private int watervol12;

    @Column(name="\"watervol2\"")
    private int watervol2;

    @Column(name="\"watervol3\"")
    private int watervol3;

    @Column(name="\"watervol4\"")
    private int watervol4;

    @Column(name="\"watervol5\"")
    private int watervol5;

    @Column(name="\"watervol6\"")
    private int watervol6;

    @Column(name="\"watervol7\"")
    private int watervol7;

    @Column(name="\"watervol8\"")
    private int watervol8;

    @Column(name="\"watervol9\"")
    private int watervol9;

    @Column(name="\"wellnumb\"")
    private int wellnumb;

    public NonProd() {
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

    public int getCo2vol1() {
        return this.co2vol1;
    }

    public void setCo2vol1(int co2vol1) {
        this.co2vol1 = co2vol1;
    }

    public int getCo2vol10() {
        return this.co2vol10;
    }

    public void setCo2vol10(int co2vol10) {
        this.co2vol10 = co2vol10;
    }

    public int getCo2vol11() {
        return this.co2vol11;
    }

    public void setCo2vol11(int co2vol11) {
        this.co2vol11 = co2vol11;
    }

    public int getCo2vol12() {
        return this.co2vol12;
    }

    public void setCo2vol12(int co2vol12) {
        this.co2vol12 = co2vol12;
    }

    public int getCo2vol2() {
        return this.co2vol2;
    }

    public void setCo2vol2(int co2vol2) {
        this.co2vol2 = co2vol2;
    }

    public int getCo2vol3() {
        return this.co2vol3;
    }

    public void setCo2vol3(int co2vol3) {
        this.co2vol3 = co2vol3;
    }

    public int getCo2vol4() {
        return this.co2vol4;
    }

    public void setCo2vol4(int co2vol4) {
        this.co2vol4 = co2vol4;
    }

    public int getCo2vol5() {
        return this.co2vol5;
    }

    public void setCo2vol5(int co2vol5) {
        this.co2vol5 = co2vol5;
    }

    public int getCo2vol6() {
        return this.co2vol6;
    }

    public void setCo2vol6(int co2vol6) {
        this.co2vol6 = co2vol6;
    }

    public int getCo2vol7() {
        return this.co2vol7;
    }

    public void setCo2vol7(int co2vol7) {
        this.co2vol7 = co2vol7;
    }

    public int getCo2vol8() {
        return this.co2vol8;
    }

    public void setCo2vol8(int co2vol8) {
        this.co2vol8 = co2vol8;
    }

    public int getCo2vol9() {
        return this.co2vol9;
    }

    public void setCo2vol9(int co2vol9) {
        this.co2vol9 = co2vol9;
    }

    public int getCountyID() {
        return this.countyID;
    }

    public void setCountyID(int countyID) {
        this.countyID = countyID;
    }

    public int getDaysprod1() {
        return this.daysprod1;
    }

    public void setDaysprod1(int daysprod1) {
        this.daysprod1 = daysprod1;
    }

    public int getDaysprod10() {
        return this.daysprod10;
    }

    public void setDaysprod10(int daysprod10) {
        this.daysprod10 = daysprod10;
    }

    public int getDaysprod11() {
        return this.daysprod11;
    }

    public void setDaysprod11(int daysprod11) {
        this.daysprod11 = daysprod11;
    }

    public int getDaysprod12() {
        return this.daysprod12;
    }

    public void setDaysprod12(int daysprod12) {
        this.daysprod12 = daysprod12;
    }

    public int getDaysprod2() {
        return this.daysprod2;
    }

    public void setDaysprod2(int daysprod2) {
        this.daysprod2 = daysprod2;
    }

    public int getDaysprod3() {
        return this.daysprod3;
    }

    public void setDaysprod3(int daysprod3) {
        this.daysprod3 = daysprod3;
    }

    public int getDaysprod4() {
        return this.daysprod4;
    }

    public void setDaysprod4(int daysprod4) {
        this.daysprod4 = daysprod4;
    }

    public int getDaysprod5() {
        return this.daysprod5;
    }

    public void setDaysprod5(int daysprod5) {
        this.daysprod5 = daysprod5;
    }

    public int getDaysprod6() {
        return this.daysprod6;
    }

    public void setDaysprod6(int daysprod6) {
        this.daysprod6 = daysprod6;
    }

    public int getDaysprod7() {
        return this.daysprod7;
    }

    public void setDaysprod7(int daysprod7) {
        this.daysprod7 = daysprod7;
    }

    public int getDaysprod8() {
        return this.daysprod8;
    }

    public void setDaysprod8(int daysprod8) {
        this.daysprod8 = daysprod8;
    }

    public int getDaysprod9() {
        return this.daysprod9;
    }

    public void setDaysprod9(int daysprod9) {
        this.daysprod9 = daysprod9;
    }

    public int getGasvol1() {
        return this.gasvol1;
    }

    public void setGasvol1(int gasvol1) {
        this.gasvol1 = gasvol1;
    }

    public int getGasvol10() {
        return this.gasvol10;
    }

    public void setGasvol10(int gasvol10) {
        this.gasvol10 = gasvol10;
    }

    public int getGasvol11() {
        return this.gasvol11;
    }

    public void setGasvol11(int gasvol11) {
        this.gasvol11 = gasvol11;
    }

    public int getGasvol12() {
        return this.gasvol12;
    }

    public void setGasvol12(int gasvol12) {
        this.gasvol12 = gasvol12;
    }

    public int getGasvol2() {
        return this.gasvol2;
    }

    public void setGasvol2(int gasvol2) {
        this.gasvol2 = gasvol2;
    }

    public int getGasvol3() {
        return this.gasvol3;
    }

    public void setGasvol3(int gasvol3) {
        this.gasvol3 = gasvol3;
    }

    public int getGasvol4() {
        return this.gasvol4;
    }

    public void setGasvol4(int gasvol4) {
        this.gasvol4 = gasvol4;
    }

    public int getGasvol5() {
        return this.gasvol5;
    }

    public void setGasvol5(int gasvol5) {
        this.gasvol5 = gasvol5;
    }

    public int getGasvol6() {
        return this.gasvol6;
    }

    public void setGasvol6(int gasvol6) {
        this.gasvol6 = gasvol6;
    }

    public int getGasvol7() {
        return this.gasvol7;
    }

    public void setGasvol7(int gasvol7) {
        this.gasvol7 = gasvol7;
    }

    public int getGasvol8() {
        return this.gasvol8;
    }

    public void setGasvol8(int gasvol8) {
        this.gasvol8 = gasvol8;
    }

    public int getGasvol9() {
        return this.gasvol9;
    }

    public void setGasvol9(int gasvol9) {
        this.gasvol9 = gasvol9;
    }

    public String getLeaseid() {
        return this.leaseid;
    }

    public void setLeaseid(String leaseid) {
        this.leaseid = leaseid;
    }

    public String getNonProductionYears() {
        return this.nonProductionYears;
    }

    public void setNonProductionYears(String nonProductionYears) {
        this.nonProductionYears = nonProductionYears;
    }

    public int getOilvol1() {
        return this.oilvol1;
    }

    public void setOilvol1(int oilvol1) {
        this.oilvol1 = oilvol1;
    }

    public int getOilvol10() {
        return this.oilvol10;
    }

    public void setOilvol10(int oilvol10) {
        this.oilvol10 = oilvol10;
    }

    public int getOilvol11() {
        return this.oilvol11;
    }

    public void setOilvol11(int oilvol11) {
        this.oilvol11 = oilvol11;
    }

    public int getOilvol12() {
        return this.oilvol12;
    }

    public void setOilvol12(int oilvol12) {
        this.oilvol12 = oilvol12;
    }

    public int getOilvol2() {
        return this.oilvol2;
    }

    public void setOilvol2(int oilvol2) {
        this.oilvol2 = oilvol2;
    }

    public int getOilvol3() {
        return this.oilvol3;
    }

    public void setOilvol3(int oilvol3) {
        this.oilvol3 = oilvol3;
    }

    public int getOilvol4() {
        return this.oilvol4;
    }

    public void setOilvol4(int oilvol4) {
        this.oilvol4 = oilvol4;
    }

    public int getOilvol5() {
        return this.oilvol5;
    }

    public void setOilvol5(int oilvol5) {
        this.oilvol5 = oilvol5;
    }

    public int getOilvol6() {
        return this.oilvol6;
    }

    public void setOilvol6(int oilvol6) {
        this.oilvol6 = oilvol6;
    }

    public int getOilvol7() {
        return this.oilvol7;
    }

    public void setOilvol7(int oilvol7) {
        this.oilvol7 = oilvol7;
    }

    public int getOilvol8() {
        return this.oilvol8;
    }

    public void setOilvol8(int oilvol8) {
        this.oilvol8 = oilvol8;
    }

    public int getOilvol9() {
        return this.oilvol9;
    }

    public void setOilvol9(int oilvol9) {
        this.oilvol9 = oilvol9;
    }

    public int getPoolid() {
        return this.poolid;
    }

    public void setPoolid(int poolid) {
        this.poolid = poolid;
    }

    public String getPoolname() {
        return this.poolname;
    }

    public void setPoolname(String poolname) {
        this.poolname = poolname;
    }

    public int getProddate() {
        return this.proddate;
    }

    public void setProddate(int proddate) {
        this.proddate = proddate;
    }

    public String getStatus1() {
        return this.status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

    public String getStatus10() {
        return this.status10;
    }

    public void setStatus10(String status10) {
        this.status10 = status10;
    }

    public String getStatus11() {
        return this.status11;
    }

    public void setStatus11(String status11) {
        this.status11 = status11;
    }

    public String getStatus12() {
        return this.status12;
    }

    public void setStatus12(String status12) {
        this.status12 = status12;
    }

    public String getStatus2() {
        return this.status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public String getStatus3() {
        return this.status3;
    }

    public void setStatus3(String status3) {
        this.status3 = status3;
    }

    public String getStatus4() {
        return this.status4;
    }

    public void setStatus4(String status4) {
        this.status4 = status4;
    }

    public String getStatus5() {
        return this.status5;
    }

    public void setStatus5(String status5) {
        this.status5 = status5;
    }

    public String getStatus6() {
        return this.status6;
    }

    public void setStatus6(String status6) {
        this.status6 = status6;
    }

    public String getStatus7() {
        return this.status7;
    }

    public void setStatus7(String status7) {
        this.status7 = status7;
    }

    public String getStatus8() {
        return this.status8;
    }

    public void setStatus8(String status8) {
        this.status8 = status8;
    }

    public String getStatus9() {
        return this.status9;
    }

    public void setStatus9(String status9) {
        this.status9 = status9;
    }

    public int getWatervol1() {
        return this.watervol1;
    }

    public void setWatervol1(int watervol1) {
        this.watervol1 = watervol1;
    }

    public int getWatervol10() {
        return this.watervol10;
    }

    public void setWatervol10(int watervol10) {
        this.watervol10 = watervol10;
    }

    public int getWatervol11() {
        return this.watervol11;
    }

    public void setWatervol11(int watervol11) {
        this.watervol11 = watervol11;
    }

    public int getWatervol12() {
        return this.watervol12;
    }

    public void setWatervol12(int watervol12) {
        this.watervol12 = watervol12;
    }

    public int getWatervol2() {
        return this.watervol2;
    }

    public void setWatervol2(int watervol2) {
        this.watervol2 = watervol2;
    }

    public int getWatervol3() {
        return this.watervol3;
    }

    public void setWatervol3(int watervol3) {
        this.watervol3 = watervol3;
    }

    public int getWatervol4() {
        return this.watervol4;
    }

    public void setWatervol4(int watervol4) {
        this.watervol4 = watervol4;
    }

    public int getWatervol5() {
        return this.watervol5;
    }

    public void setWatervol5(int watervol5) {
        this.watervol5 = watervol5;
    }

    public int getWatervol6() {
        return this.watervol6;
    }

    public void setWatervol6(int watervol6) {
        this.watervol6 = watervol6;
    }

    public int getWatervol7() {
        return this.watervol7;
    }

    public void setWatervol7(int watervol7) {
        this.watervol7 = watervol7;
    }

    public int getWatervol8() {
        return this.watervol8;
    }

    public void setWatervol8(int watervol8) {
        this.watervol8 = watervol8;
    }

    public int getWatervol9() {
        return this.watervol9;
    }

    public void setWatervol9(int watervol9) {
        this.watervol9 = watervol9;
    }

    public int getWellnumb() {
        return this.wellnumb;
    }

    public void setWellnumb(int wellnumb) {
        this.wellnumb = wellnumb;
    }

}