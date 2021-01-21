package org.modelio.module.marte.profile.gcm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d66e89a2-a380-48cd-aef9-7b3529bb1908")
public class GCMTrigger_DependencyProperty implements IPropertyContent {
    @objid ("60b2b2fd-d9a6-43dd-9e40-5dd24b49de1f")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GCMTRIGGER_DEPENDENCY_GCMTRIGGER_DEPENDENCY_FEATURE, value);
        }
        if(row == 2){
             ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GCMTRIGGER_DEPENDENCY_GCMTRIGGER_DEPENDENCY_PORT, value);
        }
    }

    @objid ("44ed1b5d-bd39-4b23-9907-2d09ca2bd209")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        String value_feature = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GCMTRIGGER_DEPENDENCY_GCMTRIGGER_DEPENDENCY_FEATURE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GCMTRIGGER_DEPENDENCY_GCMTRIGGER_DEPENDENCY_FEATURE),value_feature);
        
        String value_GCMTrigger_Dependency_port = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GCMTRIGGER_DEPENDENCY_GCMTRIGGER_DEPENDENCY_PORT, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GCMTRIGGER_DEPENDENCY_GCMTRIGGER_DEPENDENCY_PORT),value_GCMTrigger_Dependency_port);
    }

}
