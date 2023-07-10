package com.example.taleadventure.base.dto;

import com.example.taleadventure.base.success.SuccessResponseResult;
import com.example.taleadventure.base.success.SuccessStatusCode;
import lombok.*;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiSuccessResponse<T> {

    private SuccessStatusCode successStatusCode;
    private String message;
    private T data;

    public static <T> ApiSuccessResponse<T> successResponse(SuccessResponseResult successResponseResult, T data){
        return new ApiSuccessResponse<>(successResponseResult.getSuccessStatusCode(), successResponseResult.getMessage(), data);
    }
}
