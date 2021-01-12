# ImapUtility
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getImapSequenceValues(String set)
	* [ImapUtility](../ServiceProviders/ImapUtility.md) has a role type of Service Provider
	* [UidCopyResponse](../ServiceProviders/UidCopyResponse.md) has a role type of Service Provider
* getImapRangeValues(String range)
	* [ImapUtility](../ServiceProviders/ImapUtility.md) has a role type of Service Provider
* isNumberValid(String number)
	* [ImapUtility](../ServiceProviders/ImapUtility.md) has a role type of Service Provider
* is32bitValue(long value)
	* [ImapUtility](../ServiceProviders/ImapUtility.md) has a role type of Service Provider
* encodeString(String str)
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [ImapUtility](../ServiceProviders/ImapUtility.md) has a role type of Service Provider
	* [UidSearchCommandBuilder](../InformationHolders/UidSearchCommandBuilder.md) has a role type of Information Holder
* getLastResponse(List<ImapResponse> responses)
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapUtility](../ServiceProviders/ImapUtility.md) has a role type of Service Provider
	* [NegativeImapResponseException](../InformationHolders/NegativeImapResponseException.md) has a role type of Information Holder
* combineFlags(Iterable<Flag> flags, boolean canCreateForwardedFlag)
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapUtility](../ServiceProviders/ImapUtility.md) has a role type of Service Provider
* join(String delimiter, Collection<? extends Object> tokens)
	* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapUtility](../ServiceProviders/ImapUtility.md) has a role type of Service Provider
	* [LockScreenNotification](../Coordinators/LockScreenNotification.md) has a role type of Coordinator
	* [UriLinkifier](../ServiceProviders/UriLinkifier.md) has a role type of Service Provider
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
