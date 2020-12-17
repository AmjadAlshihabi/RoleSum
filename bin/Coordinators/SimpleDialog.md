# SimpleDialog
### This Coordinator is responsible for delegating work between the following objects: 
* [AccountsImportedDialog](../Coordinators/AccountsImportedDialog.md) has a role type of Coordinator
* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
* [AccountsImportedDialog](../Coordinators/AccountsImportedDialog.md) has a role type of Coordinator
* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [K9](../Controllers/K9.md) has a role type of Controller
* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
* [MessageWebView](../Coordinators/MessageWebView.md) has a role type of Coordinator
* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
* [RemoteControlService](../Controllers/RemoteControlService.md) has a role type of Controller
* [FileBrowserHelper](../ServiceProviders/FileBrowserHelper.md) has a role type of Service Provider
* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) has a role type of Interfacer
* [ActionModeCallback](../Interfacers/ActionModeCallback.md) has a role type of Interfacer
* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
* [AccountsAdapter](../Interfacers/AccountsAdapter.md) has a role type of Interfacer
* [ExportAsyncTask](../ServiceProviders/ExportAsyncTask.md) has a role type of Service Provider
* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) has a role type of Service Provider
* [ImportSelectionDialog](../Interfacers/ImportSelectionDialog.md) has a role type of Interfacer
* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) has a role type of Service Provider
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [MoveAccountAsyncTask](../ServiceProviders/MoveAccountAsyncTask.md) has a role type of Service Provider
* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) has a role type of Interfacer
* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
* [ChooseIdentity](../Interfacers/ChooseIdentity.md) has a role type of Interfacer
* [EmailAddressList](../Interfacers/EmailAddressList.md) has a role type of Interfacer
* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* [ManageIdentities](../Interfacers/ManageIdentities.md) has a role type of Interfacer
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) has a role type of Interfacer
* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
* [AccountSetupAccountType](../Interfacers/AccountSetupAccountType.md) has a role type of Interfacer
* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
* [OpenPgpAppSelectDialog](../Interfacers/OpenPgpAppSelectDialog.md) has a role type of Interfacer
* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) has a role type of Interfacer
* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
### the okayAction method receives requests from:
* [AccountsImportedDialog](../Coordinators/AccountsImportedDialog.md) 
* [SimpleDialog](../Coordinators/SimpleDialog.md) 
### and delegate the request to: 
* [Accounts](../Coordinators/Accounts.md) 


### the generateMessage method receives requests from:
* [AccountsImportedDialog](../Coordinators/AccountsImportedDialog.md) 
* [SimpleDialog](../Coordinators/SimpleDialog.md) 
### and delegate the request to: 
* [Accounts](../Coordinators/Accounts.md) 


### the show method receives requests from:
* [Account](../InformationHolders/Account.md) 
* [K9](../Controllers/K9.md) 
* [MessageHeader](../Interfacers/MessageHeader.md) 
* [MessageWebView](../Coordinators/MessageWebView.md) 
* [RecipientSelectView](../Interfacers/RecipientSelectView.md) 
* [AttachmentController](../Controllers/AttachmentController.md) 
* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) 
* [MessageContainerView](../Interfacers/MessageContainerView.md) 
* [MessageViewFragment](../Interfacers/MessageViewFragment.md) 
* [RemoteControlService](../Controllers/RemoteControlService.md) 
* [FileBrowserHelper](../ServiceProviders/FileBrowserHelper.md) 
* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) 
* [ActionModeCallback](../Interfacers/ActionModeCallback.md) 
* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) 
* [MessageListFragment](../Interfacers/MessageListFragment.md) 
* [AccountsHandler](../Interfacers/AccountsHandler.md) 
* [AccountsAdapter](../Interfacers/AccountsAdapter.md) 
* [ExportAsyncTask](../ServiceProviders/ExportAsyncTask.md) 
* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) 
* [ImportSelectionDialog](../Interfacers/ImportSelectionDialog.md) 
* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) 
* [MessagingController](../Controllers/MessagingController.md) 
* [MoveAccountAsyncTask](../ServiceProviders/MoveAccountAsyncTask.md) 
* [SimpleDialog](../Coordinators/SimpleDialog.md) 
* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) 
* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) 
* [Accounts](../Coordinators/Accounts.md) 
* [ChooseIdentity](../Interfacers/ChooseIdentity.md) 
* [EmailAddressList](../Interfacers/EmailAddressList.md) 
* [FolderListAdapter](../Interfacers/FolderListAdapter.md) 
* [FolderListHandler](../ServiceProviders/FolderListHandler.md) 
* [FolderList](../Interfacers/FolderList.md) 
* [ManageIdentities](../Interfacers/ManageIdentities.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [MessageList](../Interfacers/MessageList.md) 
* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) 
* [AccountSettings](../Interfacers/AccountSettings.md) 
* [AccountSetupAccountType](../Interfacers/AccountSetupAccountType.md) 
* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) 
* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) 
* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) 
* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) 
* [OpenPgpAppSelectDialog](../Interfacers/OpenPgpAppSelectDialog.md) 
* [Prefs](../Interfacers/Prefs.md) 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
### and delegate the request to: 
* [Accounts](../Coordinators/Accounts.md) 


