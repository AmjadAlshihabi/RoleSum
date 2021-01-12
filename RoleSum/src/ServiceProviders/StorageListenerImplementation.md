# StorageListenerImplementation
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* onUnmount(String providerId)
	* [StorageListener](../Structurers/StorageListener.md) has a role type of Structurer
	* [StorageListener](../Structurers/StorageListener.md) has a role type of Structurer
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [StorageListenerImplementation](../ServiceProviders/StorageListenerImplementation.md) has a role type of Service Provider
* onMount(String providerId)
	* [StorageReceiver](../ServiceProviders/StorageReceiver.md) has a role type of Service Provider
	* [StorageListener](../Structurers/StorageListener.md) has a role type of Structurer
	* [StorageListener](../Structurers/StorageListener.md) has a role type of Structurer
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [StorageListenerImplementation](../ServiceProviders/StorageListenerImplementation.md) has a role type of Service Provider
