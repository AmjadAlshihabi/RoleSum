# SimpleMessagingListener
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* searchStats(AccountStats stats)
	* [MessageInfoHolderRetrieverListener](../Structurers/MessageInfoHolderRetrieverListener.md) has a role type of Structurer
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* accountStatusChanged(BaseAccount account, AccountStats stats)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* accountSizeChanged(Account account, long oldSize, long newSize)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
* listFoldersStarted(Account account)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* listFolders(Account account, List<LocalFolder> folders)
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* listFoldersFinished(Account account)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* listFoldersFailed(Account account, String message)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* listLocalMessagesAddMessages(Account account, String folder, List<LocalMessage> messages)
	* [MessageInfoHolderRetrieverListener](../Structurers/MessageInfoHolderRetrieverListener.md) has a role type of Structurer
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* synchronizeMailboxStarted(Account account, String folder)
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* synchronizeMailboxHeadersStarted(Account account, String folder)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* synchronizeMailboxHeadersProgress(Account account, String folder, int completed, int total)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* synchronizeMailboxHeadersFinished(Account account, String folder, int totalMessagesInMailbox,
            int numNewMessages)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* synchronizeMailboxProgress(Account account, String folder, int completed, int total)
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* synchronizeMailboxNewMessage(Account account, String folder, Message message)
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* synchronizeMailboxRemovedMessage(Account account, String folder, Message message)
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* synchronizeMailboxFinished(Account account, String folder, int totalMessagesInMailbox,
            int numNewMessages)
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* synchronizeMailboxFailed(Account account, String folder, String message)
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* loadMessageRemoteFinished(Account account, String folder, String uid)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
* loadMessageRemoteFailed(Account account, String folder, String uid, Throwable t)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
* checkMailStarted(Context context, Account account)
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* checkMailFinished(Context context, Account account)
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* sendPendingMessagesStarted(Account account)
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* sendPendingMessagesCompleted(Account account)
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* sendPendingMessagesFailed(Account account)
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* emptyTrashCompleted(Account account)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* folderStatusChanged(Account account, String folderName, int unreadMessageCount)
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* systemStatusChanged()
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* messageDeleted(Account account, String folder, Message message)
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* messageUidChanged(Account account, String folder, String oldUid, String newUid)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setPushActive(Account account, String folderName, boolean enabled)
	* [PushReceiver](../ServiceProviders/PushReceiver.md) has a role type of Service Provider
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* loadAttachmentFinished(Account account, Message message, Part part)
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* loadAttachmentFailed(Account account, Message message, Part part, String reason)
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* pendingCommandStarted(Account account, String commandTitle)
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* pendingCommandsProcessing(Account account)
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* pendingCommandCompleted(Account account, String commandTitle)
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* pendingCommandsFinished(Account account)
	* [MemorizingMessagingListener](../Controllers/MemorizingMessagingListener.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* remoteSearchStarted(String folder)
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MessageListFragmentListener](../ServiceProviders/MessageListFragmentListener.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* remoteSearchServerQueryComplete(String folderName, int numResults, int maxResults)
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* remoteSearchFinished(String folder, int numResults, int maxResults, List<Message> extraResults)
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MessageListHandler](../Interfacers/MessageListHandler.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* remoteSearchFailed(String folder, String err)
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* enableProgressIndicator(boolean enable)
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* updateProgress(int progress)
	* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) has a role type of Interfacer
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [ProgressListener](../Interfacers/ProgressListener.md) has a role type of Interfacer
	* [ProgressBodyFactory](../Coordinators/ProgressBodyFactory.md) has a role type of Coordinator
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
