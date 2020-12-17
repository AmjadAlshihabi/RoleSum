# HighlightDialogFragment
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* onStart()
	* [HighlightDialogFragment](../ServiceProviders/HighlightDialogFragment.md) has a role type of Service Provider
	* [Search](../Interfacers/Search.md) has a role type of Interfacer
* onDismiss(DialogInterface dialog)
	* [HighlightDialogFragment](../ServiceProviders/HighlightDialogFragment.md) has a role type of Service Provider
	* [ApgDeprecationDialogFragment](../Coordinators/ApgDeprecationDialogFragment.md) has a role type of Coordinator
	* [OpenPgpAppSelectFragment](../Structurers/OpenPgpAppSelectFragment.md) has a role type of Structurer
* hideKeyboard()
	* [HighlightDialogFragment](../ServiceProviders/HighlightDialogFragment.md) has a role type of Service Provider
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
* hideShowcaseView()
	* [HighlightDialogFragment](../ServiceProviders/HighlightDialogFragment.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* highlightViewInBackground()
	* [HighlightDialogFragment](../ServiceProviders/HighlightDialogFragment.md) has a role type of Service Provider
* setDialogBackgroundDim()
	* [HighlightDialogFragment](../ServiceProviders/HighlightDialogFragment.md) has a role type of Service Provider
