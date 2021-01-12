# ViewSwitcher
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* showFirstView()
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* showSecondView()
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* setupAnimations(Animation in, Animation out)
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
* handleSwitchCompleteCallback()
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
* getFirstInAnimation()
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
* setFirstInAnimation(Animation inAnimation)
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* getmFirstOutAnimation()
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
* setFirstOutAnimation(Animation outAnimation)
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* getSecondInAnimation()
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
* setSecondInAnimation(Animation inAnimation)
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* getSecondOutAnimation()
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
* setSecondOutAnimation(Animation outAnimation)
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* setOnSwitchCompleteListener(OnSwitchCompleteListener listener)
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* onAnimationEnd(Animation animation)
	* [FoldableLinearLayout](../Interfacers/FoldableLinearLayout.md) has a role type of Interfacer
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
	* [MessageTopView](../Interfacers/MessageTopView.md) has a role type of Interfacer
* onAnimationRepeat(Animation animation)
	* [FoldableLinearLayout](../Interfacers/FoldableLinearLayout.md) has a role type of Interfacer
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
* onAnimationStart(Animation animation)
	* [FoldableLinearLayout](../Interfacers/FoldableLinearLayout.md) has a role type of Interfacer
	* [ViewSwitcher](../ServiceProviders/ViewSwitcher.md) has a role type of Service Provider
