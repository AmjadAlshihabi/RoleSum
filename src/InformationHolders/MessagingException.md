# MessagingException
## This Information Holder is responsible for:
### providing and holding information about: 
* serialVersionUID
* permanentFailure
### Providing information to the following objects 
* [BinaryMemoryBody](../InformationHolders/BinaryMemoryBody.md) has a role type of Information Holder
* [AuthenticationFailedException](../InformationHolders/AuthenticationFailedException.md) has a role type of Information Holder
* [CertificateValidationException](../InformationHolders/CertificateValidationException.md) has a role type of Information Holder
* [Folder<T extends Message>](../Structurers/Folder<T extends Message>.md) has a role type of Structurer
* [Multipart](../Structurers/Multipart.md) has a role type of Structurer
* [Store](../InformationHolders/Store.md) has a role type of Information Holder
* [TransportProvider](../ServiceProviders/TransportProvider.md) has a role type of Service Provider
* [WebDavTransport](../ServiceProviders/WebDavTransport.md) has a role type of Service Provider
* [NegativeSmtpReplyException](../InformationHolders/NegativeSmtpReplyException.md) has a role type of Information Holder
* [RemoteStore](../Structurers/RemoteStore.md) has a role type of Structurer
* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
* [Pop3ErrorResponse](../InformationHolders/Pop3ErrorResponse.md) has a role type of Information Holder
* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
* [Pop3Message](../ServiceProviders/Pop3Message.md) has a role type of Service Provider
* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
* [ImapList](../Structurers/ImapList.md) has a role type of Structurer
* [ImapMessage](../Structurers/ImapMessage.md) has a role type of Structurer
* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
* [NegativeImapResponseException](../InformationHolders/NegativeImapResponseException.md) has a role type of Information Holder
* [KeyChainKeyManager](../ServiceProviders/KeyChainKeyManager.md) has a role type of Service Provider
* [MessageHeaderParser](../ServiceProviders/MessageHeaderParser.md) has a role type of Service Provider
* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
* [BinaryTempFileMessageBody](../InformationHolders/BinaryTempFileMessageBody.md) has a role type of Information Holder
* [CharsetSupport](../ServiceProviders/CharsetSupport.md) has a role type of Service Provider
* [JisSupport](../ServiceProviders/JisSupport.md) has a role type of Service Provider
* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
* [MimeBodyPart](../Structurers/MimeBodyPart.md) has a role type of Structurer
* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
* [MimeMessageHelper](../ServiceProviders/MimeMessageHelper.md) has a role type of Service Provider
* [MimeMultipart](../InformationHolders/MimeMultipart.md) has a role type of Information Holder
* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* [HtmlQuoteCreator](../ServiceProviders/HtmlQuoteCreator.md) has a role type of Service Provider
* [TextQuoteCreator](../ServiceProviders/TextQuoteCreator.md) has a role type of Service Provider
* [AttachmentCounter](../ServiceProviders/AttachmentCounter.md) has a role type of Service Provider
* [AttachmentInfoExtractor](../ServiceProviders/AttachmentInfoExtractor.md) has a role type of Service Provider
* [BinaryAttachmentBody](../ServiceProviders/BinaryAttachmentBody.md) has a role type of Service Provider
* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
* [FileBackedBody](../InformationHolders/FileBackedBody.md) has a role type of Information Holder
* [LocalBodyPart](../InformationHolders/LocalBodyPart.md) has a role type of Information Holder
* [LocalMimeMessage](../InformationHolders/LocalMimeMessage.md) has a role type of Information Holder
* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* [PartBuilder](../Structurers/PartBuilder.md) has a role type of Structurer
* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
* [UnavailableStorageException](../InformationHolders/UnavailableStorageException.md) has a role type of Information Holder
* [UnreadWidgetProperties](../Coordinators/UnreadWidgetProperties.md) has a role type of Coordinator
* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
* [MessageCryptoStructureDetector](../ServiceProviders/MessageCryptoStructureDetector.md) has a role type of Service Provider
* [PendingAppend](../Coordinators/PendingAppend.md) has a role type of Coordinator
* [PendingEmptyTrash](../Coordinators/PendingEmptyTrash.md) has a role type of Coordinator
* [PendingExpunge](../Coordinators/PendingExpunge.md) has a role type of Coordinator
* [PendingMarkAllAsRead](../Coordinators/PendingMarkAllAsRead.md) has a role type of Coordinator
* [PendingMoveOrCopy](../Coordinators/PendingMoveOrCopy.md) has a role type of Coordinator
* [PendingSetFlag](../Coordinators/PendingSetFlag.md) has a role type of Coordinator
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
