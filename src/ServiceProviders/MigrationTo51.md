# MigrationTo51
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* db51MigrateMessageFormat(SQLiteDatabase db, MigrationsHelper migrationsHelper)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [Migrations](../Coordinators/Migrations.md) has a role type of Coordinator
* renameOldAttachmentDirAndCreateNew(Account account, File attachmentDirNew)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* dropOldMessagesTable(SQLiteDatabase db)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* cleanUpOldAttachmentDirectory(File attachmentDirOld)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* copyMessageMetadataToNewTable(SQLiteDatabase db)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* renameOldMessagesTableAndCreateNew(SQLiteDatabase db)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* replaceContentUriWithContentIdInHtmlPart(
            SQLiteDatabase db, long messageId, String htmlContent)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* migrateSimpleMailContent(SQLiteDatabase db, String htmlContent,
            String textContent, String mimeType, MimeHeader mimeHeader, MimeStructureState structureState)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* insertAttachments(SQLiteDatabase db, File attachmentDirOld, File attachmentDirNew,
            long messageId, MimeStructureState structureState)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* updateFlagsForMessage(SQLiteDatabase db, long messageId, String messageFlags,
            MigrationsHelper migrationsHelper)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* loadHeaderFromHeadersTable(SQLiteDatabase db, long messageId)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* migratePgpMimeEncryptedContent(SQLiteDatabase db, long messageId,
            File attachmentDirOld, File attachmentDirNew, MimeHeader mimeHeader, MimeStructureState structureState)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* migratePgpMimeEncryptedContent(SQLiteDatabase db, long messageId,
            File attachmentDirOld, File attachmentDirNew, MimeHeader mimeHeader, MimeStructureState structureState)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* migrateComplexMailContent(SQLiteDatabase db,
            File attachmentDirOld, File attachmentDirNew, long messageId, String htmlContent, String textContent,
            MimeHeader mimeHeader, MimeStructureState structureState)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* migrateComplexMailContent(SQLiteDatabase db,
            File attachmentDirOld, File attachmentDirNew, long messageId, String htmlContent, String textContent,
            MimeHeader mimeHeader, MimeStructureState structureState)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* insertMimeAttachmentPart(SQLiteDatabase db, File attachmentDirOld,
            File attachmentDirNew, MimeStructureState structureState, long id, int size, String name, String mimeType,
            String storeData, String contentUriString, String contentId, String contentDisposition)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* insertMimeAttachmentPart(SQLiteDatabase db, File attachmentDirOld,
            File attachmentDirNew, MimeStructureState structureState, long id, int size, String name, String mimeType,
            String storeData, String contentUriString, String contentId, String contentDisposition)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* insertMimeAttachmentPart(SQLiteDatabase db, File attachmentDirOld,
            File attachmentDirNew, MimeStructureState structureState, long id, int size, String name, String mimeType,
            String storeData, String contentUriString, String contentId, String contentDisposition)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* insertMimeAttachmentPart(SQLiteDatabase db, File attachmentDirOld,
            File attachmentDirNew, MimeStructureState structureState, long id, int size, String name, String mimeType,
            String storeData, String contentUriString, String contentId, String contentDisposition)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* insertBodyAsMultipartAlternative(SQLiteDatabase db,
            MimeStructureState structureState, MimeHeader mimeHeader,
            String textContent, String htmlContent)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* insertBodyAsMultipartAlternative(SQLiteDatabase db,
            MimeStructureState structureState, MimeHeader mimeHeader,
            String textContent, String htmlContent)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* insertBodyAsMultipartAlternative(SQLiteDatabase db,
            MimeStructureState structureState, MimeHeader mimeHeader,
            String textContent, String htmlContent)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* insertTextualPartIntoDatabase(SQLiteDatabase db, MimeStructureState structureState,
            MimeHeader mimeHeader, String content, boolean isHtml)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* insertTextualPartIntoDatabase(SQLiteDatabase db, MimeStructureState structureState,
            MimeHeader mimeHeader, String content, boolean isHtml)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* insertTextualPartIntoDatabase(SQLiteDatabase db, MimeStructureState structureState,
            MimeHeader mimeHeader, String content, boolean isHtml)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
