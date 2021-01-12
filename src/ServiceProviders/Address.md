# Address
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getAddress()
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [JisSupport](../ServiceProviders/JisSupport.md) has a role type of Service Provider
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [Recipient](../InformationHolders/Recipient.md) has a role type of Information Holder
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MessageHelper](../ServiceProviders/MessageHelper.md) has a role type of Service Provider
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
	* [AutocryptOperations](../ServiceProviders/AutocryptOperations.md) has a role type of Service Provider
	* [AlternateRecipientAdapter](../Interfacers/AlternateRecipientAdapter.md) has a role type of Interfacer
	* [FallbackGlideParams](../InformationHolders/FallbackGlideParams.md) has a role type of Information Holder
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
	* [ComposeCryptoStatusBuilder](../ServiceProviders/ComposeCryptoStatusBuilder.md) has a role type of Service Provider
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* getHostname()
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [MessageIdGenerator](../Coordinators/MessageIdGenerator.md) has a role type of Coordinator
* setAddress(String address)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
* getPersonal()
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [Recipient](../InformationHolders/Recipient.md) has a role type of Information Holder
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MessageHelper](../ServiceProviders/MessageHelper.md) has a role type of Service Provider
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [FallbackGlideParams](../InformationHolders/FallbackGlideParams.md) has a role type of Information Holder
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
* setPersonal(String newPersonal)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
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
* hashCode()
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [SearchCondition](../InformationHolders/SearchCondition.md) has a role type of Information Holder
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [AutocryptHeader](../ServiceProviders/AutocryptHeader.md) has a role type of Service Provider
	* [FolderInfoHolder](../InformationHolders/FolderInfoHolder.md) has a role type of Information Holder
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [MessageInfoHolder](../InformationHolders/MessageInfoHolder.md) has a role type of Information Holder
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
	* [MessageReference](../InformationHolders/MessageReference.md) has a role type of Information Holder
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
* toEncodedString(Address[] addresses)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* toEncodedString(Address[] addresses)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* unpack(String addressList)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
* pack(Address[] addresses)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
* quoteString(String s)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* parseUnencoded(String addressList)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* parse(String addressList)
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
* quoteAtoms(final String text)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
