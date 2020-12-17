# IdentitySettings
### This Coordinator is responsible for delegating work between the following objects: 
* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* [Storage](../Structurers/Storage.md) has a role type of Structurer
### the getIdentitySettings method receives requests from:
* [IdentitySettings](../Coordinators/IdentitySettings.md) 
* [SettingsImporter](../ServiceProviders/SettingsImporter.md) 
### and delegate the request to: 
* [Storage](../Structurers/Storage.md) 


