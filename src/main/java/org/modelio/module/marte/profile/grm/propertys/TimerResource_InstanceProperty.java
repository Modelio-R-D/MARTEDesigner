package org.modelio.module.marte.profile.grm.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("6e8d5f83-2025-49be-8a52-9aa249187b02")
public class TimerResource_InstanceProperty implements IPropertyContent {
    @objid ("84abbf3e-e9b2-41d5-8ecd-62ddcdedc409")
    private static List<ModelElement> typedElement = null;

    @objid ("8e38e898-8032-4d0c-a1f8-5f33731dbef4")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SWTIMERRESOURCE_INSTANCE)){
                ModelUtils.manageSingleOrientedLink(elt, 
                        typedElement, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_DURATIONELEMENTS_SWTIMERRESOURCE, 
        //                        MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_DURATION, 
                        value);
            }else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_DURATION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_ISPERIODIC, value);
        }
    }

    @objid ("16dd8513-a335-4a53-83bf-59a807b94828")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timer Resource
        //
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SWTIMERRESOURCE_INSTANCE)){
            typedElement = MARTESearchUtils.searchTypedElement();          
            String[] tab_durationElements = ModelUtils.createListString(typedElement);      
            String value_durationElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DURATIONELEMENTS_SWTIMERRESOURCE, elt);
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_DURATION), value_durationElements, tab_durationElements);
        }else{
            String value_duration = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_DURATION, elt);
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_DURATION),value_duration);
        }
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_ISPERIODIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_INSTANCE_TIMERRESOURCE_INSTANCE_ISPERIODIC, elt));
    }

}
