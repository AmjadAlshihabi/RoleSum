# ListResponse
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* parseList(List<ImapResponse> responses)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
* parseLsub(List<ImapResponse> responses)
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
* parse(List<ImapResponse> responses, String commandResponse)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [StatusCodeClass](../InformationHolders/StatusCodeClass.md) has a role type of Information Holder
	* [StatusCodeSubject](../InformationHolders/StatusCodeSubject.md) has a role type of Information Holder
	* [StatusCodeDetail](../InformationHolders/StatusCodeDetail.md) has a role type of Information Holder
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [DataSet](../Structurers/DataSet.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [CapabilityResponse](../ServiceProviders/CapabilityResponse.md) has a role type of Service Provider
	* [FetchBodyCallback](../ServiceProviders/FetchBodyCallback.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapList](../Structurers/ImapList.md) has a role type of Structurer
	* [ImapPushState](../ServiceProviders/ImapPushState.md) has a role type of Service Provider
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
	* [NamespaceResponse](../ServiceProviders/NamespaceResponse.md) has a role type of Service Provider
	* [PermanentFlagsResponse](../ServiceProviders/PermanentFlagsResponse.md) has a role type of Service Provider
	* [SearchResponse](../Structurers/SearchResponse.md) has a role type of Structurer
	* [SelectOrExamineResponse](../ServiceProviders/SelectOrExamineResponse.md) has a role type of Service Provider
	* [UidCopyResponse](../ServiceProviders/UidCopyResponse.md) has a role type of Service Provider
	* [MessageHeaderParser](../ServiceProviders/MessageHeaderParser.md) has a role type of Service Provider
	* [ListHeaders](../ServiceProviders/ListHeaders.md) has a role type of Service Provider
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [MessageListWidgetProvider](../Controllers/MessageListWidgetProvider.md) has a role type of Controller
	* [PreLollipopWebViewClient](../Interfacers/PreLollipopWebViewClient.md) has a role type of Interfacer
	* [K9WebViewClient](../Interfacers/K9WebViewClient.md) has a role type of Interfacer
	* [Recipient](../InformationHolders/Recipient.md) has a role type of Information Holder
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [BootReceiver](../ServiceProviders/BootReceiver.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
	* [NotificationController](../Controllers/NotificationController.md) has a role type of Controller
	* [IdentityHeaderParser](../ServiceProviders/IdentityHeaderParser.md) has a role type of Service Provider
	* [HtmlSignatureRemover](../Coordinators/HtmlSignatureRemover.md) has a role type of Coordinator
	* [HtmlSanitizer](../Coordinators/HtmlSanitizer.md) has a role type of Coordinator
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [FileBrowserHelper](../ServiceProviders/FileBrowserHelper.md) has a role type of Service Provider
	* [MailTo](../ServiceProviders/MailTo.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [MessageReference](../InformationHolders/MessageReference.md) has a role type of Information Holder
	* [MessageReferenceHelper](../ServiceProviders/MessageReferenceHelper.md) has a role type of Service Provider
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [OpenPgpAppSelectDialog](../Interfacers/OpenPgpAppSelectDialog.md) has a role type of Interfacer
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* parseSingleLine(ImapResponse response, String commandResponse)
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
	* [SearchResponse](../Structurers/SearchResponse.md) has a role type of Structurer
* parseSingleLine(ImapResponse response, String commandResponse)
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
	* [SearchResponse](../Structurers/SearchResponse.md) has a role type of Structurer
* parseSingleLine(ImapResponse response, String commandResponse)
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
	* [SearchResponse](../Structurers/SearchResponse.md) has a role type of Structurer
* extractAttributes(ImapResponse response)
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
* extractAttributes(ImapResponse response)
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
* getAttributes()
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
* hasAttribute(String attribute)
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
* getHierarchyDelimiter()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
	* [NamespaceResponse](../ServiceProviders/NamespaceResponse.md) has a role type of Service Provider
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
