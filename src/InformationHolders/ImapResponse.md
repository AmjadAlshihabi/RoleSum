# ImapResponse
## This Information Holder is responsible for:
### providing and holding information about: 
* serialVersionUID
* commandContinuationRequested
* callback
* tag
### Providing information to the following objects 
* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
* [PushRunnable](../Controllers/PushRunnable.md) has a role type of Controller
* [ImapResponseCallback](../ServiceProviders/ImapResponseCallback.md) has a role type of Service Provider
* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
* [ImapUtility](../ServiceProviders/ImapUtility.md) has a role type of Service Provider
* [NegativeImapResponseException](../InformationHolders/NegativeImapResponseException.md) has a role type of Information Holder
