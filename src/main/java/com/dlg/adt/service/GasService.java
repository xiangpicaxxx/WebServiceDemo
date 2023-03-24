package com.dlg.adt.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Description:
 *
 * @author 格兰德法则·祝
 * Date:2023/3/21 14:16
 **/
@WebService
public interface GasService {

    @WebMethod
    void addGasData(@WebParam(name = "CompanyId",targetNamespace = "http://service.adt.dlg.com/") String companyId,
                    @WebParam(name = "AssetId",targetNamespace = "http://service.adt.dlg.com/") String assetId,
                    @WebParam(name = "GasType",targetNamespace = "http://service.adt.dlg.com/") String gasType,
                    @WebParam(name = "DateTime",targetNamespace = "http://service.adt.dlg.com/") String dateTime,
                    @WebParam(name = "PPM",targetNamespace = "http://service.adt.dlg.com/") float  ppm,
                    @WebParam(name = "HasAlarm",targetNamespace = "http://service.adt.dlg.com/") String hasAlarm,
                    @WebParam(name = "HasDone",targetNamespace = "http://service.adt.dlg.com/") String hasDone);

    public void test(@WebParam(name = "text",targetNamespace = "http://service.adt.dlg.com/") String text);


}
