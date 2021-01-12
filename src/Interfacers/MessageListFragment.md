# MessageListFragment
## this Interfacer is responsible for: 
### inheriting the following classes: 
* Fragment
### implementing the following interfaces:
* OnItemClickListener
* [ConfirmationDialogFragmentListener](../Interfacers/ConfirmationDialogFragmentListener.md) 
* LoaderCallbacks<Cursor>
### managing system interaction with external APIs and users using the following objects: 
* Context
* Cursor[]
* Map<SortType, Comparator<Cursor>>
* Parcelable
* List<Message>
* List<MessageReference>
* BroadcastReceiver
* SwipeRefreshLayout
* View
* LocalBroadcastManager
* ListView
* ActionMode
* LayoutInflater
* Future<?>
### collaborating with the following objects: 
* Structurers: 
	* [Preferences](../Structurers/Preferences.md) 
	* [LocalSearch](../Structurers/LocalSearch.md) 
* Service Providers: 
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) 
	* [MessageListFragmentListener](../ServiceProviders/MessageListFragmentListener.md) 
	* [ActivityListener](../ServiceProviders/ActivityListener.md) 
	* [MessageHelper](../ServiceProviders/MessageHelper.md) 
* Interfacers: 
	* [ActionModeCallback](../Interfacers/ActionModeCallback.md) 
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) 
	* [MessageListHandler](../Interfacers/MessageListHandler.md) 
* Information Holders: 
	* [SortType](../InformationHolders/SortType.md) 
	* [MessageReference](../InformationHolders/MessageReference.md) 
	* [FolderInfoHolder](../InformationHolders/FolderInfoHolder.md) 
	* [Account](../InformationHolders/Account.md) 
* Controllers: 
	* [MessagingController](../Controllers/MessagingController.md) 
