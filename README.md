# com.forestvpn.cloud.sdk.client - Kotlin client library for ForestVPN Cloud SDK API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.forestvpn.com/cloud/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthForestVPNCloudSDKAPI* | [**getAccessToken**](docs/AuthForestVPNCloudSDKAPI.md#getaccesstoken) | **POST** /auth/token/ | Get an access token
*ProfilesForestVPNCloudSDKAPI* | [**getProfile**](docs/ProfilesForestVPNCloudSDKAPI.md#getprofile) | **GET** /profiles/{profileId}/ | Profile details
*ProfilesForestVPNCloudSDKAPI* | [**getProfileProtocolConfig**](docs/ProfilesForestVPNCloudSDKAPI.md#getprofileprotocolconfig) | **GET** /profiles/{profileId}/protocols/{protocolId}.conf | Profile protocol config
*ProfilesForestVPNCloudSDKAPI* | [**getProfileProtocols**](docs/ProfilesForestVPNCloudSDKAPI.md#getprofileprotocols) | **GET** /profiles/{profileId}/protocols/ | Profile supported protocols


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.forestvpn.cloud.sdk.client.models.AccessToken](docs/AccessToken.md)
 - [com.forestvpn.cloud.sdk.client.models.AccessTokenRequest](docs/AccessTokenRequest.md)
 - [com.forestvpn.cloud.sdk.client.models.Error](docs/Error.md)
 - [com.forestvpn.cloud.sdk.client.models.Profile](docs/Profile.md)
 - [com.forestvpn.cloud.sdk.client.models.Protocol](docs/Protocol.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="BearerTokenAuth"></a>
### BearerTokenAuth

- **Type**: HTTP basic authentication

## Credits

- ForestVPN.com [Free VPN](https://forestvpn.com) for all
- SpaceV.net [VPN for teams](https://spacev.net)
