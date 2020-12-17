# MailService
## This Controller is responsible for:
* [RemoteControlService](../Controllers/RemoteControlService.md) (Controller)
### controlling tasks with the following methods 
* setupPushers()
* refreshPushersInBackground(boolean hasConnectivity, boolean doBackground,
            Integer startId)
* rescheduleAllInBackground(final boolean hasConnectivity,
            final boolean doBackground, Integer startId)
* saveLastCheckEnd(Context context)
* getNextPollTime()
