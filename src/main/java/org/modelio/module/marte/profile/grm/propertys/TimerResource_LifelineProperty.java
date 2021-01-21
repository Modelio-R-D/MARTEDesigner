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

@objid ("d29616a8-038f-4b16-b176-37a62715786b")
public class TimerResource_LifelineProperty implements IPropertyContent {
    @objid ("a9d64bf3-9c7f-44e6-9b91-df9cbecb575d")
    private static List<ModelElement> typedElement = null;

    @objid ("767f8047-3e7f-45e8-bb22-2c32060e889f")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SWTIMERRESOURCE_LIFELINE)){
                ModelUtils.manageSingleOrientedLink(elt, 
                        typedElement, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_DURATIONELEMENTS_SWTIMERRESOURCE, 
        //                        MARTEDesignerTagTypes.TIMERRESOURCE_LIFELINE_TIMERRESOURCE_LIFELINE_DURATION, 
                        value);
            }else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMERRESOURCE_LIFELINE_TIMERRESOURCE_LIFELINE_DURATION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMERRESOURCE_LIFELINE_TIMERRESOURCE_LIFELINE_ISPERIODIC, value);
        }
    }

    @objid ("17c4924f-c46d-4f86-88c8-3eea37b7c6b8")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timer Resource
        //
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SWTIMERRESOURCE_LIFELINE)){
            typedElement = MARTESearchUtils.searchTypedElement();          
            String[] tab_durationElements = ModelUtils.createListString(typedElement);      
            String value_durationElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DURATIONELEMENTS_SWTIMERRESOURCE, elt);
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_LIFELINE_TIMERRESOURCE_LIFELINE_DURATION), value_durationElements, tab_durationElements);
        }else{
            String value_duration = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_LIFELINE_TIMERRESOURCE_LIFELINE_DURATION, elt);
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_LIFELINE_TIMERRESOURCE_LIFELINE_DURATION),value_duration);
        }
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_LIFELINE_TIMERRESOURCE_LIFELINE_ISPERIODIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_LIFELINE_TIMERRESOURCE_LIFELINE_ISPERIODIC, elt));
    }

}
