# Message
## This Structurer is responsible for:
### implementing the following interfaces:
* [Part](../ServiceProviders/Part.md) 
* [Body](../ServiceProviders/Body.md) 
### managing the relationships between the following objects as components:
* Structurers: 
	* [Folder](../Structurers/Folder.md) 
### Maintaining relationships between objects through the following methods: 
* olderThan(Date earliestDate)
* equals(Object o)
* hashCode()
* getUid()
* setUid(String uid)
* getInternalDate()
* setInternalDate(Date internalDate)
* setRecipient(RecipientType type, Address address)
* delete(String trashFolderName)
* getFlags()
* setFlag(Flag flag, boolean set)
* setFlags(final Set<Flag> flags, boolean set)
* isSet(Flag flag)
* calculateSize()
* copy(Message destination)
