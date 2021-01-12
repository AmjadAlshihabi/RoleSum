# ImapConnection
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* open()
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [Transport](../ServiceProviders/Transport.md) has a role type of Service Provider
	* [WebDavTransport](../ServiceProviders/WebDavTransport.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
	* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
* handleSslException(SSLException e)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* handleConnectException(ConnectException e)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* isConnected()
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
* adjustDNSCacheTTL()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* connect()
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* setUpStreamsAndParserFromSocket()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* readInitialResponse()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* extractCapabilities(List<ImapResponse> responses)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* extractOrRequestCapabilities(List<ImapResponse> responses)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* requestCapabilitiesIfNecessary()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* requestCapabilities()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* upgradeToTlsIfNecessary()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* upgradeToTls()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* handlePermanentXoauth2Failure(NegativeImapResponseException e)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* handleXOAuthUntaggedResponse(ImapResponse response)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* authCramMD5()
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* saslAuthPlainWithLoginFallback()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* saslAuthPlain()
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* login()
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* saslAuthExternal()
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* handleAuthenticationFailure(NegativeImapResponseException e)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* enableCompressionIfRequested()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* enableCompression()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* retrievePathPrefixIfNecessary()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* handleNamespace()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* retrievePathDelimiterIfNecessary()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* retrievePathDelimiter()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* isListResponse(ImapResponse response)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* hasCapability(String capability)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
* isCondstoreCapable()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* isIdleCapable()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
* isUidPlusCapable()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
* close()
	* [DefaultBodyFactory](../ServiceProviders/DefaultBodyFactory.md) has a role type of Service Provider
	* [Folder](../Structurers/Folder.md) has a role type of Structurer
	* [Transport](../ServiceProviders/Transport.md) has a role type of Service Provider
	* [WebDavTransport](../ServiceProviders/WebDavTransport.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [IdleStopper](../ServiceProviders/IdleStopper.md) has a role type of Service Provider
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [BinaryTempFileBodyInputStream](../ServiceProviders/BinaryTempFileBodyInputStream.md) has a role type of Service Provider
	* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
	* [SignSafeOutputStream](../ServiceProviders/SignSafeOutputStream.md) has a role type of Service Provider
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [ColorChip](../Coordinators/ColorChip.md) has a role type of Coordinator
	* [QueryHandler](../ServiceProviders/QueryHandler.md) has a role type of Service Provider
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [MonitoredCursor](../ServiceProviders/MonitoredCursor.md) has a role type of Service Provider
	* [ThrottlingQueryHandler](../ServiceProviders/ThrottlingQueryHandler.md) has a role type of Service Provider
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [BinaryAttachmentBody](../ServiceProviders/BinaryAttachmentBody.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [FileBackedBody](../InformationHolders/FileBackedBody.md) has a role type of Information Holder
	* [StorageListener](../Structurers/StorageListener.md) has a role type of Structurer
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo46](../ServiceProviders/MigrationTo46.md) has a role type of Service Provider
	* [MigrationTo47](../ServiceProviders/MigrationTo47.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [FileHelper](../ServiceProviders/FileHelper.md) has a role type of Service Provider
	* [MergeCursor](../ServiceProviders/MergeCursor.md) has a role type of Service Provider
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) has a role type of Service Provider
	* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderInfoHolder](../InformationHolders/FolderInfoHolder.md) has a role type of Information Holder
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
* getOutputStream()
	* [DefaultBodyFactory](../ServiceProviders/DefaultBodyFactory.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) has a role type of Service Provider
* getLogId()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
* executeSimpleCommand(String command, boolean sensitive)
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
* executeSimpleCommand(String command, boolean sensitive)
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
* executeCommandWithIdSet(String commandPrefix, String commandSuffix, Set<Long> ids)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
* readStatusResponse(String tag, String commandToLog, UntaggedHandler untaggedHandler)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* sendSaslIrCommand(String command, String initialClientResponse, boolean sensitive)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* sendCommand(String command, boolean sensitive)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
* sendContinuation(String continuation)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [IdleStopper](../ServiceProviders/IdleStopper.md) has a role type of Service Provider
* readResponse(ImapResponseCallback callback)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* readResponse(ImapResponseCallback callback)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* setReadTimeout(int millis)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [IdleStopper](../ServiceProviders/IdleStopper.md) has a role type of Service Provider
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
* readContinuationResponse(String tag)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* connectToAddress(InetAddress address)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* connectToAddress(InetAddress address)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* configureSocket()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* setUpStreamsAndParser(InputStream input, OutputStream output)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* startTLS()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* authenticate()
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* authXoauth2withSASLIR()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* handleTemporaryXoauth2Failure(NegativeImapResponseException e)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* attemptXOAuth2()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* shouldEnableCompression()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* getLineLengthLimit()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* getLineLengthLimit()
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
