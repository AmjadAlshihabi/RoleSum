# ImapStore
## This Structurer is responsible for:
### inheriting the following classes:
* [RemoteStore](../Structurers/RemoteStore.md)
### managing the relationships between the following objects as components:
* [ConnectionSecurity](../InformationHolders/ConnectionSecurity.md) 
* [OAuth2TokenProvider](../ServiceProviders/OAuth2TokenProvider.md) 
* [FolderNameCodec](../ServiceProviders/FolderNameCodec.md) 
* [AuthType](../InformationHolders/AuthType.md) 
### Maintaining relatiohships between objects through the following methods: 
* decodeUri(String uri)
* createUri(ServerSettings server)
* getPersonalNamespaces(boolean forceListAll)
* listFolders(ImapConnection connection, boolean subscribedOnly)
* checkSettings()
* createImapConnection()
* getFolders(Collection<String> folderNames)
* getPermanentFlagsIndex()
