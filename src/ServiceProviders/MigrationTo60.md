# MigrationTo60
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* migratePendingCommands(SQLiteDatabase db)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [Migrations](../Coordinators/Migrations.md) has a role type of Coordinator
* columnExists(SQLiteDatabase db, String table, String columnName)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migrateCommandExpunge(OldPendingCommand command)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migrateCommandEmptyTrash()
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migrateCommandMoveOrCopy(OldPendingCommand command)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migrateCommandMoveOrCopyBulkNew(OldPendingCommand command)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migrateCommandMarkAllAsRead(OldPendingCommand command)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migrateCommandSetFlag(OldPendingCommand command)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migrateCommandSetFlagBulk(OldPendingCommand command)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migrateCommandAppend(OldPendingCommand command)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* getPendingCommands(SQLiteDatabase db)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* fastUrlDecode(String s)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* migratePendingCommand(OldPendingCommand oldPendingCommand)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migratePendingCommand(OldPendingCommand oldPendingCommand)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migratePendingCommand(OldPendingCommand oldPendingCommand)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migratePendingCommand(OldPendingCommand oldPendingCommand)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migratePendingCommand(OldPendingCommand oldPendingCommand)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migratePendingCommand(OldPendingCommand oldPendingCommand)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migratePendingCommand(OldPendingCommand oldPendingCommand)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migratePendingCommand(OldPendingCommand oldPendingCommand)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migratePendingCommand(OldPendingCommand oldPendingCommand)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migrateCommandMoveOrCopyBulk(OldPendingCommand command)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migrateCommandMoveOrCopyBulk(OldPendingCommand command)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
* migrateCommandMoveOrCopyBulk(OldPendingCommand command)
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
