# NotificationActionCreator
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* createViewMessagePendingIntent(MessageReference messageReference, int notificationId)
	* [BaseNotifications](../Coordinators/BaseNotifications.md) has a role type of Coordinator
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* createViewFolderPendingIntent(Account account, String folderName, int notificationId)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [SyncNotifications](../Coordinators/SyncNotifications.md) has a role type of Coordinator
* createViewMessagesPendingIntent(Account account, List<MessageReference> messageReferences,
            int notificationId)
	* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* createViewFolderListPendingIntent(Account account, int notificationId)
	* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [SendFailedNotifications](../Coordinators/SendFailedNotifications.md) has a role type of Coordinator
* createDeleteMessagePendingIntent(MessageReference messageReference, int notificationId)
	* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
* createDeleteAllPendingIntent(Account account, List<MessageReference> messageReferences,
            int notificationId)
	* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* getDeleteAllPendingIntent(Account account, List<MessageReference> messageReferences,
            int notificationId)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
* getFolderNameOfAllMessages(List<MessageReference> messageReferences)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* skipFolderListInBackStack(Account account, String folderName)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* createDismissAllMessagesPendingIntent(Account account, int notificationId)
	* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* createDismissMessagePendingIntent(Context context, MessageReference messageReference,
            int notificationId)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
* createReplyPendingIntent(MessageReference messageReference, int notificationId)
	* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
* createMarkMessageAsReadPendingIntent(MessageReference messageReference, int notificationId)
	* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
* createMarkAllAsReadPendingIntent(Account account, List<MessageReference> messageReferences,
            int notificationId)
	* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* getMarkAllAsReadPendingIntent(Account account, List<MessageReference> messageReferences,
            int notificationId)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
* getMarkAsReadPendingIntent(Account account, List<MessageReference> messageReferences,
            int notificationId, Context context, int flags)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* createDeleteServicePendingIntent(MessageReference messageReference, int notificationId)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* createDeleteConfirmationPendingIntent(MessageReference messageReference, int notificationId)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* getDeleteAllConfirmationPendingIntent(List<MessageReference> messageReferences,
            int notificationId, int flags)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* getDeleteAllServicePendingIntent(Account account, List<MessageReference> messageReferences,
            int notificationId, int flags)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* createArchiveMessagePendingIntent(MessageReference messageReference, int notificationId)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
* createArchiveAllPendingIntent(Account account, List<MessageReference> messageReferences,
            int notificationId)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
* createMarkMessageAsSpamPendingIntent(MessageReference messageReference, int notificationId)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
* buildAccountsBackStack()
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* buildFolderListBackStack(Account account)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* buildUnreadBackStack(final Account account)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* buildMessageListBackStack(Account account, String folderName)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* buildMessageViewBackStack(MessageReference message)
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* skipAccountsInBackStack()
	* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
