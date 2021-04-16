/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unique;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author anura
 */
@WebService(serviceName = "CompoundInterest")
public class CompoundInterest 
{

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CompInt")
    public double CompInt(@WebParam(name = "principal") int principal, @WebParam(name = "time") int time, @WebParam(name = "rate") double rate, @WebParam(name = "number") int number) {
        double amount = principal * Math.pow(1 + (rate / number), number * time);
        double cinterest = amount - principal;
        return cinterest;
    }

    

    
    
}
