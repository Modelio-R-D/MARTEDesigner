package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f96b9054-c523-4c06-97c4-a4e475bb1fe5")
public class DeviceResource_Link {
    @objid ("b1484ba0-dd7e-4beb-b9b3-17a42da66a13")
    protected Link element;

    @objid ("50ad2fdf-963f-4bba-8faa-31b996f50031")
    public DeviceResource_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.DEVICERESOURCE_LINK);
        this.element.setName(MARTEResourceManager.getName("DeviceResource_Link"));
    }

    @objid ("2ba97eaa-89d6-49f1-a3af-72e44286ba35")
    public DeviceResource_Link(final Link element) {
        this.element = element;
    }

    @objid ("9b1aed06-0ae4-4620-b62a-b79f89902fbd")
    public void setParent(final TemplateParameter source, final Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("88aa2230-8dd1-4377-a0b8-035e50198578")
    public Link getElement() {
        return this.element;
    }

}
