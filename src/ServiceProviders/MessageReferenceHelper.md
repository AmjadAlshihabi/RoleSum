# MessageReferenceHelper
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* toMessageReferenceList(List<String> messageReferenceStrings)
	* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
	* [MessageReferenceHelper](../ServiceProviders/MessageReferenceHelper.md) has a role type of Service Provider
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
* toMessageReferenceStringList(List<MessageReference> messageReferences)
	* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
	* [MessageReferenceHelper](../ServiceProviders/MessageReferenceHelper.md) has a role type of Service Provider
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
