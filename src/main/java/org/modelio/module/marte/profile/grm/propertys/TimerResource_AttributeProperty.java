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

@objid ("ccedd44e-7dee-4edc-acf1-99c22e62f54b")
public class TimerResource_AttributeProperty implements IPropertyContent {
    @objid ("d4279672-21f1-45db-9137-a443adb388b4")
    private static List<ModelElement> typedElement = null;

    @objid ("7f7b92fe-8809-4b80-b34b-a4d55f85320b")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SWTIMERRESOURCE_ATTRIBUTE)){
                ModelUtils.manageSingleOrientedLink(elt, 
                        typedElement, 
                        MARTEDesignerStereotypes.PROFILEASSOCIATION_DURATIONELEMENTS_SWTIMERRESOURCE, 
        //                        MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_DURATION, 
                        value);
            }else
                ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_DURATION, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_ISPERIODIC, value);
        }
    }

    @objid ("69daa050-093b-4771-a43a-78b149d5f3a9")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Timer Resource
        //
        if (elt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.SWTIMERRESOURCE_ATTRIBUTE)){
            typedElement = MARTESearchUtils.searchTypedElement();          
            String[] tab_durationElements = ModelUtils.createListString(typedElement);      
            String value_durationElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_DURATIONELEMENTS_SWTIMERRESOURCE, elt);
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_DURATION), value_durationElements, tab_durationElements);
        }else{
            String value_duration = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_DURATION, elt);
            table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_DURATION),value_duration);
        }
        
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_ISPERIODIC),ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.TIMERRESOURCE_ATTRIBUTE_TIMERRESOURCE_ATTRIBUTE_ISPERIODIC, elt));
    }

}
