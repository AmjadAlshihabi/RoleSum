# ChooseFolderHandler
## This Service Provider is responsible for:
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* handleMessage(android.os.Message msg)
	* [MessageListHandler](../Interfacers/MessageListHandler.md) has a role type of Interfacer
	* [ChooseFolderHandler](../ServiceProviders/ChooseFolderHandler.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* handleMessage(android.os.Message msg)
	* [MessageListHandler](../Interfacers/MessageListHandler.md) has a role type of Interfacer
	* [ChooseFolderHandler](../ServiceProviders/ChooseFolderHandler.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* progress(boolean progress)
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
* setSelectedFolder(int position)
	* [ChooseFolderHandler](../ServiceProviders/ChooseFolderHandler.md) has a role type of Service Provider
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
