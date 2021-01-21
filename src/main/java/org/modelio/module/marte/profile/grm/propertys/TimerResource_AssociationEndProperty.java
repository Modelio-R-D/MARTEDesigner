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

@objid ("257c16cc-1eb3-4b91-8b44-ec4da34ed2e7")
public class TimerResource_AssociationEndProperty implements IPropertyContent {
    @objid ("6c834170-0110-4834-ae8a-84e6edaba0aa")
    private static List<ModelElement> typedElement = null;

    @objid ("1c3be172-95ca-4c00-8f63-7061dbc7d8de")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SWTIMERRESOURCE_ASSOCIATIONEND)){
                ModelUtils.manageSingleOrientedLink(elt, 
                        typedElement, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_DURATIONELEMENTS_SWTIMERRESOURCE, 
        //                        MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_DURATION, 
                        value);
            }else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_DURATION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC, value);
        }
    }

    @objid ("4439605a-eab5-4c2e-9924-6e3e8aee0275")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timer Resource
        //
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SWTIMERRESOURCE_ASSOCIATIONEND)){
            typedElement = MARTESearchUtils.searchTypedElement();          
            String[] tab_durationElements = ModelUtils.createListString(typedElement);      
            String value_durationElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DURATIONELEMENTS_SWTIMERRESOURCE, elt);
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_DURATION), value_durationElements, tab_durationElements);
        }else{
            String value_duration = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_DURATION, elt);
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_DURATION),value_duration);
        }
        
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ASSOCIATIONEND_TIMERRESOURCE_ASSOCIATIONEND_ISPERIODIC, elt));
    }

}
