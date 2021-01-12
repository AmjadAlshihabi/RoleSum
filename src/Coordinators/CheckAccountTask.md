# CheckAccountTask
### This Coordinator is responsible for delegating work between the following objects: 
* [CertificateErrorNotifications](../Coordinators/CertificateErrorNotifications.md) has a role type of Coordinator
* [NotificationController](../Controllers/NotificationController.md) has a role type of Controller
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [CheckDirection](../InformationHolders/CheckDirection.md) has a role type of Information Holder
* [CheckDirection](../InformationHolders/CheckDirection.md) has a role type of Information Holder
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
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* [SaveMessageTask](../ServiceProviders/SaveMessageTask.md) has a role type of Service Provider
* [CheckDirection](../InformationHolders/CheckDirection.md) has a role type of Information Holder
### the clearCertificateErrorNotifications method receives requests from:
* [CertificateErrorNotifications](../Coordinators/CertificateErrorNotifications.md) 
* [NotificationController](../Controllers/NotificationController.md) 
* [MessagingController](../Controllers/MessagingController.md) 
* [CheckAccountTask](../Coordinators/CheckAccountTask.md) 
### and delegate the request to: 
* [CheckDirection](../InformationHolders/CheckDirection.md) 


### the checkServerSettings method receives requests from:
* [CheckAccountTask](../Coordinators/CheckAccountTask.md) 
### and delegate the request to: 
* [CheckDirection](../InformationHolders/CheckDirection.md) 


### the doInBackground method receives requests from:
* [K9](../Controllers/K9.md) 
* [SaveAttachmentAsyncTask](../ServiceProviders/SaveAttachmentAsyncTask.md) 
* [ViewAttachmentAsyncTask](../ServiceProviders/ViewAttachmentAsyncTask.md) 
* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) 
* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) 
* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) 
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* [LoadAccounts](../ServiceProviders/LoadAccounts.md) 
* [ExportAsyncTask](../ServiceProviders/ExportAsyncTask.md) 
* [ImportAsyncTask](../ServiceProviders/ImportAsyncTask.md) 
* [ListImportContentsAsyncTask](../ServiceProviders/ListImportContentsAsyncTask.md) 
* [MoveAccountAsyncTask](../ServiceProviders/MoveAccountAsyncTask.md) 
* [SetPasswordsAsyncTask](../ServiceProviders/SetPasswordsAsyncTask.md) 
* [SendMessageTask](../ServiceProviders/SendMessageTask.md) 
* [PopulateFolderPrefsTask](../Interfacers/PopulateFolderPrefsTask.md) 
* [CheckAccountTask](../Coordinators/CheckAccountTask.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
* [SaveMessageTask](../ServiceProviders/SaveMessageTask.md) 
### and delegate the request to: 
* [CheckDirection](../InformationHolders/CheckDirection.md) 


