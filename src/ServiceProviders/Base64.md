# Base64
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* hasData()
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [RetainFragment](../InformationHolders/RetainFragment.md) has a role type of Information Holder
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
* avail()
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
* resizeBuf()
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
* readResults(byte[] b, int bPos, int bAvail)
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
	* [Base64OutputStream](../Coordinators/Base64OutputStream.md) has a role type of Coordinator
* setInitialBuffer(byte[] out, int outPos, int outAvail)
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
* isArrayByteBase64(byte[] arrayOctet)
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
* containsBase64Byte(byte[] arrayOctet)
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
* encodeBase64Chunked(byte[] binaryData)
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
* decodeBase64(byte[] base64Data)
	* [Authentication](../ServiceProviders/Authentication.md) has a role type of Service Provider
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
	* [AutocryptHeaderParser](../ServiceProviders/AutocryptHeaderParser.md) has a role type of Service Provider
* isWhiteSpace(byte byteToCheck)
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
* discardNonBase64(byte[] data)
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
* decodeInteger(byte[] pArray)
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
* encodeInteger(BigInteger bigInt)
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
* toIntegerBytes(BigInteger bigInt)
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* encode(byte[] pArray)
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
* encode(byte[] pArray)
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
* encode(byte[] pArray)
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
* encode(byte[] pArray)
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
* encode(byte[] pArray)
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
* encode(byte[] pArray)
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
* decode(byte[] pArray)
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
* decode(byte[] pArray)
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
* decode(byte[] pArray)
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
* decode(byte[] pArray)
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
* isBase64(byte octet)
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
* isBase64(byte octet)
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
* encodeBase64(byte[] binaryData, boolean isChunked)
	* [Authentication](../ServiceProviders/Authentication.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
* encodeBase64(byte[] binaryData, boolean isChunked)
	* [Authentication](../ServiceProviders/Authentication.md) has a role type of Service Provider
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [Base64](../ServiceProviders/Base64.md) has a role type of Service Provider
