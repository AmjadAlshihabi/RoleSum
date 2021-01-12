# SettingsImporter
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getImportStreamContents(InputStream inputStream)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) has a role type of Service Provider
* importSettings(Context context, InputStream inputStream, boolean globalSettings,
            List<String> accountUuids, boolean overwrite)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) has a role type of Service Provider
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [WelcomeMessage](../Interfacers/WelcomeMessage.md) has a role type of Interfacer
* importGlobalSettings(Storage storage, StorageEditor editor, int contentVersion,
            ImportedSettings settings)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* importAccount(Context context, StorageEditor editor, int contentVersion,
            ImportedAccount account, boolean overwrite)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* importFolder(StorageEditor editor, int contentVersion, String uuid, ImportedFolder folder,
            boolean overwrite, Preferences prefs)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* importIdentities(StorageEditor editor, int contentVersion, String uuid, ImportedAccount account,
            boolean overwrite, Account existingAccount, Preferences prefs)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* isAccountNameUsed(String name, List<Account> accounts)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* isIdentityDescriptionUsed(String description, List<Identity> identities)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* findIdentity(ImportedIdentity identity, List<Identity> identities)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [IdentityHelper](../ServiceProviders/IdentityHelper.md) has a role type of Service Provider
* putString(StorageEditor editor, String key, String value)
	* [Account](../InformationHolders/Account.md) has a role type of Information Holder
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [Preferences](../Structurers/Preferences.md) has a role type of Structurer
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [ContactBadge](../Interfacers/ContactBadge.md) has a role type of Interfacer
	* [CryptoInfoDialog](../Interfacers/CryptoInfoDialog.md) has a role type of Interfacer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [StorageEditor](../Structurers/StorageEditor.md) has a role type of Structurer
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [AttachmentDownloadDialogFragment](../Interfacers/AttachmentDownloadDialogFragment.md) has a role type of Interfacer
	* [ConfirmationDialogFragment](../Coordinators/ConfirmationDialogFragment.md) has a role type of Coordinator
	* [ProgressDialogFragment](../Interfacers/ProgressDialogFragment.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) has a role type of Interfacer
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) has a role type of Coordinator
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* parseSettings(XmlPullParser xpp, String endTag)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* skipToEndTag(XmlPullParser xpp, String endTag)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* getText(XmlPullParser xpp)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
	* [Alternative](../InformationHolders/Alternative.md) has a role type of Information Holder
	* [ClientCertificateSpinner](../Interfacers/ClientCertificateSpinner.md) has a role type of Interfacer
	* [MessageTitleView](../Interfacers/MessageTitleView.md) has a role type of Interfacer
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
	* [EolConvertingEditText](../ServiceProviders/EolConvertingEditText.md) has a role type of Service Provider
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
	* [FileBrowserHelper](../ServiceProviders/FileBrowserHelper.md) has a role type of Service Provider
	* [Utility](../ServiceProviders/Utility.md) has a role type of Service Provider
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) has a role type of Interfacer
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [EditIdentity](../Interfacers/EditIdentity.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
* parseRoot(XmlPullParser xpp, boolean globalSettings, List<String> accountUuids,
            boolean overview)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* validateFileFormatVersion(String versionString)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* validateContentVersion(String versionString)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* parseSettings(XmlPullParser xpp, String endTag)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* parseAccounts(XmlPullParser xpp, List<String> accountUuids,
            boolean overview)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* parseAccount(XmlPullParser xpp, List<String> accountUuids, boolean overview)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* parseServerSettings(XmlPullParser xpp, String endTag)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* parseIdentities(XmlPullParser xpp)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* parseIdentity(XmlPullParser xpp)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* parseFolders(XmlPullParser xpp)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* parseFolder(XmlPullParser xpp)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
* getAccountDisplayName(ImportedAccount account)
	* [SettingsImporter](../ServiceProviders/SettingsImporter.md) has a role type of Service Provider
