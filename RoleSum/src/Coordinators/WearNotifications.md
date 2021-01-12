# WearNotifications
### This Coordinator is responsible for delegating work between the following objects: 
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) has a role type of Coordinator
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
* [NotificationData](../Structurers/NotificationData.md) has a role type of Structurer
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
* [NotificationHolder](../InformationHolders/NotificationHolder.md) has a role type of Information Holder
### the buildStackedNotification method receives requests from:
* [NewMailNotifications](../Coordinators/NewMailNotifications.md) 
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


### the addActions method receives requests from:
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


### the addWearActions method receives requests from:
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


### the isArchiveActionAvailableForWear method receives requests from:
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the addMarkAsSpamAction method receives requests from:
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


### the addDeviceMarkAsReadAction method receives requests from:
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


### the addDeleteAction method receives requests from:
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) 
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


### the addArchiveAllAction method receives requests from:
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationData](../Structurers/NotificationData.md) 


### the addMarkAsReadAction method receives requests from:
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) 
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


### the addDeviceDeleteAction method receives requests from:
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


### the addReplyAction method receives requests from:
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) 
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


### the isMovePossible method receives requests from:
* [NotificationActionService](../Controllers/NotificationActionService.md) 
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the addSummaryActions method receives requests from:
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) 
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationData](../Structurers/NotificationData.md) 


### the addMarkAllAsReadAction method receives requests from:
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) 
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationData](../Structurers/NotificationData.md) 


### the addDeviceActions method receives requests from:
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


### the isSpamActionAvailableForWear method receives requests from:
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the addDeleteAllAction method receives requests from:
* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) 
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationData](../Structurers/NotificationData.md) 


### the addDeviceReplyAction method receives requests from:
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


### the addArchiveAction method receives requests from:
* [WearNotifications](../Coordinators/WearNotifications.md) 
### and delegate the request to: 
* [NotificationHolder](../InformationHolders/NotificationHolder.md) 


