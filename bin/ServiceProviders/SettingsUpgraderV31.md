# SettingsUpgraderV31
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* upgrade(Map<String, Object> settings)
	* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [SettingsUpgraderV12](../ServiceProviders/SettingsUpgraderV12.md) has a role type of Service Provider
	* [SettingsUpgraderV24](../ServiceProviders/SettingsUpgraderV24.md) has a role type of Service Provider
	* [SettingsUpgraderV31](../ServiceProviders/SettingsUpgraderV31.md) has a role type of Service Provider
	* [IdentitySettings](../Coordinators/IdentitySettings.md) has a role type of Coordinator
	* [GlobalSettings](../Coordinators/GlobalSettings.md) has a role type of Coordinator
	* [SettingsUpgrader](../ServiceProviders/SettingsUpgrader.md) has a role type of Service Provider
	* [Settings](../ServiceProviders/Settings.md) has a role type of Service Provider
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* convertFromOldSize(int oldSize)
	* [FontSizes](../InformationHolders/FontSizes.md) has a role type of Information Holder
	* [SettingsUpgraderV31](../ServiceProviders/SettingsUpgraderV31.md) has a role type of Service Provider
