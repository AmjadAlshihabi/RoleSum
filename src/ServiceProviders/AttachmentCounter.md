# AttachmentCounter
## This Service Provider is responsible for:
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
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
* getAttachmentCount(Message message)
	* [AttachmentCounter](../ServiceProviders/AttachmentCounter.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
