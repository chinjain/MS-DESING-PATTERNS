package com.eazybytes.accounts.dto;

public class ResponseDto<T> {

    private String statusCode;
    private String statusMsg;
    private T data;

    public ResponseDto() {}

    public ResponseDto(String statusCode, String statusMsg) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }

    public String getStatusCode() { return statusCode; }
    public void setStatusCode(String statusCode) { this.statusCode = statusCode; }
    
    public String getStatusMsg() { return statusMsg; }
    public void setStatusMsg(String statusMsg) { this.statusMsg = statusMsg; }

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
