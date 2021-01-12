# MessageBuilder
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* build() 
	* Coordinators: 
		* [LockScreenNotification](../Coordinators/LockScreenNotification.md) 
		* [MimeMessage](../Coordinators/MimeMessage.md) 
		* [PendingCommandSerializer](../Coordinators/PendingCommandSerializer.md) 
		* [DeleteUriExtractor](../Coordinators/DeleteUriExtractor.md) 
		* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
		* [SendFailedNotifications](../Coordinators/SendFailedNotifications.md) 
		* [AuthenticationErrorNotifications](../Coordinators/AuthenticationErrorNotifications.md) 
		* [SyncNotifications](../Coordinators/SyncNotifications.md) 
		* [WearNotifications](../Coordinators/WearNotifications.md) 
		* [CertificateErrorNotifications](../Coordinators/CertificateErrorNotifications.md) 
	* Information Holders: 
		* [UidSearchCommandBuilder](../InformationHolders/UidSearchCommandBuilder.md) 
	* Interfacers: 
		* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) 
	* Service Providers: 
		* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) 
		* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) 
		* [HighlightDialogFragment](../ServiceProviders/HighlightDialogFragment.md) 
		* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) 
		* [DeviceNotifications](../ServiceProviders/DeviceNotifications.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
		* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) 
		* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) 
		* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) 
		* [MessageHeaderParser](../ServiceProviders/MessageHeaderParser.md) 
		* [ComposeCryptoStatusBuilder](../ServiceProviders/ComposeCryptoStatusBuilder.md) 
		* [IdentityHeaderParser](../ServiceProviders/IdentityHeaderParser.md) 
		* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) 
	* Structurers: 
		* [ImapFolder](../Structurers/ImapFolder.md) 
* buildBody(MimeMessage message) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* buildIdentityHeader(TextBody body, TextBody bodyPlain) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* addAttachmentsToMessage(final MimeMultipart mp) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* buildText(boolean isDraft, SimpleMessageFormat simpleMessageFormat) 
	* Controllers: 
		* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* buildText(boolean isDraft, SimpleMessageFormat simpleMessageFormat) 
	* Controllers: 
		* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setSubject(String subject) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Coordinators: 
		* [MimeMessage](../Coordinators/MimeMessage.md) 
	* Information Holders: 
		* [LocalMessage](../InformationHolders/LocalMessage.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
* setSentDate(Date sentDate) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Coordinators: 
		* [MimeMessage](../Coordinators/MimeMessage.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
* setHideTimeZone(boolean hideTimeZone) 
	* Controllers: 
		* [K9](../Controllers/K9.md) 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Interfacers: 
		* [Prefs](../Interfacers/Prefs.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setTo(List<Address> to) 
	* Coordinators: 
		* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setCc(List<Address> cc) 
	* Coordinators: 
		* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setBcc(List<Address> bcc) 
	* Coordinators: 
		* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setInReplyTo(String inReplyTo) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Coordinators: 
		* [MimeMessage](../Coordinators/MimeMessage.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
* setReferences(String references) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Coordinators: 
		* [MimeMessage](../Coordinators/MimeMessage.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
* setRequestReadReceipt(boolean requestReadReceipt) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setIdentity(Identity identity) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setMessageFormat(SimpleMessageFormat messageFormat) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Interfacers: 
		* [AccountSettings](../Interfacers/AccountSettings.md) 
	* Service Providers: 
		* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setText(String text) 
	* Controllers: 
		* [UpgradeDatabaseBroadcastReceiver](../Controllers/UpgradeDatabaseBroadcastReceiver.md) 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Coordinators: 
		* [AttachmentView](../Coordinators/AttachmentView.md) 
	* Interfacers: 
		* [FolderListAdapter](../Interfacers/FolderListAdapter.md) 
		* [CryptoInfoDialog](../Interfacers/CryptoInfoDialog.md) 
		* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) 
		* [AccountsHandler](../Interfacers/AccountsHandler.md) 
		* [WelcomeMessage](../Interfacers/WelcomeMessage.md) 
		* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) 
		* [EditIdentity](../Interfacers/EditIdentity.md) 
		* [MessageTitleView](../Interfacers/MessageTitleView.md) 
		* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) 
		* [MessageTopView](../Interfacers/MessageTopView.md) 
		* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) 
		* [MessageListAdapter](../Interfacers/MessageListAdapter.md) 
		* [MessageListFragment](../Interfacers/MessageListFragment.md) 
		* [AlternateRecipientAdapter](../Interfacers/AlternateRecipientAdapter.md) 
		* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) 
		* [AccountSettings](../Interfacers/AccountSettings.md) 
		* [ClientCertificateSpinner](../Interfacers/ClientCertificateSpinner.md) 
		* [FoldableLinearLayout](../Interfacers/FoldableLinearLayout.md) 
		* [AccountSetupNames](../Interfacers/AccountSetupNames.md) 
		* [RecipientAdapter](../Interfacers/RecipientAdapter.md) 
		* [MessageContainerView](../Interfacers/MessageContainerView.md) 
		* [RecipientSelectView](../Interfacers/RecipientSelectView.md) 
		* [AccountsAdapter](../Interfacers/AccountsAdapter.md) 
		* [MessageHeader](../Interfacers/MessageHeader.md) 
		* [MessageList](../Interfacers/MessageList.md) 
		* [FolderList](../Interfacers/FolderList.md) 
	* Service Providers: 
		* [EolConvertingEditText](../ServiceProviders/EolConvertingEditText.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
		* [FolderListHandler](../ServiceProviders/FolderListHandler.md) 
		* [ClipboardManager](../ServiceProviders/ClipboardManager.md) 
		* [FileBrowserHelper](../ServiceProviders/FileBrowserHelper.md) 
	* Structurers: 
		* [IdentityAdapter](../Structurers/IdentityAdapter.md) 
* setAttachments(List<Attachment> attachments) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setSignature(String signature) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Identity](../InformationHolders/Identity.md) 
	* Interfacers: 
		* [EditIdentity](../Interfacers/EditIdentity.md) 
		* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) 
	* Service Providers: 
		* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) 
		* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setQuoteStyle(QuoteStyle quoteStyle) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Interfacers: 
		* [AccountSettings](../Interfacers/AccountSettings.md) 
	* Service Providers: 
		* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
	* Structurers: 
		* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* setQuotedTextMode(QuotedTextMode quotedTextMode) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
	* Structurers: 
		* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* setQuotedText(String quotedText) 
	* Interfacers: 
		* [QuotedMessageMvpView](../Interfacers/QuotedMessageMvpView.md) 
	* Service Providers: 
		* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
	* Structurers: 
		* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* setQuotedHtmlContent(InsertableHtmlContent quotedHtmlContent) 
	* Service Providers: 
		* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
	* Structurers: 
		* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* setReplyAfterQuote(boolean isReplyAfterQuote) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Interfacers: 
		* [AccountSettings](../Interfacers/AccountSettings.md) 
	* Service Providers: 
		* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
	* Structurers: 
		* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* setSignatureBeforeQuotedText(boolean isSignatureBeforeQuotedText) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
	* Interfacers: 
		* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) 
	* Service Providers: 
		* [TextBodyBuilder](../ServiceProviders/TextBodyBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setIdentityChanged(boolean identityChanged) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setSignatureChanged(boolean signatureChanged) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setCursorPosition(int cursorPosition) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setMessageReference(MessageReference messageReference) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setDraft(boolean isDraft) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* setIsPgpInlineEnabled(boolean isPgpInlineEnabled) 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* isDraft() 
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [Callback](../ServiceProviders/Callback.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
		* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) 
### Offering configuration features to other object. List of configuration features and corresponding consumer objects: 
* buildHeader(MimeMessage message)
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* buildHeader(MimeMessage message)
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* createMimeMultipart()
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
		* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) 
* buildAsync(Callback callback)
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* onActivityResult(final int requestCode, int resultCode, final Intent data, Callback callback)
	* Controllers: 
		* [MessageCryptoPresenter](../Controllers/MessageCryptoPresenter.md) 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Coordinators: 
		* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
		* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
		* [Accounts](../Coordinators/Accounts.md) 
	* Interfacers: 
		* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) 
		* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) 
		* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) 
		* [MessageViewFragment](../Interfacers/MessageViewFragment.md) 
		* [Prefs](../Interfacers/Prefs.md) 
		* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) 
		* [MessageListFragment](../Interfacers/MessageListFragment.md) 
		* [AccountSettings](../Interfacers/AccountSettings.md) 
		* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) 
		* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) 
		* [MessageList](../Interfacers/MessageList.md) 
	* Service Providers: 
		* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
		* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) 
* detachCallback()
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
		* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) 
		* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) 
* reattachCallback(Callback callback)
	* Controllers: 
		* [MessageCompose](../Controllers/MessageCompose.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
		* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) 
* queueMessageBuildSuccess(MimeMessage message)
	* Service Providers: 
		* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
		* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) 
* queueMessageBuildException(MessagingException exception)
	* Service Providers: 
		* [SimpleMessageBuilder](../ServiceProviders/SimpleMessageBuilder.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
		* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) 
* queueMessageBuildPendingIntent(PendingIntent pendingIntent, int requestCode)
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
		* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) 
* deliverResult()
	* Coordinators: 
		* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
	* Service Providers: 
		* [AttachmentInfoLoader](../ServiceProviders/AttachmentInfoLoader.md) 
		* [RecipientLoader](../ServiceProviders/RecipientLoader.md) 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
		* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) 
		* [LocalMessageExtractorLoader](../ServiceProviders/LocalMessageExtractorLoader.md) 
		* [LocalMessageLoader](../ServiceProviders/LocalMessageLoader.md) 
		* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) 
