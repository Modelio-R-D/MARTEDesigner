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

@objid ("8353a9c4-7cd3-452a-80f5-8fe77a9be38c")
public class InterruptResource_LinkProperty implements IPropertyContent {
    @objid ("531e04e8-7b67-4e02-bf66-b596f7580d6e")
    private static List<ModelElement> typedElement = null;

    @objid ("bf4571cd-124e-4a0d-b8ad-82ad26a82478")
    private static List<ModelElement> behavioralFeature = null;

    @objid ("da85e5ce-9480-4b47-94b6-76f44738f897")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.INTERRUPTRESOURCE_LINK_INTERRUPTRESOURCE_LINK_KIND, value);
        }
        else if(row == 2){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.INTERRUPTRESOURCE_LINK_INTERRUPTRESOURCE_LINK_ISMASKABLE, value);
        }
        else if(row == 3){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_VECTORELEMENTS_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_LINK_INTERRUPTRESOURCE_LINK_VECTORELEMENTS, 
                    value);
        }
        else if(row == 4){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    typedElement, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_LINK_INTERRUPTRESOURCE_LINK_MASKELEMENTS, 
                    value);
        }
        else if(row == 5){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINECONNECTSERVICES_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_LINK_INTERRUPTRESOURCE_LINK_ROUTINECONNECTSERVICES, s
                    value);
        }
        else if(row == 6){
            ModelUtils.manageMultipleOrientedLink(elt, 
                    behavioralFeature, 
                    MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINEDISCONNECTSERVICES_INTERRUPTRESOURCE, 
        //                    MARTEDesignerTagTypes.INTERRUPTRESOURCE_LINK_INTERRUPTRESOURCE_LINK_ROUTINEDISCONNECTSERVICES, 
                    value);
        }
    }

    @objid ("d2f4c8cf-314c-415a-8eb5-d208cb177b48")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        // Interrupt Resource
        //
        
        typedElement = MARTESearchUtils.searchTypedElement();   
        behavioralFeature = MARTESearchUtils.searchBehavioralFeature(); 
        
        String[] tableInterruptKind = MARTEEnumerationUtils.getInterruptKind();
        String value_kind = ModelUtils.getTaggedValue(MARTEDesignerTagTypes.INTERRUPTRESOURCE_LINK_INTERRUPTRESOURCE_LINK_KIND, elt);
        if(!(MARTEEnumerationUtils.isInterruptKind(value_kind))){
            value_kind = "Undef";
        }
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_LINK_INTERRUPTRESOURCE_LINK_KIND),value_kind, tableInterruptKind); 
        
        String[] tab_vectorElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_VECTORELEMENTS_INTERRUPTRESOURCE), typedElement);
        String value_vectorElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_VECTORELEMENTS_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_LINK_INTERRUPTRESOURCE_LINK_VECTORELEMENTS),value_vectorElements, tab_vectorElements);
        
        String[] tab_maskElements = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_INTERRUPTRESOURCE), typedElement);
        String value_maskElements = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_MASKELEMENTS_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_LINK_INTERRUPTRESOURCE_LINK_MASKELEMENTS),value_maskElements, tab_maskElements);
        
        
        String[] tab_routineConnectServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINECONNECTSERVICES_INTERRUPTRESOURCE), behavioralFeature);
        String value_routineConnectServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINECONNECTSERVICES_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_LINK_INTERRUPTRESOURCE_LINK_ROUTINECONNECTSERVICES),value_routineConnectServices, tab_routineConnectServices);
        
        
        String[] tab_routineDisconnectServices = ModelUtils.createListAddRemove(LinkManager.getAllTargets(elt, MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINEDISCONNECTSERVICES_INTERRUPTRESOURCE), behavioralFeature);
        String value_routineDisconnectServices = ModelUtils.getTargetDependencyNames(MARTEDesignerStereotypes.PROFILEASSOCIATION_ROUTINEDISCONNECTSERVICES_INTERRUPTRESOURCE, elt);
        table.addProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.INTERRUPTRESOURCE_LINK_INTERRUPTRESOURCE_LINK_ROUTINEDISCONNECTSERVICES),value_routineDisconnectServices, tab_routineDisconnectServices);
    }

}