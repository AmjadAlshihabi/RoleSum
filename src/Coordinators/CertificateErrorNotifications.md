# CertificateErrorNotifications
### This Coordinator is responsible for delegating work between the following objects: 
* [AuthenticationErrorNotifications](../Coordinators/AuthenticationErrorNotifications.md) has a role type of Coordinator
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [NotificationController](../Controllers/NotificationController.md) has a role type of Controller
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [NotificationController](../Controllers/NotificationController.md) has a role type of Controller
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
### the createContentIntent method receives requests from:
* [AuthenticationErrorNotifications](../Coordinators/AuthenticationErrorNotifications.md) 
* [CertificateErrorNotifications](../Coordinators/CertificateErrorNotifications.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the clearCertificateErrorNotifications method receives requests from:
* [CertificateErrorNotifications](../Coordinators/CertificateErrorNotifications.md) 
* [NotificationController](../Controllers/NotificationController.md) 
* [MessagingController](../Controllers/MessagingController.md) 
* [CheckAccountTask](../Coordinators/CheckAccountTask.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the showCertificateErrorNotification method receives requests from:
* [CertificateErrorNotifications](../Coordinators/CertificateErrorNotifications.md) 
* [NotificationController](../Controllers/NotificationController.md) 
* [MessagingController](../Controllers/MessagingController.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


