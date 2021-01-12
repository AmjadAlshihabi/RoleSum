# MimeMessageHelper
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* setBody(Part part, Body body)
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [Part](../ServiceProviders/Part.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [MimeBodyPart](../Structurers/MimeBodyPart.md) has a role type of Structurer
	* [MimeMessageBuilder](../Structurers/MimeMessageBuilder.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MimeMessageHelper](../ServiceProviders/MimeMessageHelper.md) has a role type of Service Provider
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [PartBuilder](../Structurers/PartBuilder.md) has a role type of Structurer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
* setEncoding(Part part, String encoding)
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
