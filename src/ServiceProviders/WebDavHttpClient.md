# WebDavHttpClient
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* modifyRequestToAcceptGzipResponse(HttpRequest request)
	* [WebDavHttpClient](../ServiceProviders/WebDavHttpClient.md) has a role type of Service Provider
* getUngzippedContent(HttpEntity entity)
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavHttpClient](../ServiceProviders/WebDavHttpClient.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
* executeOverride(HttpUriRequest request, HttpContext context)
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavHttpClient](../ServiceProviders/WebDavHttpClient.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
