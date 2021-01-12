# AccountStats
## This Information Holder is responsible for:
### providing and holding information about: 
* serialVersionUID
* size
* available
* unreadMessageCount
* flaggedMessageCount
### Providing information to the following objects 
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [UnreadQueryHandler](../ServiceProviders/UnreadQueryHandler.md) has a role type of Service Provider
* [UnreadWidgetProperties](../Coordinators/UnreadWidgetProperties.md) has a role type of Coordinator
* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
* [AccountsAdapter](../Interfacers/AccountsAdapter.md) has a role type of Interfacer
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
