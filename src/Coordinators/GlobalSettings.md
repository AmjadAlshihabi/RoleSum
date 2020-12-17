# GlobalSettings
### This Coordinator is responsible for delegating work between the following objects: 
* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* [Storage](../Structurers/Storage.md) has a role type of Structurer
### the getGlobalSettings method receives requests from:
* [GlobalSettings](../Coordinators/GlobalSettings.md) 
* [SettingsImporter](../ServiceProviders/SettingsImporter.md) 
### and delegate the request to: 
* [Storage](../Structurers/Storage.md) 


