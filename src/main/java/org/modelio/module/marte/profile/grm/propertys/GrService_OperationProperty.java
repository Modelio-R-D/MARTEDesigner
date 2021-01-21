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

@objid ("8d477994-e3bd-47e1-91ab-cf8fbd4ad1a3")
public class GrService_OperationProperty implements IPropertyContent {
    @objid ("693a6861-5ac0-4e8f-8930-08f887ac0626")
    @Override
    public void changeProperty(final ModelElement elt, final int row, final String value) {
        if(row == 1){
            ModelUtils.addStringValue(elt, MARTEDesignerTagTypes.GRSERVICE_OPERATION_GRSERVICE_OPERATION_OWNER, value);
        }
    }

    @objid ("f426ed43-f92d-4206-9aaf-5e94fa94219c")
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
        
        table.addConsultProperty(MARTEResourceManager.getPropertyName(MARTEDesignerTagTypes.GRSERVICE_OPERATION_GRSERVICE_OPERATION_OWNER), value_owner);
    }

}
