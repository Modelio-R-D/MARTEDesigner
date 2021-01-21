package org.modelio.module.marte.profile.hwmemory.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fe5f85c7-870f-47c9-abb6-8666c6e9404f")
public class HwCache_ClassifierProperty implements IPropertyContent {
    @objid ("743079ae-2b78-49e0-b643-a07822a20351")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_LEVEL, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_TYPE, value);
        }
        else if(row == 3){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_STRUCTURE, value);
        }
        else if(row == 4){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_REPL_POLICY, value);
        }
        else if(row == 5){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_WRITEPOLICY, value);
        }
    }

    @objid ("d13d2aef-e4ae-4672-b9a5-0da71a639760")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Hw Cache
        //
        String value_level = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_LEVEL, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_LEVEL),value_level);
        
        
        String[] types = MARTEEnumerationUtils.getCacheType();
        String value_type = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_TYPE, elt);
        if(!(MARTEEnumerationUtils.isCacheType(value_type))){
             value_type = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_TYPE),value_type, types);
        
        
        String value_structure = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_STRUCTURE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_STRUCTURE),value_structure);
        
        
        String[] tab_repl_Policy = MARTEEnumerationUtils.getRepl_Policy();
        String value_repl_Policy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_REPL_POLICY, elt);
        if(!(MARTEEnumerationUtils.isRepl_Policy(value_repl_Policy))){
            value_repl_Policy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_REPL_POLICY),value_repl_Policy, tab_repl_Policy);
        
        
        String[] tab_writePolicy = MARTEEnumerationUtils.getWritePolicy();
        String value_writePolicy = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_WRITEPOLICY, elt);
        if(!(MARTEEnumerationUtils.isWritePolicy(value_writePolicy))){
             value_writePolicy = "undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.HWCACHE_CLASSIFIER_HWCACHE_CLASSIFIER_WRITEPOLICY),value_writePolicy, tab_writePolicy);
    }

}
