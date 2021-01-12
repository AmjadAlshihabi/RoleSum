# SmtpTransport
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* parseOptionalSizeValue(Map<String, String> extensions) 
	* Service Providers:
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* close() 
	* Controllers:
		* [AttachmentController](../Controllers/AttachmentController.md) 
		* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) 
		* [MessagingController](../Controllers/MessagingController.md) 
		* [PushRunnable](../Controllers/PushRunnable.md) 
		* [Pop3Folder](../Controllers/Pop3Folder.md) 
	* Coordinators: 
		* [Base64OutputStream](../Coordinators/Base64OutputStream.md) 
		* [CheckAccountTask](../Coordinators/CheckAccountTask.md) 
		* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) 
		* [ColorChip](../Coordinators/ColorChip.md) 
		* [Accounts](../Coordinators/Accounts.md) 
	* Information Holders: 
		* [WebDavStore](../InformationHolders/WebDavStore.md) 
		* [FolderInfoHolder](../InformationHolders/FolderInfoHolder.md) 
		* [TextBody](../InformationHolders/TextBody.md) 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [FileBackedBody](../InformationHolders/FileBackedBody.md) 
	* Interfacers: 
		* [MessageListFragment](../Interfacers/MessageListFragment.md) 
		* [FolderListAdapter](../Interfacers/FolderListAdapter.md) 
		* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) 
	* Service Providers: 
		* [WebDavFolder](../ServiceProviders/WebDavFolder.md) 
		* [SignSafeOutputStream](../ServiceProviders/SignSafeOutputStream.md) 
		* [MonitoredCursor](../ServiceProviders/MonitoredCursor.md) 
		* [MigrationTo46](../ServiceProviders/MigrationTo46.md) 
		* [MigrationTo47](../ServiceProviders/MigrationTo47.md) 
		* [Utility](../ServiceProviders/Utility.md) 
		* [LockableDatabase](../ServiceProviders/LockableDatabase.md) 
		* [BinaryTempFileBodyInputStream](../ServiceProviders/BinaryTempFileBodyInputStream.md) 
		* [QueryHandler](../ServiceProviders/QueryHandler.md) 
		* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) 
		* [MigrationTo51](../ServiceProviders/MigrationTo51.md) 
		* [MergeCursor](../ServiceProviders/MergeCursor.md) 
		* [BinaryAttachmentBody](../ServiceProviders/BinaryAttachmentBody.md) 
		* [MimeUtility](../ServiceProviders/MimeUtility.md) 
		* [Transport](../ServiceProviders/Transport.md) 
		* [ThrottlingQueryHandler](../ServiceProviders/ThrottlingQueryHandler.md) 
		* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) 
		* [MigrationTo60](../ServiceProviders/MigrationTo60.md) 
		* [IdleStopper](../ServiceProviders/IdleStopper.md) 
		* [WebDavTransport](../ServiceProviders/WebDavTransport.md) 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
		* [ImapConnection](../ServiceProviders/ImapConnection.md) 
		* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) 
		* [Pop3Store](../ServiceProviders/Pop3Store.md) 
		* [PRNGFixes](../ServiceProviders/PRNGFixes.md) 
		* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) 
		* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) 
		* [RecipientLoader](../ServiceProviders/RecipientLoader.md) 
		* [DefaultBodyFactory](../ServiceProviders/DefaultBodyFactory.md) 
		* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) 
		* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) 
		* [FileHelper](../ServiceProviders/FileHelper.md) 
		* [Contacts](../ServiceProviders/Contacts.md) 
		* [SettingsExporter](../ServiceProviders/SettingsExporter.md) 
		* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) 
	* Structurers: 
		* [ImapFolder](../Structurers/ImapFolder.md) 
		* [ImapStore](../Structurers/ImapStore.md) 
		* [Storage](../Structurers/Storage.md) 
		* [Folder](../Structurers/Folder.md) 
		* [StorageListener](../Structurers/StorageListener.md) 
* readLine() 
	* Controllers: 
		* [Pop3Folder](../Controllers/Pop3Folder.md) 
	* Information Holders: 
		* [WebDavStore](../InformationHolders/WebDavStore.md) 
	* Service Providers: 
		* [WebDavFolder](../ServiceProviders/WebDavFolder.md) 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* executeSensitiveCommand(String format, Object... args) 
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* executeCommand(boolean sensitive, String format, Object... args) 
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* buildEnhancedNegativeSmtpReplyException(int replyCode, List<String> results) 
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* readCommandResponseLine(List<String> results) 
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* executePipelinedCommands(Queue<String> pipelinedCommands) 
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* readPipelinedResponse(Queue<String> pipelinedCommands) 
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* responseLineToCommandResponse(String line, List<String> results) 
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* handlePermanentFailure(NegativeSmtpReplyException negativeResponse) 
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* getCanonicalHostName(InetAddress localAddress) 
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
### Offering configuration features to other object. List of configuration features and corresponding consumer objects: 
* open()
	* Controllers: 
		* [MessagingController](../Controllers/MessagingController.md) 
		* [Pop3Folder](../Controllers/Pop3Folder.md) 
	* Coordinators: 
		* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) 
		* [CheckAccountTask](../Coordinators/CheckAccountTask.md) 
	* Information Holders: 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
		* [WebDavStore](../InformationHolders/WebDavStore.md) 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
	* Interfacers: 
		* [FolderSettings](../Interfacers/FolderSettings.md) 
	* Service Providers: 
		* [WebDavFolder](../ServiceProviders/WebDavFolder.md) 
		* [WebDavTransport](../ServiceProviders/WebDavTransport.md) 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
		* [MlfUtils](../ServiceProviders/MlfUtils.md) 
		* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
		* [ImapConnection](../ServiceProviders/ImapConnection.md) 
		* [Pop3Store](../ServiceProviders/Pop3Store.md) 
		* [LockableDatabase](../ServiceProviders/LockableDatabase.md) 
		* [Transport](../ServiceProviders/Transport.md) 
	* Structurers: 
		* [ImapFolder](../Structurers/ImapFolder.md) 
		* [ImapStore](../Structurers/ImapStore.md) 
		* [Folder](../Structurers/Folder.md) 
* sendHello(String host)
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* sendMessage(Message message)
	* Controllers: 
		* [MessagingController](../Controllers/MessagingController.md) 
	* Interfacers: 
		* [MessageListHandler](../Interfacers/MessageListHandler.md) 
	* Service Providers: 
		* [SendMessageTask](../ServiceProviders/SendMessageTask.md) 
		* [WebDavTransport](../ServiceProviders/WebDavTransport.md) 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
		* [ChooseFolderHandler](../ServiceProviders/ChooseFolderHandler.md) 
		* [SaveMessageTask](../ServiceProviders/SaveMessageTask.md) 
		* [Transport](../ServiceProviders/Transport.md) 
* sendMessageTo(List<String> addresses, Message message)
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* constructSmtpMailFromCommand(Address[] from, boolean is8bitEncodingAllowed)
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* writeLine(String s, boolean sensitive)
	* Controllers: 
		* [Pop3Folder](../Controllers/Pop3Folder.md) 
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* saslAuthLogin()
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* saslAuthPlain()
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
		* [ImapConnection](../ServiceProviders/ImapConnection.md)
* saslAuthCramMD5()
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* saslXoauth2()
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md)
* handleTemporaryFailure(String username, NegativeSmtpReplyException negativeResponseFromOldToken)
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md)
* attemptXoauth2(String username)
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md)
* saslAuthExternal()
	* Service Providers: 
		* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
		* [ImapConnection](../ServiceProviders/ImapConnection.md) 
