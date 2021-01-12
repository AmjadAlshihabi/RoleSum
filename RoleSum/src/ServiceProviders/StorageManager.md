# StorageManager
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* isMountPoint(final File file)
	* [FixedStorageProviderBase](../InformationHolders/FixedStorageProviderBase.md) has a role type of Information Holder
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
* addListener(final StorageListener listener)
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* removeListener(final StorageListener listener)
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* getInstance(final Context context)
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
* getDefaultProviderId()
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [StorageProviderSetting](../ServiceProviders/StorageProviderSetting.md) has a role type of Service Provider
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
* getProvider(final String providerId)
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
* getDatabase(final String dbName, final String providerId)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [ExternalStorageProvider](../InformationHolders/ExternalStorageProvider.md) has a role type of Information Holder
	* [FixedStorageProviderBase](../InformationHolders/FixedStorageProviderBase.md) has a role type of Information Holder
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [InternalStorageProvider](../InformationHolders/InternalStorageProvider.md) has a role type of Information Holder
	* [StorageProvider](../InformationHolders/StorageProvider.md) has a role type of Information Holder
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
* getAttachmentDirectory(final String dbName, final String providerId)
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [ExternalStorageProvider](../InformationHolders/ExternalStorageProvider.md) has a role type of Information Holder
	* [FixedStorageProviderBase](../InformationHolders/FixedStorageProviderBase.md) has a role type of Information Holder
	* [InternalStorageProvider](../InformationHolders/InternalStorageProvider.md) has a role type of Information Holder
	* [StorageProvider](../InformationHolders/StorageProvider.md) has a role type of Information Holder
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* isReady(final String providerId)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [ExternalStorageProvider](../InformationHolders/ExternalStorageProvider.md) has a role type of Information Holder
	* [FixedStorageProviderBase](../InformationHolders/FixedStorageProviderBase.md) has a role type of Information Holder
	* [InternalStorageProvider](../InformationHolders/InternalStorageProvider.md) has a role type of Information Holder
	* [StorageProvider](../InformationHolders/StorageProvider.md) has a role type of Information Holder
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
* getAvailableProviders()
	* [StorageProviderSetting](../ServiceProviders/StorageProviderSetting.md) has a role type of Service Provider
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
* getAvailableProviders()
	* [StorageProviderSetting](../ServiceProviders/StorageProviderSetting.md) has a role type of Service Provider
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
* onBeforeUnmount(final String path)
	* [StorageGoneReceiver](../ServiceProviders/StorageGoneReceiver.md) has a role type of Service Provider
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
* onAfterUnmount(final String path)
	* [StorageGoneReceiver](../ServiceProviders/StorageGoneReceiver.md) has a role type of Service Provider
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
* onAfterUnmount(final String path)
	* [StorageGoneReceiver](../ServiceProviders/StorageGoneReceiver.md) has a role type of Service Provider
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
* onMount(final String path, final boolean readOnly)
	* [StorageReceiver](../ServiceProviders/StorageReceiver.md) has a role type of Service Provider
	* [StorageListener](../Structurers/StorageListener.md) has a role type of Structurer
	* [StorageListener](../Structurers/StorageListener.md) has a role type of Structurer
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [StorageListenerImplementation](../ServiceProviders/StorageListenerImplementation.md) has a role type of Service Provider
* resolveProvider(final String path)
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
* resolveProvider(final String path)
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
* lockProvider(final String providerId)
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
* lockProvider(final String providerId)
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
* unlockProvider(final String providerId)
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
