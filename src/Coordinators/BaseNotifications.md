# BaseNotifications
### This Coordinator is responsible for delegating work between the following objects: 
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
### the createBigTextStyleNotification method receives requests from:
* [BaseNotifications](../Coordinators/BaseNotifications.md) 
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) 
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


### the createAndInitializeNotificationBuilder method receives requests from:
* [BaseNotifications](../Coordinators/BaseNotifications.md) 
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


