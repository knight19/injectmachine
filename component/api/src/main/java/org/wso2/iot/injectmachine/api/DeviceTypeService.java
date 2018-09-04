/*
* Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.iot.injectmachine.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Extension;
import io.swagger.annotations.ExtensionProperty;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.wso2.carbon.apimgt.annotations.api.Scope;
import org.wso2.carbon.apimgt.annotations.api.Scopes;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * This is the API which is used to control and manage device type functionality.
 */
@SwaggerDefinition(
        info = @Info(
                version = "1.0.0",
                title = "",
                extensions = {
                        @Extension(properties = {
                                @ExtensionProperty(name = "name", value = "injectmachine"),
                                @ExtensionProperty(name = "context", value = "/injectmachine"),
                        })
                }
        ),
        tags = {
                @Tag(name = "injectmachine,device_management", description = "")
        }
)
@Scopes(
        scopes = {
                @Scope(
                        name = "Enroll device",
                        description = "",
                        key = "perm:injectmachine:enroll",
                        permissions = {"/device-mgt/devices/enroll/injectmachine"}
                )
        }
)
@SuppressWarnings("NonJaxWsWebServices")
public interface DeviceTypeService {
    String SCOPE = "scope";


    /**
     * Retrieve Sensor ControllerInfo data for the given time period.
     *
     * @param deviceId unique identifier for given device type instance
     * @param from     starting time
     * @param to       ending time
     * @return response with List<SensorRecord> object which includes sensor data which is requested
     */
    @Path("device/stats/ControllerInfo/{deviceId}")
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @ApiOperation(
            consumes = MediaType.APPLICATION_JSON,
            httpMethod = "GET",
            value = "device Stats ControllerInfo and data",
            notes = "",
            response = Response.class,
            tags = "injectmachine",
            extensions = {
                    @Extension(properties = {
                            @ExtensionProperty(name = SCOPE, value = "perm:injectmachine:enroll")
                    })
            }
    )
    Response getSensorStatsControllerInfo(@PathParam("deviceId") String deviceId, @QueryParam("from") long from,
                            @QueryParam("to") long to);



    /**
     * Retrieve Sensor ControllerInfo data for the given time period.
     *
     * @param deviceId unique identifier for given device type instance
     * @param from     starting time
     * @param to       ending time
     * @return response with List<SensorRecord> object which includes sensor data which is requested
     */
    @Path("device/stats/MoldData/{deviceId}")
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @ApiOperation(
            consumes = MediaType.APPLICATION_JSON,
            httpMethod = "GET",
            value = "device Stats MoldData and data",
            notes = "",
            response = Response.class,
            tags = "injectmachine",
            extensions = {
                    @Extension(properties = {
                            @ExtensionProperty(name = SCOPE, value = "perm:injectmachine:enroll")
                    })
            }
    )
    Response getSensorStatsMoldData(@PathParam("deviceId") String deviceId, @QueryParam("from") long from,
                            @QueryParam("to") long to);


    /**
     * Retrieve Sensor ControllerInfo data for the given time period.
     *
     * @param deviceId unique identifier for given device type instance
     * @param from     starting time
     * @param to       ending time
     * @return response with List<SensorRecord> object which includes sensor data which is requested
     */
    @Path("device/stats/CycleData/{deviceId}")
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @ApiOperation(
            consumes = MediaType.APPLICATION_JSON,
            httpMethod = "GET",
            value = "device Stats CycleData and data",
            notes = "",
            response = Response.class,
            tags = "injectmachine",
            extensions = {
                    @Extension(properties = {
                            @ExtensionProperty(name = SCOPE, value = "perm:injectmachine:enroll")
                    })
            }
    )
    Response getSensorStatsCycleData(@PathParam("deviceId") String deviceId, @QueryParam("from") long from,
                                    @QueryParam("to") long to);

    /**
     * Retrieve Sensor ControllerInfo data for the given time period.
     *
     * @param deviceId unique identifier for given device type instance
     * @param from     starting time
     * @param to       ending time
     * @return response with List<SensorRecord> object which includes sensor data which is requested
     */
    @Path("device/stats/BigData/{deviceId}")
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @ApiOperation(
            consumes = MediaType.APPLICATION_JSON,
            httpMethod = "GET",
            value = "device Stats BigData and data",
            notes = "",
            response = Response.class,
            tags = "injectmachine",
            extensions = {
                    @Extension(properties = {
                            @ExtensionProperty(name = SCOPE, value = "perm:injectmachine:enroll")
                    })
            }
    )
    Response getSensorStatsBigData(@PathParam("deviceId") String deviceId, @QueryParam("from") long from,
                                     @QueryParam("to") long to);
}