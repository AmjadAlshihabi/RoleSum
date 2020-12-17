# MigrationTo58
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* cleanUpOrphanedData(SQLiteDatabase db)
	* [MigrationTo58](../ServiceProviders/MigrationTo58.md) has a role type of Service Provider
	* [Migrations](../Coordinators/Migrations.md) has a role type of Coordinator
* cleanUpFtsTable(SQLiteDatabase db)
	* [MigrationTo56](../ServiceProviders/MigrationTo56.md) has a role type of Service Provider
	* [MigrationTo58](../ServiceProviders/MigrationTo58.md) has a role type of Service Provider
	* [Migrations](../Coordinators/Migrations.md) has a role type of Coordinator
* cleanUpMessagePartsTable(SQLiteDatabase db)
	* [MigrationTo58](../ServiceProviders/MigrationTo58.md) has a role type of Service Provider
* createDeleteMessageTrigger(SQLiteDatabase db)
	* [MigrationTo58](../ServiceProviders/MigrationTo58.md) has a role type of Service Provider
	* [Migrations](../Coordinators/Migrations.md) has a role type of Coordinator
