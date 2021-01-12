# DeferredFileBody
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getInputStream()
	* [BinaryMemoryBody](../InformationHolders/BinaryMemoryBody.md) has a role type of Information Holder
	* [Body](../ServiceProviders/Body.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MimeMultipart](../InformationHolders/MimeMultipart.md) has a role type of Information Holder
	* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [BinaryAttachmentBody](../ServiceProviders/BinaryAttachmentBody.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [FileBackedBody](../InformationHolders/FileBackedBody.md) has a role type of Information Holder
	* [TempFileBody](../InformationHolders/TempFileBody.md) has a role type of Information Holder
* getSize()
	* [BinaryMemoryBody](../InformationHolders/BinaryMemoryBody.md) has a role type of Information Holder
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [SizeAware](../ServiceProviders/SizeAware.md) has a role type of Service Provider
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [FileBackedBody](../InformationHolders/FileBackedBody.md) has a role type of Information Holder
	* [LocalBodyPart](../InformationHolders/LocalBodyPart.md) has a role type of Information Holder
	* [LocalPart](../Structurers/LocalPart.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [TempFileBody](../InformationHolders/TempFileBody.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getFile()
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [DeferredFileOutputStream](../InformationHolders/DeferredFileOutputStream.md) has a role type of Information Holder
	* [TemporaryAttachmentStore](../ServiceProviders/TemporaryAttachmentStore.md) has a role type of Service Provider
* writeTo(OutputStream out)
	* [BinaryMemoryBody](../InformationHolders/BinaryMemoryBody.md) has a role type of Information Holder
	* [Body](../ServiceProviders/Body.md) has a role type of Service Provider
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [Part](../ServiceProviders/Part.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [MimeBodyPart](../Structurers/MimeBodyPart.md) has a role type of Structurer
	* [MimeHeader](../Structurers/MimeHeader.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MimeMultipart](../InformationHolders/MimeMultipart.md) has a role type of Information Holder
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [BinaryAttachmentBody](../ServiceProviders/BinaryAttachmentBody.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [FileBackedBody](../InformationHolders/FileBackedBody.md) has a role type of Information Holder
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [DeferredFileOutputStream](../InformationHolders/DeferredFileOutputStream.md) has a role type of Information Holder
	* [MessageCryptoStructureDetector](../ServiceProviders/MessageCryptoStructureDetector.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* getOutputStream()
	* [DefaultBodyFactory](../ServiceProviders/DefaultBodyFactory.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) has a role type of Service Provider
* getOutputStream()
	* [DefaultBodyFactory](../ServiceProviders/DefaultBodyFactory.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) has a role type of Service Provider
* writeMemoryToFile()
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
* setEncoding(String encoding)
	* [BinaryMemoryBody](../InformationHolders/BinaryMemoryBody.md) has a role type of Information Holder
	* [Body](../ServiceProviders/Body.md) has a role type of Service Provider
	* [BodyPart](../InformationHolders/BodyPart.md) has a role type of Information Holder
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [Multipart](../Structurers/Multipart.md) has a role type of Structurer
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [BinaryTempFileMessageBody](../InformationHolders/BinaryTempFileMessageBody.md) has a role type of Information Holder
	* [MimeBodyPart](../Structurers/MimeBodyPart.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MimeMessageHelper](../ServiceProviders/MimeMessageHelper.md) has a role type of Service Provider
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [BinaryAttachmentBody](../ServiceProviders/BinaryAttachmentBody.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [FileBackedBody](../InformationHolders/FileBackedBody.md) has a role type of Information Holder
* getEncoding()
	* [BinaryMemoryBody](../InformationHolders/BinaryMemoryBody.md) has a role type of Information Holder
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [MimeMessageHelper](../ServiceProviders/MimeMessageHelper.md) has a role type of Service Provider
	* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
	* [RawDataBody](../ServiceProviders/RawDataBody.md) has a role type of Service Provider
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
	* [BinaryAttachmentBody](../ServiceProviders/BinaryAttachmentBody.md) has a role type of Service Provider
	* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
	* [FileBackedBody](../InformationHolders/FileBackedBody.md) has a role type of Information Holder
