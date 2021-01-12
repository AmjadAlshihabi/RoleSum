# EncryptionDetector
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* isEncrypted(@NonNull Message message)
	* [AttachmentCounter](../ServiceProviders/AttachmentCounter.md) has a role type of Service Provider
	* [EncryptionDetector](../ServiceProviders/EncryptionDetector.md) has a role type of Service Provider
	* [MessageFulltextCreator](../ServiceProviders/MessageFulltextCreator.md) has a role type of Service Provider
	* [MessagePreviewCreator](../ServiceProviders/MessagePreviewCreator.md) has a role type of Service Provider
* isPgpMimeOrSMimeEncrypted(Message message)
	* [EncryptionDetector](../ServiceProviders/EncryptionDetector.md) has a role type of Service Provider
* containsPartWithMimeType(Part part, String... wantedMimeTypes)
	* [EncryptionDetector](../ServiceProviders/EncryptionDetector.md) has a role type of Service Provider
* isMimeTypeAnyOf(String mimeType, String... wantedMimeTypes)
	* [EncryptionDetector](../ServiceProviders/EncryptionDetector.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* containsInlinePgpEncryptedText(Message message)
	* [EncryptionDetector](../ServiceProviders/EncryptionDetector.md) has a role type of Service Provider
