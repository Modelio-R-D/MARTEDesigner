package org.modelio.module.marte.profile.rsm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("b3f3a880-e264-41d6-8831-a32f21716180")
public class Shaped_ConnectorEnd {
    @objid ("5293481b-5bef-4cb3-a899-73280b994741")
    protected ConnectorEnd element;

    @objid ("ab643c1c-6dc2-46f5-9515-e759466b4b50")
    public Shaped_ConnectorEnd() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnectorEnd();
        ModelUtils.setStereotype(this.element,"Shaped_ConnectorEnd");
        this.element.setName(MARTEResourceManager.getName("Shaped_ConnectorEnd"));
    }

    @objid ("dbc93034-fbc3-499a-bab2-fe3e79808dc5")
    public Shaped_ConnectorEnd(ConnectorEnd element) {
        this.element = element;
    }

    @objid ("07b6e3fa-8275-4f1b-98d9-c6402d32b6c5")
    public ConnectorEnd getElement() {
        return this.element;
    }

    @objid ("81b0999e-7dee-411f-887a-df71d8f2e629")
    public void setParent(Link parent) {
        this.element.setLink(parent);
    }

    @objid ("396a68ee-9831-49f2-bee3-804b56a1d4a1")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("1079a83f-f934-495a-b277-c196f66e67f3")
    public String getshape() {
        return ModelUtils.getTaggedValue("Shaped_ConnectorEnd_shape", this.element);
    }

    @objid ("4e7b92d2-0dae-419a-b0b4-c93d28ed53f3")
    public void setshape(String value) {
        ModelUtils.addStringValue(this.element,"Shaped_ConnectorEnd_shape", value);
    }

}
