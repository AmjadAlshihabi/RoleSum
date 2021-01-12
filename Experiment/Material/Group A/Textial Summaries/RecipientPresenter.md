# RecipientPresenter
### This Coordinator is responsible for delegating work between objects: 

### the initFromReplyToMessage method receives requests from:
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [ReplyToAddresses](../InformationHolders/ReplyToAddresses.md) 
* [CryptoMode](../InformationHolders/CryptoMode.md) 
* [ComposePgpEnableByDefaultDecider](../ServiceProviders/ComposePgpEnableByDefaultDecider.md) 
* [ComposePgpInlineDecider](../ServiceProviders/ComposePgpInlineDecider.md) 
* [ReplyToParser](../ServiceProviders/ReplyToParser.md) 
* [Account](../InformationHolders/Account.md) 
* [Message](../Structurers/Message.md) 


### the addRecipientFromContactUri method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Recipient](../InformationHolders/Recipient.md) 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the onClickBccLabel method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the checkRecipientsOkForSending method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the onToFocused method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the initFromMailto method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [MailTo](../ServiceProviders/MailTo.md) 


### the onActivityResult method receives requests from:
* [MessageCryptoPresenter](../Controllers/MessageCryptoPresenter.md) 
* [MessageViewFragment](../Interfacers/MessageViewFragment.md) 
* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) 
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* [MessageListFragment](../Interfacers/MessageListFragment.md) 
* [Accounts](../Coordinators/Accounts.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [MessageList](../Interfacers/MessageList.md) 
* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) 
* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) 
* [AccountSettings](../Interfacers/AccountSettings.md) 
* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) 
* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) 
* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) 
* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) 
* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) 
* [Prefs](../Interfacers/Prefs.md) 
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the hideEmptyExtendedRecipientFields method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the getCurrentCachedCryptoStatus method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [ComposeCryptoStatus](../InformationHolders/ComposeCryptoStatus.md) 


### the onMenuSetPgpInline method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the cryptoProviderBindOrCheckPermission method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the onCcTokenAdded method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientsChangedListener](../ServiceProviders/RecipientsChangedListener.md) 


### the onToTokenChanged method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientsChangedListener](../ServiceProviders/RecipientsChangedListener.md) 


### the updateRecipientExpanderVisibility method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the addToAddresses method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Address](../ServiceProviders/Address.md) 


### the onCcTokenRemoved method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientsChangedListener](../ServiceProviders/RecipientsChangedListener.md) 


### the onMenuSetSignOnly method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the onSwitchIdentity method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Identity](../InformationHolders/Identity.md) 


### the initFromDraftMessage method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Message](../Structurers/Message.md) 


### the onNonRecipientFieldFocused method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the onBccTokenRemoved method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientsChangedListener](../ServiceProviders/RecipientsChangedListener.md) 


### the setCryptoProviderState method receives requests from:
* [ComposeCryptoStatusBuilder](../ServiceProviders/ComposeCryptoStatusBuilder.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [CryptoProviderState](../InformationHolders/CryptoProviderState.md) 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [CryptoProviderState](../InformationHolders/CryptoProviderState.md) 


### the showPgpSendError method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [SendErrorState](../InformationHolders/SendErrorState.md) 


### the getBccAddresses method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the builderSetProperties method receives requests from:
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) 
* [ComposeCryptoStatus](../InformationHolders/ComposeCryptoStatus.md) 


### the onSwitchAccount method receives requests from:
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [Account](../InformationHolders/Account.md) 
* [Account](../InformationHolders/Account.md) 


### the asyncUpdateCryptoStatus method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [ComposeCryptoStatus](../InformationHolders/ComposeCryptoStatus.md) 
* [CryptoMode](../InformationHolders/CryptoMode.md) 
* [CryptoProviderState](../InformationHolders/CryptoProviderState.md) 
* [ComposeCryptoStatus](../InformationHolders/ComposeCryptoStatus.md) 
* [AutocryptStatusInteractor](../ServiceProviders/AutocryptStatusInteractor.md) 
* [Account](../InformationHolders/Account.md) 


### the getCcAddresses method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the showPgpAttachError method receives requests from:
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [AttachErrorState](../InformationHolders/AttachErrorState.md) 


### the addCcAddresses method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [Address](../ServiceProviders/Address.md) 


### the onPgpPermissionCheckResult method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the setupCryptoProvider method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the onClickCryptoStatus method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [ComposeCryptoStatus](../InformationHolders/ComposeCryptoStatus.md) 
* [CryptoMode](../InformationHolders/CryptoMode.md) 
* [CryptoProviderState](../InformationHolders/CryptoProviderState.md) 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the recipientTypeToRequestCode method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the onBccTokenAdded method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientsChangedListener](../ServiceProviders/RecipientsChangedListener.md) 


### the onRestoreInstanceState method receives requests from:
* [FoldableLinearLayout](../Interfacers/FoldableLinearLayout.md) 
* [MessageHeader](../Interfacers/MessageHeader.md) 
* [MessageContainerView](../Interfacers/MessageContainerView.md) 
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* [MessageListHandler](../Interfacers/MessageListHandler.md) 
* [Accounts](../Coordinators/Accounts.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [MessageList](../Interfacers/MessageList.md) 
* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) 
* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) 
* [SliderPreference](../InformationHolders/SliderPreference.md) 
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [CryptoMode](../InformationHolders/CryptoMode.md) 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the handleOpenPgpError method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the redrawCachedCryptoStatusIcon method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [CryptoStatusDisplayType](../InformationHolders/CryptoStatusDisplayType.md) 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [ComposeCryptoStatus](../InformationHolders/ComposeCryptoStatus.md) 


### the addRecipientsFromAddresses method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientType](../InformationHolders/RecipientType.md) 
* [Address](../ServiceProviders/Address.md) 


### the onClickCryptoSpecialModeIndicator method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [CryptoMode](../InformationHolders/CryptoMode.md) 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the getToAddresses method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the onToTokenRemoved method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientsChangedListener](../ServiceProviders/RecipientsChangedListener.md) 


### the onCcTokenChanged method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientsChangedListener](../ServiceProviders/RecipientsChangedListener.md) 


### the getAllRecipients method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the onBccFocused method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the onClickRecipientExpander method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the onPrepareOptionsMenu method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [MessageList](../Interfacers/MessageList.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [ComposeCryptoStatus](../InformationHolders/ComposeCryptoStatus.md) 


### the onCryptoProviderError method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the onCryptoModeChanged method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [CryptoMode](../InformationHolders/CryptoMode.md) 
* [CryptoMode](../InformationHolders/CryptoMode.md) 


### the onCcFocused method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the onClickToLabel method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the onMenuAddFromContacts method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the hasContactPicker method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Contacts](../ServiceProviders/Contacts.md) 


### the addBccAddresses method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [Account](../InformationHolders/Account.md) 
* [Address](../ServiceProviders/Address.md) 


### the initRecipientsFromDraftMessage method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Message](../Structurers/Message.md) 


### the shouldSaveRemotely method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [ComposeCryptoStatus](../InformationHolders/ComposeCryptoStatus.md) 


### the onMenuSetEnableEncryption method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [ComposeCryptoStatus](../InformationHolders/ComposeCryptoStatus.md) 


### the initPgpInlineFromDraftMessage method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Message](../Structurers/Message.md) 


### the onClickCcLabel method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 


### the initFromTrustIdAction method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [CryptoMode](../InformationHolders/CryptoMode.md) 


### the onSaveInstanceState method receives requests from:
* [FoldableLinearLayout](../Interfacers/FoldableLinearLayout.md) 
* [MessageHeader](../Interfacers/MessageHeader.md) 
* [MessageCryptoPresenter](../Controllers/MessageCryptoPresenter.md) 
* [MessageContainerView](../Interfacers/MessageContainerView.md) 
* [MessageViewFragment](../Interfacers/MessageViewFragment.md) 
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* [MessageListFragment](../Interfacers/MessageListFragment.md) 
* [Accounts](../Coordinators/Accounts.md) 
* [EditIdentity](../Interfacers/EditIdentity.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [MessageList](../Interfacers/MessageList.md) 
* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) 
* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) 
* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) 
* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) 
* [SliderPreference](../InformationHolders/SliderPreference.md) 
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [CryptoMode](../InformationHolders/CryptoMode.md) 
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the onToTokenAdded method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientsChangedListener](../ServiceProviders/RecipientsChangedListener.md) 


### the onBccTokenChanged method receives requests from:
* [RecipientMvpView](../Interfacers/RecipientMvpView.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientsChangedListener](../ServiceProviders/RecipientsChangedListener.md) 


