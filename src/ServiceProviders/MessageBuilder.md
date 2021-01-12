# MessageBuilder
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
* buildBody(MimeMessage message)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* buildIdentityHeader(TextBody body, TextBody bodyPlain)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* addAttachmentsToMessage(final MimeMultipart mp)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* buildText(boolean isDraft, SimpleMessageFormat simpleMessageFormat)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* buildText(boolean isDraft, SimpleMessageFormat simpleMessageFormat)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* setSubject(String subject)
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setSentDate(Date sentDate)
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setHideTimeZone(boolean hideTimeZone)
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
* setTo(List<Address> to)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* setCc(List<Address> cc)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* setBcc(List<Address> bcc)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* setInReplyTo(String inReplyTo)
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setReferences(String references)
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setRequestReadReceipt(boolean requestReadReceipt)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setIdentity(Identity identity)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setMessageFormat(SimpleMessageFormat messageFormat)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
* setText(String text)
	* [ClientCertificateSpinner](../Interfacers/ClientCertificateSpinner.md) has a role type of Interfacer
	* [FoldableLinearLayout](../Interfacers/FoldableLinearLayout.md) has a role type of Interfacer
	* [MessageTitleView](../Interfacers/MessageTitleView.md) has a role type of Interfacer
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [EolConvertingEditText](../ServiceProviders/EolConvertingEditText.md) has a role type of Service Provider
	* [AttachmentView](../Coordinators/AttachmentView.md) has a role type of Coordinator
	* [CryptoInfoDialog](../Interfacers/CryptoInfoDialog.md) has a role type of Interfacer
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [ClipboardManager](../ServiceProviders/ClipboardManager.md) has a role type of Service Provider
	* [FileBrowserHelper](../ServiceProviders/FileBrowserHelper.md) has a role type of Service Provider
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [AccountsAdapter](../Interfacers/AccountsAdapter.md) has a role type of Interfacer
	* [AccountsHandler](../Interfacers/AccountsHandler.md) has a role type of Interfacer
	* [AccountsAdapter](../Interfacers/AccountsAdapter.md) has a role type of Interfacer
	* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) has a role type of Interfacer
	* [AlternateRecipientAdapter](../Interfacers/AlternateRecipientAdapter.md) has a role type of Interfacer
	* [EditIdentity](../Interfacers/EditIdentity.md) has a role type of Interfacer
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [UpgradeDatabaseBroadcastReceiver](../Controllers/UpgradeDatabaseBroadcastReceiver.md) has a role type of Controller
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [WelcomeMessage](../Interfacers/WelcomeMessage.md) has a role type of Interfacer
	* [IdentityAdapter](../Structurers/IdentityAdapter.md) has a role type of Structurer
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
* setAttachments(List<Attachment> attachments)
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
* setQuoteStyle(QuoteStyle quoteStyle)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
* setQuotedTextMode(QuotedTextMode quotedTextMode)
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* setQuotedText(String quotedText)
	* [QuotedMessageMvpView](../Interfacers/QuotedMessageMvpView.md) has a role type of Interfacer
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
* setQuotedHtmlContent(InsertableHtmlContent quotedHtmlContent)
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* setReplyAfterQuote(boolean isReplyAfterQuote)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
* setSignatureBeforeQuotedText(boolean isSignatureBeforeQuotedText)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) has a role type of Interfacer
* setIdentityChanged(boolean identityChanged)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setSignatureChanged(boolean signatureChanged)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setCursorPosition(int cursorPosition)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setMessageReference(MessageReference messageReference)
	* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setDraft(boolean isDraft)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* setIsPgpInlineEnabled(boolean isPgpInlineEnabled)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* isDraft()
	* [Callback](../ServiceProviders/Callback.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* buildHeader(MimeMessage message)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* buildHeader(MimeMessage message)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* createMimeMultipart()
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* buildAsync(Callback callback)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* onActivityResult(final int requestCode, int resultCode, final Intent data, Callback callback)
	* [MessageCryptoPresenter](../Controllers/MessageCryptoPresenter.md) has a role type of Controller
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
	* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) has a role type of Interfacer
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
	* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) has a role type of Coordinator
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* detachCallback()
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
* reattachCallback(Callback callback)
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* queueMessageBuildSuccess(MimeMessage message)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) has a role type of Service Provider
* queueMessageBuildException(MessagingException exception)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
	* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) has a role type of Service Provider
* queueMessageBuildPendingIntent(PendingIntent pendingIntent, int requestCode)
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* deliverResult()
	* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) has a role type of Service Provider
	* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) has a role type of Service Provider
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
	* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) has a role type of Service Provider
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
