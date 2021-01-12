# FolderNameCodec
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* newInstance()
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [FolderNameCodec](../ServiceProviders/FolderNameCodec.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [MimeMultipart](../InformationHolders/MimeMultipart.md) has a role type of Information Holder
	* [K9WebViewClient](../Interfacers/K9WebViewClient.md) has a role type of Interfacer
	* [MessageWebView](../Coordinators/MessageWebView.md) has a role type of Coordinator
	* [CryptoInfoDialog](../Interfacers/CryptoInfoDialog.md) has a role type of Interfacer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [RealDeviceIdleManager](../ServiceProviders/RealDeviceIdleManager.md) has a role type of Service Provider
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [DeviceIdleManager](../ServiceProviders/DeviceIdleManager.md) has a role type of Service Provider
	* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
	* [LockScreenNotification](../Coordinators/LockScreenNotification.md) has a role type of Coordinator
	* [NewMailNotifications](../Coordinators/NewMailNotifications.md) has a role type of Coordinator
	* [NotificationController](../Controllers/NotificationController.md) has a role type of Controller
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) has a role type of Service Provider
	* [HtmlProcessor](../ServiceProviders/HtmlProcessor.md) has a role type of Service Provider
	* [AttachmentCounter](../ServiceProviders/AttachmentCounter.md) has a role type of Service Provider
	* [MessageFulltextCreator](../ServiceProviders/MessageFulltextCreator.md) has a role type of Service Provider
	* [MessagePreviewCreator](../ServiceProviders/MessagePreviewCreator.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
	* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) has a role type of Interfacer
	* [ConfirmationDialogFragment](../Coordinators/ConfirmationDialogFragment.md) has a role type of Coordinator
	* [ProgressDialogFragment](../Interfacers/ProgressDialogFragment.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [K9Activity](../Interfacers/K9Activity.md) has a role type of Interfacer
	* [K9ActivityCommon](../Coordinators/K9ActivityCommon.md) has a role type of Coordinator
	* [K9ListActivity](../Interfacers/K9ListActivity.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [PgpEnabledErrorDialog](../Coordinators/PgpEnabledErrorDialog.md) has a role type of Coordinator
	* [PgpEncryptDescriptionDialog](../Coordinators/PgpEncryptDescriptionDialog.md) has a role type of Coordinator
	* [PgpInlineDialog](../Interfacers/PgpInlineDialog.md) has a role type of Interfacer
	* [PgpSignOnlyDialog](../Interfacers/PgpSignOnlyDialog.md) has a role type of Interfacer
	* [RecipientMvpView](../Interfacers/RecipientMvpView.md) has a role type of Interfacer
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* encode(String folderName)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [FolderNameCodec](../ServiceProviders/FolderNameCodec.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
	* [SignSafeOutputStream](../ServiceProviders/SignSafeOutputStream.md) has a role type of Service Provider
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [ContactBadge](../Interfacers/ContactBadge.md) has a role type of Interfacer
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [MessageReference](../InformationHolders/MessageReference.md) has a role type of Information Holder
* encode(String folderName)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [FolderNameCodec](../ServiceProviders/FolderNameCodec.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
	* [SignSafeOutputStream](../ServiceProviders/SignSafeOutputStream.md) has a role type of Service Provider
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [ContactBadge](../Interfacers/ContactBadge.md) has a role type of Interfacer
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [MessageReference](../InformationHolders/MessageReference.md) has a role type of Information Holder
* decode(String encodedFolderName)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [WebDavStoreUriDecoder](../ServiceProviders/WebDavStoreUriDecoder.md) has a role type of Service Provider
	* [FolderNameCodec](../ServiceProviders/FolderNameCodec.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ImapStoreUriDecoder](../ServiceProviders/ImapStoreUriDecoder.md) has a role type of Service Provider
	* [XOAuth2ChallengeParser](../Coordinators/XOAuth2ChallengeParser.md) has a role type of Coordinator
	* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [IdentityHeaderParser](../ServiceProviders/IdentityHeaderParser.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MailTo](../ServiceProviders/MailTo.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [MessageReference](../InformationHolders/MessageReference.md) has a role type of Information Holder
	* [FallbackGlideBitmapDecoder](../ServiceProviders/FallbackGlideBitmapDecoder.md) has a role type of Service Provider
* decode(String encodedFolderName)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [WebDavStoreUriDecoder](../ServiceProviders/WebDavStoreUriDecoder.md) has a role type of Service Provider
	* [FolderNameCodec](../ServiceProviders/FolderNameCodec.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ImapStoreUriDecoder](../ServiceProviders/ImapStoreUriDecoder.md) has a role type of Service Provider
	* [XOAuth2ChallengeParser](../Coordinators/XOAuth2ChallengeParser.md) has a role type of Coordinator
	* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [IdentityHeaderParser](../ServiceProviders/IdentityHeaderParser.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MailTo](../ServiceProviders/MailTo.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [MessageReference](../InformationHolders/MessageReference.md) has a role type of Information Holder
	* [FallbackGlideBitmapDecoder](../ServiceProviders/FallbackGlideBitmapDecoder.md) has a role type of Service Provider
