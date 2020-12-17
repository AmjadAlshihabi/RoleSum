# MigrationTo41
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* db41FoldersAddClassColumns(SQLiteDatabase db)
	* [MigrationTo41](../ServiceProviders/MigrationTo41.md) has a role type of Service Provider
	* [Migrations](../Coordinators/Migrations.md) has a role type of Coordinator
* db41UpdateFolderMetadata(SQLiteDatabase db, MigrationsHelper migrationsHelper)
	* [MigrationTo41](../ServiceProviders/MigrationTo41.md) has a role type of Service Provider
	* [Migrations](../Coordinators/Migrations.md) has a role type of Coordinator
* update41Metadata(SQLiteDatabase db, MigrationsHelper migrationsHelper, int id, String name)
	* [MigrationTo41](../ServiceProviders/MigrationTo41.md) has a role type of Service Provider
