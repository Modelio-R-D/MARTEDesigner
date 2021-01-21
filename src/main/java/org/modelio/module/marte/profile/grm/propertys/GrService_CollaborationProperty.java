package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9ec0ec85-c3b7-4bb3-ba95-496c09a74d9b")
public class GrService_CollaborationProperty implements IPropertyContent {
    @objid ("3a963397-aff0-4918-8f45-700c9c9355fd")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GRSERVICE_COLLABORATION_GRSERVICE_COLLABORATION_OWNER, value);
        }
    }

    @objid ("384d5bf0-694e-4658-8e2b-765f2308d14a")
    @Override
    public void update(final ModelElement elt, final IModulePropertyTable table) {
        //
        //Gr Services
        //
        MObject owner = elt.getCompositionOwner();
        String value_owner = "";
        if (owner instanceof ModelElement) {
            ModelElement modelElt = (ModelElement) owner;
            if (modelElt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.RESOURCE_ASSOCIATION) ||
                    modelElt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.RESOURCE_ASSOCIATIONEND) ||
                    modelElt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.RESOURCE_ATTRIBUTE) ||
                    modelElt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.RESOURCE_CLASSIFIER) ||
                    modelElt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.RESOURCE_INSTANCE) ||
                    modelElt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.RESOURCE_LIFELINE) ||
                    modelElt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.RESOURCE_LINK) ||
                    modelElt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.RESOURCE_LINKEND) ||
                    modelElt.isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MARTEDesignerStereotypes.RESOURCE_PARAMETER) )
            value_owner = ((ModelElement) owner).getName();
        }
        
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GRSERVICE_COLLABORATION_GRSERVICE_COLLABORATION_OWNER), value_owner);
    }

}
