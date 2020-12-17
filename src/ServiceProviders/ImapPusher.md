# ImapPusher
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getLastRefresh()
	* [Pusher](../ServiceProviders/Pusher.md) has a role type of Service Provider
	* [ImapPusher](../ServiceProviders/ImapPusher.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
* setLastRefresh(long lastRefresh)
	* [Pusher](../ServiceProviders/Pusher.md) has a role type of Service Provider
	* [ImapPusher](../ServiceProviders/ImapPusher.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
* currentTimeMillis()
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [ImapPusher](../ServiceProviders/ImapPusher.md) has a role type of Service Provider
	* [Clock](../ServiceProviders/Clock.md) has a role type of Service Provider
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [RemoteControlService](../Controllers/RemoteControlService.md) has a role type of Controller
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
	* [AuthenticationErrorNotifications](../Coordinators/AuthenticationErrorNotifications.md) has a role type of Coordinator
	* [BaseNotifications](../Coordinators/BaseNotifications.md) has a role type of Coordinator
	* [CertificateErrorNotifications](../Coordinators/CertificateErrorNotifications.md) has a role type of Coordinator
	* [SendFailedNotifications](../Coordinators/SendFailedNotifications.md) has a role type of Coordinator
	* [SyncNotifications](../Coordinators/SyncNotifications.md) has a role type of Coordinator
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [FileHelper](../ServiceProviders/FileHelper.md) has a role type of Service Provider
	* [TemporaryAttachmentStore](../ServiceProviders/TemporaryAttachmentStore.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* start(List<String> folderNames)
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [Pusher](../ServiceProviders/Pusher.md) has a role type of Service Provider
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavHandler](../Structurers/WebDavHandler.md) has a role type of Structurer
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ContiguousIdGroup](../InformationHolders/ContiguousIdGroup.md) has a role type of Information Holder
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
	* [ImapPusher](../ServiceProviders/ImapPusher.md) has a role type of Service Provider
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessageTitleView](../Interfacers/MessageTitleView.md) has a role type of Interfacer
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [CryptoInfoDialog](../Interfacers/CryptoInfoDialog.md) has a role type of Interfacer
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
	* [IntegerRangeSetting](../ServiceProviders/IntegerRangeSetting.md) has a role type of Service Provider
	* [HtmlQuoteCreator](../ServiceProviders/HtmlQuoteCreator.md) has a role type of Service Provider
	* [BitcoinUriParser](../ServiceProviders/BitcoinUriParser.md) has a role type of Service Provider
	* [EthereumUriParser](../ServiceProviders/EthereumUriParser.md) has a role type of Service Provider
	* [HtmlToTextTagHandler](../ServiceProviders/HtmlToTextTagHandler.md) has a role type of Service Provider
	* [HttpUriParser](../ServiceProviders/HttpUriParser.md) has a role type of Service Provider
	* [UriLinkifier](../ServiceProviders/UriLinkifier.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [SimpleTextWatcher](../ServiceProviders/SimpleTextWatcher.md) has a role type of Service Provider
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [ImportSelectionDialog](../Interfacers/ImportSelectionDialog.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
	* [RecipientMvpView](../Interfacers/RecipientMvpView.md) has a role type of Interfacer
* refresh()
	* [Pusher](../ServiceProviders/Pusher.md) has a role type of Service Provider
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
	* [ImapPusher](../ServiceProviders/ImapPusher.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) has a role type of Service Provider
	* [MoveAccountAsyncTask](../ServiceProviders/MoveAccountAsyncTask.md) has a role type of Service Provider
	* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
* stop()
	* [Pusher](../ServiceProviders/Pusher.md) has a role type of Service Provider
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
	* [ImapPusher](../ServiceProviders/ImapPusher.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getRefreshInterval()
	* [Pusher](../ServiceProviders/Pusher.md) has a role type of Service Provider
	* [ImapPusher](../ServiceProviders/ImapPusher.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
* createImapFolderPusher(String folderName)
	* [ImapPusher](../ServiceProviders/ImapPusher.md) has a role type of Service Provider
* createImapFolderPusher(String folderName)
	* [ImapPusher](../ServiceProviders/ImapPusher.md) has a role type of Service Provider
