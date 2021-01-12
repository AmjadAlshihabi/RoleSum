# WebDavFolder
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getStore()
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
* buildFolderUrl()
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
* setUrl(String url)
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
* open(int mode)
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
* copyMessages(List<? extends Message> messages, Folder folder)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* moveMessages(List<? extends Message> messages, Folder folder)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* delete(boolean recursive)
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
* moveOrCopyMessages(List<? extends Message> messages, String folderName, boolean isMove)
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
* getMessageCount()
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [DataSet](../Structurers/DataSet.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getMessageCount()
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [DataSet](../Structurers/DataSet.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getUnreadMessageCount()
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
	* [LockScreenNotification](../Coordinators/LockScreenNotification.md) has a role type of Coordinator
	* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* getFlaggedMessageCount()
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* isOpen()
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
* getMode()
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getName()
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
	* [ImapPusher](../ServiceProviders/ImapPusher.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
	* [MessageHeaderParserContentHandler](../Structurers/MessageHeaderParserContentHandler.md) has a role type of Structurer
	* [BinaryTempFileBodyInputStream](../ServiceProviders/BinaryTempFileBodyInputStream.md) has a role type of Service Provider
	* [Field](../InformationHolders/Field.md) has a role type of Information Holder
	* [MimeHeader](../Structurers/MimeHeader.md) has a role type of Structurer
	* [MimeMessageBuilder](../Structurers/MimeMessageBuilder.md) has a role type of Structurer
	* [Identity](../InformationHolders/Identity.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [LinuxPRNGSecureRandomProvider](../ServiceProviders/LinuxPRNGSecureRandomProvider.md) has a role type of Service Provider
	* [RigidWebView](../InformationHolders/RigidWebView.md) has a role type of Information Holder
	* [ContactBadge](../Interfacers/ContactBadge.md) has a role type of Interfacer
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [SleepService](../ServiceProviders/SleepService.md) has a role type of Service Provider
	* [LocalSearch](../Structurers/LocalSearch.md) has a role type of Structurer
	* [SearchSpecification](../InformationHolders/SearchSpecification.md) has a role type of Information Holder
	* [DeleteUriExtractor](../Coordinators/DeleteUriExtractor.md) has a role type of Coordinator
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [SyncNotifications](../Coordinators/SyncNotifications.md) has a role type of Coordinator
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [PartBuilder](../Structurers/PartBuilder.md) has a role type of Structurer
	* [ExternalStorageProvider](../InformationHolders/ExternalStorageProvider.md) has a role type of Information Holder
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [HtcIncredibleStorageProvider](../InformationHolders/HtcIncredibleStorageProvider.md) has a role type of Information Holder
	* [InternalStorageProvider](../InformationHolders/InternalStorageProvider.md) has a role type of Information Holder
	* [SamsungGalaxySStorageProvider](../InformationHolders/SamsungGalaxySStorageProvider.md) has a role type of Information Holder
	* [StorageProvider](../InformationHolders/StorageProvider.md) has a role type of Information Holder
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [FileHelper](../ServiceProviders/FileHelper.md) has a role type of Service Provider
	* [MergeCursorWithUniqueId](../InformationHolders/MergeCursorWithUniqueId.md) has a role type of Information Holder
	* [OpenPgpApiHelper](../ServiceProviders/OpenPgpApiHelper.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [TemporaryAttachmentStore](../ServiceProviders/TemporaryAttachmentStore.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [ChooseIdentity](../Interfacers/ChooseIdentity.md) has a role type of Interfacer
	* [EditIdentity](../Interfacers/EditIdentity.md) has a role type of Interfacer
	* [FolderInfoHolder](../InformationHolders/FolderInfoHolder.md) has a role type of Information Holder
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) has a role type of Interfacer
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
	* [IdentityAdapter](../Structurers/IdentityAdapter.md) has a role type of Structurer
* exists()
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalKeyStore](../InformationHolders/LocalKeyStore.md) has a role type of Information Holder
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [FileHelper](../ServiceProviders/FileHelper.md) has a role type of Service Provider
	* [TemporaryAttachmentStore](../ServiceProviders/TemporaryAttachmentStore.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
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
* create(FolderType type)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [HttpGeneric](../InformationHolders/HttpGeneric.md) has a role type of Information Holder
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavHttpClientFactory](../ServiceProviders/WebDavHttpClientFactory.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [WebDavStoreUriCreator](../ServiceProviders/WebDavStoreUriCreator.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ImapStoreUriCreator](../ServiceProviders/ImapStoreUriCreator.md) has a role type of Service Provider
	* [CryptoInfoDialog](../Interfacers/CryptoInfoDialog.md) has a role type of Interfacer
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [ConfirmationDialogFragment](../Coordinators/ConfirmationDialogFragment.md) has a role type of Coordinator
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
	* [PendingAppend](../Coordinators/PendingAppend.md) has a role type of Coordinator
	* [PendingEmptyTrash](../Coordinators/PendingEmptyTrash.md) has a role type of Coordinator
	* [PendingExpunge](../Coordinators/PendingExpunge.md) has a role type of Coordinator
	* [PendingMarkAllAsRead](../Coordinators/PendingMarkAllAsRead.md) has a role type of Coordinator
	* [PendingMoveOrCopy](../Coordinators/PendingMoveOrCopy.md) has a role type of Coordinator
	* [PendingSetFlag](../Coordinators/PendingSetFlag.md) has a role type of Coordinator
	* [AutocryptOperations](../ServiceProviders/AutocryptOperations.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) has a role type of Interfacer
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ConfirmationDialog](../Interfacers/ConfirmationDialog.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [OpenPgpAppSelectFragment](../Structurers/OpenPgpAppSelectFragment.md) has a role type of Structurer
	* [PgpEnabledErrorDialog](../Coordinators/PgpEnabledErrorDialog.md) has a role type of Coordinator
	* [PgpEncryptDescriptionDialog](../Coordinators/PgpEncryptDescriptionDialog.md) has a role type of Coordinator
	* [PgpInlineDialog](../Interfacers/PgpInlineDialog.md) has a role type of Interfacer
	* [PgpSignOnlyDialog](../Interfacers/PgpSignOnlyDialog.md) has a role type of Interfacer
* delete(boolean recursive)
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
* getMessage(String uid)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
	* [LocalKeyStore](../InformationHolders/LocalKeyStore.md) has a role type of Information Holder
	* [SecureX509TrustManager](../ServiceProviders/SecureX509TrustManager.md) has a role type of Service Provider
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [RemoteControlService](../Controllers/RemoteControlService.md) has a role type of Controller
	* [UnreadQueryHandler](../ServiceProviders/UnreadQueryHandler.md) has a role type of Service Provider
	* [AutocryptStatusInteractor](../ServiceProviders/AutocryptStatusInteractor.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [LocalBodyPart](../InformationHolders/LocalBodyPart.md) has a role type of Information Holder
	* [LocalMimeMessage](../InformationHolders/LocalMimeMessage.md) has a role type of Information Holder
	* [LocalPart](../Structurers/LocalPart.md) has a role type of Structurer
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo34](../ServiceProviders/MigrationTo34.md) has a role type of Service Provider
	* [MigrationTo41](../ServiceProviders/MigrationTo41.md) has a role type of Service Provider
	* [MigrationTo44](../ServiceProviders/MigrationTo44.md) has a role type of Service Provider
	* [MigrationTo45](../ServiceProviders/MigrationTo45.md) has a role type of Service Provider
	* [MigrationTo50](../ServiceProviders/MigrationTo50.md) has a role type of Service Provider
	* [MigrationTo55](../ServiceProviders/MigrationTo55.md) has a role type of Service Provider
	* [ExceptionHelper](../ServiceProviders/ExceptionHelper.md) has a role type of Service Provider
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [AccountSetupAccountType](../Interfacers/AccountSetupAccountType.md) has a role type of Interfacer
	* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
* getMessages(int start, int end, Date earliestDate, MessageRetrievalListener<WebDavMessage> listener)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* areMoreMessagesAvailable(int indexOfOldestMessage, Date earliestDate)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getMessageUrls(String[] uids)
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
* fetch(List<WebDavMessage> messages, FetchProfile fp, MessageRetrievalListener<WebDavMessage> listener)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo55](../ServiceProviders/MigrationTo55.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* fetchMessages(List<WebDavMessage> messages, MessageRetrievalListener<WebDavMessage> listener, int lines)
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
* fetchFlags(List<WebDavMessage> startMessages, MessageRetrievalListener<WebDavMessage> listener)
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
* fetchEnvelope(List<WebDavMessage> startMessages, MessageRetrievalListener<WebDavMessage> listener)
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
* setFlags(final Set<Flag> flags, boolean value)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Message](../ServiceProviders/Pop3Message.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapMessage](../Structurers/ImapMessage.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
* markServerMessagesRead(String[] uids, boolean read)
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
* deleteServerMessages(String[] uids)
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
* generateDeleteUrl(String startUrl)
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
* appendMessages(List<? extends Message> messages)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* appendWebDavMessages(List<? extends Message> messages)
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
* equals(Object o)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [ServerSettings](../InformationHolders/ServerSettings.md) has a role type of Information Holder
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [DataSet](../Structurers/DataSet.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavHandler](../Structurers/WebDavHandler.md) has a role type of Structurer
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [WebDavStoreUriDecoder](../ServiceProviders/WebDavStoreUriDecoder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapList](../Structurers/ImapList.md) has a role type of Structurer
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ImapStoreUriCreator](../ServiceProviders/ImapStoreUriCreator.md) has a role type of Service Provider
	* [ImapStoreUriDecoder](../ServiceProviders/ImapStoreUriDecoder.md) has a role type of Service Provider
	* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
	* [LocalKeyStore](../InformationHolders/LocalKeyStore.md) has a role type of Information Holder
	* [XOAuth2ChallengeParser](../Coordinators/XOAuth2ChallengeParser.md) has a role type of Coordinator
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
	* [DecoderUtil](../ServiceProviders/DecoderUtil.md) has a role type of Service Provider
	* [MimeBodyPart](../Structurers/MimeBodyPart.md) has a role type of Structurer
	* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
	* [MessageListWidgetProvider](../Controllers/MessageListWidgetProvider.md) has a role type of Controller
	* [ClientCertificateSpinner](../Interfacers/ClientCertificateSpinner.md) has a role type of Interfacer
	* [ColorChip](../Coordinators/ColorChip.md) has a role type of Coordinator
	* [K9WebViewClient](../Interfacers/K9WebViewClient.md) has a role type of Interfacer
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [Recipient](../InformationHolders/Recipient.md) has a role type of Information Holder
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [IntentAndResolvedActivitiesCount](../InformationHolders/IntentAndResolvedActivitiesCount.md) has a role type of Information Holder
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [MessageCryptoPresenter](../Controllers/MessageCryptoPresenter.md) has a role type of Controller
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [BootReceiver](../ServiceProviders/BootReceiver.md) has a role type of Service Provider
	* [CoreReceiver](../ServiceProviders/CoreReceiver.md) has a role type of Service Provider
	* [PollService](../ServiceProviders/PollService.md) has a role type of Service Provider
	* [PushService](../ServiceProviders/PushService.md) has a role type of Service Provider
	* [RemoteControlReceiver](../ServiceProviders/RemoteControlReceiver.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [ShutdownReceiver](../ServiceProviders/ShutdownReceiver.md) has a role type of Service Provider
	* [RemoteControlService](../Controllers/RemoteControlService.md) has a role type of Controller
	* [StorageGoneReceiver](../ServiceProviders/StorageGoneReceiver.md) has a role type of Service Provider
	* [StorageReceiver](../ServiceProviders/StorageReceiver.md) has a role type of Service Provider
	* [LocalSearch](../Structurers/LocalSearch.md) has a role type of Structurer
	* [SearchCondition](../InformationHolders/SearchCondition.md) has a role type of Information Holder
	* [AccountReceiver](../ServiceProviders/AccountReceiver.md) has a role type of Service Provider
	* [AttachmentTempFileProviderCleanupReceiver](../ServiceProviders/AttachmentTempFileProviderCleanupReceiver.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [DecryptedFileProviderCleanupReceiver](../ServiceProviders/DecryptedFileProviderCleanupReceiver.md) has a role type of Service Provider
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [IdTrickeryCursor](../ServiceProviders/IdTrickeryCursor.md) has a role type of Service Provider
	* [SpecialColumnsCursor](../InformationHolders/SpecialColumnsCursor.md) has a role type of Information Holder
	* [AccountsQueryHandler](../ServiceProviders/AccountsQueryHandler.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [SubThemeSetting](../ServiceProviders/SubThemeSetting.md) has a role type of Service Provider
	* [ThemeSetting](../ServiceProviders/ThemeSetting.md) has a role type of Service Provider
	* [OptionalEmailAddressSetting](../ServiceProviders/OptionalEmailAddressSetting.md) has a role type of Service Provider
	* [BooleanSetting](../ServiceProviders/BooleanSetting.md) has a role type of Service Provider
	* [PseudoEnumSetting](../ServiceProviders/PseudoEnumSetting.md) has a role type of Service Provider
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [ImportedServerSettings](../InformationHolders/ImportedServerSettings.md) has a role type of Information Holder
	* [StorageEditor](../Structurers/StorageEditor.md) has a role type of Structurer
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
	* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
	* [StripSignatureFilter](../ServiceProviders/StripSignatureFilter.md) has a role type of Service Provider
	* [HtmlQuoteCreator](../ServiceProviders/HtmlQuoteCreator.md) has a role type of Service Provider
	* [HtmlToTextTagHandler](../ServiceProviders/HtmlToTextTagHandler.md) has a role type of Service Provider
	* [ListTagHandler](../ServiceProviders/ListTagHandler.md) has a role type of Service Provider
	* [DatabasePreviewType](../InformationHolders/DatabasePreviewType.md) has a role type of Information Holder
	* [MoreMessages](../InformationHolders/MoreMessages.md) has a role type of Information Holder
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [StorageListener](../Structurers/StorageListener.md) has a role type of Structurer
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [ExternalStorageProvider](../InformationHolders/ExternalStorageProvider.md) has a role type of Information Holder
	* [FixedStorageProviderBase](../InformationHolders/FixedStorageProviderBase.md) has a role type of Information Holder
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [HtcIncredibleStorageProvider](../InformationHolders/HtcIncredibleStorageProvider.md) has a role type of Information Holder
	* [SamsungGalaxySStorageProvider](../InformationHolders/SamsungGalaxySStorageProvider.md) has a role type of Information Holder
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [FlowedMessageUtils](../ServiceProviders/FlowedMessageUtils.md) has a role type of Service Provider
	* [MigrationTo41](../ServiceProviders/MigrationTo41.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [MailTo](../ServiceProviders/MailTo.md) has a role type of Service Provider
	* [MergeCursorWithUniqueId](../InformationHolders/MergeCursorWithUniqueId.md) has a role type of Information Holder
	* [UnreadWidgetProperties](../Coordinators/UnreadWidgetProperties.md) has a role type of Coordinator
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [AutocryptHeader](../ServiceProviders/AutocryptHeader.md) has a role type of Service Provider
	* [AutocryptHeaderParser](../ServiceProviders/AutocryptHeaderParser.md) has a role type of Service Provider
	* [AccountsAdapter](../Interfacers/AccountsAdapter.md) has a role type of Interfacer
	* [AccountsAdapter](../Interfacers/AccountsAdapter.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [ChooseIdentity](../Interfacers/ChooseIdentity.md) has a role type of Interfacer
	* [FolderInfoHolder](../InformationHolders/FolderInfoHolder.md) has a role type of Information Holder
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [LauncherShortcuts](../Interfacers/LauncherShortcuts.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageInfoHolder](../InformationHolders/MessageInfoHolder.md) has a role type of Information Holder
	* [StorageListenerImplementation](../ServiceProviders/StorageListenerImplementation.md) has a role type of Service Provider
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
	* [MessageReference](../InformationHolders/MessageReference.md) has a role type of Information Holder
	* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) has a role type of Interfacer
	* [UpgradeDatabaseBroadcastReceiver](../Controllers/UpgradeDatabaseBroadcastReceiver.md) has a role type of Controller
	* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) has a role type of Interfacer
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupOptions](../Interfacers/AccountSetupOptions.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [OpenPgpAppSelectFragment](../Structurers/OpenPgpAppSelectFragment.md) has a role type of Structurer
	* [OpenPgpAppSelectDialog](../Interfacers/OpenPgpAppSelectDialog.md) has a role type of Interfacer
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
	* [SpinnerOption](../InformationHolders/SpinnerOption.md) has a role type of Information Holder
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* getUidFromMessageId(Message message)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* setFlags(final Set<Flag> flags, boolean value)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Message](../ServiceProviders/Pop3Message.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapMessage](../Structurers/ImapMessage.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
* getUrl()
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [LollipopWebViewClient](../Interfacers/LollipopWebViewClient.md) has a role type of Interfacer
