# WebDavTransport
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* open()
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [Transport](../ServiceProviders/Transport.md) has a role type of Service Provider
	* [WebDavTransport](../ServiceProviders/WebDavTransport.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
	* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
* close()
	* [DefaultBodyFactory](../ServiceProviders/DefaultBodyFactory.md) has a role type of Service Provider
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [Transport](../ServiceProviders/Transport.md) has a role type of Service Provider
	* [WebDavTransport](../ServiceProviders/WebDavTransport.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [IdleStopper](../ServiceProviders/IdleStopper.md) has a role type of Service Provider
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [BinaryTempFileBodyInputStream](../ServiceProviders/BinaryTempFileBodyInputStream.md) has a role type of Service Provider
	* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
	* [SignSafeOutputStream](../ServiceProviders/SignSafeOutputStream.md) has a role type of Service Provider
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [ColorChip](../Coordinators/ColorChip.md) has a role type of Coordinator
	* [QueryHandler](../ServiceProviders/QueryHandler.md) has a role type of Service Provider
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [MonitoredCursor](../ServiceProviders/MonitoredCursor.md) has a role type of Service Provider
	* [ThrottlingQueryHandler](../ServiceProviders/ThrottlingQueryHandler.md) has a role type of Service Provider
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [BinaryAttachmentBody](../ServiceProviders/BinaryAttachmentBody.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [FileBackedBody](../InformationHolders/FileBackedBody.md) has a role type of Information Holder
	* [StorageListener](../Structurers/StorageListener.md) has a role type of Structurer
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo46](../ServiceProviders/MigrationTo46.md) has a role type of Service Provider
	* [MigrationTo47](../ServiceProviders/MigrationTo47.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [FileHelper](../ServiceProviders/FileHelper.md) has a role type of Service Provider
	* [MergeCursor](../ServiceProviders/MergeCursor.md) has a role type of Service Provider
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) has a role type of Service Provider
	* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderInfoHolder](../InformationHolders/FolderInfoHolder.md) has a role type of Information Holder
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* sendMessage(Message message)
	* [Transport](../ServiceProviders/Transport.md) has a role type of Service Provider
	* [WebDavTransport](../ServiceProviders/WebDavTransport.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [MessageListHandler](../Interfacers/MessageListHandler.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ChooseFolderHandler](../ServiceProviders/ChooseFolderHandler.md) has a role type of Service Provider
	* [SendMessageTask](../ServiceProviders/SendMessageTask.md) has a role type of Service Provider
	* [SaveMessageTask](../ServiceProviders/SaveMessageTask.md) has a role type of Service Provider
