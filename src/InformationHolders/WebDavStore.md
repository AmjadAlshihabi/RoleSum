# WebDavStore
## This Information Holder is responsible for:
### providing and holding information about: 
* httpClient
* httpContext
* sendFolder
* mailboxPath
* authCookies
* formBasedAuthPath
* folderList
* cachedLoginUrl
* mConnectionSecurity
* httpClientFactory
* path
* password
* baseUrl
* hostname
* port
* alias
* authenticationType
* authString
* username
### Managing database tasks through the following methods:
* getFolderListXml()
* getMessageCountXml(String messageState)
* getMessageEnvelopeXml(String[] uids)
* getMessagesXml()
* getMessageUrlsXml(String[] uids)
* getMessageFlagsXml(String[] uids)
### Providing information to the following objects 
* [WebDavTransport](../ServiceProviders/WebDavTransport.md) has a role type of Service Provider
* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
* [WebDavStoreUriCreator](../ServiceProviders/WebDavStoreUriCreator.md) has a role type of Service Provider
* [WebDavStoreUriDecoder](../ServiceProviders/WebDavStoreUriDecoder.md) has a role type of Service Provider
