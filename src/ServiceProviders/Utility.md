# Utility
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* arrayContains(Object[] a, Object o)
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [MessageListActivityListener](../Coordinators/MessageListActivityListener.md) has a role type of Coordinator
* isAnyMimeType(String o, String... a)
	* [MigrationTo51](../ServiceProviders/MigrationTo51.md) has a role type of Service Provider
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
* arrayContainsAny(Object[] a, Object... o)
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
* combine(Iterable<?> parts, char separator)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
* combine(Iterable<?> parts, char separator)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
* requiredFieldValid(Editable s)
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
* requiredFieldValid(Editable s)
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
* domainFieldValid(EditText view)
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
* setCompoundDrawablesAlpha(TextView view, int alpha)
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
* stripNewLines(String multiLineString)
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* closeQuietly(final Cursor cursor)
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [ImapConnection](../ServiceProviders/ImapConnection.md) has a role type of Service Provider
	* [LocalKeyStore](../InformationHolders/LocalKeyStore.md) has a role type of Information Holder
	* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MigrationTo41](../ServiceProviders/MigrationTo41.md) has a role type of Service Provider
	* [MigrationTo60](../ServiceProviders/MigrationTo60.md) has a role type of Service Provider
	* [FileHelper](../ServiceProviders/FileHelper.md) has a role type of Service Provider
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
* hasConnectivity(final Context context)
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
* getMainThreadHandler()
	* [RigidWebView](../InformationHolders/RigidWebView.md) has a role type of Information Holder
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
* setContactForBadge(ContactBadge contactBadge,
                                          Address address)
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* wrap(String str, int wrapLength, String newLineStr, boolean wrapLongWords)
	* [FolderNameCodec](../ServiceProviders/FolderNameCodec.md) has a role type of Service Provider
	* [TextQuoteCreator](../ServiceProviders/TextQuoteCreator.md) has a role type of Service Provider
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
* stripSubject(final String subject)
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
* stripSubject(final String subject)
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [MlfUtils](../ServiceProviders/MlfUtils.md) has a role type of Service Provider
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
* hasExternalImages(final String message)
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
* extractMessageIds(final String text)
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
* extractMessageId(final String text)
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
