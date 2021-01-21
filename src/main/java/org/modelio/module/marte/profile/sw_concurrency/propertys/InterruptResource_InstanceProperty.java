package org.modelio.module.marte.profile.sw_concurrency.propertys;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.MARTEEnumerationUtils;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.MARTESearchUtils;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("64477e79-3ce5-4a53-8246-6fe05e46ef9d")
public class InterruptResource_InstanceProperty implements IPropertyContent {
    @objid ("ec37dfc1-f82c-4f4c-b25f-4d761a1f12b8")
    private static List<ModelElement> typedElement = null;

    @objid ("27d9c46b-93be-4bd9-8be2-8d24b80c61dd")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("1bd79d06-3561-4c01-b9c9-d39dce11d45f")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_KIND, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ISMASKABLE, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_VECTORELEMENTS_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS, 
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINECONNECTSERVICES_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES, 
                    value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINEDISCONNECTSERVICES_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES, 
                    value);
        }
    }

    @objid ("03973969-5e64-43eb-b3d7-b7b1b46557dc")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Interrupt Resource
        //
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        String[] tableInterruptKind = MARTEEnumerationUtils.getInterruptKind();
        String value_kind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_KIND, elt);
        if(!(MARTEEnumerationUtils.isInterruptKind(value_kind))){
            value_kind = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_KIND),value_kind, tableInterruptKind); 
        
        String[] tab_vectorElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_VECTORELEMENTS_INTERRUPTRESOURCE), typedElement);
        String value_vectorElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_VECTORELEMENTS_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_VECTORELEMENTS),value_vectorElements, tab_vectorElements);
        
        String[] tab_maskElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_INTERRUPTRESOURCE), typedElement);
        String value_maskElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_MASKELEMENTS),value_maskElements, tab_maskElements);
        
        
        String[] tab_routineConnectServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINECONNECTSERVICES_INTERRUPTRESOURCE), behavioralFeature);
        String value_routineConnectServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINECONNECTSERVICES_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINECONNECTSERVICES),value_routineConnectServices, tab_routineConnectServices);
        
        
        String[] tab_routineDisconnectServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINEDISCONNECTSERVICES_INTERRUPTRESOURCE), behavioralFeature);
        String value_routineDisconnectServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINEDISCONNECTSERVICES_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_INSTANCE_INTERRUPTRESOURCE_INSTANCE_ROUTINEDISCONNECTSERVICES),value_routineDisconnectServices, tab_routineDisconnectServices);
    }

}
