# PRNGFixes
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* apply()
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
	* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) has a role type of Interfacer
* getDeviceSerialNumber()
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
* getBuildFingerprintAndDeviceSerial()
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* applyOpenSSLFix()
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
* applyOpenSSLFix()
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
* installLinuxPRNGSecureRandom()
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
* installLinuxPRNGSecureRandom()
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
* generateSeed()
	* [PRNGFixes](../ServiceProviders/PRNGFixes.md) has a role type of Service Provider
