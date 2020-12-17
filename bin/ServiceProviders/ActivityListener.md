# ActivityListener
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* onResume(Context context)
	* [MessageCryptoPresenter](../Controllers/MessageCryptoPresenter.md) has a role type of Controller
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [AccountList](../Interfacers/AccountList.md) has a role type of Interfacer
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ChooseIdentity](../Interfacers/ChooseIdentity.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [K9ListActivity](../Interfacers/K9ListActivity.md) has a role type of Interfacer
	* [ManageIdentities](../Interfacers/ManageIdentities.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [UpgradeDatabases](../Coordinators/UpgradeDatabases.md) has a role type of Coordinator
* onPause(Context context)
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [UpgradeDatabases](../Coordinators/UpgradeDatabases.md) has a role type of Coordinator
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
* informUserOfStatus()
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* searchStats(AccountStats stats)
	* [MessageInfoHolderRetrieverListener](../Structurers/MessageInfoHolderRetrieverListener.md) has a role type of Structurer
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* systemStatusChanged()
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* folderStatusChanged(Account account, String folder, int unreadMessageCount)
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* getOperation(Context context)
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
* getActionInProgressOperation(Context context)
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
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
* synchronizeMailboxHeadersFinished(Account account, String folder, int total, int completed)
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
* pendingCommandsProcessing(Account account)
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
* pendingCommandStarted(Account account, String commandTitle)
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
* getFolderCompleted()
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
* getFolderTotal()
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
