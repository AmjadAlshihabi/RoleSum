# ViewAttachmentAsyncTask
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* onPreExecute()
	* [SaveAttachmentAsyncTask](../ServiceProviders/SaveAttachmentAsyncTask.md) has a role type of Service Provider
	* [ViewAttachmentAsyncTask](../ServiceProviders/ViewAttachmentAsyncTask.md) has a role type of Service Provider
	* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) has a role type of Interfacer
	* [ExtendedAsyncTask](../Coordinators/ExtendedAsyncTask.md) has a role type of Coordinator
* doInBackground(Void... params)
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [SaveAttachmentAsyncTask](../ServiceProviders/SaveAttachmentAsyncTask.md) has a role type of Service Provider
	* [ViewAttachmentAsyncTask](../ServiceProviders/ViewAttachmentAsyncTask.md) has a role type of Service Provider
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [LoadAccounts](../ServiceProviders/LoadAccounts.md) has a role type of Service Provider
	* [ExportAsyncTask](../ServiceProviders/ExportAsyncTask.md) has a role type of Service Provider
	* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) has a role type of Service Provider
	* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) has a role type of Service Provider
	* [MoveAccountAsyncTask](../ServiceProviders/MoveAccountAsyncTask.md) has a role type of Service Provider
	* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
	* [SendMessageTask](../ServiceProviders/SendMessageTask.md) has a role type of Service Provider
	* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) has a role type of Interfacer
	* [CheckAccountTask](../Coordinators/CheckAccountTask.md) has a role type of Coordinator
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
	* [SaveMessageTask](../ServiceProviders/SaveMessageTask.md) has a role type of Service Provider
* onPostExecute(Intent intent)
	* [SaveAttachmentAsyncTask](../ServiceProviders/SaveAttachmentAsyncTask.md) has a role type of Service Provider
	* [ViewAttachmentAsyncTask](../ServiceProviders/ViewAttachmentAsyncTask.md) has a role type of Service Provider
	* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [LoadAccounts](../ServiceProviders/LoadAccounts.md) has a role type of Service Provider
	* [ExportAsyncTask](../ServiceProviders/ExportAsyncTask.md) has a role type of Service Provider
	* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) has a role type of Service Provider
	* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) has a role type of Service Provider
	* [MoveAccountAsyncTask](../ServiceProviders/MoveAccountAsyncTask.md) has a role type of Service Provider
	* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) has a role type of Service Provider
	* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) has a role type of Interfacer
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* viewAttachment(Intent intent)
	* [ViewAttachmentAsyncTask](../ServiceProviders/ViewAttachmentAsyncTask.md) has a role type of Service Provider
	* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
