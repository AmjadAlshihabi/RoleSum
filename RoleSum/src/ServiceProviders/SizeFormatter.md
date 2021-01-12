# SizeFormatter
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* formatSize(Context context, long size)
	* [AttachmentView](../Coordinators/AttachmentView.md) has a role type of Coordinator
	* [SizeFormatter](../ServiceProviders/SizeFormatter.md) has a role type of Service Provider
	* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
	* [AccountsAdapter](../Interfacers/AccountsAdapter.md) has a role type of Interfacer
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
