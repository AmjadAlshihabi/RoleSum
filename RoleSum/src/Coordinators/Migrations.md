# Migrations
### This Coordinator is responsible for delegating work between the following objects: 
* [StoreSchemaDefinition](../ServiceProviders/StoreSchemaDefinition.md) has a role type of Service Provider
* [MigrationsHelper](../Structurers/MigrationsHelper.md) has a role type of Structurer
### the upgradeDatabase method receives requests from:
* [StoreSchemaDefinition](../ServiceProviders/StoreSchemaDefinition.md) 
* [Migrations](../Coordinators/Migrations.md) 
### and delegate the request to: 
* [MigrationsHelper](../Structurers/MigrationsHelper.md) 


