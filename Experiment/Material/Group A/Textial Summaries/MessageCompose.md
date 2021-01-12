# MessageCompose
### This Controller is responsible for controlling tasks and making functional decision. 
### A list of tasks and used objects in each task: 

 * onCreate(Bundle savedInstanceState)
	* Interfacers: 
		* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
		* [QuotedMessageMvpView](../Interfacers/QuotedMessageMvpView.md) 
	* Service Providers: 
		* [ComposePgpInlineDecider](../ServiceProviders/ComposePgpInlineDecider.md) 
		* [EolConvertingEditText](../ServiceProviders/EolConvertingEditText.md) 
		* [ComposePgpEnableByDefaultDecider](../ServiceProviders/ComposePgpEnableByDefaultDecider.md) 

 * processDraftMessage(MessageViewInfo messageViewInfo)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [MessageViewInfo](../InformationHolders/MessageViewInfo.md) 
		* [Identity](../InformationHolders/Identity.md) 
		* [MessageReference](../InformationHolders/MessageReference.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 
		* [Preferences](../Structurers/Preferences.md) 

 * onCreateDialog(int id)
	* Information Holders: 
		* [IdentityContainer](../InformationHolders/IdentityContainer.md) 
	* Structurers: 
		* [IdentityAdapter](../Structurers/IdentityAdapter.md) 

 * initFromIntent(final Intent intent)
	* Service Providers: 
		* [MailTo](../ServiceProviders/MailTo.md) 

 * onOptionsItemSelected(MenuItem item)

 * processMessageToReplyTo(MessageViewInfo messageViewInfo)
	* Information Holders: 
		* [MessageViewInfo](../InformationHolders/MessageViewInfo.md) 
		* [Identity](../InformationHolders/Identity.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 

 * processSourceMessage(MessageViewInfo messageViewInfo)
	* Information Holders: 
		* [MessageViewInfo](../InformationHolders/MessageViewInfo.md) 

 * onAccountChosen(Account account, Identity identity)
	* Information Holders: 
		* [Account](../InformationHolders/Account.md) 
		* [Identity](../InformationHolders/Identity.md) 

 * onActivityResult(int requestCode, int resultCode, Intent data)

 * createMessageBuilder(boolean isDraft)
	* Information Holders: 
		* [SendErrorState](../InformationHolders/SendErrorState.md) 
		* [ComposeCryptoStatus](../InformationHolders/ComposeCryptoStatus.md) 
	* Service Providers: 
		* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
		* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) 

 * updateMessageFormat()
	* Information Holders: 
		* [MessageFormat](../InformationHolders/MessageFormat.md) 
		* [SimpleMessageFormat](../InformationHolders/SimpleMessageFormat.md) 

 * onRestoreInstanceState(Bundle savedInstanceState)

 * onMessageBuildSuccess(MimeMessage message, boolean isDraft)
	* Coordinators: 
		* [MimeMessage](../Coordinators/MimeMessage.md) 
	* Service Provider: 
		* [SendMessageTask](../ServiceProviders/SendMessageTask.md)
		* [SaveMessageTask](../ServiceProviders/SaveMessageTask.md) 

 * prepareToFinish(boolean shouldNavigateUp)

 * onSaveInstanceState(Bundle outState)

 * processMessageToForward(MessageViewInfo messageViewInfo)
	* Information Holders: 
		* [MessageViewInfo](../InformationHolders/MessageViewInfo.md) 
	* Structurers: 
		* [Message](../Structurers/Message.md) 

 * onReadReceipt()

 * loadLocalMessageForDisplay(MessageViewInfo messageViewInfo, Action action)
	* Information Holders: 
		* [Action](../InformationHolders/Action.md) 
		* [MessageViewInfo](../InformationHolders/MessageViewInfo.md) 

 * onDiscard()

 * checkToSendMessage()

 * onCreateOptionsMenu(Menu menu)

 * checkToSaveDraftAndSave()

 * initializeFromMailto(MailTo mailTo)
	* Service Providers: 
		* [MailTo](../ServiceProviders/MailTo.md) 

 * switchToIdentity(Identity identity)
	* Information Holders: 
		* [Identity](../InformationHolders/Identity.md) 

 * onPause()

 * draftIsNotEmpty()

 * checkToSaveDraftImplicitly()

 * openAutoExpandFolder()
	* Structurers: 
		* [LocalSearch](../Structurers/LocalSearch.md) 

 * updateSignature()

 * onMessageBuildReturnPendingIntent(PendingIntent pendingIntent, int requestCode)

 * launchUserInteractionPendingIntent(PendingIntent pendingIntent, int requestCode)

 * performSendAfterChecks()

 * performSaveAfterChecks()

 * onFocusChange(View v, boolean hasFocus)

 * askBeforeDiscard()

 * onMessageBuildException(MessagingException me)
	* Information Holders: 
		* [MessagingException](../InformationHolders/MessagingException.md) 

 * onDestroy()

 * onPrepareOptionsMenu(Menu menu)

 * onRetainNonConfigurationInstance()

 * showContactPicker(int requestCode)

 * onClick(View view)

 * loadQuotedTextForEdit()

 * initializeActionBar()

 * onMessageBuildCancel()

 * onResume()

 * onOpenPgpInlineChange(boolean enabled)

 * updateFrom()

 * setCurrentMessageFormat(SimpleMessageFormat format)
	* Information Holders: 
		* [SimpleMessageFormat](../InformationHolders/SimpleMessageFormat.md) 

 * saveDraftEventually()

 * onAttachmentRemoved()

 * onOpenPgpSignOnlyChange(boolean enabled)

 * onOpenPgpClickDisable()

 * setTitle()

 * onProgressCancel(ProgressDialogFragment fragment)
	* Interfacers: 
		* [ProgressDialogFragment](../Interfacers/ProgressDialogFragment.md) 
		* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) 

 * onAttachmentAdded()

 * onBackPressed()

 * onRecipientsChanged()
