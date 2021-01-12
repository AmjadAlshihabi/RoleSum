# Authentication
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* computeCramMd5Bytes(String username, String password, byte[] b64Nonce)
	* [Authentication](../ServiceProviders/Authentication.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* computeCramMd5(String username, String password, String b64Nonce)
	* [Authentication](../ServiceProviders/Authentication.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
* computeXoauth(String username, String authToken)
	* [Authentication](../ServiceProviders/Authentication.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* computeXoauth(String username, String authToken)
	* [Authentication](../ServiceProviders/Authentication.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
