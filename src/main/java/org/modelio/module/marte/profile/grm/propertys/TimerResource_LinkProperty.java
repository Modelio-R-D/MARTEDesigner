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

@objid ("b51434a0-403c-4f22-af4c-75dd710e1b73")
public class TimerResource_LinkProperty implements IPropertyContent {
    @objid ("c46137c5-ed49-4994-b5ec-ac71c639af31")
    private static List<ModelElement> typedElement = null;

    @objid ("dabb42ff-44c2-4329-9256-5d68ff40e3e3")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SWTIMERRESOURCE_LINK)){
                ModelUtils.manageSingleOrientedLink(elt, 
                        typedElement, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_DURATIONELEMENTS_SWTIMERRESOURCE, 
        //                        MARTEDesignerTagTypes.TIMERRESOURCE_LINK_TIMERRESOURCE_LINK_DURATION, 
                        value);
            }else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMERRESOURCE_LINK_TIMERRESOURCE_LINK_DURATION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMERRESOURCE_LINK_TIMERRESOURCE_LINK_ISPERIODIC, value);
        }
    }

    @objid ("1d3b065d-2a90-41e6-b94e-56592ef1d316")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timer Resource
        //
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SWTIMERRESOURCE_LINK)){
            typedElement = MARTESearchUtils.searchTypedElement();          
            String[] tab_durationElements = ModelUtils.createListString(typedElement);      
            String value_durationElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DURATIONELEMENTS_SWTIMERRESOURCE, elt);
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_LINK_TIMERRESOURCE_LINK_DURATION), value_durationElements, tab_durationElements);
        }else{
            String value_duration = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_LINK_TIMERRESOURCE_LINK_DURATION, elt);
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_LINK_TIMERRESOURCE_LINK_DURATION),value_duration);
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_LINK_TIMERRESOURCE_LINK_ISPERIODIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_LINK_TIMERRESOURCE_LINK_ISPERIODIC, elt));
    }

}
