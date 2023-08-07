package com.pcc.apitest.response;

public class ApiResponse {
    private final String responseCode;
    private final String responseMessage;
    private final ResponseData responseData;

    public ApiResponse(String responseCode, String responseMessage, ResponseData responseData) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.responseData = responseData;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public ResponseData getResponseData() {
        return responseData;
    }
}
