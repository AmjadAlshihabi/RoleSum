# Pop3Store
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* decodeUri(String uri)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [RemoteStore](../Structurers/RemoteStore.md) has a role type of Structurer
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
* createUri(ServerSettings server)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [RemoteStore](../Structurers/RemoteStore.md) has a role type of Structurer
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [QueryHandler](../ServiceProviders/QueryHandler.md) has a role type of Service Provider
* getFolder(String name)
	* [Message](../Structurers/Message.md) has a role type of Structurer
	* [Store](../InformationHolders/Store.md) has a role type of Information Holder
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [ImapMessage](../Structurers/ImapMessage.md) has a role type of Structurer
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [SqlQueryBuilder](../ServiceProviders/SqlQueryBuilder.md) has a role type of Service Provider
	* [DeleteUriExtractor](../Coordinators/DeleteUriExtractor.md) has a role type of Coordinator
	* [MessageInfoHolderRetrieverListener](../Structurers/MessageInfoHolderRetrieverListener.md) has a role type of Structurer
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MessageHelper](../ServiceProviders/MessageHelper.md) has a role type of Service Provider
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
	* [MessagingControllerPushReceiver](../Coordinators/MessagingControllerPushReceiver.md) has a role type of Coordinator
	* [EmailProviderCache](../Structurers/EmailProviderCache.md) has a role type of Structurer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [FolderListAdapter](../Interfacers/FolderListAdapter.md) has a role type of Interfacer
	* [FolderListHandler](../ServiceProviders/FolderListHandler.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
* getPersonalNamespaces(boolean forceListAll)
	* [Store](../InformationHolders/Store.md) has a role type of Information Holder
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [MigrationTo42](../ServiceProviders/MigrationTo42.md) has a role type of Service Provider
	* [MigrationTo55](../ServiceProviders/MigrationTo55.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) has a role type of Interfacer
* isSeenFlagSupported()
	* [Store](../InformationHolders/Store.md) has a role type of Information Holder
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* checkSettings()
	* [Store](../InformationHolders/Store.md) has a role type of Information Holder
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapStore](../Structurers/ImapStore.md) has a role type of Structurer
	* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
