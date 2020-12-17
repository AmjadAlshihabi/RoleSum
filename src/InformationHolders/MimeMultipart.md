# MimeMultipart
## This Information Holder is responsible for:
### providing and holding information about: 
* boundary
* preamble
* epilogue
* mimeType
### Providing information to the following objects 
* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
* [MimeMessageBuilder](../Structurers/MimeMessageBuilder.md) has a role type of Structurer
* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* [PartBuilder](../Structurers/PartBuilder.md) has a role type of Structurer
* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
* [MessageCryptoStructureDetector](../ServiceProviders/MessageCryptoStructureDetector.md) has a role type of Service Provider
