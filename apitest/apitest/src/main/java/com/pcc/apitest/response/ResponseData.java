package com.pcc.apitest.response;

public class ResponseData {
    private final String userId;
    private final String tokenId;

    public ResponseData(String userId, String tokenId) {
        this.userId = userId;
        this.tokenId = tokenId;
    }

    public String getUserId() {
        return userId;
    }

    public String getTokenId() {
        return tokenId;
    }

}
