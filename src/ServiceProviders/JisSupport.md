# JisSupport
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getJisVariantFromMessage(Message message)
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
	* [JisSupport](../ServiceProviders/JisSupport.md) has a role type of Service Provider
* isShiftJis(String charset)
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
	* [JisSupport](../ServiceProviders/JisSupport.md) has a role type of Service Provider
* getJisVariantFromAddress(String address)
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
	* [JisSupport](../ServiceProviders/JisSupport.md) has a role type of Service Provider
* getJisVariantFromMailerHeaders(Message message)
	* [JisSupport](../ServiceProviders/JisSupport.md) has a role type of Service Provider
* getJisVariantFromReceivedHeaders(Part message)
	* [JisSupport](../ServiceProviders/JisSupport.md) has a role type of Service Provider
* getAddressFromReceivedHeader(String receivedHeader)
	* [JisSupport](../ServiceProviders/JisSupport.md) has a role type of Service Provider
* getJisVariantFromFromHeaders(Message message)
	* [JisSupport](../ServiceProviders/JisSupport.md) has a role type of Service Provider
* isInDomain(String address, String domain)
	* [JisSupport](../ServiceProviders/JisSupport.md) has a role type of Service Provider
