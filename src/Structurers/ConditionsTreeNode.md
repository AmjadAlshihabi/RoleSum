# ConditionsTreeNode
## This Structurer is responsible for:
### implementing the following interfaces:
* Parcelable
### managing the relationships between the following objects as components:
* [Operator](../InformationHolders/Operator.md) 
* [SearchCondition](../InformationHolders/SearchCondition.md) 
### Maintaining relatiohships between objects through the following methods: 
* buildTreeFromDB(Cursor cursor)
* getLeafSet()
* preorder()
* getLeafSet(Set<ConditionsTreeNode> leafSet)
