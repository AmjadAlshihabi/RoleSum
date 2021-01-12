# IdleStopper
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* startAcceptingDoneContinuation(ImapConnection connection)
	* [IdleStopper](../ServiceProviders/IdleStopper.md) has a role type of Service Provider
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
* stopAcceptingDoneContinuation()
	* [IdleStopper](../ServiceProviders/IdleStopper.md) has a role type of Service Provider
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
* stopIdle()
	* [IdleStopper](../ServiceProviders/IdleStopper.md) has a role type of Service Provider
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
* sendDone()
	* [IdleStopper](../ServiceProviders/IdleStopper.md) has a role type of Service Provider
