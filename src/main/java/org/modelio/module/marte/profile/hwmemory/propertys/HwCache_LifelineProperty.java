package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("430125a8-df39-4f26-aab5-78308314572d")
public class HwCache_LifelineProperty implements IPropertyContent {
    @objid ("9717a64a-bdb3-45f3-8370-71506ec77c21")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_LEVEL, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_TYPE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_STRUCTURE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_REPL_POLICY, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_WRITEPOLICY, value);
        }
    }

    @objid ("83684e83-020e-4d14-837e-ce33ff8dbad9")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Cache
        //
        String value_level = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_LEVEL, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_LEVEL),value_level);
        
        
        String[] types = MARTEEnumerationUtils.getCacheType();
        String value_type = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_TYPE, elt);
        if(!(MARTEEnumerationUtils.isCacheType(value_type))){
             value_type = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_TYPE),value_type, types);
        
        
        String value_structure = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_STRUCTURE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_STRUCTURE),value_structure);
        
        
        String[] tab_repl_Policy = MARTEEnumerationUtils.getRepl_Policy();
        String value_repl_Policy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_REPL_POLICY, elt);
        if(!(MARTEEnumerationUtils.isRepl_Policy(value_repl_Policy))){
            value_repl_Policy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_REPL_POLICY),value_repl_Policy, tab_repl_Policy);
        
        
        String[] tab_writePolicy = MARTEEnumerationUtils.getWritePolicy();
        String value_writePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_WRITEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isWritePolicy(value_writePolicy))){
             value_writePolicy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_LIFELINE_HWCACHE_LIFELINE_WRITEPOLICY),value_writePolicy, tab_writePolicy);
    }

}
