package com.sl.dbs.service;


import com.sl.dbs.model.Request;
import org.springframework.http.ResponseEntity;

public interface CommonService {

    ResponseEntity<String> getData(Request request) throws Exception;

}