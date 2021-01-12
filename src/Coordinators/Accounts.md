# Accounts
### This Coordinator is responsible for delegating work between the following objects: 
* [BaseAccount](../InformationHolders/BaseAccount.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) has a role type of Service Provider
* [ImportResults](../InformationHolders/ImportResults.md) has a role type of Information Holder
* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
* [MonitoredCursor](../ServiceProviders/MonitoredCursor.md) has a role type of Service Provider
* [ActionModeCallback](../Interfacers/ActionModeCallback.md) has a role type of Interfacer
* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* [AccountsAdapter](../Interfacers/AccountsAdapter.md) has a role type of Interfacer
* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* [BaseAccount](../InformationHolders/BaseAccount.md) has a role type of Information Holder
* [BaseAccount](../InformationHolders/BaseAccount.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [AccountsImportedDialog](../Coordinators/AccountsImportedDialog.md) has a role type of Coordinator
* [ExportAsyncTask](../ServiceProviders/ExportAsyncTask.md) has a role type of Service Provider
* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) has a role type of Service Provider
* [ImportSelectionDialog](../Interfacers/ImportSelectionDialog.md) has a role type of Interfacer
* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) has a role type of Service Provider
* [MoveAccountAsyncTask](../ServiceProviders/MoveAccountAsyncTask.md) has a role type of Service Provider
* [SimpleDialog](../Coordinators/SimpleDialog.md) has a role type of Coordinator
* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) has a role type of Interfacer
* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
* [NonConfigurationInstance](../ServiceProviders/NonConfigurationInstance.md) has a role type of Service Provider
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) has a role type of Service Provider
* [ImportContents](../InformationHolders/ImportContents.md) has a role type of Information Holder
### the onOpenAccount method receives requests from:
* [Accounts](../Coordinators/Accounts.md) 
### and delegate the request to: 
* [BaseAccount](../InformationHolders/BaseAccount.md) 


### the onClear method receives requests from:
* [Accounts](../Coordinators/Accounts.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the onEmptyTrash method receives requests from:
* [Accounts](../Coordinators/Accounts.md) 
* [FolderList](../Interfacers/FolderList.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the showAccountsImportedDialog method receives requests from:
* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) 
* [Accounts](../Coordinators/Accounts.md) 
### and delegate the request to: 
* [ImportResults](../InformationHolders/ImportResults.md) 


### the onMove method receives requests from:
* [MessageViewFragment](../Interfacers/MessageViewFragment.md) 
* [MonitoredCursor](../ServiceProviders/MonitoredCursor.md) 
* [ActionModeCallback](../Interfacers/ActionModeCallback.md) 
* [MessageListFragment](../Interfacers/MessageListFragment.md) 
* [Accounts](../Coordinators/Accounts.md) 
* [MessageList](../Interfacers/MessageList.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the onDeleteAccount method receives requests from:
* [Accounts](../Coordinators/Accounts.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the createUnreadSearch method receives requests from:
* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) 
* [AccountsAdapter](../Interfacers/AccountsAdapter.md) 
* [Accounts](../Coordinators/Accounts.md) 
* [FolderListAdapter](../Interfacers/FolderListAdapter.md) 
### and delegate the request to: 
* [BaseAccount](../InformationHolders/BaseAccount.md) 


### the accountLocation method receives requests from:
* [Accounts](../Coordinators/Accounts.md) 
### and delegate the request to: 
* [BaseAccount](../InformationHolders/BaseAccount.md) 


### the onCheckMail method receives requests from:
* [Accounts](../Coordinators/Accounts.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the onExport method receives requests from:
* [Accounts](../Coordinators/Accounts.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the setNonConfigurationInstance method receives requests from:
* [AccountsImportedDialog](../Coordinators/AccountsImportedDialog.md) 
* [ExportAsyncTask](../ServiceProviders/ExportAsyncTask.md) 
* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) 
* [ImportSelectionDialog](../Interfacers/ImportSelectionDialog.md) 
* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) 
* [MoveAccountAsyncTask](../ServiceProviders/MoveAccountAsyncTask.md) 
* [SimpleDialog](../Coordinators/SimpleDialog.md) 
* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) 
* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) 
* [Accounts](../Coordinators/Accounts.md) 
### and delegate the request to: 
* [NonConfigurationInstance](../ServiceProviders/NonConfigurationInstance.md) 


### the onClearCommands method receives requests from:
* [Accounts](../Coordinators/Accounts.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the onActivateAccount method receives requests from:
* [Accounts](../Coordinators/Accounts.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the onRecreate method receives requests from:
* [Accounts](../Coordinators/Accounts.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the onEditAccount method receives requests from:
* [Accounts](../Coordinators/Accounts.md) 
* [FolderList](../Interfacers/FolderList.md) 
* [MessageList](../Interfacers/MessageList.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the showImportSelectionDialog method receives requests from:
* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) 
* [Accounts](../Coordinators/Accounts.md) 
### and delegate the request to: 
* [ImportContents](../InformationHolders/ImportContents.md) 


