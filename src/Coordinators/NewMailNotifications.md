# NewMailNotifications
### This Coordinator is responsible for delegating work between the following objects: 
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
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
* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
* [NotificationController](../Controllers/NotificationController.md) has a role type of Controller
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [MessageReference](../InformationHolders/MessageReference.md) has a role type of Information Holder
* [NotificationController](../Controllers/NotificationController.md) has a role type of Controller
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [NotificationController](../Controllers/NotificationController.md) has a role type of Controller
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
### the updateSummaryNotification method receives requests from:
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 
* [NotificationData](../Structurers/NotificationData.md) 


### the removeNotificationData method receives requests from:
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


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
* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) 


### the createSummaryNotification method receives requests from:
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 
* [NotificationData](../Structurers/NotificationData.md) 


### the removeNewMailNotification method receives requests from:
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) 
* [NotificationController](../Controllers/NotificationController.md) 
* [MessagingController](../Controllers/MessagingController.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 
* [MessageReference](../InformationHolders/MessageReference.md) 


### the clearNewMailNotifications method receives requests from:
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) 
* [NotificationController](../Controllers/NotificationController.md) 
* [MessagingController](../Controllers/MessagingController.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the getOrCreateNotificationData method receives requests from:
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the getNotificationData method receives requests from:
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the createNotificationData method receives requests from:
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the addNewMailNotification method receives requests from:
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) 
* [NotificationController](../Controllers/NotificationController.md) 
* [MessagingController](../Controllers/MessagingController.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 
* [LocalMessage](../InformationHolders/LocalMessage.md) 


### the createStackedNotification method receives requests from:
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


