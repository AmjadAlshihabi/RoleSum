# TextPartFinder
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* findFirstTextPart(@NonNull Part part)
	* [EncryptionDetector](../ServiceProviders/EncryptionDetector.md) has a role type of Service Provider
	* [MessageFulltextCreator](../ServiceProviders/MessageFulltextCreator.md) has a role type of Service Provider
	* [MessagePreviewCreator](../ServiceProviders/MessagePreviewCreator.md) has a role type of Service Provider
	* [TextPartFinder](../ServiceProviders/TextPartFinder.md) has a role type of Service Provider
* findTextPartInMultipartAlternative(Multipart multipart)
	* [TextPartFinder](../ServiceProviders/TextPartFinder.md) has a role type of Service Provider
* findTextPartInMultipart(Multipart multipart)
	* [TextPartFinder](../ServiceProviders/TextPartFinder.md) has a role type of Service Provider
