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

@objid ("75125796-864e-40a5-b7c3-200a8abaf2d3")
public class GrService_CollaborationUseProperty implements IPropertyContent {
    @objid ("8842009a-460a-47f9-b39a-99b6d4f2e061")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GRSERVICE_COLLABORATIONUSE_GRSERVICE_COLLABORATIONUSE_OWNER, value);
        }
    }

    @objid ("e4aa6119-7026-436a-bc6e-4250563620ed")
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
        
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GRSERVICE_COLLABORATIONUSE_GRSERVICE_COLLABORATIONUSE_OWNER), value_owner);
    }

}
