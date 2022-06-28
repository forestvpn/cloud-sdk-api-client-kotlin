# AuthForestVPNCloudSDKAPI

All URIs are relative to *https://api.forestvpn.com/cloud/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccessToken**](AuthForestVPNCloudSDKAPI.md#getAccessToken) | **POST** /auth/token/ | Get an access token


<a name="getAccessToken"></a>
# **getAccessToken**
> AccessToken getAccessToken(accessTokenRequest)

Get an access token

### Example
```kotlin
// Import classes:
//import com.forestvpn.cloud.sdk.client.infrastructure.*
//import com.forestvpn.cloud.sdk.client.models.*

val apiInstance = AuthForestVPNCloudSDKAPI()
val accessTokenRequest : AccessTokenRequest =  // AccessTokenRequest | 
try {
    val result : AccessToken = apiInstance.getAccessToken(accessTokenRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthForestVPNCloudSDKAPI#getAccessToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthForestVPNCloudSDKAPI#getAccessToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessTokenRequest** | [**AccessTokenRequest**](AccessTokenRequest.md)|  |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization


Configure BearerTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

