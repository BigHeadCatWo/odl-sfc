/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.sfc.provider.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.opendaylight.sfc.provider.util.httpUtil;
import org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.common.rev151017.SfName;
import org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.rsp.rev140701.CreateRenderedPathInput;
import org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.sfc.rev140701.service.function.chain.grouping.ServiceFunctionChain;
import org.opendaylight.yang.gen.v1.urn.cisco.params.xml.ns.yang.sfc.sfp.rev140701.service.function.paths.ServiceFunctionPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by g on 2016/12/9.
 */
public class SfcServiceFunctionNoneSchedulerAPI extends SfcServiceFunctionSchedulerAPI {

    private static final Logger LOG = LoggerFactory.getLogger(SfcServiceFunctionNoneSchedulerAPI.class);

    SfcServiceFunctionNoneSchedulerAPI() {
        super.setSfcServiceFunctionSchedulerType(
                org.opendaylight.yang.gen.v1.urn.intel.params.xml.ns.yang.sfc.sfst.rev150312.UserDefined.class);
    }
    @Override
    public List<SfName> scheduleServiceFunctions(ServiceFunctionChain chain, int serviceIndex,
                                                 ServiceFunctionPath sfp) {
        return null;
    }
    @Override
    public List<SfName> scheduleServiceFunctions(ServiceFunctionChain chain, int serviceIndex,
                                                 ServiceFunctionPath sfp,CreateRenderedPathInput createRenderedPathInput) {
        LOG.info("GMY=>SfcServiceFunctionNoneSchedulerAPI");
        List<SfName> sfNameList = new ArrayList<>();
        String[] infos=createRenderedPathInput.getName().split("_");
        if(infos.length<2)
            return sfNameList;
        String rspRequestID=infos[1];
        String rspInfoServerAddr="127.0.0.1:8000";
        String res= httpUtil.sendGet("http://"+rspInfoServerAddr+"/rspget","rspID="+rspRequestID);
        JsonParser jsonParser=new JsonParser();
        JsonElement jsonElement=jsonParser.parse(res);
        JsonObject jsonObject=jsonElement.getAsJsonObject();
        JsonArray sfcJsonList=jsonObject.get("sfNameList").getAsJsonArray();
        for(int i=0;i<sfcJsonList.size();i++){
            SfName sfName=new SfName(sfcJsonList.get(i).getAsString());
            sfNameList.add(sfName);
        }
        return sfNameList;
    }
}
