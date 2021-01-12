# LocalMessage
## This Information Holder is responsible for:
### providing and holding information about: 
* preview
* messageReference
* threadId
* messagePartId
* rootId
* subject
* headerNeedsUpdating
* localStore
* attachmentCount
* previewType
* mimeType
* databaseId
### Managing database tasks through the following methods:
* populateFromGetMessageCursor(Cursor cursor)
* getDatabaseId()
* setFlag(final Flag flag, final boolean set)
* delete()
* debugClearLocalData()
* clone()
### Providing information to the following objects 
* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
* [DeleteUriExtractor](../Coordinators/DeleteUriExtractor.md) has a role type of Coordinator
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) has a role type of Coordinator
* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) has a role type of Service Provider
* [NotificationController](../Controllers/NotificationController.md) has a role type of Controller
* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
* [LocalBodyPart](../InformationHolders/LocalBodyPart.md) has a role type of Information Holder
* [LocalMimeMessage](../InformationHolders/LocalMimeMessage.md) has a role type of Information Holder
* [LocalPart](../Structurers/LocalPart.md) has a role type of Structurer
* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
* [MigrationTo55](../ServiceProviders/MigrationTo55.md) has a role type of Service Provider
* [MessageHelper](../ServiceProviders/MessageHelper.md) has a role type of Service Provider
* [EmailProviderCache](../Structurers/EmailProviderCache.md) has a role type of Structurer
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [MessageInfoHolder](../InformationHolders/MessageInfoHolder.md) has a role type of Information Holder
* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
