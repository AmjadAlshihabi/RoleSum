# CharsetSupport
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* setCharset(String charset, Part part)
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [Multipart](../Structurers/Multipart.md) has a role type of Structurer
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
	* [MimeHeader](../Structurers/MimeHeader.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
* getCharsetFromAddress(String address)
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
* getExternalCharset(String charset)
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
* fixupCharset(String charset, Message message)
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
	* [DecoderUtil](../ServiceProviders/DecoderUtil.md) has a role type of Service Provider
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
* importStringFromIphone(String str)
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
* importCodePointFromIphone(int codePoint)
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* readToString(InputStream in, String charset)
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
	* [DecoderUtil](../ServiceProviders/DecoderUtil.md) has a role type of Service Provider
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
