# ProfilesForestVPNCloudSDKAPI

All URIs are relative to *https://api.forestvpn.com/cloud/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProfile**](ProfilesForestVPNCloudSDKAPI.md#getProfile) | **GET** /profiles/{profileId}/ | Profile details
[**getProfileProtocolConfig**](ProfilesForestVPNCloudSDKAPI.md#getProfileProtocolConfig) | **GET** /profiles/{profileId}/protocols/{protocolId}.conf | Profile protocol config
[**getProfileProtocols**](ProfilesForestVPNCloudSDKAPI.md#getProfileProtocols) | **GET** /profiles/{profileId}/protocols/ | Profile supported protocols


<a name="getProfile"></a>
# **getProfile**
> Profile getProfile(profileId)

Profile details

### Example
```kotlin
// Import classes:
//import com.forestvpn.cloud.sdk.client.infrastructure.*
//import com.forestvpn.cloud.sdk.client.models.*

val apiInstance = ProfilesForestVPNCloudSDKAPI()
val profileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Profile = apiInstance.getProfile(profileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesForestVPNCloudSDKAPI#getProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesForestVPNCloudSDKAPI#getProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **java.util.UUID**|  |

### Return type

[**Profile**](Profile.md)

### Authorization


Configure BearerTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProfileProtocolConfig"></a>
# **getProfileProtocolConfig**
> kotlin.String getProfileProtocolConfig(profileId, protocolId)

Profile protocol config

### Example
```kotlin
// Import classes:
//import com.forestvpn.cloud.sdk.client.infrastructure.*
//import com.forestvpn.cloud.sdk.client.models.*

val apiInstance = ProfilesForestVPNCloudSDKAPI()
val profileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val protocolId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.String = apiInstance.getProfileProtocolConfig(profileId, protocolId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesForestVPNCloudSDKAPI#getProfileProtocolConfig")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesForestVPNCloudSDKAPI#getProfileProtocolConfig")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **java.util.UUID**|  |
 **protocolId** | **java.util.UUID**|  |

### Return type

**kotlin.String**

### Authorization


Configure BearerTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProfileProtocols"></a>
# **getProfileProtocols**
> kotlin.collections.List&lt;Protocol&gt; getProfileProtocols(profileId)

Profile supported protocols

### Example
```kotlin
// Import classes:
//import com.forestvpn.cloud.sdk.client.infrastructure.*
//import com.forestvpn.cloud.sdk.client.models.*

val apiInstance = ProfilesForestVPNCloudSDKAPI()
val profileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : kotlin.collections.List<Protocol> = apiInstance.getProfileProtocols(profileId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesForestVPNCloudSDKAPI#getProfileProtocols")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesForestVPNCloudSDKAPI#getProfileProtocols")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | **java.util.UUID**|  |

### Return type

[**kotlin.collections.List&lt;Protocol&gt;**](Protocol.md)

### Authorization


Configure BearerTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

