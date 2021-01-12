# IdentityHeaderBuilder
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* build()
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [UidSearchCommandBuilder](../InformationHolders/UidSearchCommandBuilder.md) has a role type of Information Holder
	* [MessageHeaderParser](../ServiceProviders/MessageHeaderParser.md) has a role type of Service Provider
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [HighlightDialogFragment](../ServiceProviders/HighlightDialogFragment.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
	* [DeleteUriExtractor](../Coordinators/DeleteUriExtractor.md) has a role type of Coordinator
	* [AuthenticationErrorNotifications](../Coordinators/AuthenticationErrorNotifications.md) has a role type of Coordinator
	* [CertificateErrorNotifications](../Coordinators/CertificateErrorNotifications.md) has a role type of Coordinator
	* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) has a role type of Service Provider
	* [LockScreenNotification](../Coordinators/LockScreenNotification.md) has a role type of Coordinator
	* [SendFailedNotifications](../Coordinators/SendFailedNotifications.md) has a role type of Coordinator
	* [SyncNotifications](../Coordinators/SyncNotifications.md) has a role type of Coordinator
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [IdentityHeaderParser](../ServiceProviders/IdentityHeaderParser.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) has a role type of Service Provider
	* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) has a role type of Service Provider
	* [PendingCommandSerializer](../Coordinators/PendingCommandSerializer.md) has a role type of Coordinator
	* [ComposeCryptoStatusBuilder](../ServiceProviders/ComposeCryptoStatusBuilder.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* appendValue(IdentityField field, String value)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
* appendValue(IdentityField field, String value)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
* appendValue(IdentityField field, String value)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
* appendValue(IdentityField field, String value)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
* setQuotedHtmlContent(InsertableHtmlContent quotedHtmlContent)
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* setQuoteStyle(QuoteStyle quoteStyle)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
* setQuoteTextMode(QuotedTextMode quotedTextMode)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* setMessageFormat(SimpleMessageFormat messageFormat)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
* setIdentity(Identity identity)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setIdentityChanged(boolean identityChanged)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setSignature(String signature)
	* [Identity](../InformationHolders/Identity.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
	* [EditIdentity](../Interfacers/EditIdentity.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) has a role type of Interfacer
* setSignatureChanged(boolean signatureChanged)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setMessageReference(MessageReference messageReference)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setBody(TextBody body)
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
* setBodyPlain(TextBody bodyPlain)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* setCursorPosition(int cursorPosition)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
