# EncoderUtil
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* initChars(String specials)
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
* bEncodedLength(byte[] bytes)
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
* encode(String text, Charset charset)
	* [TransportUris](../ServiceProviders/TransportUris.md) has a role type of Service Provider
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [FolderNameCodec](../ServiceProviders/FolderNameCodec.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
	* [SignSafeOutputStream](../ServiceProviders/SignSafeOutputStream.md) has a role type of Service Provider
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [ContactBadge](../Interfacers/ContactBadge.md) has a role type of Interfacer
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [Contacts](../ServiceProviders/Contacts.md) has a role type of Service Provider
	* [UrlEncodingHelper](../ServiceProviders/UrlEncodingHelper.md) has a role type of Service Provider
	* [MessageReference](../InformationHolders/MessageReference.md) has a role type of Information Holder
* determineCharset(String text)
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* encodeEncodedWord(String text, Charset charset)
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
	* [MimeHeader](../Structurers/MimeHeader.md) has a role type of Structurer
* encodeB(String prefix, String text, Charset charset, byte[] bytes)
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
* encodeB(String prefix, String text, Charset charset, byte[] bytes)
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
* encodeQ(String prefix, String text,  Charset charset, byte[] bytes)
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
* encodeQ(String prefix, String text,  Charset charset, byte[] bytes)
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
* qEncodedLength(byte[] bytes)
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
* determineEncoding(byte[] bytes)
	* [EncoderUtil](../ServiceProviders/EncoderUtil.md) has a role type of Service Provider
