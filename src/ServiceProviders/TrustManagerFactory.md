# TrustManagerFactory
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* get(String host, int port)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [Multipart](../Structurers/Multipart.md) has a role type of Structurer
	* [RemoteStore](../Structurers/RemoteStore.md) has a role type of Structurer
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [DataSet](../Structurers/DataSet.md) has a role type of Structurer
	* [ParsedMessageEnvelope](../Structurers/ParsedMessageEnvelope.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [WebDavSocketFactory](../ServiceProviders/WebDavSocketFactory.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [WebDavStoreUriCreator](../ServiceProviders/WebDavStoreUriCreator.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [AlertResponse](../ServiceProviders/AlertResponse.md) has a role type of Service Provider
	* [CapabilityResponse](../ServiceProviders/CapabilityResponse.md) has a role type of Service Provider
	* [FetchBodyCallback](../ServiceProviders/FetchBodyCallback.md) has a role type of Service Provider
	* [FetchPartCallback](../Coordinators/FetchPartCallback.md) has a role type of Coordinator
	* [FolderNameCodec](../ServiceProviders/FolderNameCodec.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
	* [ImapList](../Structurers/ImapList.md) has a role type of Structurer
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ImapStoreUriCreator](../ServiceProviders/ImapStoreUriCreator.md) has a role type of Service Provider
	* [ImapUtility](../ServiceProviders/ImapUtility.md) has a role type of Service Provider
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
	* [NamespaceResponse](../ServiceProviders/NamespaceResponse.md) has a role type of Service Provider
	* [NegativeImapResponseException](../InformationHolders/NegativeImapResponseException.md) has a role type of Information Holder
	* [PermanentFlagsResponse](../ServiceProviders/PermanentFlagsResponse.md) has a role type of Service Provider
	* [SearchResponse](../Structurers/SearchResponse.md) has a role type of Structurer
	* [SelectOrExamineResponse](../ServiceProviders/SelectOrExamineResponse.md) has a role type of Service Provider
	* [UidCopyResponse](../ServiceProviders/UidCopyResponse.md) has a role type of Service Provider
	* [DefaultTrustedSocketFactory](../Structurers/DefaultTrustedSocketFactory.md) has a role type of Structurer
	* [SecureX509TrustManager](../ServiceProviders/SecureX509TrustManager.md) has a role type of Service Provider
	* [TrustManagerFactory](../ServiceProviders/TrustManagerFactory.md) has a role type of Service Provider
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
	* [Preferences](../Structurers/Preferences.md) has a role type of Structurer
	* [MailItem](../InformationHolders/MailItem.md) has a role type of Information Holder
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [MessageCryptoAnnotations](../Structurers/MessageCryptoAnnotations.md) has a role type of Structurer
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [RemoteControlReceiver](../ServiceProviders/RemoteControlReceiver.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [SpecialColumnsCursor](../InformationHolders/SpecialColumnsCursor.md) has a role type of Information Holder
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MonitoredCursor](../ServiceProviders/MonitoredCursor.md) has a role type of Service Provider
	* [ThrottlingQueryHandler](../ServiceProviders/ThrottlingQueryHandler.md) has a role type of Service Provider
	* [UnreadQueryHandler](../ServiceProviders/UnreadQueryHandler.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [SettingsUpgraderV12](../ServiceProviders/SettingsUpgraderV12.md) has a role type of Service Provider
	* [SettingsUpgraderV24](../ServiceProviders/SettingsUpgraderV24.md) has a role type of Service Provider
	* [SettingsUpgraderV31](../ServiceProviders/SettingsUpgraderV31.md) has a role type of Service Provider
	* [PseudoEnumSetting](../ServiceProviders/PseudoEnumSetting.md) has a role type of Service Provider
	* [Settings](../ServiceProviders/Settings.md) has a role type of Service Provider
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [StorageEditor](../Structurers/StorageEditor.md) has a role type of Structurer
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [NewMailNotifications](../Coordinators/NewMailNotifications.md) has a role type of Coordinator
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
	* [IdentityHeaderParser](../ServiceProviders/IdentityHeaderParser.md) has a role type of Service Provider
	* [UriLinkifier](../ServiceProviders/UriLinkifier.md) has a role type of Service Provider
	* [AttachmentResolver](../ServiceProviders/AttachmentResolver.md) has a role type of Service Provider
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MailTo](../ServiceProviders/MailTo.md) has a role type of Service Provider
	* [MessageListHandler](../Interfacers/MessageListHandler.md) has a role type of Interfacer
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
	* [MessageCryptoStructureDetector](../ServiceProviders/MessageCryptoStructureDetector.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [PendingCommandSerializer](../Coordinators/PendingCommandSerializer.md) has a role type of Coordinator
	* [EmailProviderCache](../Structurers/EmailProviderCache.md) has a role type of Structurer
	* [AutocryptHeaderParser](../ServiceProviders/AutocryptHeaderParser.md) has a role type of Service Provider
	* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
	* [AccountsAdapter](../Interfacers/AccountsAdapter.md) has a role type of Interfacer
	* [ImportSelectionDialog](../Interfacers/ImportSelectionDialog.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [AlternateRecipientAdapter](../Interfacers/AlternateRecipientAdapter.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [AuthTypeAdapter](../Structurers/AuthTypeAdapter.md) has a role type of Structurer
	* [ConnectionSecurityAdapter](../Interfacers/ConnectionSecurityAdapter.md) has a role type of Interfacer
	* [OpenPgpAppSelectFragment](../Structurers/OpenPgpAppSelectFragment.md) has a role type of Structurer
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
	* [FallbackGlideBitmapDecoder](../ServiceProviders/FallbackGlideBitmapDecoder.md) has a role type of Service Provider
	* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) has a role type of Coordinator
	* [IdentityAdapter](../Structurers/IdentityAdapter.md) has a role type of Structurer
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
