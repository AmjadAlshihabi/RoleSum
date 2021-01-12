# CheckBoxListPreference
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* onPrepareDialogBuilder(final Builder builder)
	* [CheckBoxListPreference](../ServiceProviders/CheckBoxListPreference.md) has a role type of Service Provider
* onDialogClosed(boolean positiveResult)
	* [CheckBoxListPreference](../ServiceProviders/CheckBoxListPreference.md) has a role type of Service Provider
	* [TimePickerPreference](../Interfacers/TimePickerPreference.md) has a role type of Interfacer
	* [SliderPreference](../InformationHolders/SliderPreference.md) has a role type of Information Holder
* setItems(final CharSequence[] items)
	* [ImapUtility](../ServiceProviders/ImapUtility.md) has a role type of Service Provider
	* [CheckBoxListPreference](../ServiceProviders/CheckBoxListPreference.md) has a role type of Service Provider
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
* setCheckedItems(final boolean[] items)
	* [CheckBoxListPreference](../ServiceProviders/CheckBoxListPreference.md) has a role type of Service Provider
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
* getCheckedItems()
	* [CheckBoxListPreference](../ServiceProviders/CheckBoxListPreference.md) has a role type of Service Provider
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
