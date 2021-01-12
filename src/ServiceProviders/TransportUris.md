# TransportUris
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* decodeTransportUri(String uri)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) has a role type of Interfacer
	* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
* createTransportUri(ServerSettings server)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
* decodeSmtpUri(String uri)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
* createSmtpUri(ServerSettings server)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
* decodeWebDavUri(String uri)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
* createWebDavUri(ServerSettings server)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
* encodeUtf8(String s)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [HttpGeneric](../InformationHolders/HttpGeneric.md) has a role type of Information Holder
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [WebDavStoreUriCreator](../ServiceProviders/WebDavStoreUriCreator.md) has a role type of Service Provider
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapStoreUriCreator](../ServiceProviders/ImapStoreUriCreator.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
* decodeUtf8(String s)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [HttpGeneric](../InformationHolders/HttpGeneric.md) has a role type of Information Holder
	* [WebDavMessage](../ServiceProviders/WebDavMessage.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [WebDavStoreUriDecoder](../ServiceProviders/WebDavStoreUriDecoder.md) has a role type of Service Provider
	* [Pop3Store](../ServiceProviders/Pop3Store.md) has a role type of Service Provider
	* [ImapStoreUriDecoder](../ServiceProviders/ImapStoreUriDecoder.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
