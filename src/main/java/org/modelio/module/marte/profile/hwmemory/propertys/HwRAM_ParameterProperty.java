package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("00cf4f3f-638a-4873-a6f7-55c7fc2f296e")
public class HwRAM_ParameterProperty implements IPropertyContent {
    @objid ("8ddc1df9-16f4-4331-b7c5-a0ed866c5e31")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_ORGANIZATION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_REPL_POLICY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_WRITEPOLICY, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_ISSYNCHRONOUS, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_ISSTATIC, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_ISNONVOLATILE, value);
        }
    }

    @objid ("f03b34ce-49cf-456e-ba26-16fc82f92de1")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw RAM
        //
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_ORGANIZATION),value_organization);
        
        String[] tab_repl_Policy = MARTEEnumerationUtils.getRepl_Policy();
        String value_repl_Policy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_REPL_POLICY, elt);
        if(!(MARTEEnumerationUtils.isRepl_Policy(value_repl_Policy))){
             value_repl_Policy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_REPL_POLICY),value_repl_Policy, tab_repl_Policy);
        
        
        String[] tab_writePolicy = MARTEEnumerationUtils.getWritePolicy();
        String value_writePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_WRITEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isWritePolicy(value_writePolicy))){
            value_writePolicy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_WRITEPOLICY),value_writePolicy, tab_writePolicy);
        
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_ISSYNCHRONOUS),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_ISSYNCHRONOUS, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_ISSTATIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_ISSTATIC, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_ISNONVOLATILE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_PARAMETER_HWRAM_PARAMETER_ISNONVOLATILE, elt));
    }

}
