package com.monolith.demo.monolith_demo.shared;

import com.monolith.demo.monolith_demo.dto.ResponseDto;

public class Utils {
  public static ResponseDto getResponse(boolean success, Integer httpStatus, String message, Object data) {
    ResponseDto response = new ResponseDto();

    response.setHttpStatus(httpStatus);
    response.setServerMessage(message);
    response.setData(data);
    response.setSuccess(success);
    response.setError(!success);

    return response;
  }
}
