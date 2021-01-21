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

@objid ("2db62149-7ca4-43e3-be43-2ec2e32de742")
public class GrService_BehaviorProperty implements IPropertyContent {
    @objid ("a1e06e47-8532-44a4-9c2f-82f47a0a1c25")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GRSERVICE_COLLABORATION_GRSERVICE_COLLABORATION_OWNER, value);
        }
    }

    @objid ("7c51b13d-2ded-4a18-a283-aa7025702327")
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
        
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GRSERVICE_BEHAVIOR_GRSERVICE_BEHAVIOR_OWNER), value_owner);
    }

}
