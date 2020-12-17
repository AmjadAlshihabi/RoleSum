# CoreReceiver
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getWakeLock(Context context)
	* [CoreReceiver](../ServiceProviders/CoreReceiver.md) has a role type of Service Provider
* receive(Context context, Intent intent, Integer wakeLockId)
	* [BootReceiver](../ServiceProviders/BootReceiver.md) has a role type of Service Provider
	* [CoreReceiver](../ServiceProviders/CoreReceiver.md) has a role type of Service Provider
	* [RemoteControlReceiver](../ServiceProviders/RemoteControlReceiver.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* onReceive(Context context, Intent intent)
	* [MessageListWidgetProvider](../Controllers/MessageListWidgetProvider.md) has a role type of Controller
	* [CoreReceiver](../ServiceProviders/CoreReceiver.md) has a role type of Service Provider
	* [ShutdownReceiver](../ServiceProviders/ShutdownReceiver.md) has a role type of Service Provider
	* [StorageGoneReceiver](../ServiceProviders/StorageGoneReceiver.md) has a role type of Service Provider
	* [StorageReceiver](../ServiceProviders/StorageReceiver.md) has a role type of Service Provider
	* [AccountReceiver](../ServiceProviders/AccountReceiver.md) has a role type of Service Provider
	* [AttachmentTempFileProviderCleanupReceiver](../ServiceProviders/AttachmentTempFileProviderCleanupReceiver.md) has a role type of Service Provider
	* [DecryptedFileProviderCleanupReceiver](../ServiceProviders/DecryptedFileProviderCleanupReceiver.md) has a role type of Service Provider
	* [DeviceIdleReceiver](../Coordinators/DeviceIdleReceiver.md) has a role type of Coordinator
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [UpgradeDatabaseBroadcastReceiver](../Controllers/UpgradeDatabaseBroadcastReceiver.md) has a role type of Controller
* onReceive(Context context, Intent intent)
	* [MessageListWidgetProvider](../Controllers/MessageListWidgetProvider.md) has a role type of Controller
	* [CoreReceiver](../ServiceProviders/CoreReceiver.md) has a role type of Service Provider
	* [ShutdownReceiver](../ServiceProviders/ShutdownReceiver.md) has a role type of Service Provider
	* [StorageGoneReceiver](../ServiceProviders/StorageGoneReceiver.md) has a role type of Service Provider
	* [StorageReceiver](../ServiceProviders/StorageReceiver.md) has a role type of Service Provider
	* [AccountReceiver](../ServiceProviders/AccountReceiver.md) has a role type of Service Provider
	* [AttachmentTempFileProviderCleanupReceiver](../ServiceProviders/AttachmentTempFileProviderCleanupReceiver.md) has a role type of Service Provider
	* [DecryptedFileProviderCleanupReceiver](../ServiceProviders/DecryptedFileProviderCleanupReceiver.md) has a role type of Service Provider
	* [DeviceIdleReceiver](../Coordinators/DeviceIdleReceiver.md) has a role type of Coordinator
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [UpgradeDatabaseBroadcastReceiver](../Controllers/UpgradeDatabaseBroadcastReceiver.md) has a role type of Controller
* releaseWakeLock(Context context, int wakeLockId)
	* [CoreReceiver](../ServiceProviders/CoreReceiver.md) has a role type of Service Provider
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
* releaseWakeLock(Context context, int wakeLockId)
	* [CoreReceiver](../ServiceProviders/CoreReceiver.md) has a role type of Service Provider
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
