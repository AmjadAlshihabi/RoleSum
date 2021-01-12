# ImapFolder
## This Structurer is responsible for:
### inheriting the following classes:
* [ImapMessage](../Structurers/ImapMessage.md)
### managing the relationships between the following objects as components:
* [ImapConnection](../ServiceProviders/ImapConnection.md) 
* [ImapStore](../Structurers/ImapStore.md) 
* [FolderNameCodec](../ServiceProviders/FolderNameCodec.md) 
### Maintaining relatiohships between objects through the following methods: 
* handlePermanentFlags(ImapResponse response)
* copyMessages(List<? extends Message> messages, Folder folder)
* getMessages(final Set<Long> mesgSeqs, final boolean includeDeleted,
            final MessageRetrievalListener<ImapMessage> listener)
* getMessagesFromUids(final List<String> mesgUids)
* getMessages(SearchResponse searchResponse, MessageRetrievalListener<ImapMessage> listener)
* fetch(List<ImapMessage> messages, FetchProfile fetchProfile,
            MessageRetrievalListener<ImapMessage> listener)
* parseBodyStructure(ImapList bs, Part part, String id)
* expungeUids(List<String> uids)
* setFlags(Set<Flag> flags, boolean value)
* setFlags(List<? extends Message> messages, final Set<Flag> flags, boolean value)
* search(final String queryString, final Set<Flag> requiredFlags,
            final Set<Flag> forbiddenFlags)
