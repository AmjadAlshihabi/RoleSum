# FetchBodyCallback
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* foundLiteral(ImapResponse response,
                               FixedLengthInputStream literal)
	* [FetchBodyCallback](../ServiceProviders/FetchBodyCallback.md) has a role type of Service Provider
	* [FetchPartCallback](../Coordinators/FetchPartCallback.md) has a role type of Coordinator
	* [ImapResponseCallback](../ServiceProviders/ImapResponseCallback.md) has a role type of Service Provider
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
