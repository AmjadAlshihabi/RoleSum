# ChooseAccount
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* displaySpecialAccounts()
	* [AccountList](../Interfacers/AccountList.md) has a role type of Interfacer
	* [ChooseAccount](../ServiceProviders/ChooseAccount.md) has a role type of Service Provider
	* [LauncherShortcuts](../Interfacers/LauncherShortcuts.md) has a role type of Interfacer
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* onAccountSelected(BaseAccount account)
	* [AccountList](../Interfacers/AccountList.md) has a role type of Interfacer
	* [ChooseAccount](../ServiceProviders/ChooseAccount.md) has a role type of Service Provider
	* [LauncherShortcuts](../Interfacers/LauncherShortcuts.md) has a role type of Interfacer
