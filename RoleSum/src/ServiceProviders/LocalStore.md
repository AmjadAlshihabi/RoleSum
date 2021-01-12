# LocalStore
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getFolder(String name)
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [Store](../InformationHolders/Store.md) has a role type of Information Holder
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapMessage](../Structurers/ImapMessage.md) has a role type of Structurer
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) has a role type of Service Provider
	* [DeleteUriExtractor](../Coordinators/DeleteUriExtractor.md) has a role type of Coordinator
	* [MessageInfoHolderRetrieverListener](../Structurers/MessageInfoHolderRetrieverListener.md) has a role type of Structurer
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MessageHelper](../ServiceProviders/MessageHelper.md) has a role type of Service Provider
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [EmailProviderCache](../Structurers/EmailProviderCache.md) has a role type of Structurer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* getInstance(Account account, Context context)
	* [Authentication](../ServiceProviders/Authentication.md) has a role type of Service Provider
	* [BoundaryGenerator](../ServiceProviders/BoundaryGenerator.md) has a role type of Service Provider
	* [TransportProvider](../ServiceProviders/TransportProvider.md) has a role type of Service Provider
	* [RemoteStore](../Structurers/RemoteStore.md) has a role type of Structurer
	* [WebDavSocketFactory](../ServiceProviders/WebDavSocketFactory.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [DefaultTrustedSocketFactory](../Structurers/DefaultTrustedSocketFactory.md) has a role type of Structurer
	* [LocalKeyStore](../InformationHolders/LocalKeyStore.md) has a role type of Information Holder
	* [SecureX509TrustManager](../ServiceProviders/SecureX509TrustManager.md) has a role type of Service Provider
	* [TrustManagerFactory](../ServiceProviders/TrustManagerFactory.md) has a role type of Service Provider
	* [MessageIdGenerator](../Coordinators/MessageIdGenerator.md) has a role type of Coordinator
	* [MimeMultipart](../InformationHolders/MimeMultipart.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [MessageListWidgetProvider](../Controllers/MessageListWidgetProvider.md) has a role type of Controller
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [ApgDeprecationWarningDialog](../Interfacers/ApgDeprecationWarningDialog.md) has a role type of Interfacer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [PollService](../ServiceProviders/PollService.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [StorageGoneReceiver](../ServiceProviders/StorageGoneReceiver.md) has a role type of Service Provider
	* [StorageReceiver](../ServiceProviders/StorageReceiver.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [UnreadWidgetProvider](../Controllers/UnreadWidgetProvider.md) has a role type of Controller
	* [StorageProviderSetting](../ServiceProviders/StorageProviderSetting.md) has a role type of Service Provider
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [DeviceIdleManager](../ServiceProviders/DeviceIdleManager.md) has a role type of Service Provider
	* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
	* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) has a role type of Service Provider
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
	* [AutocryptStatusInteractor](../ServiceProviders/AutocryptStatusInteractor.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) has a role type of Service Provider
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [AttachmentResolver](../ServiceProviders/AttachmentResolver.md) has a role type of Service Provider
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [ClipboardManager](../ServiceProviders/ClipboardManager.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [FileBrowserHelper](../ServiceProviders/FileBrowserHelper.md) has a role type of Service Provider
	* [MessageHelper](../ServiceProviders/MessageHelper.md) has a role type of Service Provider
	* [UnreadWidgetProperties](../Coordinators/UnreadWidgetProperties.md) has a role type of Coordinator
	* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [PendingCommandSerializer](../Coordinators/PendingCommandSerializer.md) has a role type of Coordinator
	* [EmailProviderCache](../Structurers/EmailProviderCache.md) has a role type of Structurer
	* [AutocryptHeaderParser](../ServiceProviders/AutocryptHeaderParser.md) has a role type of Service Provider
	* [AutocryptOpenPgpApiInteractor](../Coordinators/AutocryptOpenPgpApiInteractor.md) has a role type of Coordinator
	* [AutocryptOperations](../ServiceProviders/AutocryptOperations.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [SendMessageTask](../ServiceProviders/SendMessageTask.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
	* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) has a role type of Interfacer
	* [UpgradeDatabases](../Coordinators/UpgradeDatabases.md) has a role type of Coordinator
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
	* [WelcomeMessage](../Interfacers/WelcomeMessage.md) has a role type of Interfacer
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
	* [SaveMessageTask](../ServiceProviders/SaveMessageTask.md) has a role type of Service Provider
* getInstance(Account account, Context context)
	* [Authentication](../ServiceProviders/Authentication.md) has a role type of Service Provider
	* [BoundaryGenerator](../ServiceProviders/BoundaryGenerator.md) has a role type of Service Provider
	* [TransportProvider](../ServiceProviders/TransportProvider.md) has a role type of Service Provider
	* [RemoteStore](../Structurers/RemoteStore.md) has a role type of Structurer
	* [WebDavSocketFactory](../ServiceProviders/WebDavSocketFactory.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [DefaultTrustedSocketFactory](../Structurers/DefaultTrustedSocketFactory.md) has a role type of Structurer
	* [LocalKeyStore](../InformationHolders/LocalKeyStore.md) has a role type of Information Holder
	* [SecureX509TrustManager](../ServiceProviders/SecureX509TrustManager.md) has a role type of Service Provider
	* [TrustManagerFactory](../ServiceProviders/TrustManagerFactory.md) has a role type of Service Provider
	* [MessageIdGenerator](../Coordinators/MessageIdGenerator.md) has a role type of Coordinator
	* [MimeMultipart](../InformationHolders/MimeMultipart.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [MessageListWidgetProvider](../Controllers/MessageListWidgetProvider.md) has a role type of Controller
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [ApgDeprecationWarningDialog](../Interfacers/ApgDeprecationWarningDialog.md) has a role type of Interfacer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [PollService](../ServiceProviders/PollService.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [StorageGoneReceiver](../ServiceProviders/StorageGoneReceiver.md) has a role type of Service Provider
	* [StorageReceiver](../ServiceProviders/StorageReceiver.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [UnreadWidgetProvider](../Controllers/UnreadWidgetProvider.md) has a role type of Controller
	* [StorageProviderSetting](../ServiceProviders/StorageProviderSetting.md) has a role type of Service Provider
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [DeviceIdleManager](../ServiceProviders/DeviceIdleManager.md) has a role type of Service Provider
	* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
	* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) has a role type of Service Provider
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
	* [AutocryptStatusInteractor](../ServiceProviders/AutocryptStatusInteractor.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) has a role type of Service Provider
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [AttachmentResolver](../ServiceProviders/AttachmentResolver.md) has a role type of Service Provider
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [ClipboardManager](../ServiceProviders/ClipboardManager.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [FileBrowserHelper](../ServiceProviders/FileBrowserHelper.md) has a role type of Service Provider
	* [MessageHelper](../ServiceProviders/MessageHelper.md) has a role type of Service Provider
	* [UnreadWidgetProperties](../Coordinators/UnreadWidgetProperties.md) has a role type of Coordinator
	* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [PendingCommandSerializer](../Coordinators/PendingCommandSerializer.md) has a role type of Coordinator
	* [EmailProviderCache](../Structurers/EmailProviderCache.md) has a role type of Structurer
	* [AutocryptHeaderParser](../ServiceProviders/AutocryptHeaderParser.md) has a role type of Service Provider
	* [AutocryptOpenPgpApiInteractor](../Coordinators/AutocryptOpenPgpApiInteractor.md) has a role type of Coordinator
	* [AutocryptOperations](../ServiceProviders/AutocryptOperations.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [SendMessageTask](../ServiceProviders/SendMessageTask.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
	* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) has a role type of Interfacer
	* [UpgradeDatabases](../Coordinators/UpgradeDatabases.md) has a role type of Coordinator
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
	* [WelcomeMessage](../Interfacers/WelcomeMessage.md) has a role type of Interfacer
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
	* [SaveMessageTask](../ServiceProviders/SaveMessageTask.md) has a role type of Service Provider
* getInstance(Account account, Context context)
	* [Authentication](../ServiceProviders/Authentication.md) has a role type of Service Provider
	* [BoundaryGenerator](../ServiceProviders/BoundaryGenerator.md) has a role type of Service Provider
	* [TransportProvider](../ServiceProviders/TransportProvider.md) has a role type of Service Provider
	* [RemoteStore](../Structurers/RemoteStore.md) has a role type of Structurer
	* [WebDavSocketFactory](../ServiceProviders/WebDavSocketFactory.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [DefaultTrustedSocketFactory](../Structurers/DefaultTrustedSocketFactory.md) has a role type of Structurer
	* [LocalKeyStore](../InformationHolders/LocalKeyStore.md) has a role type of Information Holder
	* [SecureX509TrustManager](../ServiceProviders/SecureX509TrustManager.md) has a role type of Service Provider
	* [TrustManagerFactory](../ServiceProviders/TrustManagerFactory.md) has a role type of Service Provider
	* [MessageIdGenerator](../Coordinators/MessageIdGenerator.md) has a role type of Coordinator
	* [MimeMultipart](../InformationHolders/MimeMultipart.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [MessageListWidgetProvider](../Controllers/MessageListWidgetProvider.md) has a role type of Controller
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [ApgDeprecationWarningDialog](../Interfacers/ApgDeprecationWarningDialog.md) has a role type of Interfacer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [PollService](../ServiceProviders/PollService.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [StorageGoneReceiver](../ServiceProviders/StorageGoneReceiver.md) has a role type of Service Provider
	* [StorageReceiver](../ServiceProviders/StorageReceiver.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [UnreadWidgetProvider](../Controllers/UnreadWidgetProvider.md) has a role type of Controller
	* [StorageProviderSetting](../ServiceProviders/StorageProviderSetting.md) has a role type of Service Provider
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [DeviceIdleManager](../ServiceProviders/DeviceIdleManager.md) has a role type of Service Provider
	* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
	* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) has a role type of Service Provider
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
	* [AutocryptStatusInteractor](../ServiceProviders/AutocryptStatusInteractor.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) has a role type of Service Provider
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [AttachmentResolver](../ServiceProviders/AttachmentResolver.md) has a role type of Service Provider
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [ClipboardManager](../ServiceProviders/ClipboardManager.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [FileBrowserHelper](../ServiceProviders/FileBrowserHelper.md) has a role type of Service Provider
	* [MessageHelper](../ServiceProviders/MessageHelper.md) has a role type of Service Provider
	* [UnreadWidgetProperties](../Coordinators/UnreadWidgetProperties.md) has a role type of Coordinator
	* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [PendingCommandSerializer](../Coordinators/PendingCommandSerializer.md) has a role type of Coordinator
	* [EmailProviderCache](../Structurers/EmailProviderCache.md) has a role type of Structurer
	* [AutocryptHeaderParser](../ServiceProviders/AutocryptHeaderParser.md) has a role type of Service Provider
	* [AutocryptOpenPgpApiInteractor](../Coordinators/AutocryptOpenPgpApiInteractor.md) has a role type of Coordinator
	* [AutocryptOperations](../ServiceProviders/AutocryptOperations.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [SendMessageTask](../ServiceProviders/SendMessageTask.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
	* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) has a role type of Interfacer
	* [UpgradeDatabases](../Coordinators/UpgradeDatabases.md) has a role type of Coordinator
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
	* [WelcomeMessage](../Interfacers/WelcomeMessage.md) has a role type of Interfacer
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
	* [SaveMessageTask](../ServiceProviders/SaveMessageTask.md) has a role type of Service Provider
* removeAccount(Account account)
	* [Preferences](../Structurers/Preferences.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* removeInstance(Account account)
	* [RemoteStore](../Structurers/RemoteStore.md) has a role type of Structurer
	* [Preferences](../Structurers/Preferences.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
* switchLocalStorage(final String newStorageProviderId)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
* getContext()
	* [PushReceiver](../ServiceProviders/PushReceiver.md) has a role type of Service Provider
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
	* [Globals](../InformationHolders/Globals.md) has a role type of Information Holder
	* [FoldableLinearLayout](../Interfacers/FoldableLinearLayout.md) has a role type of Interfacer
	* [K9WebViewClient](../Interfacers/K9WebViewClient.md) has a role type of Interfacer
	* [MessageCryptoStatusView](../Interfacers/MessageCryptoStatusView.md) has a role type of Interfacer
	* [MessageWebView](../Coordinators/MessageWebView.md) has a role type of Coordinator
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [QueryHandler](../ServiceProviders/QueryHandler.md) has a role type of Service Provider
	* [ContactBadge](../Interfacers/ContactBadge.md) has a role type of Interfacer
	* [AttachmentView](../Coordinators/AttachmentView.md) has a role type of Coordinator
	* [MessageCryptoPresenter](../Controllers/MessageCryptoPresenter.md) has a role type of Controller
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
	* [AccountsQueryHandler](../ServiceProviders/AccountsQueryHandler.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessageInfoHolderRetrieverListener](../Structurers/MessageInfoHolderRetrieverListener.md) has a role type of Structurer
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [UnreadQueryHandler](../ServiceProviders/UnreadQueryHandler.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [TimePickerPreference](../Interfacers/TimePickerPreference.md) has a role type of Interfacer
	* [AuthenticationErrorNotifications](../Coordinators/AuthenticationErrorNotifications.md) has a role type of Coordinator
	* [BaseNotifications](../Coordinators/BaseNotifications.md) has a role type of Coordinator
	* [CertificateErrorNotifications](../Coordinators/CertificateErrorNotifications.md) has a role type of Coordinator
	* [LockScreenNotification](../Coordinators/LockScreenNotification.md) has a role type of Coordinator
	* [NewMailNotifications](../Coordinators/NewMailNotifications.md) has a role type of Coordinator
	* [NotificationController](../Controllers/NotificationController.md) has a role type of Controller
	* [SendFailedNotifications](../Coordinators/SendFailedNotifications.md) has a role type of Coordinator
	* [SyncNotifications](../Coordinators/SyncNotifications.md) has a role type of Coordinator
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) has a role type of Service Provider
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
	* [RealMigrationsHelper](../InformationHolders/RealMigrationsHelper.md) has a role type of Information Holder
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
	* [MigrationsHelper](../Structurers/MigrationsHelper.md) has a role type of Structurer
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [OpenPgpAppSelectFragment](../Structurers/OpenPgpAppSelectFragment.md) has a role type of Structurer
	* [SliderPreference](../InformationHolders/SliderPreference.md) has a role type of Information Holder
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
	* [RecipientMvpView](../Interfacers/RecipientMvpView.md) has a role type of Interfacer
* getAccount()
	* [Preferences](../Structurers/Preferences.md) has a role type of Structurer
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [AccountColorExtractor](../Coordinators/AccountColorExtractor.md) has a role type of Coordinator
	* [AccountExtractor](../Coordinators/AccountExtractor.md) has a role type of Coordinator
	* [AccountNumberExtractor](../Coordinators/AccountNumberExtractor.md) has a role type of Coordinator
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [DeleteUriExtractor](../Coordinators/DeleteUriExtractor.md) has a role type of Coordinator
	* [MessageInfoHolderRetrieverListener](../Structurers/MessageInfoHolderRetrieverListener.md) has a role type of Structurer
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
	* [LockScreenNotification](../Coordinators/LockScreenNotification.md) has a role type of Coordinator
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
	* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [RealMigrationsHelper](../InformationHolders/RealMigrationsHelper.md) has a role type of Information Holder
	* [MigrationTo41](../ServiceProviders/MigrationTo41.md) has a role type of Service Provider
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
	* [MigrationTo50](../ServiceProviders/MigrationTo50.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MigrationsHelper](../Structurers/MigrationsHelper.md) has a role type of Structurer
	* [UnreadWidgetProperties](../Coordinators/UnreadWidgetProperties.md) has a role type of Coordinator
	* [ActionModeCallback](../Interfacers/ActionModeCallback.md) has a role type of Interfacer
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [AccountsImportedDialog](../Coordinators/AccountsImportedDialog.md) has a role type of Coordinator
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [ChooseIdentity](../Interfacers/ChooseIdentity.md) has a role type of Interfacer
	* [EditIdentity](../Interfacers/EditIdentity.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [SendMessageTask](../ServiceProviders/SendMessageTask.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
	* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) has a role type of Interfacer
	* [UpgradeDatabaseBroadcastReceiver](../Controllers/UpgradeDatabaseBroadcastReceiver.md) has a role type of Controller
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [AccountSetupAccountType](../Interfacers/AccountSetupAccountType.md) has a role type of Interfacer
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [AccountSetupOptions](../Interfacers/AccountSetupOptions.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
* getStorage()
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [Preferences](../Structurers/Preferences.md) has a role type of Structurer
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [RemoteControlService](../Controllers/RemoteControlService.md) has a role type of Controller
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [RealMigrationsHelper](../InformationHolders/RealMigrationsHelper.md) has a role type of Information Holder
	* [MigrationTo41](../ServiceProviders/MigrationTo41.md) has a role type of Service Provider
	* [MigrationTo42](../ServiceProviders/MigrationTo42.md) has a role type of Service Provider
	* [MigrationsHelper](../Structurers/MigrationsHelper.md) has a role type of Structurer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [FontSizeSettings](../Coordinators/FontSizeSettings.md) has a role type of Coordinator
	* [OpenPgpAppSelectDialog](../Interfacers/OpenPgpAppSelectDialog.md) has a role type of Interfacer
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
* getSize()
	* [BinaryMemoryBody](../InformationHolders/BinaryMemoryBody.md) has a role type of Information Holder
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [SizeAware](../ServiceProviders/SizeAware.md) has a role type of Service Provider
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [FileBackedBody](../InformationHolders/FileBackedBody.md) has a role type of Information Holder
	* [LocalBodyPart](../InformationHolders/LocalBodyPart.md) has a role type of Information Holder
	* [LocalPart](../Structurers/LocalPart.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [TempFileBody](../InformationHolders/TempFileBody.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getSize()
	* [BinaryMemoryBody](../InformationHolders/BinaryMemoryBody.md) has a role type of Information Holder
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [SizeAware](../ServiceProviders/SizeAware.md) has a role type of Service Provider
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [FileBackedBody](../InformationHolders/FileBackedBody.md) has a role type of Information Holder
	* [LocalBodyPart](../InformationHolders/LocalBodyPart.md) has a role type of Information Holder
	* [LocalPart](../Structurers/LocalPart.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [TempFileBody](../InformationHolders/TempFileBody.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getSize()
	* [BinaryMemoryBody](../InformationHolders/BinaryMemoryBody.md) has a role type of Information Holder
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [SizeAware](../ServiceProviders/SizeAware.md) has a role type of Service Provider
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [FileBackedBody](../InformationHolders/FileBackedBody.md) has a role type of Information Holder
	* [LocalBodyPart](../InformationHolders/LocalBodyPart.md) has a role type of Information Holder
	* [LocalPart](../Structurers/LocalPart.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [TempFileBody](../InformationHolders/TempFileBody.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* compact()
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* clear()
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapPusher](../ServiceProviders/ImapPusher.md) has a role type of Service Provider
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
	* [MimeHeader](../Structurers/MimeHeader.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [LocalSearch](../Structurers/LocalSearch.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo46](../ServiceProviders/MigrationTo46.md) has a role type of Service Provider
	* [MigrationTo47](../ServiceProviders/MigrationTo47.md) has a role type of Service Provider
	* [MigrationTo55](../ServiceProviders/MigrationTo55.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [ChooseIdentity](../Interfacers/ChooseIdentity.md) has a role type of Interfacer
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
	* [FolderListFilter](../ServiceProviders/FolderListFilter.md) has a role type of Service Provider
	* [OpenPgpAppSelectFragment](../Structurers/OpenPgpAppSelectFragment.md) has a role type of Structurer
* getMessageCount()
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [DataSet](../Structurers/DataSet.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getFolderCount()
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
* getPersonalNamespaces(boolean forceListAll)
	* [Store](../InformationHolders/Store.md) has a role type of Information Holder
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MigrationTo42](../ServiceProviders/MigrationTo42.md) has a role type of Service Provider
	* [MigrationTo55](../ServiceProviders/MigrationTo55.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) has a role type of Interfacer
* getPersonalNamespaces(boolean forceListAll)
	* [Store](../InformationHolders/Store.md) has a role type of Information Holder
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MigrationTo42](../ServiceProviders/MigrationTo42.md) has a role type of Service Provider
	* [MigrationTo55](../ServiceProviders/MigrationTo55.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) has a role type of Interfacer
* getPersonalNamespaces(boolean forceListAll)
	* [Store](../InformationHolders/Store.md) has a role type of Information Holder
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MigrationTo42](../ServiceProviders/MigrationTo42.md) has a role type of Service Provider
	* [MigrationTo55](../ServiceProviders/MigrationTo55.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) has a role type of Interfacer
* getPersonalNamespaces(boolean forceListAll)
	* [Store](../InformationHolders/Store.md) has a role type of Information Holder
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MigrationTo42](../ServiceProviders/MigrationTo42.md) has a role type of Service Provider
	* [MigrationTo55](../ServiceProviders/MigrationTo55.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) has a role type of Interfacer
