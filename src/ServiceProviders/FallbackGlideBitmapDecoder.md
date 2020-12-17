# FallbackGlideBitmapDecoder
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getId()
	* [FoldableLinearLayout](../Interfacers/FoldableLinearLayout.md) has a role type of Interfacer
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [ToolableViewAnimator](../Interfacers/ToolableViewAnimator.md) has a role type of Interfacer
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [AttachmentView](../Coordinators/AttachmentView.md) has a role type of Coordinator
	* [LockedAttachmentView](../Interfacers/LockedAttachmentView.md) has a role type of Interfacer
	* [QuotedMessageMvpView](../Interfacers/QuotedMessageMvpView.md) has a role type of Interfacer
	* [SearchAccount](../Coordinators/SearchAccount.md) has a role type of Coordinator
	* [ExternalStorageProvider](../InformationHolders/ExternalStorageProvider.md) has a role type of Information Holder
	* [HtcIncredibleStorageProvider](../InformationHolders/HtcIncredibleStorageProvider.md) has a role type of Information Holder
	* [InternalStorageProvider](../InformationHolders/InternalStorageProvider.md) has a role type of Information Holder
	* [SamsungGalaxySStorageProvider](../InformationHolders/SamsungGalaxySStorageProvider.md) has a role type of Information Holder
	* [StorageProvider](../InformationHolders/StorageProvider.md) has a role type of Information Holder
	* [StorageManager](../ServiceProviders/StorageManager.md) has a role type of Service Provider
	* [MessageViewHolder](../Interfacers/MessageViewHolder.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [LauncherShortcuts](../Interfacers/LauncherShortcuts.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
	* [AccountSetupAccountType](../Interfacers/AccountSetupAccountType.md) has a role type of Interfacer
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [AccountSetupOptions](../Interfacers/AccountSetupOptions.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [WelcomeMessage](../Interfacers/WelcomeMessage.md) has a role type of Interfacer
	* [FallbackGlideBitmapDecoder](../ServiceProviders/FallbackGlideBitmapDecoder.md) has a role type of Service Provider
	* [FallbackGlideModelLoader](../ServiceProviders/FallbackGlideModelLoader.md) has a role type of Service Provider
	* [FallbackGlideParams](../InformationHolders/FallbackGlideParams.md) has a role type of Information Holder
	* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) has a role type of Coordinator
	* [RecipientMvpView](../Interfacers/RecipientMvpView.md) has a role type of Interfacer
	* [SaveMessageTask](../ServiceProviders/SaveMessageTask.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* decode(FallbackGlideParams source, int width, int height)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [WebDavStoreUriDecoder](../ServiceProviders/WebDavStoreUriDecoder.md) has a role type of Service Provider
	* [FolderNameCodec](../ServiceProviders/FolderNameCodec.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ImapStoreUriDecoder](../ServiceProviders/ImapStoreUriDecoder.md) has a role type of Service Provider
	* [XOAuth2ChallengeParser](../Coordinators/XOAuth2ChallengeParser.md) has a role type of Coordinator
	* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [IdentityHeaderParser](../ServiceProviders/IdentityHeaderParser.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [MailTo](../ServiceProviders/MailTo.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [MessageReference](../InformationHolders/MessageReference.md) has a role type of Information Holder
	* [FallbackGlideBitmapDecoder](../ServiceProviders/FallbackGlideBitmapDecoder.md) has a role type of Service Provider
