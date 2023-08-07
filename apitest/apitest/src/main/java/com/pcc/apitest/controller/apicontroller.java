package com.pcc.apitest.controller;

import com.pcc.apitest.entity.apientity;
import com.pcc.apitest.model.apimodel;
import com.pcc.apitest.response.ApiResponse;
import com.pcc.apitest.response.ResponseData;
import com.pcc.apitest.service.apiservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "apictest")
public class apicontroller {

    @Autowired
    private apiservice apiservice;

//    @PostMapping("/gentoken") // insert update delete
//    public apientity insert(@RequestBody apimodel apimodel) {
//        return apiservice.insert(apimodel);
//    }
    @PostMapping("/gentoken")
    public ResponseEntity<?> generatetoken(@RequestBody apimodel apimodel) {
        try {
            apientity savedgeneratetoken = apiservice.insert(apimodel);
            return ResponseEntity.ok(createSuccessResponse(savedgeneratetoken.getuserid(), savedgeneratetoken.gettokenid()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(createErrorResponse(apimodel));
        }
    }

    private Object createSuccessResponse(String userid, String tokenid) {
        return new ApiResponse("I07000", "ทำรายการเรียบร้อย", new ResponseData(userid, tokenid));
    }

    private Object createErrorResponse(apimodel apimodel) {
        return new ApiResponse("E000001", "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้",
                new ResponseData(apimodel.getuserid(), ""));
    }

}
