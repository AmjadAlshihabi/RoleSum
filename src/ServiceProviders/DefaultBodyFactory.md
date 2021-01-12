# DefaultBodyFactory
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* createBody(String contentTransferEncoding, String contentType, InputStream inputStream)
	* [BodyFactory](../ServiceProviders/BodyFactory.md) has a role type of Service Provider
	* [DefaultBodyFactory](../ServiceProviders/DefaultBodyFactory.md) has a role type of Service Provider
	* [FetchPartCallback](../Coordinators/FetchPartCallback.md) has a role type of Coordinator
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [MimeMessageBuilder](../Structurers/MimeMessageBuilder.md) has a role type of Structurer
	* [PartBuilder](../Structurers/PartBuilder.md) has a role type of Structurer
	* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) has a role type of Service Provider
* copyData(InputStream inputStream, OutputStream outputStream)
	* [DefaultBodyFactory](../ServiceProviders/DefaultBodyFactory.md) has a role type of Service Provider
	* [ProgressBodyFactory](../Coordinators/ProgressBodyFactory.md) has a role type of Coordinator
