# Pop3ResponseInputStream
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* read()
	* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
	* [DataSet](../Structurers/DataSet.md) has a role type of Structurer
	* [WebDavFolder](../ServiceProviders/WebDavFolder.md) has a role type of Service Provider
	* [WebDavStore](../InformationHolders/WebDavStore.md) has a role type of Information Holder
	* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
	* [Pop3ResponseInputStream](../ServiceProviders/Pop3ResponseInputStream.md) has a role type of Service Provider
	* [ImapResponseParser](../ServiceProviders/ImapResponseParser.md) has a role type of Service Provider
	* [Iso2022JpToShiftJisInputStream](../ServiceProviders/Iso2022JpToShiftJisInputStream.md) has a role type of Service Provider
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
	* [FixedLengthInputStream](../Coordinators/FixedLengthInputStream.md) has a role type of Coordinator
	* [PeekableInputStream](../ServiceProviders/PeekableInputStream.md) has a role type of Service Provider
	* [UnreadExtractor](../Coordinators/UnreadExtractor.md) has a role type of Coordinator
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [MigrationTo46](../ServiceProviders/MigrationTo46.md) has a role type of Service Provider
	* [FileHelper](../ServiceProviders/FileHelper.md) has a role type of Service Provider
	* [MessageHelper](../ServiceProviders/MessageHelper.md) has a role type of Service Provider
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [MessageInfoHolder](../InformationHolders/MessageInfoHolder.md) has a role type of Information Holder
