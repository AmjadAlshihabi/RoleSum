# LockScreenNotification
### This Coordinator is responsible for delegating work between the following objects: 
* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
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
* [NotificationController](../Controllers/NotificationController.md) has a role type of Controller
* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
### the createPublicNotificationWithNewMessagesCount method receives requests from:
* [LockScreenNotification](../Coordinators/LockScreenNotification.md) 
### and delegate the request to: 
* [NotificationData](../Structurers/NotificationData.md) 


### the configureLockScreenNotification method receives requests from:
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) 
* [LockScreenNotification](../Coordinators/LockScreenNotification.md) 
### and delegate the request to: 
* [NotificationData](../Structurers/NotificationData.md) 


### the newInstance method receives requests from:
* [WebDavStore](../InformationHolders/WebDavStore.md) 
* [FolderNameCodec](../ServiceProviders/FolderNameCodec.md) 
* [ImapFolder](../Structurers/ImapFolder.md) 
* [ImapStore](../Structurers/ImapStore.md) 
* [MimeMultipart](../InformationHolders/MimeMultipart.md) 
* [K9WebViewClient](../Interfacers/K9WebViewClient.md) 
* [MessageWebView](../Coordinators/MessageWebView.md) 
* [CryptoInfoDialog](../Interfacers/CryptoInfoDialog.md) 
* [MessageViewFragment](../Interfacers/MessageViewFragment.md) 
* [RealDeviceIdleManager](../ServiceProviders/RealDeviceIdleManager.md) 
* [SettingsImporter](../ServiceProviders/SettingsImporter.md) 
* [DeviceIdleManager](../ServiceProviders/DeviceIdleManager.md) 
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) 
* [LockScreenNotification](../Coordinators/LockScreenNotification.md) 
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) 
* [NotificationController](../Controllers/NotificationController.md) 
* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) 
* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) 
* [HtmlProcessor](../ServiceProviders/HtmlProcessor.md) 
* [AttachmentCounter](../ServiceProviders/AttachmentCounter.md) 
* [MessageFulltextCreator](../ServiceProviders/MessageFulltextCreator.md) 
* [MessagePreviewCreator](../ServiceProviders/MessagePreviewCreator.md) 
* [LocalStore](../ServiceProviders/LocalStore.md) 
* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) 
* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) 
* [ConfirmationDialogFragment](../Coordinators/ConfirmationDialogFragment.md) 
* [ProgressDialogFragment](../Interfacers/ProgressDialogFragment.md) 
* [MessageListFragment](../Interfacers/MessageListFragment.md) 
* [MessagingController](../Controllers/MessagingController.md) 
* [K9Activity](../Interfacers/K9Activity.md) 
* [K9ActivityCommon](../Coordinators/K9ActivityCommon.md) 
* [K9ListActivity](../Interfacers/K9ListActivity.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [MessageList](../Interfacers/MessageList.md) 
* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) 
* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) 
* [PgpEnabledErrorDialog](../Coordinators/PgpEnabledErrorDialog.md) 
* [PgpEncryptDescriptionDialog](../Coordinators/PgpEncryptDescriptionDialog.md) 
* [PgpInlineDialog](../Interfacers/PgpInlineDialog.md) 
* [PgpSignOnlyDialog](../Interfacers/PgpSignOnlyDialog.md) 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
### and delegate the request to: 
* [NotificationController](../Controllers/NotificationController.md) 


### the createPublicNotificationWithSenderList method receives requests from:
* [LockScreenNotification](../Coordinators/LockScreenNotification.md) 
### and delegate the request to: 
* [NotificationData](../Structurers/NotificationData.md) 


### the createPublicNotification method receives requests from:
* [LockScreenNotification](../Coordinators/LockScreenNotification.md) 
### and delegate the request to: 
* [NotificationData](../Structurers/NotificationData.md) 


