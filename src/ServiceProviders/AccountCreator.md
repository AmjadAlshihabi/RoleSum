# AccountCreator
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getDefaultDeletePolicy(Type type)
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountCreator](../ServiceProviders/AccountCreator.md) has a role type of Service Provider
* getDefaultPort(ConnectionSecurity securityType, Type storeType)
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [AccountCreator](../ServiceProviders/AccountCreator.md) has a role type of Service Provider
