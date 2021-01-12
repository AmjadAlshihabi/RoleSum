# SettingsExporter
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* exportToFile(Context context, boolean includeGlobals, Set<String> accountUuids)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [ExportAsyncTask](../ServiceProviders/ExportAsyncTask.md) has a role type of Service Provider
* exportToUri(Context context, boolean includeGlobals, Set<String> accountUuids, Uri uri)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [ExportAsyncTask](../ServiceProviders/ExportAsyncTask.md) has a role type of Service Provider
* closeOrThrow(OutputStream outputStream)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeSettings(XmlSerializer serializer, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* writeElement(XmlSerializer serializer, String elementName, String value)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeKeyAndDefaultValueFromSetting(XmlSerializer serializer, String key,
            SettingsDescription<T> setting)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* exportPreferences(Context context, OutputStream os, boolean includeGlobals, Set<String> accountUuids)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* exportPreferences(Context context, OutputStream os, boolean includeGlobals, Set<String> accountUuids)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* exportPreferences(Context context, OutputStream os, boolean includeGlobals, Set<String> accountUuids)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* exportPreferences(Context context, OutputStream os, boolean includeGlobals, Set<String> accountUuids)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* exportPreferences(Context context, OutputStream os, boolean includeGlobals, Set<String> accountUuids)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* exportPreferences(Context context, OutputStream os, boolean includeGlobals, Set<String> accountUuids)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeAccount(XmlSerializer serializer, Account account, Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeIdentity(XmlSerializer serializer, String accountUuid, String identity,
            Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeIdentity(XmlSerializer serializer, String accountUuid, String identity,
            Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeIdentity(XmlSerializer serializer, String accountUuid, String identity,
            Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeIdentity(XmlSerializer serializer, String accountUuid, String identity,
            Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeIdentity(XmlSerializer serializer, String accountUuid, String identity,
            Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeFolder(XmlSerializer serializer, String accountUuid, String folder,
            Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeFolder(XmlSerializer serializer, String accountUuid, String folder,
            Map<String, Object> prefs)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeKeyAndPrettyValueFromSetting(XmlSerializer serializer, String key, String literalValue)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* writeKeyAndPrettyValueFromSetting(XmlSerializer serializer, String key, String literalValue)
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
* generateDatedExportFileName()
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
* generateDatedExportFileName()
	* [SettingsExporter](../ServiceProviders/SettingsExporter.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
