# TracingPowerManager
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getPowerManager(Context context)
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
	* [TracingPowerManager](../ServiceProviders/TracingPowerManager.md) has a role type of Service Provider
	* [CoreReceiver](../ServiceProviders/CoreReceiver.md) has a role type of Service Provider
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* newWakeLock(int flags, String tag)
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
	* [TracingWakeLock](../ServiceProviders/TracingWakeLock.md) has a role type of Service Provider
	* [TracingPowerManager](../ServiceProviders/TracingPowerManager.md) has a role type of Service Provider
	* [CoreReceiver](../ServiceProviders/CoreReceiver.md) has a role type of Service Provider
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
	* [Listener](../ServiceProviders/Listener.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
