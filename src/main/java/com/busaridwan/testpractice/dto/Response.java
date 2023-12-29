package com.busaridwan.testpractice.dto;

import com.busaridwan.testpractice.enums.ResponseMessages;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private String code;
    private ResponseMessages message;
    private Object data;
}
