# NoOpDeviceIdleManager
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* registerReceiver()
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
	* [NoOpDeviceIdleManager](../ServiceProviders/NoOpDeviceIdleManager.md) has a role type of Service Provider
	* [RealDeviceIdleManager](../ServiceProviders/RealDeviceIdleManager.md) has a role type of Service Provider
	* [DeviceIdleManager](../ServiceProviders/DeviceIdleManager.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [UpgradeDatabases](../Coordinators/UpgradeDatabases.md) has a role type of Coordinator
* unregisterReceiver()
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
	* [NoOpDeviceIdleManager](../ServiceProviders/NoOpDeviceIdleManager.md) has a role type of Service Provider
	* [RealDeviceIdleManager](../ServiceProviders/RealDeviceIdleManager.md) has a role type of Service Provider
	* [DeviceIdleManager](../ServiceProviders/DeviceIdleManager.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [UpgradeDatabases](../Coordinators/UpgradeDatabases.md) has a role type of Coordinator
