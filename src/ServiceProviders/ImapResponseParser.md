# ImapResponseParser
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* readResponse(ImapResponseCallback callback)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* readResponse(ImapResponseCallback callback)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* readContinuationRequest(ImapResponseCallback callback)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* readUntaggedResponse(ImapResponseCallback callback)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* readTaggedResponse(ImapResponseCallback callback)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* readStatusResponse(String tag, String commandToLog, String logId,
            UntaggedHandler untaggedHandler)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* readTokens(ImapResponse response)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* parseResponseText(ImapResponse parent)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* parseListResponse(ImapResponse response)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* skipIfSpace()
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* readToken(ImapResponse response)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* parseToken(ImapList parent)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* parseString()
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* parseCommandContinuationRequest()
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* parseUntaggedResponse()
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* parseTaggedResponse()
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* parseList(ImapList parent, char start, char end)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
* parseBareString(boolean allowBrackets)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* parseLiteral()
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* parseQuoted()
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* parseQuotedOrNil()
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* parseNil()
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* readStringUntil(char end)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* formatChar(char value)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* readStringUntilEndOfLine()
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* expect(char expected)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
	* [MimeMessageBuilder](../Structurers/MimeMessageBuilder.md) has a role type of Structurer
	* [PartBuilder](../Structurers/PartBuilder.md) has a role type of Structurer
* isStatusResponse(String symbol)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* equalsIgnoreCase(Object token, String symbol)
	* [Multipart](../Structurers/Multipart.md) has a role type of Structurer
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [AlertResponse](../ServiceProviders/AlertResponse.md) has a role type of Service Provider
	* [CapabilityResponse](../ServiceProviders/CapabilityResponse.md) has a role type of Service Provider
	* [FetchBodyCallback](../ServiceProviders/FetchBodyCallback.md) has a role type of Service Provider
	* [FetchPartCallback](../Coordinators/FetchPartCallback.md) has a role type of Coordinator
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
	* [ImapFolderPusher](../Controllers/ImapFolderPusher.md) has a role type of Controller
	* [ImapList](../Structurers/ImapList.md) has a role type of Structurer
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ListResponse](../ServiceProviders/ListResponse.md) has a role type of Service Provider
	* [NamespaceResponse](../ServiceProviders/NamespaceResponse.md) has a role type of Service Provider
	* [NegativeImapResponseException](../InformationHolders/NegativeImapResponseException.md) has a role type of Information Holder
	* [PermanentFlagsResponse](../ServiceProviders/PermanentFlagsResponse.md) has a role type of Service Provider
	* [SearchResponse](../Structurers/SearchResponse.md) has a role type of Structurer
	* [SelectOrExamineResponse](../ServiceProviders/SelectOrExamineResponse.md) has a role type of Service Provider
	* [UidCopyResponse](../ServiceProviders/UidCopyResponse.md) has a role type of Service Provider
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [BinaryTempFileMessageBody](../InformationHolders/BinaryTempFileMessageBody.md) has a role type of Information Holder
	* [DecoderUtil](../ServiceProviders/DecoderUtil.md) has a role type of Service Provider
	* [FlowedMessageUtils](../ServiceProviders/FlowedMessageUtils.md) has a role type of Service Provider
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
	* [MimeBodyPart](../Structurers/MimeBodyPart.md) has a role type of Structurer
	* [MimeHeader](../Structurers/MimeHeader.md) has a role type of Structurer
	* [MimeMessage](../Coordinators/MimeMessage.md) has a role type of Coordinator
	* [MimeUtility](../ServiceProviders/MimeUtility.md) has a role type of Service Provider
	* [TextBody](../InformationHolders/TextBody.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [NotificationActionService](../Controllers/NotificationActionService.md) has a role type of Controller
	* [WearNotifications](../Coordinators/WearNotifications.md) has a role type of Coordinator
	* [CleaningVisitor](../Structurers/CleaningVisitor.md) has a role type of Structurer
	* [HttpUriParser](../ServiceProviders/HttpUriParser.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [CaseInsensitiveParamWrapper](../ServiceProviders/CaseInsensitiveParamWrapper.md) has a role type of Service Provider
	* [MessageCryptoStructureDetector](../ServiceProviders/MessageCryptoStructureDetector.md) has a role type of Service Provider
	* [AutocryptHeaderParser](../ServiceProviders/AutocryptHeaderParser.md) has a role type of Service Provider
	* [AutocryptOperations](../ServiceProviders/AutocryptOperations.md) has a role type of Service Provider
	* [ActivityListener](../ServiceProviders/ActivityListener.md) has a role type of Service Provider
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [FolderInfoHolder](../InformationHolders/FolderInfoHolder.md) has a role type of Information Holder
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
* checkTokenIsString(Object token)
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
