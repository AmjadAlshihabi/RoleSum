# MessagingController
### This Controller is responsible for controlling tasks and making functional decision. 
### A list of tasks and used objects in each task: 

 * synchronizeMailboxSynchronous(final Account account, final String folder, final MessagingListener listener,
            Folder providedRemoteFolder)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
		* [MoreMessages](../InformationHolders/MoreMessages.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * sendPendingMessagesSynchronous(final Account account)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
		* [TransportProvider](../ServiceProviders/TransportProvider.md) 
	* Structurers: 
		* [FetchProfile](../Structurers/FetchProfile.md) 

 * downloadMessages(final Account account, final Folder remoteFolder,
            final LocalFolder localFolder, List<Message> inputMessages,
            boolean flagSyncOnly, boolean purgeToVisibleLimit)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [AccountStats](../InformationHolders/AccountStats.md) 
	* Structurers: 
		* [FetchProfile](../Structurers/FetchProfile.md) 
		* [Folder](../Structurers/Folder.md) 

 * processPendingAppend(PendingAppend command, Account account)
	* Coordinators: 
		* [PendingAppend](../Coordinators/PendingAppend.md) 
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [FetchProfile](../Structurers/FetchProfile.md) 
		* [Message](../Structurers/Message.md) 
		* [Folder](../Structurers/Folder.md) 

 * processPendingMoveOrCopy(PendingMoveOrCopy command, Account account)
	* Coordinators: 
		* [PendingMoveOrCopy](../Coordinators/PendingMoveOrCopy.md) 
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
		* [Folder](../Structurers/Folder.md) 

 * moveOrCopyMessageSynchronous(final Account account, final String srcFolder,
            final List<? extends Message> inMessages, final String destFolder, final boolean isCopy)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [FetchProfile](../Structurers/FetchProfile.md) 
		* [Message](../Structurers/Message.md) 
		* [Folder](../Structurers/Folder.md) 

 * setupPushing(final Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Service Providers: 
		* [PushReceiver](../ServiceProviders/PushReceiver.md) 
		* [Pusher](../ServiceProviders/Pusher.md) 

 * deleteMessagesSynchronous(final Account account, final String folder,
            final List<? extends Message> messages,
            MessagingListener listener)
	* Coordinators: 
		* [PendingCommand](../Coordinators/PendingCommand.md) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * checkMailForAccount(final Context context, final Account account,
            final boolean ignoreLastCheckedTime,
            final MessagingListener listener)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
		* [AccountStats](../InformationHolders/AccountStats.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * loadMessageRemoteSynchronous(final Account account, final String folder,
            final String uid, final MessagingListener listener, final boolean loadPartialFromSearch)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [FetchProfile](../Structurers/FetchProfile.md) 
		* [Message](../Structurers/Message.md) 
		* [Folder](../Structurers/Folder.md) 

 * messagesArrived(final Account account, final Folder remoteFolder, final List<Message> messages,
            final boolean flagSyncOnly)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * processPendingCommandsSynchronous(Account account)
	* Coordinators: 
		* [PendingCommand](../Coordinators/PendingCommand.md) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * getSearchAccountStatsSynchronous(final SearchAccount searchAccount,
            final MessagingListener listener)
	* Coordinators: 
		* [SearchAccount](../Coordinators/SearchAccount.md) 
	* Information Holders: 
		* [AccountStats](../InformationHolders/AccountStats.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
	* Structurers: 
		* [ConditionsTreeNode](../Structurers/ConditionsTreeNode.md) 
		* [LocalSearch](../Structurers/LocalSearch.md) 
		* [Preferences](../Structurers/Preferences.md) 

 * refreshRemoteSynchronous(final Account account, final MessagingListener listener)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * searchRemoteMessagesSynchronous(final String acctUuid, final String folderName, final String query,
            final Set<Flag> requiredFlags, final Set<Flag> forbiddenFlags, final MessagingListener listener)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * checkMail(final Context context, final Account account,
            final boolean ignoreLastCheckedTime,
            final boolean useManualWakeLock,
            final MessagingListener listener)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [TracingPowerManager](../ServiceProviders/TracingPowerManager.md) 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [TracingWakeLock](../ServiceProviders/TracingWakeLock.md) 
	* Structurers: 
		* [Preferences](../Structurers/Preferences.md) 

 * setFlagSynchronous(final Account account, final List<Long> ids,
            final Flag flag, final boolean newState, final boolean threadedList)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [Flag](../InformationHolders/Flag.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * shouldNotifyForMessage(Account account, LocalFolder localFolder, Message message)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
		* [Folder](../Structurers/Folder.md) 

 * evaluateMessageForDownload(final Message message, final String folder,
            final LocalFolder localFolder,
            final Folder remoteFolder,
            final Account account,
            final List<Message> unsyncedMessages,
            final List<Message> syncFlagMessages,
            boolean flagSyncOnly)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
		* [Folder](../Structurers/Folder.md) 

 * loadAttachment(final Account account, final LocalMessage message, final Part part,
            final MessagingListener listener)
	* Coordinators: 
		* [ProgressBodyFactory](../Coordinators/ProgressBodyFactory.md) 
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
		* [Store](../InformationHolders/Store.md) 
	* Service Providers: 
		* [Part](../ServiceProviders/Part.md) 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
		* [Folder](../Structurers/Folder.md) 

 * sendAlternate(Context context, Account account, LocalMessage message)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
	* Service Providers: 
		* [Part](../ServiceProviders/Part.md) 

 * downloadSmallMessages(final Account account, final Folder<T> remoteFolder,
            final LocalFolder localFolder,
            List<T> smallMessages,
            final AtomicInteger progress,
            final int unreadBeforeStart,
            final AtomicInteger newMessages,
            final int todo,
            FetchProfile fp)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
		* [Account](../InformationHolders/Account.md) 
	* Structurers: 
		* [FetchProfile](../Structurers/FetchProfile.md) 

 * refreshLocalMessageFlags(final Account account, final Folder remoteFolder,
            final LocalFolder localFolder,
            List<Message> syncFlagMessages,
            final AtomicInteger progress,
            final int todo
    )
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
		* [Account](../InformationHolders/Account.md) 
		* [MessageReference](../InformationHolders/MessageReference.md) 
	* Structurers: 
		* [FetchProfile](../Structurers/FetchProfile.md) 
		* [Folder](../Structurers/Folder.md) 

 * processPendingMarkAllAsRead(PendingMarkAllAsRead command, Account account)
	* Coordinators: 
		* [PendingMarkAllAsRead](../Coordinators/PendingMarkAllAsRead.md) 
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * emptyTrash(final Account account, MessagingListener listener)
	* Coordinators: 
		* [PendingCommand](../Coordinators/PendingCommand.md) 
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * searchLocalMessagesSynchronous(final LocalSearch search, final MessagingListener listener)
	* Information Holders: 
		* [AccountStats](../InformationHolders/AccountStats.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [LocalSearch](../Structurers/LocalSearch.md) 

 * listFoldersSynchronous(final Account account, final boolean refreshRemote,
            final MessagingListener listener)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * fetchUnsyncedMessages(final Account account, final Folder<T> remoteFolder,
            List<T> unsyncedMessages,
            final List<Message> smallMessages,
            final List<Message> largeMessages,
            final AtomicInteger progress,
            final int todo,
            FetchProfile fp)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Structurers: 
		* [FetchProfile](../Structurers/FetchProfile.md) 

 * downloadLargeMessages(final Account account, final Folder<T> remoteFolder,
            final LocalFolder localFolder,
            List<T> largeMessages,
            final AtomicInteger progress,
            final int unreadBeforeStart,
            final AtomicInteger newMessages,
            final int todo,
            FetchProfile fp)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
		* [Account](../InformationHolders/Account.md) 
	* Structurers: 
		* [FetchProfile](../Structurers/FetchProfile.md) 

 * synchronizeFolder(
            final Account account,
            final Folder folder,
            final boolean ignoreLastCheckedTime,
            final long accountInterval,
            final MessagingListener listener)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * runInBackground()
	* Controllers: 
		* [Command](../Controllers/Command.md) 

 * clear(final Account account, final MessagingListener ml)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [AccountStats](../InformationHolders/AccountStats.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * recreate(final Account account, final MessagingListener ml)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [AccountStats](../InformationHolders/AccountStats.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * loadSearchResults(final Account account, final String folderName, final List<Message> messages,
            final MessagingListener listener)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * processPendingSetFlag(PendingSetFlag command, Account account)
	* Coordinators: 
		* [PendingSetFlag](../Coordinators/PendingSetFlag.md) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
		* [Flag](../InformationHolders/Flag.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * saveDraft(final Account account, final Message message, long existingDraftId, boolean saveRemotely)
	* Coordinators: 
		* [PendingCommand](../Coordinators/PendingCommand.md) 
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 

 * groupMessagesByAccountAndFolder(
            List<MessageReference> messages)

 * compact(final Account account, final MessagingListener ml)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * putCommand(BlockingQueue<Command> queue, String description, MessagingListener listener,
            Runnable runnable, boolean isForeground)
	* Controllers: 
		* [Command](../Controllers/Command.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * processPendingExpunge(PendingExpunge command, Account account)
	* Coordinators: 
		* [PendingExpunge](../Coordinators/PendingExpunge.md) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * loadSearchResultsSynchronous(List<Message> messages, LocalFolder localFolder, Folder remoteFolder,
            MessagingListener listener)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
	* Structurers: 
		* [FetchProfile](../Structurers/FetchProfile.md) 
		* [Folder](../Structurers/Folder.md) 

 * syncFlags(LocalMessage localMessage, Message remoteMessage)
	* Information Holders: 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 

 * messagesPendingSend(final Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * clearFolderSynchronous(Account account, String folderName, MessagingListener listener)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * loadMessage(Account account, String folderName, String uid)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [FetchProfile](../Structurers/FetchProfile.md) 

 * debugClearMessagesLocally(final List<MessageReference> messages)

 * deleteDraft(final Account account, long id)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [MessageReference](../InformationHolders/MessageReference.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * processPendingEmptyTrash(Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * moveMessagesInThread(Account srcAccount, final String srcFolder,
            final List<MessageReference> messageReferences, final String destFolder)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * sendMessage(final Account account,
            final Message message,
            MessagingListener listener)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 

 * getFolderUnreadMessageCount(final Account account, final String folderName,
            final MessagingListener l)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * moveOrDeleteSentMessage(Account account, LocalStore localStore,
            LocalFolder localFolder, LocalMessage message)
	* Coordinators: 
		* [PendingCommand](../Coordinators/PendingCommand.md) 
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * copyMessagesInThread(Account srcAccount, final String srcFolder,
            final List<MessageReference> messageReferences, final String destFolder)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * getRootCauseMessage(Throwable t)

 * downloadSaneBody(Account account, Folder remoteFolder, LocalFolder localFolder, Message message)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
	* Structurers: 
		* [FetchProfile](../Structurers/FetchProfile.md) 
		* [Message](../Structurers/Message.md) 
		* [Folder](../Structurers/Folder.md) 

 * processPendingCommands(final Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * actOnMessagesGroupedByAccountAndFolder(List<MessageReference> messages, MessageActor actor)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessageActor](../ServiceProviders/MessageActor.md) 

 * collectMessagesInThreads(Account account, List<? extends Message> messages)
	* Information Holders: 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * moveMessages(final Account srcAccount, final String srcFolder,
            List<MessageReference> messageReferences, final String destFolder)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * getAccountStats(final Context context, final Account account,
            final MessagingListener listener)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [AccountStats](../InformationHolders/AccountStats.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * verifyOrCreateRemoteSpecialFolder(Account account, String folder, Folder remoteFolder,
            MessagingListener listener)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * deleteThreads(final List<MessageReference> messages)

 * loadMoreMessages(Account account, String folder, MessagingListener listener)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * deleteMessages(List<MessageReference> messages, final MessagingListener listener)
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * getInstance(Context context)
	* Controllers: 
		* [NotificationController](../Controllers/NotificationController.md) 
	* Service Providers: 
		* [Contacts](../ServiceProviders/Contacts.md) 
		* [TransportProvider](../ServiceProviders/TransportProvider.md) 

 * getId(Message message)
	* Structurers: 
		* [Message](../Structurers/Message.md) 

 * downloadPartial(Folder remoteFolder, LocalFolder localFolder, Message message)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
	* Service Providers: 
		* [BodyFactory](../ServiceProviders/BodyFactory.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
		* [Folder](../Structurers/Folder.md) 

 * copyMessages(final Account srcAccount, final String srcFolder,
            final List<MessageReference> messageReferences, final String destFolder)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * stopAllPushing()
	* Service Providers: 
		* [Pusher](../ServiceProviders/Pusher.md) 

 * updateMoreMessages(Folder remoteFolder, LocalFolder localFolder, Date earliestDate, int remoteStart)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [MoreMessages](../InformationHolders/MoreMessages.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * queueExpunge(final Account account, final String folderName)
	* Coordinators: 
		* [PendingCommand](../Coordinators/PendingCommand.md) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * notifyUserIfCertificateProblem(Account account, Exception exception, boolean incoming)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [CertificateValidationException](../InformationHolders/CertificateValidationException.md) 

 * clearAllPending(final Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * actOnMessageGroup(
            Account account, String folderName, List<MessageReference> messageReferences, MessageActor actor)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessageActor](../ServiceProviders/MessageActor.md) 

 * queueSetFlag(final Account account, final String folderName,
            final boolean newState, final Flag flag, final List<String> uids)
	* Coordinators: 
		* [PendingCommand](../Coordinators/PendingCommand.md) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Flag](../InformationHolders/Flag.md) 

 * searchRemoteMessages(final String acctUuid, final String folderName, final String query,
            final Set<Flag> requiredFlags, final Set<Flag> forbiddenFlags, final MessagingListener listener)
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * queuePendingCommand(Account account, PendingCommand command)
	* Coordinators: 
		* [PendingCommand](../Coordinators/PendingCommand.md) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 

 * setFlag(Account account, String folderName, String uid, Flag flag,
            boolean newState)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
		* [Flag](../InformationHolders/Flag.md) 
	* Service Providers: 
		* [LocalStore](../ServiceProviders/LocalStore.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
		* [Folder](../Structurers/Folder.md) 

 * setCheckMailListener(MessagingListener checkMailListener)
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * deleteThreadsSynchronous(Account account, String folderName, List<? extends Message> messages)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * setFlagForThreads(final Account account, final List<Long> threadRootIds,
            final Flag flag, final boolean newState)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Flag](../InformationHolders/Flag.md) 

 * handleSendFailure(Account account, Store localStore, Folder localFolder, Message message,
            Exception exception, boolean permanentFailure)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
		* [Folder](../Structurers/Folder.md) 

 * getUidsFromMessages(List<? extends Message> messages)

 * loadMessageRemotePartial(final Account account, final String folder,
            final String uid, final MessagingListener listener)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * notifySynchronizeMailboxFailed(Account account, Folder localFolder, Exception exception)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * searchLocalMessages(final LocalSearch search, final MessagingListener listener)
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
	* Structurers: 
		* [LocalSearch](../Structurers/LocalSearch.md) 

 * setFlagForThreadsInCache(final Account account, final List<Long> threadRootIds,
            final Flag flag, final boolean newState)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Flag](../InformationHolders/Flag.md) 
	* Structurers: 
		* [EmailProviderCache](../Structurers/EmailProviderCache.md) 

 * listFolders(final Account account, final boolean refreshRemote, final MessagingListener listener)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * markAllMessagesRead(final Account account, final String folder)
	* Coordinators: 
		* [PendingCommand](../Coordinators/PendingCommand.md) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * setFlagInCache(final Account account, final List<Long> messageIds,
            final Flag flag, final boolean newState)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Flag](../InformationHolders/Flag.md) 
	* Structurers: 
		* [EmailProviderCache](../Structurers/EmailProviderCache.md) 

 * shouldImportMessage(final Account account, final Message message,
            final Date earliestDate)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 

 * isMessageSuppressed(LocalMessage message)
	* Information Holders: 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
	* Structurers: 
		* [EmailProviderCache](../Structurers/EmailProviderCache.md) 

 * synchronizeMailbox(final Account account, final String folder, final MessagingListener listener,
            final Folder providedRemoteFolder)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * expunge(final Account account, final String folder)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * markMessageAsReadOnView(Account account, LocalMessage message)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 

 * getSearchAccountStats(final SearchAccount searchAccount,
            final MessagingListener listener)
	* Coordinators: 
		* [SearchAccount](../Coordinators/SearchAccount.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * clearFolder(final Account account, final String folderName, final ActivityListener listener)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [ActivityListener](../ServiceProviders/ActivityListener.md) 

 * doRefreshRemote(final Account account, final MessagingListener listener)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * loadMessageRemote(final Account account, final String folder,
            final String uid, final MessagingListener listener)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * removeFlagForThreadsFromCache(final Account account, final List<Long> messageIds,
            final Flag flag)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Flag](../InformationHolders/Flag.md) 
	* Structurers: 
		* [EmailProviderCache](../Structurers/EmailProviderCache.md) 

 * removeFlagFromCache(final Account account, final List<Long> messageIds,
            final Flag flag)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Flag](../InformationHolders/Flag.md) 
	* Structurers: 
		* [EmailProviderCache](../Structurers/EmailProviderCache.md) 

 * sendPendingMessages(final Account account,
            MessagingListener listener)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
	* Structurers: 
		* [Preferences](../Structurers/Preferences.md) 

 * stop()

 * queueMoveOrCopy(Account account, String srcFolder, String destFolder,
            boolean isCopy, List<String> uids, Map<String, String> uidMap)
	* Coordinators: 
		* [PendingCommand](../Coordinators/PendingCommand.md) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * moveMessageToDraftsFolder(Account account, Folder localFolder, Store localStore, Message message)
	* Information Holders: 
		* [LocalFolder](../InformationHolders/LocalFolder.md) 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
		* [Folder](../Structurers/Folder.md) 

 * clearFetchingMailNotificationIfNecessary(Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * showSendingNotificationIfNecessary(Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * clearCertificateErrorNotifications(Account account, CheckDirection direction)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [CheckDirection](../InformationHolders/CheckDirection.md) 

 * showFetchingMailNotificationIfNecessary(Account account, Folder folder)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * suppressMessages(Account account, List<LocalMessage> messages)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Structurers: 
		* [EmailProviderCache](../Structurers/EmailProviderCache.md) 

 * deleteAccount(Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * unsuppressMessages(Account account, List<? extends Message> messages)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Structurers: 
		* [EmailProviderCache](../Structurers/EmailProviderCache.md) 

 * clearSendingNotificationIfNecessary(Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * addListener(MessagingListener listener)
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * closeFolder(Folder f)
	* Structurers: 
		* [Folder](../Structurers/Folder.md) 

 * refreshListener(MessagingListener listener)
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * systemStatusChanged()

 * handleAuthenticationFailure(Account account, boolean incoming)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * isTrashLocalOnly(Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * isCopyCapable(final Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
		* [MessageReference](../InformationHolders/MessageReference.md) 

 * getCheckMailListener()

 * modeMismatch(Account.FolderMode aMode, Folder.FolderClass fMode)

 * removeListener(MessagingListener listener)
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * deleteMessage(MessageReference message, final MessagingListener listener)
	* Information Holders: 
		* [MessageReference](../InformationHolders/MessageReference.md) 
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * getPushers()

 * moveMessage(final Account account, final String srcFolder, final MessageReference message,
            final String destFolder)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [MessageReference](../InformationHolders/MessageReference.md) 

 * getListeners(MessagingListener listener)
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * isMoveCapable(final Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Store](../InformationHolders/Store.md) 
		* [MessageReference](../InformationHolders/MessageReference.md) 

 * cancelNotificationsForAccount(Account account)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 

 * cancelNotificationForMessage(Account account, MessageReference messageReference)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [MessageReference](../InformationHolders/MessageReference.md) 

 * copyMessage(final Account account, final String srcFolder, final MessageReference message,
            final String destFolder)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [MessageReference](../InformationHolders/MessageReference.md) 

 * putBackground(String description, MessagingListener listener, Runnable runnable)
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 

 * put(String description, MessagingListener listener, Runnable runnable)
	* Service Providers: 
		* [MessagingListener](../ServiceProviders/MessagingListener.md) 
