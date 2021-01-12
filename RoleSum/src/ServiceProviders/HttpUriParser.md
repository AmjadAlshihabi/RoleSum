# HttpUriParser
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* linkifyUri(String text, int startPos, StringBuffer outputBuffer)
	* [BitcoinUriParser](../ServiceProviders/BitcoinUriParser.md) has a role type of Service Provider
	* [EthereumUriParser](../ServiceProviders/EthereumUriParser.md) has a role type of Service Provider
	* [HttpUriParser](../ServiceProviders/HttpUriParser.md) has a role type of Service Provider
	* [UriLinkifier](../ServiceProviders/UriLinkifier.md) has a role type of Service Provider
	* [UriParser](../ServiceProviders/UriParser.md) has a role type of Service Provider
* tryMatchAuthority(String text, int startPos)
	* [HttpUriParser](../ServiceProviders/HttpUriParser.md) has a role type of Service Provider
* tryMatchUserInfo(String text, int startPos, int limit)
	* [HttpUriParser](../ServiceProviders/HttpUriParser.md) has a role type of Service Provider
* tryMatchIpv6Address(String text, int startPos)
	* [HttpUriParser](../ServiceProviders/HttpUriParser.md) has a role type of Service Provider
* parse16BitHexSegment(String text, int startPos, int endPos)
	* [HttpUriParser](../ServiceProviders/HttpUriParser.md) has a role type of Service Provider
* isHexDigit(int c)
	* [HttpUriParser](../ServiceProviders/HttpUriParser.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* tryMatchDomainName(String text, int startPos)
	* [HttpUriParser](../ServiceProviders/HttpUriParser.md) has a role type of Service Provider
* tryMatchIpv4Address(String text, int startPos, boolean portAllowed)
	* [HttpUriParser](../ServiceProviders/HttpUriParser.md) has a role type of Service Provider
* matchUnreservedPCTEncodedSubDelimClassesGreedy(String text, int startPos, String additionalCharacters)
	* [HttpUriParser](../ServiceProviders/HttpUriParser.md) has a role type of Service Provider
