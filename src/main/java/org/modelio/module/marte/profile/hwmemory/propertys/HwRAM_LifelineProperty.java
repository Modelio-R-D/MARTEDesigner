package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("396584b8-feda-46b4-9bab-73c63f2b1400")
public class HwRAM_LifelineProperty implements IPropertyContent {
    @objid ("582b7339-a1da-40d4-b0ca-7bffdcd63f60")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_ORGANIZATION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_REPL_POLICY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_WRITEPOLICY, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_ISSYNCHRONOUS, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_ISSTATIC, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_ISNONVOLATILE, value);
        }
    }

    @objid ("41a1fc92-d577-4c8e-aadc-cb1b32cf27ec")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw RAM
        //
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_ORGANIZATION),value_organization);
        
        String[] tab_repl_Policy = MARTEEnumerationUtils.getRepl_Policy();
        String value_repl_Policy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_REPL_POLICY, elt);
        if(!(MARTEEnumerationUtils.isRepl_Policy(value_repl_Policy))){
             value_repl_Policy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_REPL_POLICY),value_repl_Policy, tab_repl_Policy);
        
        
        String[] tab_writePolicy = MARTEEnumerationUtils.getWritePolicy();
        String value_writePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_WRITEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isWritePolicy(value_writePolicy))){
            value_writePolicy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_WRITEPOLICY),value_writePolicy, tab_writePolicy);
        
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_ISSYNCHRONOUS),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_ISSYNCHRONOUS, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_ISSTATIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_ISSTATIC, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_ISNONVOLATILE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_LIFELINE_HWRAM_LIFELINE_ISNONVOLATILE, elt));
    }

}
