package org.modelio.module.marte.profile.hwcommunication.model;

import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwBus_Connector {
    protected Connector element;

    public HwBus_Connector() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createConnector();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWBUS_LINK);
        this.element.setName(MARTEResourceManager.getName("HwBus_Connector"));
    }

    public HwBus_Connector(Connector element) {
        this.element = element;
    }

    public void setParent(Instance source, Instance destination) {
        ModelUtils.attachConnector(this.element, source, destination);
    }

    public Connector getElement() {
        return this.element;
    }

    public String getadressWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ADRESSWIDTH, this.element);
    }

    public void setadressWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ADRESSWIDTH, value);
    }

    public String getwordWidth() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_WORDWIDTH, this.element);
    }

    public void setwordWidth(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_WORDWIDTH, value);
    }

    public boolean isisSynchronous() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ISSYNCHRONOUS, this.element);
    }

    public void isisSynchronous(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ISSYNCHRONOUS,value);
    }

    public boolean isisSerial() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ISSERIAL, this.element);
    }

    public void isisSerial(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.HWBUS_LINK_HWBUS_LINK_ISSERIAL,value);
    }

}
