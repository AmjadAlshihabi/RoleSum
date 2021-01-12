# Settings
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* validate(int version, Map<String, TreeMap<Integer, SettingsDescription>> settings,
            Map<String, String> importedSettings, boolean useDefaultValues)
	* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [IdentitySettings](../Coordinators/IdentitySettings.md) has a role type of Coordinator
	* [GlobalSettings](../Coordinators/GlobalSettings.md) has a role type of Coordinator
	* [Settings](../ServiceProviders/Settings.md) has a role type of Service Provider
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* upgradeSettingsGeneric(Map<String, TreeMap<Integer, SettingsDescription>> settings,
            Map<String, Object> validatedSettingsMutable, Set<String> deletedSettingsMutable, int toVersion)
	* [Settings](../ServiceProviders/Settings.md) has a role type of Service Provider
* upgradeSettingInsertDefault(Map<String, Object> validatedSettingsMutable,
            String settingName, SettingsDescription<T> setting)
	* [Settings](../ServiceProviders/Settings.md) has a role type of Service Provider
* upgradeSettingRemove(Map<String, Object> validatedSettingsMutable,
            Set<String> deletedSettingsMutable, String settingName)
	* [Settings](../ServiceProviders/Settings.md) has a role type of Service Provider
* convert(Map<String, Object> settings,
            Map<String, TreeMap<Integer, SettingsDescription>> settingDescriptions)
	* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [IdentitySettings](../Coordinators/IdentitySettings.md) has a role type of Coordinator
	* [GlobalSettings](../Coordinators/GlobalSettings.md) has a role type of Coordinator
	* [Settings](../ServiceProviders/Settings.md) has a role type of Service Provider
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* versions(V... versionDescriptions)
	* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [IdentitySettings](../Coordinators/IdentitySettings.md) has a role type of Coordinator
	* [GlobalSettings](../Coordinators/GlobalSettings.md) has a role type of Coordinator
	* [Settings](../ServiceProviders/Settings.md) has a role type of Service Provider
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* upgrade(int version, Map<Integer, SettingsUpgrader> customUpgraders,
            Map<String, TreeMap<Integer, SettingsDescription>> settings, Map<String, Object> validatedSettingsMutable)
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
