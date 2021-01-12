# FolderListHandler
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* refreshTitle()
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MessageListHandler](../Interfacers/MessageListHandler.md) has a role type of Interfacer
	* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* newFolders(final List<FolderInfoHolder> newFolders)
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
* workingAccount(final int res)
	* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
* accountSizeChanged(final long oldSize, final long newSize)
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
* folderLoading(final String folder, final boolean loading)
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MessageListHandler](../Interfacers/MessageListHandler.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
* progress(final boolean progress)
	* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
	* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) has a role type of Interfacer
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
	* [MessageListHandler](../Interfacers/MessageListHandler.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingListener](../ServiceProviders/MessagingListener.md) has a role type of Service Provider
	* [ProgressListener](../Interfacers/ProgressListener.md) has a role type of Interfacer
	* [SimpleMessagingListener](../ServiceProviders/SimpleMessagingListener.md) has a role type of Service Provider
	* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ChooseFolderHandler](../ServiceProviders/ChooseFolderHandler.md) has a role type of Service Provider
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [SliderPreference](../InformationHolders/SliderPreference.md) has a role type of Information Holder
* dataChanged()
	* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
