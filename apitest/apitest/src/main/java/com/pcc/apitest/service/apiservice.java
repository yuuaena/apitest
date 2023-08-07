package com.pcc.apitest.service;

import com.pcc.apitest.entity.apientity;
import com.pcc.apitest.model.apimodel;
import com.pcc.apitest.repository.apijparepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Service
@Transactional
public class apiservice {
    @Autowired
    private apijparepositoty jpa;

    public apientity insert(apimodel model){
        apientity entity = new apientity();
        entity.setrequest_date(new Date());
        entity.setssotype(model.getssotype());
        entity.setsystemid(model.getsystemid());
        entity.setsystemname(model.getsystemname());
        entity.setsystemtransactions(model.getsystemtransactions());
        entity.setsystemprivileges(model.getsystemprivileges());
        entity.setsystemusergroup(model.getsystemusergroup());
        entity.setsystemlocationgroup(model.getsystemlocationgroup());
        entity.setuserid(model.getuserid());
        entity.setuserfullname(model.getuserfullname());
        entity.setuserrdofficecode(model.getuserrdofficecode());
        entity.setuserofficecode(model.getuserofficecode());
        entity.setclientlocation(model.getclientlocation());
        entity.setlocationmachinenumber(model.getlocationmachinenumber());
        entity.settokenid(model.gettokenid());
        return jpa.save(entity);
    }
}
