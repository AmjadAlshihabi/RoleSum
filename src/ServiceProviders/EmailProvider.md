# EmailProvider
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* onCreate()
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
	* [PollService](../ServiceProviders/PollService.md) has a role type of Service Provider
	* [PushService](../ServiceProviders/PushService.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [RetainFragment](../InformationHolders/RetainFragment.md) has a role type of Information Holder
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [AccountList](../Interfacers/AccountList.md) has a role type of Interfacer
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [ChooseIdentity](../Interfacers/ChooseIdentity.md) has a role type of Interfacer
	* [EditIdentity](../Interfacers/EditIdentity.md) has a role type of Interfacer
	* [EmailAddressList](../Interfacers/EmailAddressList.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [K9Activity](../Interfacers/K9Activity.md) has a role type of Interfacer
	* [K9ListActivity](../Interfacers/K9ListActivity.md) has a role type of Interfacer
	* [K9PreferenceActivity](../Coordinators/K9PreferenceActivity.md) has a role type of Coordinator
	* [LauncherShortcuts](../Interfacers/LauncherShortcuts.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
	* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) has a role type of Interfacer
	* [UpgradeDatabases](../Coordinators/UpgradeDatabases.md) has a role type of Coordinator
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
	* [FontSizeSettings](../Coordinators/FontSizeSettings.md) has a role type of Coordinator
	* [OpenPgpAppSelectFragment](../Structurers/OpenPgpAppSelectFragment.md) has a role type of Structurer
	* [OpenPgpAppSelectDialog](../Interfacers/OpenPgpAppSelectDialog.md) has a role type of Interfacer
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
	* [WelcomeMessage](../Interfacers/WelcomeMessage.md) has a role type of Interfacer
* getType(Uri uri)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [K9WebViewClient](../Interfacers/K9WebViewClient.md) has a role type of Interfacer
	* [IntentAndResolvedActivitiesCount](../InformationHolders/IntentAndResolvedActivitiesCount.md) has a role type of Information Holder
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
	* [SpecialColumnsCursor](../InformationHolders/SpecialColumnsCursor.md) has a role type of Information Holder
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MonitoredCursor](../ServiceProviders/MonitoredCursor.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [MergeCursor](../ServiceProviders/MergeCursor.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
* delete(Uri uri, String selection, String[] selectionArgs)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Message](../ServiceProviders/Pop3Message.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapMessage](../Structurers/ImapMessage.md) has a role type of Structurer
	* [LocalKeyStore](../InformationHolders/LocalKeyStore.md) has a role type of Information Holder
	* [BinaryTempFileBodyInputStream](../ServiceProviders/BinaryTempFileBodyInputStream.md) has a role type of Service Provider
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [Preferences](../Structurers/Preferences.md) has a role type of Structurer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
	* [InsertableHtmlContent](../InformationHolders/InsertableHtmlContent.md) has a role type of Information Holder
	* [HtmlToTextTagHandler](../ServiceProviders/HtmlToTextTagHandler.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [FileHelper](../ServiceProviders/FileHelper.md) has a role type of Service Provider
	* [ActionModeCallback](../Interfacers/ActionModeCallback.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [TemporaryAttachmentStore](../ServiceProviders/TemporaryAttachmentStore.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* insert(Uri uri, ContentValues values)
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [HtmlQuoteCreator](../ServiceProviders/HtmlQuoteCreator.md) has a role type of Service Provider
	* [InsertableHtmlContent](../InformationHolders/InsertableHtmlContent.md) has a role type of Information Holder
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [FlowedMessageUtils](../ServiceProviders/FlowedMessageUtils.md) has a role type of Service Provider
	* [MigrationTo55](../ServiceProviders/MigrationTo55.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* update(Uri uri, ContentValues values, String selection, String[] selectionArgs)
	* [Authentication](../ServiceProviders/Authentication.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
	* [MigrationTo46](../ServiceProviders/MigrationTo46.md) has a role type of Service Provider
	* [MigrationTo47](../ServiceProviders/MigrationTo47.md) has a role type of Service Provider
	* [MigrationTo50](../ServiceProviders/MigrationTo50.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* getAccount(String accountUuid)
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
* getDatabase(Account account)
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
* containsAny(String haystack, String[] needles)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [AccountsQueryHandler](../ServiceProviders/AccountsQueryHandler.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [QueryHandler](../ServiceProviders/QueryHandler.md) has a role type of Service Provider
	* [ThrottlingQueryHandler](../ServiceProviders/ThrottlingQueryHandler.md) has a role type of Service Provider
	* [UnreadQueryHandler](../ServiceProviders/UnreadQueryHandler.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo46](../ServiceProviders/MigrationTo46.md) has a role type of Service Provider
	* [MigrationTo47](../ServiceProviders/MigrationTo47.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [AccountsQueryHandler](../ServiceProviders/AccountsQueryHandler.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [QueryHandler](../ServiceProviders/QueryHandler.md) has a role type of Service Provider
	* [ThrottlingQueryHandler](../ServiceProviders/ThrottlingQueryHandler.md) has a role type of Service Provider
	* [UnreadQueryHandler](../ServiceProviders/UnreadQueryHandler.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo46](../ServiceProviders/MigrationTo46.md) has a role type of Service Provider
	* [MigrationTo47](../ServiceProviders/MigrationTo47.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [AccountsQueryHandler](../ServiceProviders/AccountsQueryHandler.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [QueryHandler](../ServiceProviders/QueryHandler.md) has a role type of Service Provider
	* [ThrottlingQueryHandler](../ServiceProviders/ThrottlingQueryHandler.md) has a role type of Service Provider
	* [UnreadQueryHandler](../ServiceProviders/UnreadQueryHandler.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo46](../ServiceProviders/MigrationTo46.md) has a role type of Service Provider
	* [MigrationTo47](../ServiceProviders/MigrationTo47.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [AccountsQueryHandler](../ServiceProviders/AccountsQueryHandler.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [QueryHandler](../ServiceProviders/QueryHandler.md) has a role type of Service Provider
	* [ThrottlingQueryHandler](../ServiceProviders/ThrottlingQueryHandler.md) has a role type of Service Provider
	* [UnreadQueryHandler](../ServiceProviders/UnreadQueryHandler.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo46](../ServiceProviders/MigrationTo46.md) has a role type of Service Provider
	* [MigrationTo47](../ServiceProviders/MigrationTo47.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [AccountsQueryHandler](../ServiceProviders/AccountsQueryHandler.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [QueryHandler](../ServiceProviders/QueryHandler.md) has a role type of Service Provider
	* [ThrottlingQueryHandler](../ServiceProviders/ThrottlingQueryHandler.md) has a role type of Service Provider
	* [UnreadQueryHandler](../ServiceProviders/UnreadQueryHandler.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo46](../ServiceProviders/MigrationTo46.md) has a role type of Service Provider
	* [MigrationTo47](../ServiceProviders/MigrationTo47.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [AccountsQueryHandler](../ServiceProviders/AccountsQueryHandler.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [QueryHandler](../ServiceProviders/QueryHandler.md) has a role type of Service Provider
	* [ThrottlingQueryHandler](../ServiceProviders/ThrottlingQueryHandler.md) has a role type of Service Provider
	* [UnreadQueryHandler](../ServiceProviders/UnreadQueryHandler.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo46](../ServiceProviders/MigrationTo46.md) has a role type of Service Provider
	* [MigrationTo47](../ServiceProviders/MigrationTo47.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* getMessages(String accountUuid, final String[] projection, final String selection,
            final String[] selectionArgs, final String sortOrder)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getMessages(String accountUuid, final String[] projection, final String selection,
            final String[] selectionArgs, final String sortOrder)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getMessages(String accountUuid, final String[] projection, final String selection,
            final String[] selectionArgs, final String sortOrder)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getMessages(String accountUuid, final String[] projection, final String selection,
            final String[] selectionArgs, final String sortOrder)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagesQueryHandler](../Structurers/MessagesQueryHandler.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getThreadedMessages(String accountUuid, final String[] projection, final String selection,
            final String[] selectionArgs, final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getThreadedMessages(String accountUuid, final String[] projection, final String selection,
            final String[] selectionArgs, final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getThreadedMessages(String accountUuid, final String[] projection, final String selection,
            final String[] selectionArgs, final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getThreadedMessages(String accountUuid, final String[] projection, final String selection,
            final String[] selectionArgs, final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getThreadedMessages(String accountUuid, final String[] projection, final String selection,
            final String[] selectionArgs, final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getThreadedMessages(String accountUuid, final String[] projection, final String selection,
            final String[] selectionArgs, final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getThreadedMessages(String accountUuid, final String[] projection, final String selection,
            final String[] selectionArgs, final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* createThreadedSubQuery(String[] projection, String selection, StringBuilder query)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* createThreadedSubQuery(String[] projection, String selection, StringBuilder query)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* createThreadedSubQuery(String[] projection, String selection, StringBuilder query)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* createThreadedSubQuery(String[] projection, String selection, StringBuilder query)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* createThreadedSubQuery(String[] projection, String selection, StringBuilder query)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* createThreadedSubQuery(String[] projection, String selection, StringBuilder query)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getThread(String accountUuid, final String[] projection, final String threadId,
            final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getThread(String accountUuid, final String[] projection, final String threadId,
            final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getThread(String accountUuid, final String[] projection, final String threadId,
            final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getThread(String accountUuid, final String[] projection, final String threadId,
            final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getThread(String accountUuid, final String[] projection, final String threadId,
            final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getThread(String accountUuid, final String[] projection, final String threadId,
            final String sortOrder)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* getAccountStats(String accountUuid, String[] columns, final String selection,
            final String[] selectionArgs)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* getAccountStats(String accountUuid, String[] columns, final String selection,
            final String[] selectionArgs)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* getAccountStats(String accountUuid, String[] columns, final String selection,
            final String[] selectionArgs)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
