package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a74839b3-8331-42a9-b1ba-03bd76140fff")
public class HwCommunicationResource_Association {
    @objid ("376598cd-7767-4ccd-a3aa-b851b08075d1")
    protected Association element;

    @objid ("ff4a1382-aba4-49a4-bb40-0ccc9f64564c")
    public HwCommunicationResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWCOMMUNICATIONRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwCommunicationResource_Association"));
    }

    @objid ("e8231a5c-d702-489f-9354-3307496c78bc")
    public HwCommunicationResource_Association(Association element) {
        this.element = element;
    }

    @objid ("928ad874-2cff-4d62-8bec-df8fbce55ea6")
    public void setParent(Classifier source, Classifier destination) {
        ModelUtils.attachAssociation(element, source, destination);
    }

    @objid ("ea8180c8-7ae9-4165-944e-29a1a419c7c0")
    public Association getElement() {
        return this.element;
    }

}
