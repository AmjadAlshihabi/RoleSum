# FolderListFilter
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getSearchTerm()
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListFilter](../ServiceProviders/FolderListFilter.md) has a role type of Service Provider
* performFiltering(CharSequence searchTerm)
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListFilter](../ServiceProviders/FolderListFilter.md) has a role type of Service Provider
	* [FolderListFilter](../ServiceProviders/FolderListFilter.md) has a role type of Service Provider
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
* publishResults(CharSequence constraint, FilterResults results)
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListFilter](../ServiceProviders/FolderListFilter.md) has a role type of Service Provider
	* [FolderListFilter](../ServiceProviders/FolderListFilter.md) has a role type of Service Provider
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
