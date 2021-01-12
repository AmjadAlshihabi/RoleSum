# FetchPartCallback
### This Coordinator is responsible for delegating work between the following objects: 
* [FetchBodyCallback](../ServiceProviders/FetchBodyCallback.md) has a role type of Service Provider
* [ImapResponseCallback](../ServiceProviders/ImapResponseCallback.md) has a role type of Service Provider
* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* [ImapResponse](../InformationHolders/ImapResponse.md) has a role type of Information Holder
* [FixedLengthInputStream](../Coordinators/FixedLengthInputStream.md) has a role type of Coordinator
### the foundLiteral method receives requests from:
* [FetchBodyCallback](../ServiceProviders/FetchBodyCallback.md) 
* [FetchPartCallback](../Coordinators/FetchPartCallback.md) 
* [ImapResponseCallback](../ServiceProviders/ImapResponseCallback.md) 
* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) 
### and delegate the request to: 
* [ImapResponse](../InformationHolders/ImapResponse.md) 
* [FixedLengthInputStream](../Coordinators/FixedLengthInputStream.md) 


