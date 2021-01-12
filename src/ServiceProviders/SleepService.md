# SleepService
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* sleep(Context context, long sleepTime, TracingWakeLock wakeLock, long wakeLockTimeout)
	* [PushReceiver](../ServiceProviders/PushReceiver.md) has a role type of Service Provider
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [SleepService](../ServiceProviders/SleepService.md) has a role type of Service Provider
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* endSleep(Integer id)
	* [SleepService](../ServiceProviders/SleepService.md) has a role type of Service Provider
* reacquireWakeLock(SleepDatum sleepDatum)
	* [SleepService](../ServiceProviders/SleepService.md) has a role type of Service Provider
* startService(Intent intent, int startId)
	* [BootReceiver](../ServiceProviders/BootReceiver.md) has a role type of Service Provider
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
	* [PollService](../ServiceProviders/PollService.md) has a role type of Service Provider
	* [PushService](../ServiceProviders/PushService.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [RemoteControlService](../Controllers/RemoteControlService.md) has a role type of Controller
	* [SleepService](../ServiceProviders/SleepService.md) has a role type of Service Provider
	* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
	* [UpgradeDatabases](../Coordinators/UpgradeDatabases.md) has a role type of Coordinator
