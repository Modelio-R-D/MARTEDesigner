package org.modelio.module.marte.profile.rsm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("fba43797-27fd-459a-9351-6111a27a7209")
public class LinkTopology_Connector {
    @objid ("688fe8c3-01dd-4c2c-ae42-06ec2666129d")
    protected Connector element;

    @objid ("8e1e2edd-e88f-49c4-b23e-f6e1c6a729cd")
    public LinkTopology_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,"LinkTopology_Connector");
        this.element.setName(MARTEResourceManager.getName("LinkTopology_Connector"));
    }

    @objid ("f383c9b3-b51a-4f22-bd56-7a4b0eec1b6d")
    public LinkTopology_Connector(Connector element) {
        this.element = element;
    }

    @objid ("7bc6c0c2-5885-453a-83c6-98109501784b")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("62b82200-c8e2-4151-9277-e5a7ddbde0d9")
    public Connector getElement() {
        return this.element;
    }

}
