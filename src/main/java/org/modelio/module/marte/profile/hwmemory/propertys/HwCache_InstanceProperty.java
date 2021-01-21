package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("74148577-730d-499e-8c60-05b0d6c6a9af")
public class HwCache_InstanceProperty implements IPropertyContent {
    @objid ("ddf746d7-6651-4fe3-a43f-5383ad91a438")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_LEVEL, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_TYPE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_STRUCTURE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_REPL_POLICY, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_WRITEPOLICY, value);
        }
    }

    @objid ("e1cd2fa7-91b2-49fa-9381-ced2411dc70a")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Cache
        //
        String value_level = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_LEVEL, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_LEVEL),value_level);
        
        
        String[] types = MARTEEnumerationUtils.getCacheType();
        String value_type = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_TYPE, elt);
        if(!(MARTEEnumerationUtils.isCacheType(value_type))){
             value_type = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_TYPE),value_type, types);
        
        
        String value_structure = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_STRUCTURE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_STRUCTURE),value_structure);
        
        
        String[] tab_repl_Policy = MARTEEnumerationUtils.getRepl_Policy();
        String value_repl_Policy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_REPL_POLICY, elt);
        if(!(MARTEEnumerationUtils.isRepl_Policy(value_repl_Policy))){
            value_repl_Policy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_REPL_POLICY),value_repl_Policy, tab_repl_Policy);
        
        
        String[] tab_writePolicy = MARTEEnumerationUtils.getWritePolicy();
        String value_writePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_WRITEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isWritePolicy(value_writePolicy))){
             value_writePolicy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_INSTANCE_HWCACHE_INSTANCE_WRITEPOLICY),value_writePolicy, tab_writePolicy);
    }

}
