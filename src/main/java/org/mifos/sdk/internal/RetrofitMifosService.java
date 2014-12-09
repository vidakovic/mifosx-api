/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifos.sdk.internal;

import com.google.gson.JsonObject;
import retrofit.Callback;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Retrofit service interface for authentication with the MifosX platform
 */
interface RetrofitMifosService {

    /**
     * Authenticates and obtains an authentication key
     * or throws an exception for invalid credentials
     * @param username the username for authentication
     * @param password the password for authentication
     * @param tenantId the tenant identifier for authentication
     * @param callback the callback method to handle the server response
     */
    @POST("/authentication")
    public void authenticate(@Query("username") String username,
                             @Query("password") String password,
                             @Header("X-Mifos-Platform-TenantId") String tenantId,
                             Callback<JsonObject> callback);

}