# UidCopyResponse
## This Service Provider is responsible for:
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* parse(List<ImapResponse> imapResponses)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [StatusCodeClass](../InformationHolders/StatusCodeClass.md) has a role type of Information Holder
	* [StatusCodeSubject](../InformationHolders/StatusCodeSubject.md) has a role type of Information Holder
	* [StatusCodeDetail](../InformationHolders/StatusCodeDetail.md) has a role type of Information Holder
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [DataSet](../Structurers/DataSet.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [CapabilityResponse](../ServiceProviders/CapabilityResponse.md) has a role type of Service Provider
	* [FetchBodyCallback](../ServiceProviders/FetchBodyCallback.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapList](../Structurers/ImapList.md) has a role type of Structurer
	* [ImapPushState](../ServiceProviders/ImapPushState.md) has a role type of Service Provider
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
	* [NamespaceResponse](../ServiceProviders/NamespaceResponse.md) has a role type of Service Provider
	* [PermanentFlagsResponse](../ServiceProviders/PermanentFlagsResponse.md) has a role type of Service Provider
	* [SearchResponse](../Structurers/SearchResponse.md) has a role type of Structurer
	* [SelectOrExamineResponse](../ServiceProviders/SelectOrExamineResponse.md) has a role type of Service Provider
	* [UidCopyResponse](../ServiceProviders/UidCopyResponse.md) has a role type of Service Provider
	* [MessageHeaderParser](../ServiceProviders/MessageHeaderParser.md) has a role type of Service Provider
	* [ListHeaders](../ServiceProviders/ListHeaders.md) has a role type of Service Provider
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [MessageListWidgetProvider](../Controllers/MessageListWidgetProvider.md) has a role type of Controller
	* [PreLollipopWebViewClient](../Interfacers/PreLollipopWebViewClient.md) has a role type of Interfacer
	* [K9WebViewClient](../Interfacers/K9WebViewClient.md) has a role type of Interfacer
	* [Recipient](../InformationHolders/Recipient.md) has a role type of Information Holder
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [BootReceiver](../ServiceProviders/BootReceiver.md) has a role type of Service Provider
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
	* [NotificationController](../Controllers/NotificationController.md) has a role type of Controller
	* [IdentityHeaderParser](../ServiceProviders/IdentityHeaderParser.md) has a role type of Service Provider
	* [HtmlSignatureRemover](../Coordinators/HtmlSignatureRemover.md) has a role type of Coordinator
	* [HtmlSanitizer](../Coordinators/HtmlSanitizer.md) has a role type of Coordinator
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [FileBrowserHelper](../ServiceProviders/FileBrowserHelper.md) has a role type of Service Provider
	* [MailTo](../ServiceProviders/MailTo.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [MessageReference](../InformationHolders/MessageReference.md) has a role type of Information Holder
	* [MessageReferenceHelper](../ServiceProviders/MessageReferenceHelper.md) has a role type of Service Provider
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [OpenPgpAppSelectDialog](../Interfacers/OpenPgpAppSelectDialog.md) has a role type of Interfacer
	* [RecipientLoader](../ServiceProviders/RecipientLoader.md) has a role type of Service Provider
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* parseUidCopyResponse(ImapResponse response, Map<String, String> uidMappingOutput)
	* [UidCopyResponse](../ServiceProviders/UidCopyResponse.md) has a role type of Service Provider
* getUidMapping()
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [UidCopyResponse](../ServiceProviders/UidCopyResponse.md) has a role type of Service Provider
