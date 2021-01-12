# PendingSetFlag
### This Coordinator is responsible for delegating work between the following objects: 
* [Folder](../Structurers/Folder.md) has a role type of Structurer
* [HttpGeneric](../InformationHolders/HttpGeneric.md) has a role type of Information Holder
* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
* [WebDavHttpClientFactory](../ServiceProviders/WebDavHttpClientFactory.md) has a role type of Service Provider
* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
* [WebDavStoreUriCreator](../ServiceProviders/WebDavStoreUriCreator.md) has a role type of Service Provider
* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
* [ImapStoreUriCreator](../ServiceProviders/ImapStoreUriCreator.md) has a role type of Service Provider
* [CryptoInfoDialog](../Interfacers/CryptoInfoDialog.md) has a role type of Interfacer
* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) has a role type of Service Provider
* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* [ConfirmationDialogFragment](../Coordinators/ConfirmationDialogFragment.md) has a role type of Coordinator
* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
* [PendingAppend](../Coordinators/PendingAppend.md) has a role type of Coordinator
* [PendingEmptyTrash](../Coordinators/PendingEmptyTrash.md) has a role type of Coordinator
* [PendingExpunge](../Coordinators/PendingExpunge.md) has a role type of Coordinator
* [PendingMarkAllAsRead](../Coordinators/PendingMarkAllAsRead.md) has a role type of Coordinator
* [PendingMoveOrCopy](../Coordinators/PendingMoveOrCopy.md) has a role type of Coordinator
* [AutocryptOperations](../ServiceProviders/AutocryptOperations.md) has a role type of Service Provider
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) has a role type of Interfacer
* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
* [ConfirmationDialog](../Interfacers/ConfirmationDialog.md) has a role type of Interfacer
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
* [OpenPgpAppSelectFragment](../Structurers/OpenPgpAppSelectFragment.md) has a role type of Structurer
* [PgpEnabledErrorDialog](../Coordinators/PgpEnabledErrorDialog.md) has a role type of Coordinator
* [PgpEncryptDescriptionDialog](../Coordinators/PgpEncryptDescriptionDialog.md) has a role type of Coordinator
* [PgpInlineDialog](../Interfacers/PgpInlineDialog.md) has a role type of Interfacer
* [PgpSignOnlyDialog](../Interfacers/PgpSignOnlyDialog.md) has a role type of Interfacer
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
* [PendingAppend](../Coordinators/PendingAppend.md) has a role type of Coordinator
* [PendingCommand](../Coordinators/PendingCommand.md) has a role type of Coordinator
* [PendingEmptyTrash](../Coordinators/PendingEmptyTrash.md) has a role type of Coordinator
* [PendingExpunge](../Coordinators/PendingExpunge.md) has a role type of Coordinator
* [PendingMarkAllAsRead](../Coordinators/PendingMarkAllAsRead.md) has a role type of Coordinator
* [PendingMoveOrCopy](../Coordinators/PendingMoveOrCopy.md) has a role type of Coordinator
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
### the create method receives requests from:
* [Folder](../Structurers/Folder.md) 
* [HttpGeneric](../InformationHolders/HttpGeneric.md) 
* [WebDavFolder](../ServiceProviders/WebDavFolder.md) 
* [WebDavHttpClientFactory](../ServiceProviders/WebDavHttpClientFactory.md) 
* [WebDavStore](../InformationHolders/WebDavStore.md) 
* [WebDavStoreUriCreator](../ServiceProviders/WebDavStoreUriCreator.md) 
* [Pop3Folder](../Controllers/Pop3Folder.md) 
* [ImapFolder](../Structurers/ImapFolder.md) 
* [ImapStore](../Structurers/ImapStore.md) 
* [ImapStoreUriCreator](../ServiceProviders/ImapStoreUriCreator.md) 
* [CryptoInfoDialog](../Interfacers/CryptoInfoDialog.md) 
* [NotificationActionCreator](../ServiceProviders/NotificationActionCreator.md) 
* [LocalFolder](../InformationHolders/LocalFolder.md) 
* [MigrationTo60](../ServiceProviders/MigrationTo60.md) 
* [ConfirmationDialogFragment](../Coordinators/ConfirmationDialogFragment.md) 
* [MessageListAdapter](../Interfacers/MessageListAdapter.md) 
* [PendingAppend](../Coordinators/PendingAppend.md) 
* [PendingEmptyTrash](../Coordinators/PendingEmptyTrash.md) 
* [PendingExpunge](../Coordinators/PendingExpunge.md) 
* [PendingMarkAllAsRead](../Coordinators/PendingMarkAllAsRead.md) 
* [PendingMoveOrCopy](../Coordinators/PendingMoveOrCopy.md) 
* [PendingSetFlag](../Coordinators/PendingSetFlag.md) 
* [AutocryptOperations](../ServiceProviders/AutocryptOperations.md) 
* [MessagingController](../Controllers/MessagingController.md) 
* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) 
* [Accounts](../Coordinators/Accounts.md) 
* [ConfirmationDialog](../Interfacers/ConfirmationDialog.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) 
* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) 
* [OpenPgpAppSelectFragment](../Structurers/OpenPgpAppSelectFragment.md) 
* [PgpEnabledErrorDialog](../Coordinators/PgpEnabledErrorDialog.md) 
* [PgpEncryptDescriptionDialog](../Coordinators/PgpEncryptDescriptionDialog.md) 
* [PgpInlineDialog](../Interfacers/PgpInlineDialog.md) 
* [PgpSignOnlyDialog](../Interfacers/PgpSignOnlyDialog.md) 
### and delegate the request to: 
* [Flag](../InformationHolders/Flag.md) 


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


