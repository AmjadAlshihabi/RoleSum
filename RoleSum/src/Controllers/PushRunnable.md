# PushRunnable
## This Controller is responsible for:
### controlling tasks with the following methods 
* processUntaggedResponse(long oldMessageCount, ImapResponse response, List<Long> flagSyncMsgSeqs,
                List<String> removeMsgUids)
* getAndClearStoredUntaggedResponses()
* getStartUid(long oldUidNext, long newUidNext)
* getOldUidNext()
* processUntaggedResponses(List<ImapResponse> responses)
