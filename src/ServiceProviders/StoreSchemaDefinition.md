# StoreSchemaDefinition
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getVersion()
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [SchemaDefinition](../ServiceProviders/SchemaDefinition.md) has a role type of Service Provider
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [StoreSchemaDefinition](../ServiceProviders/StoreSchemaDefinition.md) has a role type of Service Provider
	* [Migrations](../Coordinators/Migrations.md) has a role type of Coordinator
* doDbUpgrade(final SQLiteDatabase db)
	* [SchemaDefinition](../ServiceProviders/SchemaDefinition.md) has a role type of Service Provider
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [StoreSchemaDefinition](../ServiceProviders/StoreSchemaDefinition.md) has a role type of Service Provider
* dbCreateDatabaseFromScratch(SQLiteDatabase db)
	* [StoreSchemaDefinition](../ServiceProviders/StoreSchemaDefinition.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* upgradeDatabase(final SQLiteDatabase db)
	* [StoreSchemaDefinition](../ServiceProviders/StoreSchemaDefinition.md) has a role type of Service Provider
	* [Migrations](../Coordinators/Migrations.md) has a role type of Coordinator
