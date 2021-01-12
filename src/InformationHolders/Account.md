# Account
## This Information Holder is responsible for:
### providing and holding information about: 
* NO_OPENPGP_KEY
* DEFAULT_QUOTE_STYLE
* DEFAULT_QUOTED_TEXT_SHOWN
* DEFAULT_REPLY_AFTER_QUOTE
* DEFAULT_REMOTE_SEARCH_NUM_RESULTS
* DEFAULT_MESSAGE_FORMAT_AUTO
* isSignatureBeforeQuotedText
* replyAfterQuote
* maximumPolledMessageAge
* notificationSetting
* trashFolderName
* syncRemoteDeletions
* storeUri
* folderNotifyNewMailMode
* PREDEFINED_COLORS
* notifySync
* chipColor
* pgpCryptoKey
* expungePolicy
* IDENTITY_EMAIL_KEY
* notifyNewMail
* alwaysShowCcBcc
* readColorChip
* compressionMap
* inboxFolderName
* OUTBOX
* IDENTITY_NAME_KEY
* markMessageAsReadOnView
* defaultQuotedTextShown
* accountUuid
* quotePrefix
* IDENTITY_DESCRIPTION_KEY
* automaticCheckIntervalMinutes
* allowRemoteSearch
* messageFormatAuto
* notifySelfNewMail
* ringNotified
* folderDisplayMode
* draftsFolderName
* isEnabled
* unreadColorChip
* notifyContactsMailOnly
* STORE_URI_KEY
* DEFAULT_QUOTE_PREFIX
* ACCOUNT_DESCRIPTION_KEY
* description
* DEFAULT_STRIP_SIGNATURE
* subscribedFoldersOnly
* autoExpandFolderName
* DEFAULT_MESSAGE_FORMAT
* INBOX
* messageReadReceipt
* identities
* DEFAULT_MESSAGE_READ_RECEIPT
* maximumAutoDownloadMessageSize
* displayCount
* remoteSearchFullText
* transportUri
* spamFolderName
* folderTargetMode
* quoteStyle
* flaggedReadColorChip
* maxPushFolders
* showPictures
* alwaysBcc
* folderSyncMode
* messageFormat
* goToUnreadMessageSearch
* sentFolderName
* accountNumber
* remoteSearchNumResults
* flaggedUnreadColorChip
* archiveFolderName
* folderPushMode
* pushPollOnConnect
* searchableFolders
* sortAscending
* idleRefreshMinutes
* DEFAULT_SORT_TYPE
* DEFAULT_SORT_ASCENDING
* sortType
* deletePolicy
* latestOldMessageSeenTime
* localStorageProviderId
* stripSignature
* lastSelectedFolderName
* TRANSPORT_URI_KEY
### Managing database tasks through the following methods:
* save(Preferences preferences)
* getStats(Context context)
* loadUnreadCountForFolder(Context context, String folderName)
### Providing information to the following objects 
* [K9](../Controllers/K9.md) has a role type of Controller
* [Preferences](../Structurers/Preferences.md) has a role type of Structurer
* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
* [MessageCryptoPresenter](../Controllers/MessageCryptoPresenter.md) has a role type of Controller
* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
* [RemoteControlReceiver](../ServiceProviders/RemoteControlReceiver.md) has a role type of Service Provider
* [LocalSearch](../Structurers/LocalSearch.md) has a role type of Structurer
* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) has a role type of Service Provider
* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* [MessageInfoHolderRetrieverListener](../Structurers/MessageInfoHolderRetrieverListener.md) has a role type of Structurer
* [UnreadQueryHandler](../ServiceProviders/UnreadQueryHandler.md) has a role type of Service Provider
* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* [AuthenticationErrorNotifications](../Coordinators/AuthenticationErrorNotifications.md) has a role type of Coordinator
* [CertificateErrorNotifications](../Coordinators/CertificateErrorNotifications.md) has a role type of Coordinator
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
* [LockScreenNotification](../Coordinators/LockScreenNotification.md) has a role type of Coordinator
* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
* [RealMigrationsHelper](../InformationHolders/RealMigrationsHelper.md) has a role type of Information Holder
* [MigrationTo41](../ServiceProviders/MigrationTo41.md) has a role type of Service Provider
* [MigrationTo43](../ServiceProviders/MigrationTo43.md) has a role type of Service Provider
* [MigrationTo50](../ServiceProviders/MigrationTo50.md) has a role type of Service Provider
* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* [MessageHelper](../ServiceProviders/MessageHelper.md) has a role type of Service Provider
* [ReplyToParser](../ServiceProviders/ReplyToParser.md) has a role type of Service Provider
* [UnreadWidgetProperties](../Coordinators/UnreadWidgetProperties.md) has a role type of Coordinator
* [ActionModeCallback](../Interfacers/ActionModeCallback.md) has a role type of Interfacer
* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
* [Memory](../InformationHolders/Memory.md) has a role type of Information Holder
* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
* [PendingAppend](../Coordinators/PendingAppend.md) has a role type of Coordinator
* [PendingCommand](../Coordinators/PendingCommand.md) has a role type of Coordinator
* [PendingEmptyTrash](../Coordinators/PendingEmptyTrash.md) has a role type of Coordinator
* [PendingExpunge](../Coordinators/PendingExpunge.md) has a role type of Coordinator
* [PendingMarkAllAsRead](../Coordinators/PendingMarkAllAsRead.md) has a role type of Coordinator
* [PendingMoveOrCopy](../Coordinators/PendingMoveOrCopy.md) has a role type of Coordinator
* [PendingSetFlag](../Coordinators/PendingSetFlag.md) has a role type of Coordinator
* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
* [AccountsAdapter](../Interfacers/AccountsAdapter.md) has a role type of Interfacer
* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
* [AccountsImportedDialog](../Coordinators/AccountsImportedDialog.md) has a role type of Coordinator
* [MoveAccountAsyncTask](../ServiceProviders/MoveAccountAsyncTask.md) has a role type of Service Provider
* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) has a role type of Interfacer
* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
* [ChooseIdentity](../Interfacers/ChooseIdentity.md) has a role type of Interfacer
* [EditIdentity](../Interfacers/EditIdentity.md) has a role type of Interfacer
* [FolderInfoHolder](../InformationHolders/FolderInfoHolder.md) has a role type of Information Holder
* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* [SendMessageTask](../ServiceProviders/SendMessageTask.md) has a role type of Service Provider
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) has a role type of Interfacer
* [UpgradeDatabaseBroadcastReceiver](../Controllers/UpgradeDatabaseBroadcastReceiver.md) has a role type of Controller
* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
* [AccountSetupAccountType](../Interfacers/AccountSetupAccountType.md) has a role type of Interfacer
* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) has a role type of Interfacer
* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
* [AccountSetupOptions](../Interfacers/AccountSetupOptions.md) has a role type of Interfacer
* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
* [IdentityContainer](../InformationHolders/IdentityContainer.md) has a role type of Information Holder
* [IdentityAdapter](../Structurers/IdentityAdapter.md) has a role type of Structurer
* [MessageActions](../ServiceProviders/MessageActions.md) has a role type of Service Provider
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* [SaveMessageTask](../ServiceProviders/SaveMessageTask.md) has a role type of Service Provider
