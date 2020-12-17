# Pop3Message
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* setSize(int size)
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Message](../ServiceProviders/Pop3Message.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapMessage](../Structurers/ImapMessage.md) has a role type of Structurer
* setFlag(Flag flag, boolean set)
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Message](../ServiceProviders/Pop3Message.md) has a role type of Service Provider
	* [ImapMessage](../Structurers/ImapMessage.md) has a role type of Structurer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [SendMessageTask](../ServiceProviders/SendMessageTask.md) has a role type of Service Provider
* delete(String trashFolderName)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Message](../ServiceProviders/Pop3Message.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapMessage](../Structurers/ImapMessage.md) has a role type of Structurer
	* [LocalKeyStore](../InformationHolders/LocalKeyStore.md) has a role type of Information Holder
	* [BinaryTempFileBodyInputStream](../ServiceProviders/BinaryTempFileBodyInputStream.md) has a role type of Service Provider
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [Preferences](../Structurers/Preferences.md) has a role type of Structurer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
	* [InsertableHtmlContent](../InformationHolders/InsertableHtmlContent.md) has a role type of Information Holder
	* [HtmlToTextTagHandler](../ServiceProviders/HtmlToTextTagHandler.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [FileHelper](../ServiceProviders/FileHelper.md) has a role type of Service Provider
	* [ActionModeCallback](../Interfacers/ActionModeCallback.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [TemporaryAttachmentStore](../ServiceProviders/TemporaryAttachmentStore.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
