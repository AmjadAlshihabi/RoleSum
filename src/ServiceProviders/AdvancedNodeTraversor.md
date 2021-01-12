# AdvancedNodeTraversor
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* filter(Node root)
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [HtmlSignatureRemover](../Coordinators/HtmlSignatureRemover.md) has a role type of Coordinator
	* [AdvancedNodeTraversor](../ServiceProviders/AdvancedNodeTraversor.md) has a role type of Service Provider
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
