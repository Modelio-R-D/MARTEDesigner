package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2ac6cfeb-84fc-4ad8-a939-4bd0c8deed96")
public class HwRAM_LinkProperty implements IPropertyContent {
    @objid ("f91fa8f6-b65a-40cc-b3f0-b88620801990")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_ORGANIZATION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_REPL_POLICY, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_WRITEPOLICY, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_ISSYNCHRONOUS, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_ISSTATIC, value);
        }
        else if(row == 6){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_ISNONVOLATILE, value);
        }
    }

    @objid ("fc8270ac-520e-406d-a187-ad4471b2d7c7")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw RAM
        //
        
        String value_organization = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_ORGANIZATION, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_ORGANIZATION),value_organization);
        
        String[] tab_repl_Policy = MARTEEnumerationUtils.getRepl_Policy();
        String value_repl_Policy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_REPL_POLICY, elt);
        if(!(MARTEEnumerationUtils.isRepl_Policy(value_repl_Policy))){
             value_repl_Policy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_REPL_POLICY),value_repl_Policy, tab_repl_Policy);
        
        
        String[] tab_writePolicy = MARTEEnumerationUtils.getWritePolicy();
        String value_writePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_WRITEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isWritePolicy(value_writePolicy))){
            value_writePolicy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_WRITEPOLICY),value_writePolicy, tab_writePolicy);
        
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_ISSYNCHRONOUS),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_ISSYNCHRONOUS, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_ISSTATIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_ISSTATIC, elt));
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_ISNONVOLATILE),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWRAM_LINK_HWRAM_LINK_ISNONVOLATILE, elt));
    }

}
