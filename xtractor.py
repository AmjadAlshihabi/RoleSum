from lxml import etree as ET
import pandas as pd

tree = ET.parse('k9.xml')
root = tree.getroot()
role_stereotype = pd.read_csv('manual_labeled_class.csv')

RoleSter = {}
for index, cl in role_stereotype.iterrows():
    if (cl['case'] == 'k9mail'):
        classname = cl['classname']
        label = cl['label']
        RoleSter.update({classname:label})

# merging role_stereotype of classes/interfaces into xml file as an attributes
for units in root:
    # merging role_stereotype of classes
    for clss in units.iter('class'):
        for name in clss:
            if (name.tag == 'name'):
                if (RoleSter.get(name.text)):
                    clss.set('role_stereotype', RoleSter.get(name.text))
    # merging role_stereotype of interface
    for interface in units.iter('interface'):
        for name in interface:
            if (name.tag == 'name'):
                if (RoleSter.get(name.text)):
                    interface.set('role_stereotype', RoleSter.get(name.text))

# for units in root:
#     for clss in units.iter('class'):
#         for name in clss.iter('name'):
#             if (clss.attrib == 'Information Holder' & )

    
# save the updated xml doc to new file
et = ET.ElementTree(root)
et.write('output.xml', pretty_print=True)

# Extracting attributes of information holders
IH = {}

