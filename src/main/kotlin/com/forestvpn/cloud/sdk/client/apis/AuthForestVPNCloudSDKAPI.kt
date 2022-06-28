/**
 * ForestVPN Cloud SDK API
 *
 * ForestVPN Cloud - it's a Google Cloud but for VPN apps. Ready to use VPN Cloud Platform minimizes efforts to build fast, secure, and modern VPN apps. 
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: support@forestvpn.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.forestvpn.cloud.sdk.client.apis

import java.io.IOException
import okhttp3.OkHttpClient

import com.forestvpn.cloud.sdk.client.models.AccessToken
import com.forestvpn.cloud.sdk.client.models.AccessTokenRequest
import com.forestvpn.cloud.sdk.client.models.Error

import com.squareup.moshi.Json

import com.forestvpn.cloud.sdk.client.infrastructure.ApiClient
import com.forestvpn.cloud.sdk.client.infrastructure.ApiResponse
import com.forestvpn.cloud.sdk.client.infrastructure.ClientException
import com.forestvpn.cloud.sdk.client.infrastructure.ClientError
import com.forestvpn.cloud.sdk.client.infrastructure.ServerException
import com.forestvpn.cloud.sdk.client.infrastructure.ServerError
import com.forestvpn.cloud.sdk.client.infrastructure.MultiValueMap
import com.forestvpn.cloud.sdk.client.infrastructure.PartConfig
import com.forestvpn.cloud.sdk.client.infrastructure.RequestConfig
import com.forestvpn.cloud.sdk.client.infrastructure.RequestMethod
import com.forestvpn.cloud.sdk.client.infrastructure.ResponseType
import com.forestvpn.cloud.sdk.client.infrastructure.Success
import com.forestvpn.cloud.sdk.client.infrastructure.toMultiValue

class AuthForestVPNCloudSDKAPI(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.forestvpn.com/cloud/v1")
        }
    }

    /**
     * Get an access token
     * 
     * @param accessTokenRequest 
     * @return AccessToken
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAccessToken(accessTokenRequest: AccessTokenRequest) : AccessToken {
        val localVarResponse = getAccessTokenWithHttpInfo(accessTokenRequest = accessTokenRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AccessToken
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get an access token
     * 
     * @param accessTokenRequest 
     * @return ApiResponse<AccessToken?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getAccessTokenWithHttpInfo(accessTokenRequest: AccessTokenRequest) : ApiResponse<AccessToken?> {
        val localVariableConfig = getAccessTokenRequestConfig(accessTokenRequest = accessTokenRequest)

        return request<AccessTokenRequest, AccessToken>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getAccessToken
     *
     * @param accessTokenRequest 
     * @return RequestConfig
     */
    fun getAccessTokenRequestConfig(accessTokenRequest: AccessTokenRequest) : RequestConfig<AccessTokenRequest> {
        val localVariableBody = accessTokenRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/auth/token/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}