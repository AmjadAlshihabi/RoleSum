# Clock
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getTime()
	* [Clock](../ServiceProviders/Clock.md) has a role type of Service Provider
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [Throttle](../Controllers/Throttle.md) has a role type of Controller
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [RigidWebView](../InformationHolders/RigidWebView.md) has a role type of Information Holder
	* [SendDateExtractor](../Coordinators/SendDateExtractor.md) has a role type of Coordinator
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [TimePickerPreference](../Interfacers/TimePickerPreference.md) has a role type of Interfacer
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
