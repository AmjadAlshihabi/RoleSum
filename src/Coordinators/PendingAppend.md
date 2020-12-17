# PendingAppend
### This Coordinator is responsible for delegating work between the following objects: 
* [WebDavHttpClient](../ServiceProviders/WebDavHttpClient.md) has a role type of Service Provider
* [K9](../Controllers/K9.md) has a role type of Controller
* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
* [MailService](../Controllers/MailService.md) has a role type of Controller
* [RemoteControlService](../Controllers/RemoteControlService.md) has a role type of Controller
* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
* [Storage](../Structurers/Storage.md) has a role type of Structurer
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
* [PendingCommand](../Coordinators/PendingCommand.md) has a role type of Coordinator
* [PendingEmptyTrash](../Coordinators/PendingEmptyTrash.md) has a role type of Coordinator
* [PendingExpunge](../Coordinators/PendingExpunge.md) has a role type of Coordinator
* [PendingMarkAllAsRead](../Coordinators/PendingMarkAllAsRead.md) has a role type of Coordinator
* [PendingMoveOrCopy](../Coordinators/PendingMoveOrCopy.md) has a role type of Coordinator
* [PendingSetFlag](../Coordinators/PendingSetFlag.md) has a role type of Coordinator
* [AccountList](../Interfacers/AccountList.md) has a role type of Interfacer
* [ImportSelectionDialog](../Interfacers/ImportSelectionDialog.md) has a role type of Interfacer
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) has a role type of Interfacer
* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
### the execute method receives requests from:
* [WebDavHttpClient](../ServiceProviders/WebDavHttpClient.md) 
* [K9](../Controllers/K9.md) 
* [MessageContainerView](../Interfacers/MessageContainerView.md) 
* [CoreService](../ServiceProviders/CoreService.md) 
* [MailService](../Controllers/MailService.md) 
* [RemoteControlService](../Controllers/RemoteControlService.md) 
* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) 
* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) 
* [EmailProvider](../ServiceProviders/EmailProvider.md) 
* [Storage](../Structurers/Storage.md) 
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* [LocalMessage](../InformationHolders/LocalMessage.md) 
* [LockableDatabase](../ServiceProviders/LockableDatabase.md) 
* [LocalStore](../ServiceProviders/LocalStore.md) 
* [LocalFolder](../InformationHolders/LocalFolder.md) 
* [PendingAppend](../Coordinators/PendingAppend.md) 
* [PendingCommand](../Coordinators/PendingCommand.md) 
* [PendingEmptyTrash](../Coordinators/PendingEmptyTrash.md) 
* [PendingExpunge](../Coordinators/PendingExpunge.md) 
* [PendingMarkAllAsRead](../Coordinators/PendingMarkAllAsRead.md) 
* [PendingMoveOrCopy](../Coordinators/PendingMoveOrCopy.md) 
* [PendingSetFlag](../Coordinators/PendingSetFlag.md) 
* [AccountList](../Interfacers/AccountList.md) 
* [ImportSelectionDialog](../Interfacers/ImportSelectionDialog.md) 
* [MessagingController](../Controllers/MessagingController.md) 
* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) 
* [Accounts](../Coordinators/Accounts.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [AccountSettings](../Interfacers/AccountSettings.md) 
* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [MessagingController](../Controllers/MessagingController.md) 
* [Account](../InformationHolders/Account.md) 


