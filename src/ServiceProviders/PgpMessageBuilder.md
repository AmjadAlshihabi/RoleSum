# PgpMessageBuilder
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* setOpenPgpApi(OpenPgpApi openPgpApi)
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* buildMessageOnActivityResult(int requestCode, @NonNull Intent userInteractionResult)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) has a role type of Service Provider
* buildOpenPgpApiIntent(boolean shouldSign, boolean shouldEncrypt, boolean isPgpInlineMode)
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* launchOpenPgpApiIntent(@NonNull Intent openPgpIntent,
            boolean captureOutputPart, boolean capturedOutputPartIs7Bit, boolean writeBodyContentOnly)
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* createOpenPgpDataSourceFromBodyPart(final MimeBodyPart bodyPart,
            final boolean writeBodyContentOnly)
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* mimeBuildMessage(
            @NonNull Intent result, @NonNull MimeBodyPart bodyPart, @Nullable BinaryTempFileBody pgpResultTempBody)
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* mimeBuildSignedMessage(@NonNull BodyPart signedBodyPart, Intent result)
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* mimeBuildEncryptedMessage(@NonNull Body encryptedBodyPart)
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* mimeBuildInlineMessage(@NonNull Body inlineBodyPart)
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* setCryptoStatus(ComposeCryptoStatus cryptoStatus)
	* [CryptoModeSelector](../InformationHolders/CryptoModeSelector.md) has a role type of Information Holder
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [Recipient](../InformationHolders/Recipient.md) has a role type of Information Holder
	* [MessageCryptoPresenter](../Controllers/MessageCryptoPresenter.md) has a role type of Controller
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
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
* buildMessageInternal()
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) has a role type of Service Provider
* buildMessageInternal()
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) has a role type of Service Provider
* startOrContinueBuildMessage(@Nullable Intent pgpApiIntent)
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
