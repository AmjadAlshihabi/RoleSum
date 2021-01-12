# MlfUtils
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getOpenFolder(String folderName, Account account)
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
* setLastSelectedFolderName(Preferences preferences,
            List<MessageReference> messages, String destFolderName)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
* getSenderAddressFromCursor(Cursor cursor)
	* [SenderComparator](../ServiceProviders/SenderComparator.md) has a role type of Service Provider
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
* buildSubject(String subjectFromCursor, String emptySubject, int threadCount)
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
