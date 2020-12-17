# Message
## This Structurer is responsible for:
### implementing the following interfaces:
* [Part](../ServiceProviders/Part.md) 
* [Body](../ServiceProviders/Body.md) 
### managing the relationships between the following objects as components:
* [Folder](../Structurers/Folder.md) 
### Maintaining relatiohships between objects through the following methods: 
* getFlags()
* setFlags(final Set<Flag> flags, boolean set)
* isSet(Flag flag)
* copy(Message destination)
