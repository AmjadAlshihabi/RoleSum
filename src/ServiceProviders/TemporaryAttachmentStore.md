# TemporaryAttachmentStore
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getFile(Context context, String attachmentName)
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [DeferredFileOutputStream](../InformationHolders/DeferredFileOutputStream.md) has a role type of Information Holder
	* [TemporaryAttachmentStore](../ServiceProviders/TemporaryAttachmentStore.md) has a role type of Service Provider
* getFileForWriting(Context context, String attachmentName)
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [TemporaryAttachmentStore](../ServiceProviders/TemporaryAttachmentStore.md) has a role type of Service Provider
* createOrCleanAttachmentDirectory(Context context)
	* [TemporaryAttachmentStore](../ServiceProviders/TemporaryAttachmentStore.md) has a role type of Service Provider
* getTemporaryAttachmentDirectory(Context context)
	* [TemporaryAttachmentStore](../ServiceProviders/TemporaryAttachmentStore.md) has a role type of Service Provider
* cleanOldFiles(File directory)
	* [TemporaryAttachmentStore](../ServiceProviders/TemporaryAttachmentStore.md) has a role type of Service Provider
