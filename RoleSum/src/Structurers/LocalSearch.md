# LocalSearch
## This Structurer is responsible for:
### implementing the following interfaces:
* [SearchSpecification](../InformationHolders/SearchSpecification.md) 
### managing the relationships between the following objects as components:
* [ConditionsTreeNode](../Structurers/ConditionsTreeNode.md) 
### Maintaining relatiohships between objects through the following methods: 
* clone()
* and(ConditionsTreeNode node)
* or(ConditionsTreeNode node)
* getFolderNames()
* getLeafSet()
* getRemoteSearchArguments()
* writeToParcel(Parcel dest, int flags)
