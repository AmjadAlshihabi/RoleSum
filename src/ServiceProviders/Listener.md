# Listener
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* wakeLockAcquire()
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [PollService](../ServiceProviders/PollService.md) has a role type of Service Provider
* wakeLockRelease()
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
* checkMailStarted(Context context, Account account)
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* synchronizeMailboxFinished(
            Account account,
            String folder,
            int totalMessagesInMailbox,
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
* release()
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [TracingWakeLock](../ServiceProviders/TracingWakeLock.md) has a role type of Service Provider
	* [CoreReceiver](../ServiceProviders/CoreReceiver.md) has a role type of Service Provider
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [SleepService](../ServiceProviders/SleepService.md) has a role type of Service Provider
	* [MonitoredCursor](../ServiceProviders/MonitoredCursor.md) has a role type of Service Provider
	* [ThrottlingQueryHandler](../ServiceProviders/ThrottlingQueryHandler.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* checkMailFinished(Context context, Account account)
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getStartId()
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
* setStartId(int startId)
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [PollService](../ServiceProviders/PollService.md) has a role type of Service Provider
