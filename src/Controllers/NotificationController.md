# NotificationController
## This Controller is responsible for:
* [MessagingController](../Controllers/MessagingController.md) (Controller)
* [BaseNotifications](../Coordinators/BaseNotifications.md) (Coordinator)
* [SendFailedNotifications](../Coordinators/SendFailedNotifications.md) (Coordinator)
* [AuthenticationErrorNotifications](../Coordinators/AuthenticationErrorNotifications.md) (Coordinator)
* [LockScreenNotification](../Coordinators/LockScreenNotification.md) (Coordinator)
* [SyncNotifications](../Coordinators/SyncNotifications.md) (Coordinator)
* [CertificateErrorNotifications](../Coordinators/CertificateErrorNotifications.md) (Coordinator)
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) (Coordinator)
### controlling tasks with the following methods 
* clearAuthenticationErrorNotification(Account account, boolean incoming)
* platformSupportsLockScreenNotifications()
* clearSendFailedNotification(Account account)
* getContext()
* newInstance(Context context)
