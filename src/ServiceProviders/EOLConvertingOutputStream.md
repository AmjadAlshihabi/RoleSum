# EOLConvertingOutputStream
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* flush()
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [MimeBodyPart](../Structurers/MimeBodyPart.md) has a role type of Structurer
	* [MimeHeader](../Structurers/MimeHeader.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MimeMultipart](../InformationHolders/MimeMultipart.md) has a role type of Information Holder
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
	* [EOLConvertingOutputStream](../ServiceProviders/EOLConvertingOutputStream.md) has a role type of Service Provider
	* [LineWrapOutputStream](../ServiceProviders/LineWrapOutputStream.md) has a role type of Service Provider
	* [SignSafeOutputStream](../ServiceProviders/SignSafeOutputStream.md) has a role type of Service Provider
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
* writeByte(int oneByte)
	* [EOLConvertingOutputStream](../ServiceProviders/EOLConvertingOutputStream.md) has a role type of Service Provider
	* [LocalSearch](../Structurers/LocalSearch.md) has a role type of Structurer
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* write(int oneByte)
	* [BinaryMemoryBody](../InformationHolders/BinaryMemoryBody.md) has a role type of Information Holder
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [MimeBodyPart](../Structurers/MimeBodyPart.md) has a role type of Structurer
	* [MimeHeader](../Structurers/MimeHeader.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MimeMultipart](../InformationHolders/MimeMultipart.md) has a role type of Information Holder
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
	* [CountingOutputStream](../InformationHolders/CountingOutputStream.md) has a role type of Information Holder
	* [EOLConvertingOutputStream](../ServiceProviders/EOLConvertingOutputStream.md) has a role type of Service Provider
	* [LineWrapOutputStream](../ServiceProviders/LineWrapOutputStream.md) has a role type of Service Provider
	* [SignSafeOutputStream](../ServiceProviders/SignSafeOutputStream.md) has a role type of Service Provider
	* [SmtpDataStuffing](../ServiceProviders/SmtpDataStuffing.md) has a role type of Service Provider
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [FileHelper](../ServiceProviders/FileHelper.md) has a role type of Service Provider
* write(int oneByte)
	* [BinaryMemoryBody](../InformationHolders/BinaryMemoryBody.md) has a role type of Information Holder
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [MimeBodyPart](../Structurers/MimeBodyPart.md) has a role type of Structurer
	* [MimeHeader](../Structurers/MimeHeader.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MimeMultipart](../InformationHolders/MimeMultipart.md) has a role type of Information Holder
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
	* [CountingOutputStream](../InformationHolders/CountingOutputStream.md) has a role type of Information Holder
	* [EOLConvertingOutputStream](../ServiceProviders/EOLConvertingOutputStream.md) has a role type of Service Provider
	* [LineWrapOutputStream](../ServiceProviders/LineWrapOutputStream.md) has a role type of Service Provider
	* [SignSafeOutputStream](../ServiceProviders/SignSafeOutputStream.md) has a role type of Service Provider
	* [SmtpDataStuffing](../ServiceProviders/SmtpDataStuffing.md) has a role type of Service Provider
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [FileHelper](../ServiceProviders/FileHelper.md) has a role type of Service Provider
* endWithCrLfAndFlush()
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [EOLConvertingOutputStream](../ServiceProviders/EOLConvertingOutputStream.md) has a role type of Service Provider
* endWithCrLfAndFlush()
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [EOLConvertingOutputStream](../ServiceProviders/EOLConvertingOutputStream.md) has a role type of Service Provider
* completeCrLf()
	* [EOLConvertingOutputStream](../ServiceProviders/EOLConvertingOutputStream.md) has a role type of Service Provider
* completeCrLf()
	* [EOLConvertingOutputStream](../ServiceProviders/EOLConvertingOutputStream.md) has a role type of Service Provider
