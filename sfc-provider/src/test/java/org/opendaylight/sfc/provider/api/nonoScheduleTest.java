/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others. All rights reserved.
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
import org.junit.Assert;
import org.junit.Test;
import org.opendaylight.sfc.provider.util.httpUtil;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by g on 2016/12/9.
 */
public class nonoScheduleTest {
    @Test
    public void testPrix(){
        String rspName="nonoSchedule_123456_oriPathName";
        Pattern nonoSchedulerPattern= Pattern.compile("^nonoSchedule_\\d+_.*?");

        Assert.assertTrue(nonoSchedulerPattern.matcher(rspName).matches());
    }

    @Test
    public void testRspResponseServer(){
        String rspRequestID="1234";
//    todo：从配置文件读取
        String rspInfoServerIpAddr="http://127.0.0.1:8000/rspget";
        String res= httpUtil.sendGet(rspInfoServerIpAddr,"rspID="+rspRequestID);
        System.out.println(res);
//      res是json格式的，eg:{"sfNameList":""}
        JsonParser jsonParser=new JsonParser();
        JsonElement jsonElement=jsonParser.parse(res);  //将json字符串转换成JsonElement
        System.out.println(jsonElement.isJsonObject());
        JsonObject jsonObject=jsonElement.getAsJsonObject();
        JsonArray sfcJsonList=jsonObject.get("sfNameList").getAsJsonArray();
        List<String> sfcList=new LinkedList<>();
        for(int i=0;i<sfcJsonList.size();i++){
            sfcList.add(sfcJsonList.get(i).getAsString());
        }
        List<String> expect=new LinkedList<>();
        expect.add("fw");
        expect.add("dpi");
        Assert.assertEquals(sfcList,expect);
    }
}
