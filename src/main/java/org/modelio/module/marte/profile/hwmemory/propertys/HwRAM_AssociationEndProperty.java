package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9c2e40eb-0d74-44b6-a9e8-c995db7c51f0")
public class HwRAM_AssociationEndProperty implements IPropertyContent {
    @objid ("970e620f-80ab-4949-b97f-6188a6f77002")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_ORGANIZATION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_REPL_POLICY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_WRITEPOLICY, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_ISSTATIC, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_ISNONVOLATILE, value);
        }
    }

    @objid ("9ec5d908-42a9-4d91-a716-67cb4e5a6dcc")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw RAM
        //
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_ORGANIZATION),value_organization);
        
        String[] tab_repl_Policy = MARTEEnumerationUtils.getRepl_Policy();
        String value_repl_Policy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_REPL_POLICY, elt);
        if(!(MARTEEnumerationUtils.isRepl_Policy(value_repl_Policy))){
            value_repl_Policy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_REPL_POLICY),value_repl_Policy, tab_repl_Policy);
        
        
        String[] tab_writePolicy = MARTEEnumerationUtils.getWritePolicy();
        String value_writePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_WRITEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isWritePolicy(value_writePolicy))){
            value_writePolicy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_WRITEPOLICY),value_writePolicy, tab_writePolicy);
        
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_ISSYNCHRONOUS, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_ISSTATIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_ISSTATIC, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_ISNONVOLATILE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_ASSOCIATIONEND_HWRAM_ASSOCIATIONEND_ISNONVOLATILE, elt));
    }

}
