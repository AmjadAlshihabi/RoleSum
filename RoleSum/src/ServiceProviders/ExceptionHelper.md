# ExceptionHelper
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getRootCauseMessage(Throwable t)
	* [SendFailedNotifications](../Coordinators/SendFailedNotifications.md) has a role type of Coordinator
	* [ExceptionHelper](../ServiceProviders/ExceptionHelper.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
