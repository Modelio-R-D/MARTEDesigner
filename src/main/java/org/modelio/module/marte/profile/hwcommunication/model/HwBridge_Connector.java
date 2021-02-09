package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBridge_Connector {
    protected Connector element;

    public HwBridge_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBRIDGE_LINK);
        this.element.setName(MARTEResourceManager.getName("HwBridge_Connector"));
    }

    public HwBridge_Connector(Connector element) {
        this.element = element;
    }

    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachConnector(this.element, source, destination);
    }

    public Connector getElement() {
        return this.element;
    }

    public String getsides() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBRIDGE_LINK_HWBRIDGE_LINK_SIDES, this.element);
    }

    public void setsides(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBRIDGE_LINK_HWBRIDGE_LINK_SIDES, value);
    }

}
