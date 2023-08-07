package com.pcc.apitest.entity;


import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="sso_user_test", catalog="ssotest")
public class apientity {
    @Id
    private Date request_date;

    private String ssotype;

    private String systemid;
    private String systemname;
    private String systemtransactions;
    private String systemprivileges;

    private String systemusergroup;
    private String systemlocationgroup;
    private String userid;
    private String userfullname;

    private String userrdofficecode;
    private String userofficecode;
    private String clientlocation;
    private String locationmachinenumber;
    private String tokenid;



    public apientity() {
        super();
    }

    public apientity(Date request_date, String ssotype, String systemid, String systemname,
                     String systemtransactions, String systemprivileges, String systemusergroup,String systemlocationgroup, String userid,
                     String userfullname, String userrdofficecode,String userofficecode, String clientlocation, String locationmachinenumber, String tokenid){

        super();
        this.request_date = request_date;
        this.ssotype = ssotype;
        this.systemid = systemid;
        this.systemname = systemname;
        this.systemtransactions = systemtransactions;
        this.systemprivileges = systemprivileges;
        this.systemusergroup = systemusergroup;
        this.systemlocationgroup = systemlocationgroup;
        this.userid = userid;
        this.userfullname = userfullname;
        this.userrdofficecode = userrdofficecode;
        this.userofficecode = userofficecode;
        this.clientlocation = clientlocation;
        this.locationmachinenumber = locationmachinenumber;
        this.tokenid = tokenid;
    }

    @Column(name="request_date")
    public Date getrequest_date() {
        return request_date;
    }
    public void setrequest_date(Date request_date) {
        this.request_date = request_date;
    }

    @Column(name = "ssotype", length = 50)
    public String getssotype() {
        return ssotype;
    }
    public void setssotype(String ssotype) {
        this.ssotype = ssotype;
    }

    @Column(name = "systemid", length = 50)
    public String getsystemid() {
        return systemid;
    }
    public void setsystemid(String systemid) {
        this.systemid = systemid;
    }

    @Column(name = "systemname", length = 250)
    public String getsystemname() {
        return systemname;
    }
    public void setsystemname(String systemname) {
        this.systemname = systemname;
    }

    @Column(name = "systemtransactions", length = 250)
    public String getsystemtransactions() {
        return systemtransactions;
    }
    public void setsystemtransactions(String systemtransactions) {
        this.systemtransactions = systemtransactions;
    }

    @Column(name = "systemprivileges", length = 250)
    public String getsystemprivileges() {
        return systemprivileges;
    }
    public void setsystemprivileges(String systemprivileges) {
        this.systemprivileges = systemprivileges;
    }

    @Column(name = "systemusergroup", length = 50)
    public String getsystemusergroup() {
        return systemusergroup;
    }
    public void setsystemusergroup(String systemusergroup) {
        this.systemusergroup = systemusergroup;
    }

    @Column(name = "systemlocationgroup", length = 50)
    public String getsystemlocationgroup() {
        return systemlocationgroup;
    }
    public void setsystemlocationgroup(String systemlocationgroup) {
        this.systemlocationgroup = systemlocationgroup;
    }

    @Column(name = "userid", length = 200)
    public String getuserid() {
        return userid;
    }
    public void setuserid(String userid) {
        this.userid = userid;
    }

    @Column(name = "userfullname", length = 500)
    public String getuserfullname() {
        return userfullname;
    }
    public void setuserfullname(String userfullname) {
        this.userfullname = userfullname;
    }

    @Column(name = "userrdofficecode", length = 250)
    public String getuserrdofficecode() {
        return userrdofficecode;
    }
    public void setuserrdofficecode(String userrdofficecode) {
        this.userrdofficecode = userrdofficecode;
    }

    @Column(name = "userofficecode", length = 250)
    public String getuserofficecode() { return userofficecode;
    }
    public void setuserofficecode(String userofficecode) {
        this.userofficecode = userofficecode;
    }

    @Column(name = "clientlocation", length = 250)
    public String getclientlocation() {
        return clientlocation;
    }
    public void setclientlocation(String clientlocation) {
        this.clientlocation = clientlocation;
    }

    @Column(name = "locationmachinenumber", length = 500)
    public String getlocationmachinenumber() {
        return locationmachinenumber;
    }
    public void setlocationmachinenumber(String locationmachinenumber) {
        this.locationmachinenumber = locationmachinenumber;
    }

    @Column(name = "tokenid", length = 1000)
    public String gettokenid() {
        return tokenid;
    }
    public void settokenid(String tokenid) {
        this.tokenid = tokenid;
    }



}
