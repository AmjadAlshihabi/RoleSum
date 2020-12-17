# MessagingControllerPushReceiver
### This Coordinator is responsible for delegating work between the following objects: 
* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
* [SleepService](../ServiceProviders/SleepService.md) has a role type of Service Provider
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [TracingWakeLock](../ServiceProviders/TracingWakeLock.md) has a role type of Service Provider
* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [Folder](../Structurers/Folder.md) has a role type of Structurer
* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
* [Folder](../Structurers/Folder.md) has a role type of Structurer
* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
* [Folder](../Structurers/Folder.md) has a role type of Structurer
* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
* [Folder](../Structurers/Folder.md) has a role type of Structurer
### the sleep method receives requests from:
* [PushReceiver](../ServiceProviders/PushReceiver.md) 
* [PushRunnable](../Controllers/PushRunnable.md) 
* [SleepService](../ServiceProviders/SleepService.md) 
* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) 
* [MessagingController](../Controllers/MessagingController.md) 
### and delegate the request to: 
* [TracingWakeLock](../ServiceProviders/TracingWakeLock.md) 


### the messagesArrived method receives requests from:
* [PushReceiver](../ServiceProviders/PushReceiver.md) 
* [PushRunnable](../Controllers/PushRunnable.md) 
* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) 
* [MessagingController](../Controllers/MessagingController.md) 
### and delegate the request to: 
* [Folder](../Structurers/Folder.md) 


### the messagesRemoved method receives requests from:
* [PushReceiver](../ServiceProviders/PushReceiver.md) 
* [PushRunnable](../Controllers/PushRunnable.md) 
* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) 
### and delegate the request to: 
* [Folder](../Structurers/Folder.md) 


### the syncFolder method receives requests from:
* [PushReceiver](../ServiceProviders/PushReceiver.md) 
* [PushRunnable](../Controllers/PushRunnable.md) 
* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) 
### and delegate the request to: 
* [Folder](../Structurers/Folder.md) 


### the messagesFlagsChanged method receives requests from:
* [PushReceiver](../ServiceProviders/PushReceiver.md) 
* [PushRunnable](../Controllers/PushRunnable.md) 
* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) 
### and delegate the request to: 
* [Folder](../Structurers/Folder.md) 


