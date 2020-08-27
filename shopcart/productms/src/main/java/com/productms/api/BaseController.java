package com.productms.api;

import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.concurrent.TimeUnit;
public class BaseController {
	public <T> ResponseEntity<T> noCache(T responseObject, HttpStatus statusCode) {
        return ResponseEntity
                .status(statusCode)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .cacheControl(CacheControl.noCache())
                .cacheControl(CacheControl.noStore())
                .cacheControl(CacheControl
                        .maxAge(-1, TimeUnit.DAYS))
                .body(responseObject);
    }

}
