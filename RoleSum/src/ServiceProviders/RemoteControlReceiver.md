# RemoteControlReceiver
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* receive(Context context, Intent intent, Integer tmpWakeLockId)
	* [BootReceiver](../ServiceProviders/BootReceiver.md) has a role type of Service Provider
	* [CoreReceiver](../ServiceProviders/CoreReceiver.md) has a role type of Service Provider
	* [RemoteControlReceiver](../ServiceProviders/RemoteControlReceiver.md) has a role type of Service Provider
